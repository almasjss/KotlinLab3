//Create class Hippo

open class Hippo:Animal(){
    override val image="Hippo.png"
    override val food="fish"
    override val habitat="reservoir"

    override fun makeNoise() {
        println("Hmmmm!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}