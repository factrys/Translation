plugins {
    id("java-library")
    id("com.gradleup.shadow") version "8.3.6"
}

group = "com.factrys.translation"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
    maven("https://jitpack.io/")
    maven("https://repo.lanink.cn/repository/maven-public/")
}

dependencies {
    compileOnly("org.jooq:jooq:3.19.7")

    compileOnly("cn.nukkit:Nukkit:MOT-SNAPSHOT")
    runtimeOnly("cn.nukkit:Nukkit:MOT-SNAPSHOT")
    compileOnly("org.projectlombok:lombok:1.18.38")

    annotationProcessor("org.projectlombok:lombok:1.18.38")

    implementation("org.json:json:20250517")

    testImplementation("cn.nukkit:Nukkit:MOT-SNAPSHOT")
    testImplementation("com.github.MEFRREEX:JOOQConnector:1.0.1")
    testImplementation("com.google.code.gson:gson:2.13.1")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    archiveFileName.set("${project.name}-${project.version}.jar")

    minimize()
    mergeServiceFiles()
}