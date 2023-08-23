package re4rk.oneback.domain.chatRoom

enum class ChatStatus(val value: String) {
    READ("READ"),
    UNREAD("UNREAD"),
    ENDED("ENDED"),
    ;

    companion object {
        fun from(value: String): ChatStatus {
            return when (value) {
                "READ" -> READ
                "UNREAD" -> UNREAD
                "ENDED" -> ENDED
                else -> throw IllegalArgumentException()
            }
        }
    }
}
