package ru.ideaseeker.thisxbot.strategies

import ru.ideaseeker.thisxbot._

object AnimeStrategy extends IPictureStrategy with ISeedDependent {

    override val fileExtension = ".png"

    // float number (with precision = 2) in [0.5, 1.2]
    private def psi: String = {
        (randomInt(5, 13) / 10.0).toString.take(3)
    }

    override def url: String = {
        s"https://thisanimedoesnotexist.ai/results/psi-$psi/seed$seed.png"
    }
}
