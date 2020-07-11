package br.com.danielsan.data

actual class Platform actual constructor() {
    actual inline fun getName(): String = "JVM"
}
