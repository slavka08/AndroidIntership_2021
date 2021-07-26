package by.slavintodron.androidintership_1

import by.slavintodron.androidintership_1.model.messages.MessageStorage
import by.slavintodron.androidintership_1.model.executor.TestExecutor
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MessageStorageUnitTest {
    private val messageStorage = MessageStorage()

    @Test
    fun `Verify message present`() {
        messageStorage.clearMessages()
        messageStorage.addMessage("qwer")
        messageStorage.addMessage("tyui")
        messageStorage.addMessage("zxcv")
        val resultMessages = messageStorage.getResultMessages()
        val resultMessagesExcepted = listOf<String>("qwer","tyui","zxcv")
        assertEquals(resultMessagesExcepted, resultMessages)
    }
    @Test
    fun message_storage2() {
        messageStorage.clearMessages()
        val resultMessages = messageStorage.getResultMessages()
        assertEquals(listOf<String>(), resultMessages)
    }
    @Test
    fun message_storage3() {
        messageStorage.clearMessages()
        messageStorage.addMessage("qwer")
        messageStorage.addMessage("tyui")
        messageStorage.addMessage("zxcv")
        messageStorage.clearMessages()
        val resultMessages = messageStorage.getResultMessages()
        val resultMessagesExcepted = listOf<String>()
        assertEquals(resultMessagesExcepted, resultMessages)
    }
}