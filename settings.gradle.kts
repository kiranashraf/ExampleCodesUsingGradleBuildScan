plugins {
    id("com.gradle.develocity") version "3.19.2"
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "gradle-build-scan-quickstart"

develocity {
    buildScan {
        tag("backend-engineer")
    }
}