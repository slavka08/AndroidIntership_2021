package by.slavintodron.androidintership_1.model.tests


import by.slavintodron.androidintership_1.model.server.Server
import by.slavintodron.androidintership_1.model.tests.interfaces.Test
import java.util.*

class SpeedTest() : Test {
    private val testFile: TestFile = TestFile()

    private fun uploadFile(): Date {
        testFile.data
        return Date(123456) //время выполнения
    }

    private fun downloadFile(): Date {
        testFile.data
        return Date(123459) //время выполнения
    }

    override fun exec(server: Server?): Int {
        testFile.getFileSize()?.let { SpeedCalculator.CalculateSpeed(it,uploadFile()) }
        testFile.getFileSize()?.let { SpeedCalculator.CalculateSpeed(it,downloadFile()) }
        return 20
    }

    override fun testName(): String {
        TODO("Not yet implemented")
    }

    companion object {
        const val SPEEDTEST = "speedtest"
    }
}