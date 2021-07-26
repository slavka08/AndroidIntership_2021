package by.slavintodron.androidintership_1.model.tests

import by.slavintodron.androidintership_1.model.server.Server
import by.slavintodron.androidintership_1.model.tests.interfaces.Test
import kotlin.random.Random

class PingTest() : Test {
    override fun exec(server: Server?): Int {
        return Random.nextInt(120)
    }

    override fun testName(): String {
        TODO("Not yet implemented")
    }

    companion object
    {
        const val PINGTEST = "pingtest"
    }
}