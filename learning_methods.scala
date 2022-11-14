object Learning_Methods {
    def main(args: Array[String]): Unit = 
    {
        val mylist = List(1,11,3,4,5,6,7,8,9,10,11, 2, 3, 4, 5, 6, 7)

        println(40.getClass)
        println("batmanfirst".drop(3).take(3).capitalize)
        println("reversing: " + mylist.reverse)

        val myReducedList = mylist.reduce((x,y) => x max y)
        println("reducing: "+myReducedList)

        println("squaring ")
        val squaredList = mylist.map(square)
        //passing anonymous function to map
        val s2List = mylist.map(x => x*x)
        println(squaredList)

        println("cubing ")
        val cubedList = mylist.map(cube)
        //passing anonymous function to map
        val c2List = mylist.map(x => x*x*x)
        println(cubedList)

        //The filter() method is utilized to select all elements of the list which satisfies a stated predicate.
        val myfilteredList = mylist.filter(_ < 5)
        println("Printing list ")
        println(myfilteredList)

        //deeper look at mapping
        val mymap = Map("Nigeria" ->3, "Ghana" ->4, "Benin" ->5, "Camerounn" ->6, "Kenya" ->7)
        val myfilteredMap = mymap.filter(x => x._1 == "Nigeria" && x._2 == 3)
        println("Printing filtered map ")
        println(myfilteredMap)

        val myfilteredMapEmpty = mymap.filter(x => x._1 == "England" && x._2 == 3)
        println("Printing empty map")
        println(myfilteredMapEmpty)

        val containsCheck = mylist.contains(20)
        println("printing containsCheck: " + containsCheck)

        val existsCheck = mylist.exists(x => { x % 5 == 0 })
        println("pringing existsCheck: " + existsCheck)

        val forallCheck = mylist.forall(x => { x % 5 == 0 })
        println("printing forallCheck: " + forallCheck)

        val longString = "Another way to learn something nice"
        val mysubString = longString.substring(8)
        println("printing mysubString: "+mysubString)

        println("printing indexOf w: "+longString.indexOf('w'))
    }

    val square = (x: Int) => x*x

    def cube(x: Int):Int = x*x*x
}