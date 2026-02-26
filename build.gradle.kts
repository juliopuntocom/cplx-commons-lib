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


dependencies {

    api("jakarta.ws.rs:jakarta.ws.rs-api:3.1.0")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
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