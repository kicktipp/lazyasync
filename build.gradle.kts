plugins {
    java
    id("org.springframework.boot") version "3.2.2"
    id("io.spring.dependency-management") version "1.1.4"
    id("io.freefair.aspectj.post-compile-weaving") version "8.4"
}

group = "org.kicktipp.lazyasync"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    aspect(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    testAspect(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    // aspectj
    aspect("org.springframework:spring-aspects")
    testAspect("org.springframework:spring-aspects")
    implementation("org.aspectj:aspectjrt")
    implementation("org.springframework:spring-aspects")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
