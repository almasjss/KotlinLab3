//Create super class Animal
open class Animal {
    open val image:String="Animal.png"
    open val food:String="Animal food"
    open val habitat:String="Animal habitat"
    open val hunger:String="Animal hunger"
    open fun makeNoise(){
        println("Noise!!!")
    }
    open fun eat(){
        println("The Animal is eating ")
    }
    open fun roam(){
        println()
    }
    open fun sleep(){
        println()
    }
}