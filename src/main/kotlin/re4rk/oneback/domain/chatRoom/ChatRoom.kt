package re4rk.oneback.domain.chatRoom

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id
import java.time.LocalDateTime

@Entity
class ChatRoom(
    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val profile: String,

    @Column(nullable = false)
    val messageCount: Int,

    @Column(nullable = false)
    val lastMessage: String,

    @Column(nullable = false)
    val lastMessageTime: LocalDateTime,

    @Column(nullable = false)
    val status: String,

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
) {
    constructor(
        title: String,
        profile: String,
        messageCount: Int,
        lastMessage: String,
        lastMessageTime: LocalDateTime,
        status: ChatStatus,
    ) : this(
        title = title,
        profile = profile,
        messageCount = messageCount,
        lastMessage = lastMessage,
        lastMessageTime = lastMessageTime,
        status = status.value,
    )
}
