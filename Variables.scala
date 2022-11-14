object Variables {

    //mutable
    var a_mutable: Byte = 2
    var b_mutable: Int = 444
    var c_mutable: Long = 324324
    var d_mutable: Short = 5
    var e_mutable: Double = 2.0

    //immutable and type explicitly declared
    val a_immutable: Byte = 2
    val b_immutable: Int = 444
    val c_immutable: Long = 324324
    val d_immutable: Short = 5
    val e_immutable: Double = 2.0
    //NOTE: reassigning value to an immutable will cause problems

    //immutable and type not declared
    // operator used is +
    val x = 1 + 1

    val my_list_immutable: List[Int] = List(12,13,14,15,16,17,18,19,20,21,22,23,24)

    // operators: 
    
    //You can combine expressions by surrounding them with {}. We call this a block.
    println({
    val x = 1 + 1
    x + 1
    }) // 3

    def main(args: Array[String]): Unit = {
        //printing all the mutable
        println("printing mutable")
        println(a_mutable.getClass())
        println(a_mutable)
        println(b_mutable)
        println(c_mutable)
        println(d_mutable)
        println(e_mutable)

        //printing all the immutable
        println("printing immutable")
        println(a_immutable)
        println(b_immutable)
        println(c_immutable)
        println(d_immutable)
        println(e_immutable)
    }
}