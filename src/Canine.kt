//1.Create Class Canine
open class Canine: Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}
//2.Create Class Wolf
class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat="forests"

    override fun makeNoise() {
    println("Hooooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}