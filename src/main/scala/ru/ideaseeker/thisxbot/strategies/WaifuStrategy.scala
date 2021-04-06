package ru.ideaseeker.thisxbot.strategies

import ru.ideaseeker.thisxbot._

object WaifuStrategy extends IPictureStrategy with ISeedDependent {

    override val leftBound: Int = 0

    override def url: String = {
        s"https://www.thiswaifudoesnotexist.net/example-$seed.jpg"
    }
}
