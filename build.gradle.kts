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
    implementation(libs.bundles.coroutines)
}

kotlin {
    jvmToolchain(20)
}