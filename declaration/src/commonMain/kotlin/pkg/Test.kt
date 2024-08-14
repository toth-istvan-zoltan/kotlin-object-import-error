package pkg

object Test {
    operator fun plusAssign(a: Int) {
        println("a: $a")
    }
}