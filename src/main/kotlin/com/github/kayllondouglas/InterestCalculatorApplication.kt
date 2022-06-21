package com.github.kayllondouglas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InterestCalculatorApplication

fun main(args: Array<String>) {
	runApplication<InterestCalculatorApplication>(*args)
}
