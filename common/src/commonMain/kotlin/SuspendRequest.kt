package ru.otus.kotlin.loadtest.kmp

expect class SuspendRequest() {
    suspend fun request(): String
}