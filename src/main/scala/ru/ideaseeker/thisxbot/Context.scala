package ru.ideaseeker.thisxbot

import ru.ideaseeker.thisxbot.strategies._

import com.bot4s.telegram.models.InputFile

object Context {

    private var strategy: IPictureStrategy = CatStrategy

    private val strategiesMap = Map(
        "anime"   -> AnimeStrategy,
        "art"     -> ArtStrategy,
        "cat"     -> CatStrategy,
        "fursona" -> FursonaStrategy,
        "person"  -> PersonStrategy,
        "pony"    -> PonyStrategy,
        "waifu"   -> WaifuStrategy,
    )

    def getStrategies: Map[String, IPictureStrategy] = strategiesMap

    // returns the successfulness of the operation
    def setStrategy(strategyName: String): Boolean = {
        if (!strategiesMap.contains(strategyName)) {
            return false
        }
        strategy = strategiesMap(strategyName)
        true
    }

    def getPicture: InputFile = {
        InputFile("picture" + strategy.fileExtension, strategy.get)
    }
}
