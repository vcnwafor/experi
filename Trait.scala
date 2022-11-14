trait Employee {
    val employer: String
}

trait Son {
    val father: String
    val mother: String
}

trait Being {
    val name: String
}

trait Kyrptonian extends Being {
    val residence: String
}

object Superman extends Kyrptonian with Son with Employee{
    val name = "Clark Kent"
    val mother = "Martha Kent"
    val father = "Jonathan Kent"
    val employer = "Daily Planet"
    val residence = "Metropolis"
}

println(Superman.name)


trait Mutant {
    def powers() : List[String] = List()
}

trait TelePathy extends Mutant {
    override def powers()= "Telepathy"::super.powers()
}

trait TeleKinesis extends Mutant {
    override def powers()= "Telekinesis"::super.powers()
}

trait PyroKinesis extends Mutant {
    override def powers()= "Pyrokinesis"::super.powers()
}

trait TimeTravel extends Mutant {
    override def powers()= "Time Travel"::super.powers()
}

trait RealityWarping extends Mutant {
    override def powers()= "Reality Warping"::super.powers()
}

val legion = (new Mutant 
with TelePathy 
with TeleKinesis 
with PyroKinesis 
with TimeTravel 
with RealityWarping)

println(legion.powers())