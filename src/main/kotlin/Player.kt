class Player(name: String, life: Int = 3, level: Int = 3, score: Int = 0, Hitpoints: Int) : Character(name, life, level, score, Hitpoints) {
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