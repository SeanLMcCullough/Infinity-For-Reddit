<h1 align="center">
  Infinity For Reddit+ <a href="https://www.patreon.com/docile_alligator"><img src="https://img.shields.io/badge/Patreon-F96854?style=for-the-badge&logo=patreon&logoColor=white" alt="Patreon"></a>
  
</h1>

<div align="center">

A Reddit client on Android written in Java. It does not have any ads and it features a clean UI and smooth browsing experience

<img align="right" src="https://raw.githubusercontent.com/Docile-Alligator/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/icon.png" width=200>

</div>

<br>

<div>

Infinity for Reddit+ is available on Google Play and GitHub. There’s also a Patreon version that works without Google Play Services. You can find it on the <a href="https://github.com/Docile-Alligator/Infinity-For-Reddit/releases">GitHub releases page</a>. Just look for the APK file that contains <strong><i>Infinity-Patreon</i></strong> in its name.

<div align="center">
  <a href="https://play.google.com/store/apps/details?id=ml.docilealligator.infinityforreddit.plus">
      <img alt="Get it on Google Play" height="80" src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
  </a>
</div>
</div>

<div align="center">

<br>
    <a href="https://github.com/Docile-Alligator/Infinity-For-Reddit/wiki"><strong>Explore the docs »</strong></a>
<br>

<a href="https://github.com/Docile-Alligator/Infinity-For-Reddit/issues">Report a Bug</a>
·
<a href="https://github.com/Docile-Alligator/Infinity-For-Reddit/discussions/categories/ideas">Request a Feature</a>
·
<a href="https://github.com/Docile-Alligator/Infinity-For-Reddit/discussions/categories/q-a">Ask a Question</a>

</div>

<br>

<div align="center">

[![release](https://img.shields.io/github/v/release/Docile-Alligator/Infinity-For-Reddit)](https://github.com/Docile-Alligator/Infinity-For-Reddit/releases)
[![license](https://img.shields.io/github/license/Docile-Alligator/Infinity-For-Reddit)](LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/Docile-Alligator/Infinity-For-Reddit)](https://github.com/Docile-Alligator/Infinity-For-Reddit/issues)

</div>

## About This Fork

This is an unofficial fork of [Infinity for Reddit](https://github.com/Docile-Alligator/Infinity-For-Reddit) by [Docile-Alligator](https://github.com/Docile-Alligator). All credit for the app goes to the original developer. If you enjoy it, please support them through the [Donation](#donation) links below.

The fork is for personal use with Reddit API credentials that you provide. It is not affiliated with the original project and it does not come with any Reddit API credentials.

What is different from the original:

- API Credentials settings: Set your own Reddit client ID, redirect URI, user agent and Giphy API key in the app instead of building them into the source code.
- Login works with any redirect URI, including `http://127.0.0.1`.
- Prebuilt APKs are published on the [releases page](https://github.com/SeanLMcCullough/Infinity-For-Reddit/releases) of this fork.

### Download and Install

1. Go to the [releases page](https://github.com/SeanLMcCullough/Infinity-For-Reddit/releases) and download the APK file of the latest release. Its name looks like <strong><i>Infinity-8.3.5-r1.apk</i></strong>.
2. Open the APK file on your phone. Android will ask you to allow installing apps from this source the first time.
3. Install the app and continue with [Set Up Your API Credentials](#set-up-your-api-credentials).

Things to know before installing:

- This fork uses the same package name as the original Infinity for Reddit, so the two cannot be installed at the same time. Uninstall the original app first. You can back up your settings in **Settings > Advanced** before doing that.
- The APKs are signed with the public keystore of the Infinity APK Builder, so they install over an APK you built with it. Because that keystore is public, the signature does not prove who built an APK. Only download from the releases page of this fork. Each release also has a `.sha256` file to check your download against.

### Set Up Your API Credentials

To use the app you need the credentials of a Reddit API app: a **client ID**, a **redirect URI** and a **user agent**. Reddit has stopped issuing new API keys and now blocks many existing third-party keys, so for most people the reliable option is to reuse the credentials of a client that Reddit still allows, such as [RedReader](https://github.com/QuantumBadger/RedReader). This mirrors the approach described in [Apollo Reborn's guide](https://github.com/Apollo-Reborn/Apollo-Reborn#dont-have-an-api-key).

#### Option A: Reuse RedReader's credentials (recommended)

RedReader is an open-source Reddit client that Reddit still permits. You can obtain its client ID yourself without it being published here:

1. Install [RedReader](https://github.com/QuantumBadger/RedReader/releases) (or from F-Droid) and log in with your Reddit account, granting it access.
2. Reddit sends you an email with the subject **"You've authorized a new app in your Reddit account."** It lists an **App ID** — copy it.
3. In this app, open **Settings > API Credentials** and enter:
   - **Reddit Client ID:** the App ID from that email.
   - **Redirect URI:** `redreader://rr_oauth_redir`
   - **User Agent:** `RedReader/1.27` (match the version of RedReader you installed).
   - **Giphy API Key:** optional, only for posting GIFs in comments.
4. Restart the app, tap **Add an account** and log in. Reddit's consent screen will name RedReader; accept it.

This reuses RedReader's identity with Reddit. It works today but is not guaranteed — Reddit could block it, and it may be against Reddit's terms — so use it for personal use at your own discretion, and please don't abuse it out of respect for the RedReader project.

#### Option B: Use your own API app

If you still have a working Reddit API app (type: **installed app**, found at [reddit.com/prefs/apps](https://www.reddit.com/prefs/apps)), enter its own values under **Settings > API Credentials**:

- **Reddit Client ID:** the ID shown under your app's name.
- **Redirect URI:** must match your Reddit app exactly, e.g. `http://127.0.0.1`.
- **User Agent:** something that identifies you, e.g. `android:your.app.name:v1.0 (by /u/your_username)`.

Your credentials are stored on your device only and are not included in the settings backup. After changing them, restart the app and log in again.

### Versions

Releases are named after the version of the original app they are based on, followed by the build number of this fork. For example, `8.3.5-r2` is the second build of this fork and it is based on Infinity for Reddit 8.3.5.

<p align="right">(<a href="#top">back to top</a>)</p>

### 📱 Also available on iOS
Infinity for Reddit is finally on iOS! Check it out here: [Infinity for Reddit](https://github.com/foxanastudio/Infinity-For-Reddit-iOS)

<a href="https://apps.apple.com/us/app/infinity-for-reddit/id6759064642">
  <img alt="Download on the App Store" height="80" src="fastlane/metadata/android/en-US/images/app_store_badge.svg" />
</a>

## Donation
<p>Infinity for Reddit++:</p>
<a href="https://play.google.com/store/apps/details?id=ml.docilealligator.infinityforreddit.plus2">
    <img alt="Get it on Google Play" height="100" src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
</a> 

Patreon: https://www.patreon.com/docile_alligator

Bitcoin: bc1qxtkd5ap9na7uy8nr9qpt6jny6tdwaj4v43ddle

<details>
  <summary>Table of Contents</summary>

- [About](#about)
  - [Built With](#built-with)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Usage](#usage)
    - [Cookiecutter template](#cookiecutter-template)
    - [Manual setup](#manual-setup)
    - [Variables reference](#variables-reference)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [Support](#support)
- [License](#license)
- [Acknowledgements](#acknowledgements)

</details>

---

## About The Project

<table>
<tr>
<td>

Key features of **Infinity For Reddit**:

- Lazy mode: Automatic scrolling of posts enables you to enjoy amazing posts without moving your thumb.
- Browsing posts
- View comments
- Expand and collapse comments section
- Vote posts and comments
- Save posts
- Write comments
- Edit comments and delete comments
- Submit posts (text, link, image and video)
- Edit posts (mark and unmark NSFW and spoiler and edit flair) and delete posts
- See all the subscribed subreddits and followed users
- View the messages
- Get notifications of unread messages
- etc...

</td>
</tr>
</table>

<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png" 
  alt="Screenshot 1"
  height="200" >
<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png" 
  alt="Screenshot 2"
  height="200" >
<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png" 
  alt="Screenshot 3"
  height="200" >
<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png" 
  alt="Screenshot 4"
  height="200" >
<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/5.png" 
  alt="Screenshot 5"
  height="200" >
<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png" 
  alt="Screenshot 6"
  height="200" >
<img 
  src="https://raw.githubusercontent.com/Wladefant/Infinity-For-Reddit/master/fastlane/metadata/android/en-US/images/phoneScreenshots/7.png" 
  alt="Screenshot 7"
  height="200" >

<p align="right">(<a href="#top">back to top</a>)</p>

## Contributing

First off, thanks for taking the time to contribute! Contributions are what makes the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request.
It's better to also open an issue describing the issue you want to fix. But it is not required.

Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch from `master` (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request to the `master` Branch

Here are other ways you can help:

- [Report Bugs](https://github.com/Docile-Alligator/Infinity-For-Reddit/issues)
- [Make Suggestions](https://github.com/Docile-Alligator/Infinity-For-Reddit/discussions)
- [Translate The App](https://poeditor.com/join/project?hash=b2IRyfaJv6)

<p align="right">(<a href="#top">back to top</a>)</p>

## License

Distributed under the AGPL-3.0 License. See <a href="https://github.com/Docile-Alligator/Infinity-For-Reddit/blob/master/LICENSE">LICENSE</a> for more information.

<p align="right">(<a href="#top">back to top</a>)</p>

## Contact

[u/Hostilenemy](https://www.reddit.com/user/Hostilenemy) -
docilealligator.app@gmail.com (Owner)

or [u/Wladefant](https://www.reddit.com/user/Wladefant) - wladefant@gmail.com (Collaborator)

Project Link: [https://github.com/Docile-Alligator/Infinity-For-Reddit](https://github.com/Docile-Alligator/Infinity-For-Reddit)

<p align="right">(<a href="#top">back to top</a>)</p>
