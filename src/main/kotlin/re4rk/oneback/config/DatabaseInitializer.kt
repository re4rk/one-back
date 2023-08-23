package re4rk.oneback.config

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import re4rk.oneback.domain.chatRoom.ChatRoom
import re4rk.oneback.domain.chatRoom.ChatRoomRepository
import re4rk.oneback.domain.chatRoom.ChatStatus
import java.time.LocalDateTime

@Profile("local")
@Transactional
@Component
class DatabaseInitializer(
    private val chatRoomRepository: ChatRoomRepository,
    private val database: Database,
) : CommandLineRunner {
    override fun run(vararg args: String) {
        cleanUp()
        populate()
    }

    private fun cleanUp() {
        database.clear(database.retrieveTables())
    }

    private fun populate() {
        populateDummy()
    }

    private fun populateDummy() {
        List(10) {
            ChatRoom(
                title = "상대방",
                description = "오늘 뭐할래?",
                localDateTime = LocalDateTime.now(),
                status = ChatStatus.READ,
            )
        }.let(chatRoomRepository::saveAll)
    }
}
