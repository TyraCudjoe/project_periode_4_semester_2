class Enemy(name: String, life: Int = 3, level: Int = 3, score: Int = 0, Hitpoints: Int) : Character(name, life, level, score, Hitpoints) {
    var weapon: Weapon = Weapon("Fists", 3)
}