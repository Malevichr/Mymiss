plugins {
    kotlin("jvm") version "2.3.0"
    application
}

kotlin {
    jvmToolchain(17)
}

application {
    applicationName = "server"
    mainClass = "io.github.malevichr.mymiss.server.ApplicationKt"
}

dependencies {
    implementation(platform("io.ktor:ktor-bom:3.6.0"))
    implementation("io.ktor:ktor-server-netty")
    runtimeOnly("org.slf4j:slf4j-simple:2.0.17")
}
