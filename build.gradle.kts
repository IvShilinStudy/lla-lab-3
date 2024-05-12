plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

application {
    mainClass = "ru.ivan_shilin.presentation.MainKt"
}

group = "ru.ivan_shilin"
version = "0.0.1"

dependencies {
    implementation(platform(libs.kotlinx.coroutines.bom))
    implementation(libs.bundles.coroutines)
    implementation(platform(libs.koin.bom))
    implementation(libs.bundles.koin)
}

kotlin {
    jvmToolchain(20)
}