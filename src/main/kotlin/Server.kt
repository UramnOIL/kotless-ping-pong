import io.kotless.dsl.ktor.KotlessAWS
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

class Server : KotlessAWS() {
    override fun prepare(app: Application) {
        app.routing {
            get("/") {
                call.respond("Deployed using Kotless!\n Let's try to access `/ping`.")
            }
            get("/ping") {
                call.respond("pong!")
            }
        }
    }
}