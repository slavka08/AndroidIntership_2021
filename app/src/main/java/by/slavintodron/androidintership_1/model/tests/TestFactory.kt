package by.slavintodron.androidintership_1.model.tests

import by.slavintodron.androidintership_1.model.location.LocationFinder
import by.slavintodron.androidintership_1.model.server.Server
import by.slavintodron.androidintership_1.model.tests.interfaces.Test

class TestFactory {
    fun make(): List<Test> {
        return listOf(PingTest(), JitterTest(), SpeedTest())
    }
}