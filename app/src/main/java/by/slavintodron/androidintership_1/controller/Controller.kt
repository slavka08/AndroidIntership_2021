package by.slavintodron.androidintership_1.controller

import by.slavintodron.androidintership_1.ImainActivity
import by.slavintodron.androidintership_1.model.executor.TestExecutor
import by.slavintodron.androidintership_1.model.messages.MessageStorage
import by.slavintodron.androidintership_1.model.server.ServerFactory
import by.slavintodron.androidintership_1.model.tests.JitterTest
import by.slavintodron.androidintership_1.model.tests.PingTest
import by.slavintodron.androidintership_1.model.tests.SpeedTest
import by.slavintodron.androidintership_1.model.tests.TestReport
import by.slavintodron.androidintership_1.model.tests.interfaces.Test
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Controller(private val mainAct: ImainActivity) : IController {

    override fun onExecTest(userIp: Int, listTest: List<Test>) {
        GlobalScope.launch(Dispatchers.Main) {
            val mediator = TestExecutor(
                ServerFactory().make(userIp), MessageStorage()
            )
            val execAllTest = mediator.execute(listTest)
            returnTestReports(execAllTest)
        }
    }

    override fun returnTestReports(report: List<TestReport>) {
        mainAct.onTestResult(report)
    }


}