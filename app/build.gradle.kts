plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

group = "ru.ivan_shilin.app"
version = "0.0.1"

repositories {
    mavenCentral()
}

application {
    mainClass = "ru.ivan_shilin.app.App"
}

dependencies {
    implementation(platform(libs.kotlinx.coroutines.bom))
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.serialization)
}

kotlin {
    jvmToolchain(20)
}