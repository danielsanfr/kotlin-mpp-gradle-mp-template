plugins {
    kotlin("jvm")
    application
}

application.mainClassName = "br.com.danielsan.jvm.MainKt"

dependencies {
    implementation(project(Dependencies.SubProjects.presentation))
    implementation(project(Dependencies.SubProjects.domain))
    implementation(project(Dependencies.SubProjects.data))

    implementation(embeddedKotlin("stdlib-jdk8"))
    implementation(Dependencies.coroutines)

    testImplementation(kotlin("test-junit"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
