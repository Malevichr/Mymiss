plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(libs.versions.java.get().toInt())
}

application {
    applicationName = "server"
    mainClass = "io.github.malevichr.mymiss.server.ApplicationKt"
}

dependencies {
    implementation(platform(libs.ktor.bom))
    implementation(libs.ktor.server.netty)
    runtimeOnly(libs.slf4j.simple)
}
