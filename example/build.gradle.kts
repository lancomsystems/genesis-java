plugins {
    id("de.lancom.genesis.java") version "1.1.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

genesisJava {
    withJavadocJar()
    withSourcesJar()
    withCheckstyle()
    withPmd()
    withSpotBugs()
}
