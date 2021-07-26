package by.slavintodron.androidintership_1.model.tests

import by.slavintodron.androidintership_1.model.server.Server
import by.slavintodron.androidintership_1.model.tests.interfaces.Test

class JitterTest() :Test {
    override fun exec(server: Server?): Int {
        return 2
    }

    override fun testName(): String {
        TODO("Not yet implemented")
    }

    companion object
    {
        const val JITTERTEST = "jittertest"
    }
}