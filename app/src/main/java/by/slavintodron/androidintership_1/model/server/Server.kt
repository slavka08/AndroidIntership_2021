package by.slavintodron.androidintership_1.model.server


import by.slavintodron.androidintership_1.model.location.Location
import Kotlin.server.interfaces.ServerInterface

class Server(userLocation: Location) : ServerInterface {
    private var serverIp: Int = 0
    private lateinit var serverLocation: Location
    init {
        findCloserServer(userLocation)
    }

    private fun findCloserServer(userLocation: Location) {
        serverLocation = Location(123, 123, "s")
        serverIp = 3232
    }

    override fun getServerIp(): Int {
        return serverIp
    }

    companion object
    {
        const val SERVER = "server"
    }
}