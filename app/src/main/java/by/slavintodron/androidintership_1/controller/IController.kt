package by.slavintodron.androidintership_1.controller

import by.slavintodron.androidintership_1.model.tests.TestReport
import by.slavintodron.androidintership_1.model.tests.interfaces.Test

interface IController {
    fun onExecTest(userIp: Int, listTest: List<Test>)
    fun returnTestReports(report: List<TestReport>)
}