plugins {
    // TODO: Switch to native in the future.
    kotlin("js")
}

dependencies {
    implementation(project(Dependencies.SubProjects.presentation))
    implementation(project(Dependencies.SubProjects.domain))
    implementation(project(Dependencies.SubProjects.data))

    implementation(embeddedKotlin("stdlib-js"))
    implementation(Dependencies.JS.coroutines)

    implementation(npm("is-sorted"))

    testImplementation(kotlin("test-js"))
}

kotlin {
    target {
        nodejs { }
    }
}
