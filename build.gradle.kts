plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
    mavenLocal()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    withSourcesJar()
    withJavadocJar()
}

var lombokVersion ="1.18.34"
var jakartaVersion ="3.1.0"
var jupiterVersion ="3.1.0"
dependencies {

    api("jakarta.ws.rs:jakarta.ws.rs-api:${jakartaVersion}")
    compileOnly("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor("org.projectlombok:lombok:${lombokVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter:${jupiterVersion}")
}

group = "cplx-commons-lib"
version = "1.0.0-SNAPSHOT"



tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "commons-lib"
        }
    }
}