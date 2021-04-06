# ThisXDoesNotExistBot

Telegram-bot, отправляющий изображения, сгенерированные нейросетью [StyleGAN](https://github.com/NVlabs/stylegan)

## Список команд

По ссылке в каждой команде можно ознакомиться с сайтом, с которого бот выгружает изображения

- [/anime](https://thisanimedoesnotexist.ai/)
- [/art](https://thisartworkdoesnotexist.com)
- [/cat](https://thiscatdoesnotexist.com/)
- [/fursona](https://thisfursonadoesnotexist.com/)
- [/person](https://thispersondoesnotexist.com/)
- [/pony](https://thisponydoesnotexist.net/)
- [/waifu](https://www.thiswaifudoesnotexist.net/)

## Запуск бота

Сначала необходимо вставить ваш токен в поле [`ThisXDoesNotExistBot.token`](https://github.com/IdeaSeeker/ThisXDoesNotExistBot/blob/master/src/main/scala/ru/ideaseeker/thisxbot/Main.scala#L16)

Непосредственно запуск выполняется с помощью команды `run` в sbt shell или вызова функции [`main`](https://github.com/IdeaSeeker/ThisXDoesNotExistBot/blob/master/src/main/scala/ru/ideaseeker/thisxbot/Main.scala#L50) средствами IDE

## Тестирование

Для тестов используется ScalaTest 3.2.5

Запуск командой `test` из sbt shell или, опять же, напрямую из файла [BotTest.scala](/src/test/scala/ru/ideaseeker/thisxbot/BotTest.scala)
