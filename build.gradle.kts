import io.kotless.plugin.gradle.dsl.kotless

plugins {
    kotlin("jvm") version "1.5.31"
    id("io.kotless") version "0.2.0"
}

group = "com.uramnoil"
version = "1.0"

repositories {
    mavenCentral()
    maven(url = uri("https://packages.jetbrains.team/maven/p/ktls/maven"))
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.kotless", "ktor-lang", "0.2.0")
    implementation("io.kotless", "ktor-lang-aws", "0.2.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

kotless {
    config {

        aws {
            storage {
                bucket = "kotless-ping-pong"
                prefix = "dev"
            }

            profile = "kotless-ping-pong"
            region = "ap-northeast-1"
        }
    }

    webapp {
        lambda {
            memoryMb = 1024
            timeoutSec = 120
        }
    }
}