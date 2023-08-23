package re4rk.oneback.ui.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import re4rk.oneback.application.ChatRoomService
import re4rk.oneback.domain.chatRoom.ChatRoom

@RestController
class ChatRoomRestController(private val chatRoomService: ChatRoomService) {
    @GetMapping("/api/chat-rooms")
    fun findAll(): ResponseEntity<Result<List<ChatRoom>>> {
        return ResponseEntity.ok(Result.success(chatRoomService.findAll()))
    }
}
