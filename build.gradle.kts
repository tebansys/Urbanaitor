// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// build.gradle (raíz del proyecto en Groovy)
buildscript {
    /*ext {
        kotlin_version = "1.8.10"
    }*/
    val kotlinVersion by extra("1.9.0")

    repositories {
        /*jcenter()
        mavenCentral()
        maven {
            url = uri("https://maven.google.com/")
            name = "Google"
        }
        google()*/
        /*maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                username = "mapbox"
                password = project.findProperty("MAPBOX_ACCESS_TOKEN") as String? ?: ""
            }
        }*/
    }
    dependencies {
        classpath(libs.gradle)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {

    }
}

tasks.register("clean", Delete::class) {
    delete(layout.buildDirectory)
}