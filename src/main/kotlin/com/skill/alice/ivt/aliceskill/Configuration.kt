package com.skill.alice.ivt.aliceskill

import com.justai.jaicf.BotEngine
import com.justai.jaicf.channel.yandexalice.AliceChannel
import com.skill.alice.ivt.aliceskill.MainScenario

val skill = BotEngine(
    model = MainScenario(Handler()).model
)

val channel = AliceChannel(
    botApi = skill,
    useDataStorage = true,
    oauthToken = System.getenv("OAUTH_TOKEN")
)