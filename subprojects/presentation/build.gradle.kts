plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        withJava()
    }
    js {
        nodejs {
        }
    }
    linuxX64("linux") {
        binaries {
            executable {
            }
        }
    }
    macosX64("macos") {
    }
    mingwX64("windows") {
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(Dependencies.coroutines)
                implementation(project(Dependencies.SubProjects.domain))
                implementation(project(Dependencies.SubProjects.data))
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation(Dependencies.JS.coroutines)
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val linuxMain by getting {
            dependencies {
                implementation(Dependencies.Native.coroutines)
            }
        }
        val linuxTest by getting {
        }

        val macosMain by getting {
            dependencies {
                implementation(Dependencies.Native.coroutines)
            }
        }
        val macosTest by getting {
        }

        val windowsMain by getting {
            dependencies {
                implementation(Dependencies.Native.coroutines)
            }
        }
        val windowsTest by getting {
        }
    }
}
