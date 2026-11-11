# Mymiss

Стартовый проект мессенджера на Kotlin. В репозитории два модуля Gradle.

| Модуль | Назначение |
| --- | --- |
| `app` | Android-приложение на Jetpack Compose и Material 3. Минимальная версия — Android 11 (API 30). |
| `server` | Сервер на Ktor и Netty с эндпоинтом проверки работоспособности. |

## Android

Нужны JDK 17 и Android SDK Platform 36. Откройте корень репозитория в Android Studio, выполните Gradle Sync и запустите конфигурацию `app` на устройстве или эмуляторе с Android 11 или новее.

Сборка APK из PowerShell:

```powershell
.\gradlew.bat :app:assembleDebug
```

APK появится в `app/build/outputs/apk/debug/app-debug.apk`.

## Сервер

Запуск из PowerShell:

```powershell
.\gradlew.bat :server:run
```

Проверка из другого терминала:

```powershell
curl.exe http://127.0.0.1:8080/health
```

Ожидаемый ответ — HTTP 200 с телом `OK`.

На Linux и macOS используйте `./gradlew` вместо `.\gradlew.bat`.
