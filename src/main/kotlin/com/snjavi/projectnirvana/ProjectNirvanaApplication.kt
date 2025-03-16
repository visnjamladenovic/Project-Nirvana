package com.snjavi.projectnirvana

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude=[DataSourceAutoConfiguration::class])
class ProjectNirvanaApplication

fun main(args: Array<String>) {
    runApplication<ProjectNirvanaApplication>(*args)
}
