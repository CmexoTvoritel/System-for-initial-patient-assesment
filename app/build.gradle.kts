@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    //alias(libs.plugins.daggerHilt)
    alias(libs.plugins.kapt)
}

android {
    namespace = "com.example.systemforinitialpatientassesment"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.systemforinitialpatientassesment"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    //Dagger-hilt
    implementation(libs.dagger.hilt)
    annotationProcessor(libs.dagger.hilt.compiler)
    //Roomdb
    implementation(libs.roomdb)
    annotationProcessor(libs.roomdb.compiler)
    annotationProcessor(libs.roomdb.core)

    implementation(project(":core"))
    implementation(project(":resources"))
}