plugins {
    id("com.android.application") version "9.2.1"
    kotlin("plugin.compose") version "2.3.0"
}

android {
    namespace = "io.github.malevichr.mymiss"
    compileSdk = 36

    defaultConfig {
        applicationId = "io.github.malevichr.mymiss"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "0.1.0"
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.13.0")
    implementation("androidx.compose.material3:material3:1.4.0")
}
