package dev.hoyobox.api.v1

import dev.hoyobox.api.utils.dsl.JsonArray
import dev.hoyobox.api.utils.dsl.JsonObject
import dev.hoyobox.api.utils.dsl.Number
import dev.hoyobox.api.utils.dsl.String
import dev.hoyobox.api.v1.games.genshinImpactApi
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.gamesApi() {

    get("list") {
        call.respond(JsonObject {
            Number("code", 0)
            String("message", "success")
            // TODO: read data from database instead of static
            JsonObject("data") {
                Number("count", 4)
                JsonArray("games") {
                    JsonObject {
                        String("id", "hk3")
                        String("name", "Honkai Impact 3rd")
                    }
                    JsonObject {
                        String("id", "gi")
                        String("name", "Genshin Impact")
                    }
                    JsonObject {
                        String("id", "hsr")
                        String("name", "Honkai: Star Rail")
                    }
                    JsonObject {
                        String("id", "zzz")
                        String("name", "Zenless Zone Zero")
                    }
                }
            }
        })
    }

    genshinImpactApi()

}