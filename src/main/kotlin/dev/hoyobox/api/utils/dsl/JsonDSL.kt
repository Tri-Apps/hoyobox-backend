package dev.hoyobox.api.utils.dsl

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonObject

fun JsonObject(content: JsonObject.() -> Unit): JsonObject {
    val jsonObject = JsonObject()
    jsonObject.apply(content)
    return jsonObject
}

fun JsonArray(content: JsonArray.() -> Unit): JsonArray {
    val jsonArray = JsonArray()
    jsonArray.apply(content)
    return jsonArray
}

fun JsonObject.String(key: String, value: String) {
    this.addProperty(key, value)
}

fun JsonObject.Number(key: String, value: Number) {
    this.addProperty(key, value)
}

fun JsonObject.Boolean(key: String, value: Boolean) {
    this.addProperty(key, value)
}

fun JsonObject.Null(key: String) {
    this.add(key, JsonNull.INSTANCE)
}

fun JsonObject.JsonElement(key: String, value: JsonElement) {
    this.add(key, value)
}

fun JsonObject.JsonObject(key: String, value: JsonObject) {
    this.add(key, value)
}

fun JsonObject.JsonObject(key: String, content: JsonObject.() -> Unit) {
    this.add(key, JsonObject().apply(content))
}

fun JsonObject.JsonArray(key: String, value: JsonArray) {
    this.add(key, value)
}

fun JsonObject.JsonArray(key: String, content: JsonArray.() -> Unit) {
    this.add(key, JsonArray().apply(content))
}

fun JsonArray.String(value: String) {
    this.add(value)
}

fun JsonArray.Number(value: Number) {
    this.add(value)
}

fun JsonArray.Boolean(value: Boolean) {
    this.add(value)
}

fun JsonArray.Null() {
    this.add(JsonNull.INSTANCE)
}

fun JsonArray.JsonElement(value: JsonElement) {
    this.add(value)
}

fun JsonArray.JsonObject(value: JsonObject) {
    this.add(value)
}

fun JsonArray.JsonObject(content: JsonObject.() -> Unit) {
    this.add(JsonObject().apply(content))
}

fun JsonArray.JsonArray(value: JsonArray) {
    this.add(value)
}

fun JsonArray.JsonArray(content: JsonArray.() -> Unit) {
    this.add(JsonArray().apply(content))
}
