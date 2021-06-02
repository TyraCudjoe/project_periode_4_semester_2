open class Character(val name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0, var hitpoints: Int) {
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0){
            hitpoints = remainingHitpoints
            println("$name took $damage points of damage and has  $hitpoints left.")
        }else {
            if (life > 0){
                life -= 1
                println("$name has lost a life.")
            }else {
                println("$name is dead.")
            }
        }
    }

    override fun toString(): String {
        return  """
           name:        $name
           hitpoints:   $hitpoints
           life:        $life
                """
    }
}