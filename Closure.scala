object Closure {
    def main(args: Array[String]) : Unit ={
        println("playing with closure, as the return value depends on an external variable")
        println("multiplier(1) value = "+ multiplier(4))
        println("multiplier(2) value = "+ multiplier(5))
    }

    val factor = 5
    val multiplier = (i:Int) => i * factor
}