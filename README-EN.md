# F1 Drivers 2020

A simple app that shows the list of drivers of the 2020 Formula 1 season using the MVVM architecture and the Firebase Cloud Firestore as backend.

[Readme em Português](README.md) - [Download APK](#download-apk) - [How to build](#how-to-build) - [Technologies used](#technologies-used) - [License](#license)

<img src="./screenshots/screenshot.gif" alt="Screenshot" width="270">

## Download APK

[Click here](https://github.com/Vitor238/F1-Firebase-MVVM/raw/main/apk/app-debug.apk) to download the APK.

## How to build

1. Clone the project by copying this command to your terminal:
   
   ```bash
   git clone https://github.com/Vitor238/F1-Firebase-MVVM
   ```

2. Open the project in Android Studio.

3. Change the name of the project packages. See how [here](https://stackoverflow.com/a/29092698/9729980).

4. Create a new project on [Firebase](https://console.firebase.google.com/) and add the app. See how [here](https://firebase.google.com/docs/android/setup).

5. Add the data to the database.

## Technologies used

- [Android Architecture Components](https://developer.android.com/jetpack/androidx/releases/lifecycle#kotlin)  (ViewModel e LiveData)

- [Firebase Cloud Firestore](https://firebase.google.com/docs/firestore)

- [Shimmer](https://facebook.github.io/shimmer-android/)

- [Glide](https://github.com/bumptech/glide)

- [Proguard](https://developer.android.com/studio/build/shrink-code)

## License

This project is licensed under [MIT license](https://opensource.org/licenses/MIT) - see the [LICENSE](LICENSE) file for more details.
