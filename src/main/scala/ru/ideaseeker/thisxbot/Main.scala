package ru.ideaseeker.thisxbot

import com.bot4s.telegram.api.declarative._
import com.bot4s.telegram.api.{ChatActions, RequestHandler}
import com.bot4s.telegram.clients.ScalajHttpClient
import com.bot4s.telegram.future.{Polling, TelegramBot}
import com.bot4s.telegram.methods._

import scala.concurrent.Future

object ThisXDoesNotExistBot extends TelegramBot
    with Polling
    with Commands[Future]
    with ChatActions[Future] {

    private val token = "bot_token"
    override val client: RequestHandler[Future] = new ScalajHttpClient(token)

    onMessage { implicit message =>
        Future {
            val isCorrectResponse = message.text match {
                case Some(text) =>
                    Context.setStrategy(
                        // handles both options: /command and command
                        text.toLowerCase.filter(_ != '/')
                    )
                case None => false
            }
            if (!isCorrectResponse) {
                request(SendMessage(message.source, helpMessage))
            }
            else {
                uploadingPhoto
                request(SendPhoto(message.source, Context.getPicture))
            }
        }
    }

    private val helpMessage =
        Context.getStrategies.map {
            case (name, _) => s"- $name"
        }.toList.sorted.mkString(
            start = "Type one of these options:\n",
            sep = "\n",
            end = ""
        )
}

object Main extends App {
    ThisXDoesNotExistBot.run()
    scala.io.StdIn.readLine("Press [Enter] to shutdown the bot")
    ThisXDoesNotExistBot.shutdown()
}
