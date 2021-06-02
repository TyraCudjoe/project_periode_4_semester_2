class Player(name: String) : Character(name) {
    var weapon: Weapon = Weapon("Fists", 6)
    val inventory = ArrayList<Loot>()

    fun show(){
        if (life <= 0){
            println("$name is dead!")
        }else {
            println("$name is still alive!")
        }
    }

}