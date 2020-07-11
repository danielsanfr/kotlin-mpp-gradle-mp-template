plugins {
    kotlin("multiplatform") version embeddedKotlinVersion apply false
}

subprojects {
    group ="br.com.danielsan"
    version = "0.1"

    repositories {
        jcenter()
        mavenCentral()
    }
}
