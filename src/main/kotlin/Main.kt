fun main(args: Array<String>) {
//    val travon = Player("Travon", 3, 2, 3, 4)
//    val trol = Enemy("troll", 3, 6, 0, 2)

    Thread.sleep(5000)
    println("Welcome to 'WENT BAD!'")
    println("This will be the trippiest text based game you will ever play.")
    println("And maybe one day, it will be a 2D or 3D game, but who knows")
    println("Pleas enter your character name (Press enter once and then write your name)")

    var username = readLine()

    while (username!!.isBlank()) {
        println(username!!.isBlank())
        println("Pleas enter a valid username")
        username = readLine()
    }
    println("Are you ready to trip $username?")


   var start = Start()
    start.intro1()



//    while (enteredString!!.isBlank()) {
//        println("please enter 'ready'")
//        enteredString = line
//    }
//    do {
//        println("test")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
        //    println("")
//    }while (enteredString != null)



//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")
//    println("")


}