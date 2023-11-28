package dev.hoyobox.api.v1.games

import dev.hoyobox.api.data.genshin.Characters
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Route.genshinImpactApi() {

    get("characters") {

    }

    get("character/{characterId}") {
        val characterId = call.parameters["characterId"] as String

        if (!Characters.contains(characterId)) {
            // TODO: error, because character not exists
        }


    }

}