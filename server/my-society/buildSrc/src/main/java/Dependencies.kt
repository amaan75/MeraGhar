object Versions {
    val kotlin = "1.3.72"
}

object Deps {
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect"
    val kotlin_jackson = "com.fasterxml.jackson.module:jackson-module-kotlin"
    val actuator = "org.springframework.boot:spring-boot-starter-actuator"
    val web = "org.springframework.boot:spring-boot-starter-web"
    val mongo = "org.springframework.boot:spring-boot-starter-data-mongodb"

}
