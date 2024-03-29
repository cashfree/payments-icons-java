plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm")
}

extra.apply {
    set("PUBLISH_GROUP_ID", "com.cashfree.pg")
    set("PUBLISH_ARTIFACT_ID", "icons")
    set("PUBLISH_VERSION", "1.0.0")
}

apply(from = "${rootProject.projectDir}/scripts/publish-module.gradle")

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


