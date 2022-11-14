// Companion class
class Car
{
    var str1 = "driving";
    var str2 = "Stopped";
     
    // Method of Companion class
    def drive(): Unit =
    {
        println(str1)
    }

    def stop(): Unit =
    {
        println(str2)
    }
}
 
// Companion object
object Car
{
    def main(args: Array[String]): Unit =
    {
        var obj = new Car();
        obj.drive();
        obj.stop();
    }
}