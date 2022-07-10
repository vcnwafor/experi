object FactorialLoop {
    def main(args: Array[String]): BitInt = {
        val name:String = "Victor Chigozie Nwafor"
        print(name)
        for( i <- 0 to 10){
            format("%s: %sn",i,factorial_loop(i))
        }
    }

    def factorial_loop(i:BigInt): BigInt = {
        var result = Bigint(1)
        for (j <- 2 to i.intValue){
            result *=j
        } 
    }
}