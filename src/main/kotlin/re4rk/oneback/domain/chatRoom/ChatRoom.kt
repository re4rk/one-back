package re4rk.oneback.domain.chatRoom

import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id
import java.time.LocalDateTime

@Entity
class ChatRoom(
    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var description: String,

    @Column(nullable = false)
    var localDateTime: LocalDateTime,

    @Embedded
    var status: ChatStatus,

    @jakarta.persistence.Id @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L
)
