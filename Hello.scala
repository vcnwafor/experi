object Hello{
    def main(args: Array[String]): Unit = {
        println("Hello World")
        val names = Seq("john","mark","paul","bob","elvis","doe")
        val nums = Seq(1,2,3,4,5,6)

        // for(i <- 0 until 3) println(i)
        // for(i <- 0 to 3) println(i)

        // for(n <- names) println{n}
        // for(n <- names) println{n.capitalize}

         val res = for { n <- nums; l <- names} yield (n, l, l.length)
         println(res)

        for(i <- 1 to 10 if i < 4) println(i)

        for {
            i <- 1 to 10
            if i > 3
            if i < 6
            if i  % 2 == 0
        } println(i)

        val out = names.map(_.capitalize) 
        println(out)

        for(i <- 0 until names.length){
            println(s"$i is ${names(i)}")
        }
        // Beware: zipWithIndex creates a new sequence from the existing sequence, you may want to call view before invoking zipWithIndex
        for((name,count) <-names.zipWithIndex){
            println(s"$count is $name")
        }

        println("////////////////////////////////////////////////////////////////")
        val zwi2 = names.view.zipWithIndex

        for((name,count) <-names.view.zip(Stream from 2)){
            println(s"$count is $name")
        }

        names.zipWithIndex.foreach{ d => 
            println(s"${d._2} is ${d._1}")
        }

        println("////////////////////////////////////////////////////////////////")

        val nameMap = Map("firstname" -> "Victor", "lastname"-> "Nwafor")
        for((k,v) <- nameMap){
            println(s"key: $k, value: $v")
        }

        val result = for((k,v) <- nameMap) yield {
            s"key: $k, value: $v"
        }

        println(result)
        println("////////////////////////////////////////////////////////////////")
        val ratings = Map(
            "Lady in the Water" -> 3.0,
            "Snakes on a Plane" -> 4.0,
            "You, Me and Dupree" -> 3.5
        )

        for((name, rating) <- ratings) println(s"Movie: $name, Rating: $ratings")

        val a: Byte = 2
        val b: Int = 444
        val c: Long = 324324
        val d: Short = 5
        val e: Double = 2.0

        val f: String = """
                    this is just a multi-line text,
                    so it continues here,
                    and here.
                    """
        println(f)
        val g: String = "Hello\rWorld"
        val h: String = "Hello\tWorld"
        println(g)
        print(h)
    }

    

    
}

object GCD {

    def gcdList(list:List[Int]):Int = {

        // Local function

        def gcd(x:Int, y:Int):Int =

        if (y == 0) x else gcd(y, x%y)

        list match {

            case Nil => 0

            case h::t => gcd(h, gcdList(t))

        }

    }
}