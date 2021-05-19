plugins {
    kotlin("multiplatform") version "1.5.20"
    id("org.jetbrains.dokka") version "1.4.32"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        compilations["main"].apply {
            cinterops.create("foobar")
        }
    }
}
