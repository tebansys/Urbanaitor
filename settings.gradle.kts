pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }

        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                username = "mapbox"
                password = "sk.eyJ1Ijoic3RlYmFuODIiLCJhIjoiY20yeHFqeHE5MDhpMTJscHhwMWM3NDUwNCJ9.XsXpQNYTjiGln5LDxU5Xvg"
            }
        }
    }
}
rootProject.name = "Urbanaitor"
include(":app")


/*
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()

        jcenter() // Agrega JCenter
        maven {
            url = uri("https://maven.google.com/") // Agrega Maven de Google
            name = "Google"
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        jcenter() // Agrega JCenter
        mavenCentral() // Agrega Maven Central
        maven { url = uri("https://jitpack.io") }
        maven {
            url = uri("https://maven.google.com/") // Agrega Maven de Google
            name = "Google"
        }
        google() // Agrega Google
    }
}

rootProject.name = "Urbanaitor"
include(":app")
*/
