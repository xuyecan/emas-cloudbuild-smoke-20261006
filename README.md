# EMAS Cloud Build Smoke

Synthetic Android application for EMAS pre-release cloud build verification.
No user data, application secrets, or runtime dependencies.

- Android Gradle Plugin 3.5.4 / Gradle 5.4.1
- Android SDK 28 / Build Tools 28.0.3 / JDK 11
- Build command: `./gradlew --no-daemon clean assembleDebug`
- Expected artifact: `app/build/outputs/apk/debug/app-debug.apk`
- Verify checkout, compilation, cloud artifact upload, and download separately.

This project is intended for build verification only.
