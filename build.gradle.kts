plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

application {
    mainClass = "ru.ivan_shilin.MainKt"
}

group = "ru.ivan_shilin"
version = "0.0.1"

dependencies {
    implementation(libs.kotlinx.coroutines)
    implementation(libs.kotlinx.serialization)
}

kotlin {
    jvmToolchain(20)
}