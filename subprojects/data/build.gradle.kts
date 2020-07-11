plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version embeddedKotlinVersion
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
                implementation(Dependencies.ktor)
                implementation(Dependencies.ktorJson)
                implementation(Dependencies.ktorSerialization)
                implementation(Dependencies.coroutines)
                implementation(Dependencies.serialization)
                implementation(project(Dependencies.SubProjects.domain))
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
                implementation(Dependencies.JVM.ktor)
                implementation(Dependencies.JVM.ktorJson)
                implementation(Dependencies.JVM.ktorSerialization)
                implementation(Dependencies.JVM.serialization)
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
                implementation(Dependencies.JS.ktor)
                implementation(Dependencies.JS.ktorJson)
                implementation(Dependencies.JS.ktorSerialization)
                implementation(Dependencies.JS.coroutines)
                implementation(Dependencies.JS.serialization)

                // Reference: https://github.com/ktorio/ktor/issues/1822
                implementation(npm("abort-controller"))
                implementation(npm("node-fetch"))
                implementation(npm("text-encoding"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val linuxMain by getting {
            dependencies {
                implementation(Dependencies.Native.ktor)
                implementation(Dependencies.Native.ktorJson)
                implementation(Dependencies.Native.ktorSerialization)
                implementation(Dependencies.Native.coroutines)
                implementation(Dependencies.Native.serialization)
            }
        }
        val linuxTest by getting {
        }

        val macosMain by getting {
            dependencies {
                implementation(Dependencies.Native.ktor)
                implementation(Dependencies.Native.ktorJson)
                implementation(Dependencies.Native.ktorSerialization)
                implementation(Dependencies.Native.coroutines)
                implementation(Dependencies.Native.serialization)
            }
        }
        val macosTest by getting {
        }

        val windowsMain by getting {
            dependencies {
                implementation(Dependencies.Native.ktor)
                implementation(Dependencies.Native.ktorJson)
                implementation(Dependencies.Native.ktorSerialization)
                implementation(Dependencies.Native.coroutines)
                implementation(Dependencies.Native.serialization)
            }
        }
        val windowsTest by getting {
        }
    }
}
