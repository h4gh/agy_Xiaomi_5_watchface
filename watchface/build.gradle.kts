plugins {
    id("com.android.application")
}

android {
    namespace = "cz.h4gh.minimallcd"
    compileSdk = 35

    defaultConfig {
        applicationId = "cz.h4gh.minimallcd"
        minSdk = 34
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    signingConfigs {
        getByName("debug") {
            storeFile = file("debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("debug")
        }
        release {
            isMinifyEnabled = false
        }
    }
}
