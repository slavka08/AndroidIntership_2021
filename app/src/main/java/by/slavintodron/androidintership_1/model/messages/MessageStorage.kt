package by.slavintodron.androidintership_1.model.messages

class MessageStorage() {

    private var messages: MutableList<Message> = mutableListOf()

    fun addMessage(message: String) {
        messages.add(Message(message))
    }

    fun getResultMessages(): List<String> {
        return messages.map { messages -> messages.message }
    }

    fun clearMessages(){
        messages =  mutableListOf()
    }


    companion object {
        const val MESSTORAGE = "messagestorage"
    }
}