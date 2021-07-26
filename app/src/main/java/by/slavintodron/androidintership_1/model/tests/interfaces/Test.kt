package by.slavintodron.androidintership_1.model.tests.interfaces

import by.slavintodron.androidintership_1.model.server.Server

interface Test {
    fun exec(server: Server?): Int
    fun testName(): String
}