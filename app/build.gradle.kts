plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.myblog"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myblog"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
implementation ("com.google.android.material:material:1.12.0")

//DOM
implementation (platform("com.google.firebase:firebase-bom:33.4.0"))
// Navigation
implementation ("androidx.navigation:navigation-fragment-ktx:2.8.3")
implementation ("androidx.navigation:navigation-ui-ktx:2.8.3")
// Utils
implementation ("de.hdodenhof:circleimageview:3.1.0")
implementation ("com.github.bumptech.glide:glide:4.16.0")
implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation(libs.androidx.monitor)
    implementation(libs.androidx.junit.ktx)
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")
// Viewmodel and livedata KTX"
implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6")
implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.6")
// Play services coroutines
implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")
//Used for StateFlow
implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
// Lifecycle
implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")

}