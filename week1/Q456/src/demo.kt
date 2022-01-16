//Create class Human,a String argument for the name
open class Human(var name: String, var mana: Int) {
    //add a flag to checkMana
    var isManaEmpty: Boolean = this.mana <= 0
    fun manaCheck() {
        if (isManaEmpty) {
            println("$name has no Mana.")
        } else {
            println("$name has Mana.")
            attack()
        }
    }

    //Add a method, attack()
    open fun attack() {
        println("$name use Fist Attack!")
    }
}

class Mage(name: String, mana: Int) : Human(name, mana) {
    override fun attack() {
        mana -= 80
        println("$name use Fireball!")
    }
}

fun main() {
    val human = Human("Human Zoe", 0)  //instance of Human
    human.attack()    //call the attack() method
    human.manaCheck()

    val mage = Mage("Mage Zoe", 100)
    mage.attack()
    mage.manaCheck()
}