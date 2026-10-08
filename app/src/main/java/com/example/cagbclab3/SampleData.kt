package com.example.cagbclab3

object SampleData {
    private val baseMessages = listOf(
        Message("Joe", "Hi!"),
        Message("Jim", "How are you?"),
        Message("Joe", "Test..1..2...3"),
        Message("Joe", "I hate coding!!!")
    )

    // Repeat the 4 base messages to make 20 rows
    val conversationSample: List<Message> = List(20) { index ->
        baseMessages[index % baseMessages.size]
    }
}
