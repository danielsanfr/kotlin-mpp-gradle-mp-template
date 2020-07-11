rootProject.name = "KotlinMultiplatformGradleMultiprojects"
rootProject.buildFileName = "build.gradle.kts"

include("node")
include("jvm")
include("subprojects:data")
include("subprojects:domain")
include("subprojects:presentation")
