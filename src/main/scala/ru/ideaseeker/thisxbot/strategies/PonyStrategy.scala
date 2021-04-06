package ru.ideaseeker.thisxbot.strategies

import ru.ideaseeker.thisxbot._

object PonyStrategy extends IPictureStrategy with ISeedDependent {

    override def url: String = {
        s"https://thisponydoesnotexist.net/v1/w2x-redo/jpgs/seed$seed.jpg"
    }
}
