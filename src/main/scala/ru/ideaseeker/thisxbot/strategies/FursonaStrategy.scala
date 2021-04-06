package ru.ideaseeker.thisxbot.strategies

import ru.ideaseeker.thisxbot._

object FursonaStrategy extends IPictureStrategy with ISeedDependent {

    override def url: String = {
        s"https://thisfursonadoesnotexist.com/v2/jpgs/seed$seed.jpg"
    }
}
