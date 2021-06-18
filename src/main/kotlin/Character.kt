open class Character(var name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0, var hitpoints: Int = 5) {
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0){
            hitpoints = remainingHitpoints
            println("$ANSI_RED $name took $damage points of damage and has  $hitpoints left. $ANSI_RESET")
        }else {
            if (life < 1){
                life -= 1
                println("$ANSI_RED $name has lost a life.$ANSI_RESET")
            }else {
                life -= 1
                println("$ANSI_RED $name is dead. and Does a finishing move!$ANSI_RESET")
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

    open fun attack(character: Character, minDamage: Int, maxDamage: Int){
        val attackDamage = (minDamage..maxDamage).random()
        character.takeDamage(attackDamage)
        Thread.sleep(2000)

    }
}