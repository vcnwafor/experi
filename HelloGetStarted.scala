object HelloGetStarted {
    // this is a single line comment
    /* this is a multiple line comment */

    // scala stands for scalable language, it's case-sensitive, it uses JVM to execute code.
    /* 
    NOTE: 
        keywords are reserved words. 
        Identifiers are simply names you assign and use for objects, classes, variables and methods.
        @line 1, we used object keyword to create a singleton class HelloGetStarted, because scala does not use static keywords.
    */
    // her popular frameworks are: Play, Spark, Lift

    //every scala program must have a main method from which execution starts.
    def main(args: Array[String]): Unit = {
        // the line below will print out an object to the default output, followed by a new line character
        println("Welcome to Scala in a nutshell")
    }

    /* scala has 4 types of identifiers:
        alphanumeric: starts with letter or underscore. e.g sum, _my_house
        operator: consists of one or more operator character. e.g + ++ :::
        mixed: consists of alphanumeric, then underscore and operator. e.g car_+
        literal: consists of abitrary strings enclosed in backticks. e.g `mybag`

    */

    /* some reserved words are:
        abstract, case, catch, object, $, =, =>, #, @, with, type, package, private, protected,
        def, do, if, else extends, final, finally, return, trait, throw, yield, val, var, Null,
        match, override, this, :, -, <-, for, false, <:, <%, >:,
        implicit, import, lazy, new, true, false, while, forSome, type, sealed, super, class, try 
    */

}