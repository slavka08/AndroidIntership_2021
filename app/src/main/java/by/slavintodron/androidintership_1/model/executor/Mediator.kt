package by.slavintodron.androidintership_1.model.executor

import by.slavintodron.androidintership_1.model.tests.TestReport
import by.slavintodron.androidintership_1.model.tests.interfaces.Test

interface Mediator {
    suspend fun execute(list: List<Test>):List<TestReport>
}