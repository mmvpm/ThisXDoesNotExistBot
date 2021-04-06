package ru.ideaseeker.thisxbot

trait IPictureStrategy {

    def url: String

    def fileExtension: String = ".jpg"

    def get: Array[Byte] = scalaj.http.Http(url).asBytes.body
}
