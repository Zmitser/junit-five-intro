package by.zmiterkoskinen.application

data class Greeting(private val hello: String = "Hello",  private val world: String = "World") {

    fun helloWorld() = "$hello $world"

    fun helloWorld(name:String) = "$hello $name"
}