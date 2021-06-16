fun main(args: Array<String>) {
    val ANSI_RESET = "\u001B[0m"
    val ANSI_BLACK = "\u001B[30m"
    val ANSI_RED = "\u001B[31m"
    val ANSI_GREEN = "\u001B[32m"
    val ANSI_YELLOW = "\u001B[33m"
    val ANSI_BLUE = "\u001B[34m"
    val ANSI_PURPLE = "\u001B[35m"
    val ANSI_CYAN = "\u001B[36m"
    val ANSI_WHITE = "\u001B[37m"

    val ANSI_BLACK_BACKGROUND = "\u001B[40m"
    val ANSI_RED_BACKGROUND = "\u001B[41m"
    val ANSI_GREEN_BACKGROUND = "\u001B[42m"
    val ANSI_YELLOW_BACKGROUND = "\u001B[43m"
    val ANSI_BLUE_BACKGROUND = "\u001B[44m"
    val ANSI_PURPLE_BACKGROUND = "\u001B[45m"
    val ANSI_CYAN_BACKGROUND = "\u001B[46m"
    val ANSI_WHITE_BACKGROUND = "\u001B[47m"
//    val travon = Player("Travon", 3, 2, 3, 4)
//    val trol = Enemy("troll", 3, 6, 0, 2)

    Thread.sleep(5000)
    println("Welcome to 'WENT BAD!'")
    println("This will be the trippiest text based game you will ever play.")
    println("And maybe one day, it will be a 2D or 3D game, but who knows")
    println("Pleas enter your character name (Press enter once and then write your name)")

    var username = readLine()
    val player = Player("$username", 3, 1, 0, 20)
    while (username!!.isBlank()) {
        println(username!!.isBlank())
        println("Pleas enter a valid username")
        username = readLine()
    }
    println("Are you ready to trip $username?")


    fun intro1() {

        println("You are going to a party with your friends")
        println(ANSI_BLUE + "It is 2 AM.")
        println(ANSI_RESET + "They asked you if you want to get shrooms")
        Thread.sleep(4000)
        println(ANSI_PURPLE +
                """            
            |                   /--------\ 
            |                /---    o   ---\
            |             /---  o        o  ---\
            |           /---o       o          --\
            |           \_______         o ______/
            |                   \         /
            |                    |       |
            |                    |       |
            |                   /         \
            |                  /___________\
            |
        """.trimMargin())
        Thread.sleep(5000)
        println(ANSI_RESET + "You toke the shroom and slow faided...")

    }

    fun home1() {

        println("You woke up in your own house.")
        println("After you woke up you already see that something is wrong.")
        println("Your house is completely broken!")
        Thread.sleep(4000)
        println(ANSI_WHITE_BACKGROUND+ANSI_BLACK+"""   
            
                             ________________
                            /                 \ 
                           |                   \
                                                \ 
                                                 \
                           _______________________\ 
                                                   | 
                           \                       |   
                           |                       |
              _________  __/                ____   |
            |/         \/                  |    |  | 
            |                              |   _|  | 
            |                              | _/ |  |                       
            |______________________________|/___|__|
        """.trimIndent())
        println(ANSI_RESET+ "")
        println("What do you want to do?")
        Thread.sleep(1000)
        println("press 1 to go outside")
        Thread.sleep(1000)
        println("press 2 to search the remains of your house")

        var options : String = ""

        when (options) {
            "1" -> "You are going outside"
            "2" -> "You found a map"

        }
    }

fun home2() {

}
    intro1()
    println("typ 1 to continue")


    val options : String = ""
    when(options) {
        "1"-> home1()
        else -> {
            println("Try again")
        }

    }


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