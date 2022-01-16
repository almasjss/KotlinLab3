//Create super class with is properties
open class Reptile{
    open val type:String=""
    open val age:Int = 0
    open fun swim(){
         println("Swim")
    }
    open fun printAll(){
        println("...")
    }
}
//class inheritance

open class Crocodile:Reptile(){
    override val type: String="African crocodile"
    override val age:Int=8
    override fun swim(){
        println("Swim $type in swamp")
    }
    override fun printAll(){
        println("$type age is $age")
    }
}
//polymorphism
fun attackFeature(a:String){
    println("Reptile attack is :$a")
}
fun attackFeature(b:Int){
    println("Reptile attack score $b")
}

//abstract class
abstract class Snake:Reptile(){
    override abstract fun swim()
}
class Anaconda:Snake(){
    override fun swim() {
println("This snake can swim")
    }
}
fun main(){
    attackFeature(100)
    attackFeature("Fangs")
    val rep = Reptile()
    rep.swim()
    val croco = Crocodile()
    croco.swim()
    croco.printAll()
    val anaconda =Anaconda()
    anaconda.swim()
}