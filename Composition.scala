object Composition {
    def main(args: Array[String]): Unit =
    {
        //compose works with val and starts execution from the right
        //mul function is called 2*2 = 4, add function 4+1 = 5
        println((add compose mul)(2))

        //sub: 2-1 = 1, mul: 1*2 = 1, add: 2+1 = 3
        println((add compose mul compose sub)(2))

        //andThen works with val and starts execution from the left
        //add: 2+1 = 3, mul: 3*2 = 6, sub: 6-1 = 5
        println((add andThen mul andThen sub)(2))

        //passing methods to methods, it works with def and val.
        println(add(mul(2)))

        //more methods
        println(add(mul(sub(2))))

    }

    val add =  (a: Int) => { a + 1 }

    val mul = (a: Int) => { 
        a* 2
    }

    val sub = (a: Int) => a - 1
}