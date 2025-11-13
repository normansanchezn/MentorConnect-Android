package com.accenture.core.functional

sealed class Either<out L, out R> {
    data class Left<out T>(val value: T) : Either<T, Nothing>()
    data class Right<out T>(val value: T) : Either<Nothing, T>()
}

inline fun <L, R, T> Either<L,R>.fold(
    onLeft: (L) -> T,
    onRight: (R) -> T
): T = when (this) {
    is Either.Left -> onLeft(value)
    is Either.Right -> onRight(value)
}