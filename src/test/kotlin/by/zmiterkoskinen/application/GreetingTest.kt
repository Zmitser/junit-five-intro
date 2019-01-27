package by.zmiterkoskinen.application

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class GreetingTest {

    private lateinit var greeting: Greeting

    @BeforeEach
    fun setUp() {
        greeting = Greeting()
    }

    @Test
    fun helloWorld() {
        println(greeting.helloWorld())
    }

    @Test
    fun helloWorld1() {
        println(greeting.helloWorld("Michael"))

    }
}