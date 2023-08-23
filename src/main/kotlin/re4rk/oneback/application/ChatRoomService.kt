package re4rk.oneback.application

import org.springframework.stereotype.Service
import re4rk.oneback.domain.chatRoom.ChatRoom
import re4rk.oneback.domain.chatRoom.ChatRoomRepository

@Service
class ChatRoomService(val chatRoomRepository: ChatRoomRepository) {
    fun findAll(): List<ChatRoom> {
        return chatRoomRepository.findAll()
    }
}
