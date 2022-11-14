object HelloGetStarted {
    // a single line comment
    /* a multiple line comment */

    // Scala_data_type can be: String, Char, Unit, Boolean, Byte, Int, Short, Long, Float, Double 
    //var variable_name : Scala_data_type = value

    // variables can be either mutable or immutable
    var i_am_mutable: String = "mutable bucket" // mutable variable
    val i_am_immutable: String = "immutable bucket" // immutable variable

    //every scala program must have a main method from which execution starts.
    def main(args: Array[String]): Unit = {
        println("Welcome to Scala 101") //Print out an object to the default output
        println(i_am_mutable)
        println(i_am_immutable)
        
        /* Identifiers are names you assign and use for objects, classes, variables and methods. 
        scala has 4 types of identifiers:
        alphanumeric: starts with letter or underscore. e.g sum, _my_house
        operator: consists of one or more operator character. e.g + ++ :::
        mixed: consists of alphanumeric, then underscore and operator. e.g car_+
        literal: consists of abitrary strings enclosed in backticks. e.g `mybag`
        */
    
        // main, _name1, and Tuto_rial are
        // valid alphanumeric identifiers
        var _name1: String = "Ben Doe"
        var Another_Post: String = "Scala 101"
            
        println(_name1)
        println(Another_Post)
    
        // main, k, p, and sum are valid
        // alphanumeric identifiers
        var k:Int = 20
        var p:Int = 10
            
        // Here, + is a operator identifier
        // which is used to add two values
        var sum = k + p
        println("Display the result of + identifier:")
        println(sum)
    
        // num_+ is a valid mixed identifier
        var num_+ = 700
        println("Display the result of num_+ identifier:")
        println(num_+)
    
        // `name` and `age` are valid literal identifiers
        var `hisname` = "Mark Doe"
        var `hisage` = 31
        println("Name:" +`hisname`)
        println("Age:" +`hisage`)
    }
}

// Problem solving skills
// Algorithms and Data Structures
// Algorithm complexity
// Unit testing & Testing environments
// Clean Code