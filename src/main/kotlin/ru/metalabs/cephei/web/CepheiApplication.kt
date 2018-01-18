package ru.metalabs.cephei.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CepheiApplication

fun main(args: Array<String>) {
    runApplication<CepheiApplication>(*args)
}
