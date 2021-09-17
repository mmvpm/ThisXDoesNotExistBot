package ru.ideaseeker.thisxbot

import org.scalatest.flatspec.AnyFlatSpec
import ru.ideaseeker.thisxbot.strategies._

class BotTest extends AnyFlatSpec {

    "Context" should "set strategy on valid input" in {
        Context.getStrategies.foreach { case (name, _) =>
            assert(Context.setStrategy(name))
        }
    }

    it should "not set strategy on invalid input" in {
        val inputs = List(
            "aaaaa",
            "abcdefg",
            "qwerty",
            "123456",
            "hyT3ieDf01y"
        )
        inputs.foreach{ name =>
            assert(!Context.setStrategy(name))
        }
    }

    "Pictures" should "have size > minimum picture size (8192 bytes)" in {
        val strategies = List(
            AnimeStrategy,
            ArtStrategy,
            CatStrategy,
            FursonaStrategy,
            PersonStrategy,
            PonyStrategy,
            WaifuStrategy
        )
        // otherwise, the Error 404 probably occurred and we have not an image
        val minimumPictureSize = 8192

        strategies.foreach { strategy =>
            assert(
                strategy.get.length > minimumPictureSize,
                s"(error with ${strategy.getClass})"
            )
        }
    }
}
