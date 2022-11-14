class AreaOfSquare {
    var length = 20
    var height = 20

    def area():Unit =
    {
        var result =  height * length
        println("Area of Square: " + result)
    }

    def area(x:Int):Unit =
    {
        var result = x * x
        println("Area of Square: " + result)
    }
}

object Main
{
    def main(args: Array[String]): Unit =
    {
        //creating object of  class AreaOfSquare
        var obj = new AreaOfSquare()
        obj.area()
        obj.area(25)

        // I didn't need to use new keyword here
        AreaOfRect.area(7,8)
    }
}

object AreaOfRect {
    def area(l:Int, b:Int):Unit =
    {
        var result = l * b
        println("Area of Rect: "+result)
    }
}