package re4rk.oneback.application

import org.springframework.stereotype.Service
import re4rk.oneback.domain.chatRoom.ChatRoom
import re4rk.oneback.domain.chatRoom.ChatStatus
import java.time.LocalDateTime

@Service
class ChatRoomService {
    fun findAll(): List<ChatRoom> {
        return List(10) {
            ChatRoom(
                title = "상대방",
                description = "오늘 뭐할래?",
                localDateTime = LocalDateTime.now(),
                status = ChatStatus.READ,

            )
        }
    }
}
