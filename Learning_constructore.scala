class Employee(FirstName: String, LastName: String, Address: String, City: String) 
{ // the primary constructor above has four parameters

    var phone: String = "0"
    def identity():Unit =
    {
        println("Full Name: " + FirstName + " " + LastName)
        println("Address: " + Address)
        println("City: " + City)
        println("Phone: " + phone)
    }

    // Auxiliary constructor
    def this(FirstName: String, LastName: String, Address: String, City: String, Phone: String)
    {
        // invoking primary constructor
        this(FirstName, LastName,Address,City)
        this.phone = Phone
    }
}

class Employer
{ // the primary constructor above has zero parameters

    def identity():Unit =
    {
        println("I am the employer")
    }
}

object Main 
{
    def main(args: Array[String]): Unit =
    {
        var anEmployee = new Employee("Victor","Nwafor","Some place in Nigeria","Abuja")
        anEmployee.identity()

        var anEmployer = new Employer()
        anEmployer.identity()
    }
}