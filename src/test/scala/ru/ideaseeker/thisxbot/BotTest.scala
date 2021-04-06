package ru.ideaseeker.thisxbot

import ru.ideaseeker.thisxbot.strategies._

import org.scalatest.funsuite.AnyFunSuite

class BotTest extends AnyFunSuite {

    test("valid input in Context.setStrategy") {
        assert(Context.getStrategies.forall { case (name, _) =>
            Context.setStrategy(name)
        })
    }

    test("invalid input in Context.setStrategy") {
        val inputs = List(
            "aaaaa",
            "abcdefg",
            "qwerty",
            "123456",
            "hyT3ieDf01y"
        )
        assert(inputs.forall { name =>
            !Context.setStrategy(name)
        })
    }

    // otherwise, the Error 404 probably occurred and we have not an image
    private val minimumPictureSize = 8 * 1024

    test("size of AnimeStrategy.get") {
        assert(AnimeStrategy.get.length > minimumPictureSize)
    }

    test("size of ArtStrategy.get") {
        assert(ArtStrategy.get.length > minimumPictureSize)
    }

    test("size of CatStrategy.get") {
        assert(CatStrategy.get.length > minimumPictureSize)
    }

    test("size of FursonaStrategy.get") {
        assert(FursonaStrategy.get.length > minimumPictureSize)
    }

    test("size of PersonStrategy.get") {
        assert(PersonStrategy.get.length > minimumPictureSize)
    }

    test("size of PonyStrategy.get") {
        assert(PonyStrategy.get.length > minimumPictureSize)
    }

    test("size of WaifuStrategy") {
        assert(WaifuStrategy.get.length > minimumPictureSize)
    }
}
