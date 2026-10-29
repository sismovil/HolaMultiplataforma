package edu.unicauca.sismovil.holamultiplataforma

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform