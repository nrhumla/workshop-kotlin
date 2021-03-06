package org.mixit.kotlin

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class JavaWebApp {

    @Bean
    open fun objectMapper() = ObjectMapper().registerKotlinModule()
}

fun main(args: Array<String>) {
    SpringApplication.run(JavaWebApp::class.java, *args)
}