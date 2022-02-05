fun karlo(s: String, f: (String) -> String) = f("Karlo is number $s")

fun main() = karlo("1") { it.reversed() }.let(::println)