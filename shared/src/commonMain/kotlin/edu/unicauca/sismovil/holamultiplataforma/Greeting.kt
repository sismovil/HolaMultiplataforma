package edu.unicauca.sismovil.holamultiplataforma

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}