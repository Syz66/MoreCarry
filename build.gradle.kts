plugins {
    java
    id("com.github.weave-mc.weave-gradle") version "fac948db7f"
}

val projectVersion: String by project
val projectGroup:   String by project

group = projectGroup
version = projectVersion

minecraft.version("1.8.9")

repositories {
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("com.github.weave-mc:weave-loader:v0.2.4")
}

tasks.compileJava {
    options.release.set(17)
}
