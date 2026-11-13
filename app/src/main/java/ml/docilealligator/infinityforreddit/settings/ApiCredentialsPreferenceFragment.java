package ml.docilealligator.infinityforreddit.settings;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.preference.EditTextPreference;

import ml.docilealligator.infinityforreddit.BuildConfig;
import ml.docilealligator.infinityforreddit.R;
import ml.docilealligator.infinityforreddit.customviews.preference.CustomFontPreferenceFragmentCompat;
import ml.docilealligator.infinityforreddit.utils.APIUtils;
import ml.docilealligator.infinityforreddit.utils.SharedPreferencesUtils;

public class ApiCredentialsPreferenceFragment extends CustomFontPreferenceFragmentCompat {
    public ApiCredentialsPreferenceFragment() {}

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        getPreferenceManager().setSharedPreferencesName(SharedPreferencesUtils.API_CREDENTIALS_SHARED_PREFERENCES_FILE);
        setPreferencesFromResource(R.xml.api_credentials_preferences, rootKey);

        setUp(SharedPreferencesUtils.REDDIT_CLIENT_ID, BuildConfig.DEFAULT_REDDIT_CLIENT_ID, false);
        setUp(SharedPreferencesUtils.REDDIT_REDIRECT_URI,
                BuildConfig.DEFAULT_REDDIT_REDIRECT_URI.isEmpty() ? APIUtils.MANIFEST_REDIRECT_URI : BuildConfig.DEFAULT_REDDIT_REDIRECT_URI,
                true);
        setUp(SharedPreferencesUtils.REDDIT_USER_AGENT, BuildConfig.DEFAULT_REDDIT_USER_AGENT, false);
        setUp(SharedPreferencesUtils.GIPHY_API_KEY, BuildConfig.DEFAULT_GIPHY_API_KEY, false);
    }

    /**
     * A blank value means "use the build default", which the summary then shows.
     */
    private void setUp(String key, String buildDefault, boolean isUri) {
        EditTextPreference preference = findPreference(key);
        if (preference == null) {
            return;
        }

        preference.setSummaryProvider(p -> {
            String value = ((EditTextPreference) p).getText();
            if (value != null && !value.trim().isEmpty()) {
                return value;
            }
            return buildDefault.isEmpty()
                    ? getString(R.string.settings_api_credentials_not_set)
                    : getString(R.string.settings_api_credentials_build_default, buildDefault);
        });

        preference.setOnPreferenceChangeListener((p, newValue) -> {
            String value = ((String) newValue).trim();
            if (isUri && !value.isEmpty() && Uri.parse(value).getScheme() == null) {
                Toast.makeText(mActivity, R.string.settings_reddit_redirect_uri_invalid, Toast.LENGTH_SHORT).show();
                return false;
            }

            // Persist the trimmed value ourselves so the new credentials can be applied right away.
            ((EditTextPreference) p).setText(value);
            APIUtils.loadCredentials(mActivity);
            Toast.makeText(mActivity, R.string.settings_api_credentials_changed, Toast.LENGTH_LONG).show();
            return false;
        });
    }
}
