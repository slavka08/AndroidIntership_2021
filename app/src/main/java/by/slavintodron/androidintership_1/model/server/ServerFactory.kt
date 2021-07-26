package by.slavintodron.androidintership_1.model.server

import by.slavintodron.androidintership_1.model.location.LocationFinder

class ServerFactory() {
    fun make(userIp:Int):Server{
        val userLocation = LocationFinder().getLocationFromIp(userIp)
        return Server(userLocation)
    }
}