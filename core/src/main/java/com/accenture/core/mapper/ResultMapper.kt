package com.accenture.core.mapper

fun interface ResultMapper<T, R> {
    fun map(input: T): R
}