package by.slavintodron.androidintership_1.model.executor

import by.slavintodron.androidintership_1.model.messages.MessageStorage
import by.slavintodron.androidintership_1.model.server.Server
import by.slavintodron.androidintership_1.model.tests.TestReport
import by.slavintodron.androidintership_1.model.tests.interfaces.Test

class TestExecutor(
    private var server: Server,
    private var messageStorage: MessageStorage
) : Mediator {

    override suspend fun execute(list: List<Test>):List<TestReport> {
        var mutableList:MutableList<TestReport> = mutableListOf()
        messageStorage?.clearMessages()
        for (test in list){
            mutableList.add(TestReport(test.exec(server),test.javaClass.toString()))
        }

        return mutableList.toList()
    }
}