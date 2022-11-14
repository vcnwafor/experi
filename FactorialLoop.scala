object FactorialLoop {
    def main(args: Array[String]): Unit = {
        val name:String = "Victor Chigozie Nwafor"
        print(name)
        for( i <- 0 to 10){
            var k = factorial_loop(i)
            println(s"$i: $k")
        }
    }

    def factorial_loop(i:BigInt): BigInt = {
        var result = BigInt(1)
        for (j <- 2 to i.intValue){
            result *=j
        } 
        return result
    }
}