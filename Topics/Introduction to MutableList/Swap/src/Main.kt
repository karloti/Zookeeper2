fun main() = readln()
    .split(' ')
    .map { it.toInt() }
    .toMutableList()
    .apply { this[0] = last().also { this[lastIndex] = first() } }
    .joinToString(" ")
    .let(::println)