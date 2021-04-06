package ru.ideaseeker.thisxbot

import scala.util.Random

trait ISeedDependent {

    val leftBound = 10000
    val rightBound = 100000

    def seed: Int = {
        randomInt(leftBound, rightBound)
    }

    // returns a random int in [l, r)
    def randomInt(l: Int, r: Int): Int = {
        Random.nextInt(r - l) + l
    }
}
