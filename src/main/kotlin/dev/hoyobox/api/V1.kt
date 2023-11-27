package dev.hoyobox.api

import dev.hoyobox.api.v1.gamesApi
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.hoyoboxApiV1() {
    routing {
        route("v1") {
            route("games") {
                gamesApi()
            }
        }
    }
}