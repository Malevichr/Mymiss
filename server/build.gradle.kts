plugins {
    kotlin("jvm")
    application
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "io.github.malevichr.mymiss.server.ApplicationKt"
}

dependencies {
    implementation(platform("io.ktor:ktor-bom:3.6.0"))
    implementation("io.ktor:ktor-server-netty")
    runtimeOnly("org.slf4j:slf4j-simple:2.0.17")
}
