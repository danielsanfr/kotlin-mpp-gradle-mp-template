final class Dependencies {
    public static final String ktor = "io.ktor:ktor-client-core:" + Versions.ktor;
    public static final String ktorJson = "io.ktor:ktor-client-json:" + Versions.ktor;
    public static final String ktorSerialization = "io.ktor:ktor-client-serialization:" + Versions.ktor;
    public static final String coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:" + Versions.coroutines;
    public static final String serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:" + Versions.serialization;

    private Dependencies() { /* Empty body */ }

    public static final class SubProjects {
        public static final String presentation = ":subprojects:presentation";
        public static final String domain = ":subprojects:domain";
        public static final String data = ":subprojects:data";

        private SubProjects() { /* Empty body */ }
    }

    public static final class JVM {
        public static final String ktor = "io.ktor:ktor-client-okhttp:" + Versions.ktor;
        public static final String ktorJson = "io.ktor:ktor-client-json-jvm:" + Versions.ktor;
        public static final String ktorSerialization = "io.ktor:ktor-client-serialization-jvm:" + Versions.ktor;
        public static final String serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:" + Versions.serialization;

        private JVM() { /* Empty body */ }
    }

    public static final class JS {
        public static final String ktor = "io.ktor:ktor-client-js:" + Versions.ktor;
        public static final String ktorJson = "io.ktor:ktor-client-json-js:" + Versions.ktor;
        public static final String ktorSerialization = "io.ktor:ktor-client-serialization-js:" + Versions.ktor;
        public static final String coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core-js:" + Versions.coroutines;
        public static final String serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:" + Versions.serialization;

        private JS() { /* Empty body */ }
    }

    public static final class Native {
        public static final String ktor = "io.ktor:ktor-client-curl:" + Versions.ktor;
        public static final String ktorJson = "io.ktor:ktor-client-json-native:" + Versions.ktor;
        public static final String ktorSerialization = "io.ktor:ktor-client-serialization-native:" + Versions.ktor;
        public static final String coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:" + Versions.coroutines;
        public static final String serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:" + Versions.serialization;

        private Native() { /* Empty body */ }
    }
}
