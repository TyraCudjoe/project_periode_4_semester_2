import jdk.swing.interop.SwingInterOpUtils

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

var username: String = ""
val player = Player("$username", 3, 1, 0, 20)
fun main(args: Array<String>) {

//    val travon = Player("Travon", 3, 2, 3, 4)
//    val trol = Enemy("troll", 3, 6, 0, 2)

    Thread.sleep(5000)
    println("Welcome to 'WENT BAD!'")
    println("This will be the trippiest text based game you will ever play.")
    println("And maybe one day, it will be a 2D or 3D game, but who knows")
    println("Pleas enter your character name (Press enter once and then write your name)")

    username = readLine().toString()
    player.name = username.toString()
    println(player)
    while (username!!.isBlank()) {
        println(username!!.isBlank())
        println("Pleas enter a valid username")
        username = readLine().toString()
    }
    Thread.sleep(1000)
    println("Are you ready to trip $username?")
    intro1()

}
    fun intro1() {

        println("You are going to a party with your friends")
        println(ANSI_BLUE + "It is 2 AM.")
        println(ANSI_RESET + "They asked you if you want to get shrooms")
        Thread.sleep(4000)
        println(ANSI_PURPLE +
                """            
          __.....__
       .'" _  o    "`.
     .' O (_)     () o`.
    .           O       .
   . ()   o__...__    O  .
. _.--""'"'       ""'"'--._ .
  :"                     ";
   `-.__    :   :    __.-'
      ""'"'-:   :-""'"'
           J     L
           :     :
          J       L
          :       :
          `._____.' 
     
        """.trimMargin())
        Thread.sleep(5000)
        println(ANSI_RESET + "You take the shroom and slowly faided...")
        lvl1()

    }
    fun lvl1() {

        println("You woke up in your own house.")
        println("After you woke up you already see that something is wrong.")
        println("Your house is completely broken!")
        println("Nothing is where it should be!")
        println("What should you do?")
        println("$ANSI_YELLOW New Objective: find out what happend$ANSI_RESET")
        Thread.sleep(4000)
        println(ANSI_WHITE_BACKGROUND+ANSI_BLACK+"""   
            
       _|\________
      /           /  
                 |    
       ____________\___
      /  || /--\ ||  ||
     /|[]|| |\ | ||[]||
 (*/)||__||_| \|_||__||()


        """.trimIndent())
        println(ANSI_RESET+ "")
        println("What do you want to do?")
        Thread.sleep(1000)
        println("press 1 to go outside")
        Thread.sleep(1000)
        println("press 2 to search the remains of your house")

        var options : String = ""


        val map = Loot("Map", LootType.OBJECT, 3.0)
        options = readLine().toString()





            when (options) {
                "1" -> "You are going outside" + loop()
                "2" -> "You found a map and went outside" + lvl2()
            }


        }
    fun loop() {
        Thread.sleep(3000)
        println("Before you stepped outside you notice a map laying on the ground.")
        println("You picked it up and went outside")
        lvl2()
    }

    fun lvl2() {
        println("You walked outside your house.")
        println(ANSI_PURPLE + "The sky is purple "  + ANSI_BLUE + "The trees are blue. Everything is diffrent")
        Thread.sleep(3000)
        println(ANSI_RESET + "Where are you? Did you travel to a new world?")
        println("You need to find answers!")
        println("A shadow appears from the dark, you hear growling.")
        println("""$ANSI_BLUE       ,     .
                       (\,;,/)
                        (o o)\//,
                         \ /     \,
                         `+'(  (   \    )
                            //  \   |_./
                          '~' '~----'    $ANSI_RESET""")
        println("It is a big blue rat! and it isn't peacefull!")

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


