fun main(args: Array<String>){
    val travon = Player("Travon", 3, 2, 3, 4)
    val trol = Enemy("troll", 3, 6,0, 2)


    println("Welcome to 'WENT BAD!'")
    println("This will be the trippiest text based game you will ever play.")
    println("And maybe one day, it will be a 2D or 3D game, but who knows")
    println("When you're ready to start type 'ready'")

    var enteredString = readLine()
    var line = "ready"
    while (enteredString!!.isBlank()) {
        println("please enter 'ready'")
        enteredString = readLine()
//        else {
//            line = "ready"
//            println("you are going to the next level")
//        }

    }

//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")


}