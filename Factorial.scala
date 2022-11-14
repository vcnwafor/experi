object Factorial { // we created an object
    // execution starts in the main method
    def main(args: Array[String]):Unit = {
        for( i <- 1 to 3)
            println(factorial(i))
    }

    def factorial(i: Int):Int = {
        //line 10, nested function
        def fact(i: Int, j: Int):Int ={
            if(i <= 1)
                j
            else
                fact(i - 1, i*j)
        }
        fact(i,1)
    }
}