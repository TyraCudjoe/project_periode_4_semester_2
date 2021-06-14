class Start {
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

    fun intro1() {

        println("You are going to a party with your friends")
        println(ANSI_BLUE+ "It is 2 AM.")
        println("They asked you if you want to get shrooms")
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
        Thread.sleep(10000)
        println(ANSI_RESET +"You toke the shroom and slow faided...")

    }



}
