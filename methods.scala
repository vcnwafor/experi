object MyClass {
    def datatype(x:Int){
        println("The parameter is of Integer datatype")    
    }
    
    def datatype(x:Float){
        println("The parameter is of Float data type")    
    } 
    
    def datatype(x:Char){
        println("The parameter is of Character data type")    
    }
    
    def datatype(x: Boolean){
        println("The parameter is of Boolean data type")    
    }
    
    def main(args: Array[String]) {
        
        datatype(4.0f)
    }
}