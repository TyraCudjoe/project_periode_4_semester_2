import jdk.swing.interop.SwingInterOpUtils
import java.awt.PageAttributes

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
var options : String = ""
var username: String = ""


var player = Player("$username", 3, 1, 0, 20)


val map = Loot("Map", LootType.OBJECT, 3.0)
val CloakOfDodge = Loot("Cloak of Armor", LootType.ARMOR, 10.0)
val TheSwordOfTheForgotten = Weapon("The Sword Of the Forgotten", 4, 8)
var BloodySword = Weapon("Bloody Sword", 3, 6)



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
    lvl3()

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




        options = readLine().toString()





            when (options) {
                "1" -> {
                    println("You are going outside")
                    player.inventory.add(map)
                    Thread.sleep(1000)
                    loop()
                }
                "2" -> {
                    println("You found a map and went outside")
                    player.inventory.add(map)
                    Thread.sleep(1000)
                    lvl2()
                }
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
        Thread.sleep(1000)
        println("You need to find answers!")
        Thread.sleep(1000)
        println("A shadow appears from the dark, you hear growling...")
        Thread.sleep(2000)
        val Bluerat = Bluerat("Blue rat", 1)
        println("It is a big blue rat! and it isn't peaceful!")
        while(Bluerat.life > 0) {
            println("""$ANSI_BLUE       
                       ,     .
                       (\,;,/)
                        (o o)\//,
                         \ /     \,
                         `+'(  (   \    )
                            //  \   |_./
                          '~' '~----'    $ANSI_RESET""")
            println("You need to fight it!")
            Thread.sleep(1000)
            println("Press 1 to attack")
            Thread.sleep(1000)
            println("Press 2 to doge attack")
            Thread.sleep(1000)
            println("Press 3 to show player")
            Thread.sleep(1000)
            println("Press 4 to see objective")


            options = readLine().toString()

            if (Bluerat.life > 0) {
                println("Bluerat is starting an attack")
            }

            when (options) {
                "1" -> {
                    player.attack(Bluerat, player.weapon.minDamage, player.weapon.maxDamage)
                    Bluerat.attack(player, 0, 2)
                }
                "2" -> {
                    var number = (0..1).random()


                    if (number == 0) {
                        println("You tried to dodge the attack")
                        Thread.sleep(1000)
                        println("but you failed")
                        Bluerat.attack(player, 0, 2)
                    } else {
                        println("You tried to dodge the attack")
                        Thread.sleep(1000)
                        println("And succeed")
                        player.attack(Bluerat, player.weapon.minDamage, player.weapon.maxDamage)
                    }
                }
                "3" -> println(player)
                "4" -> println("$ANSI_YELLOW New Objective: find out what happend$ANSI_RESET")

                else -> {
                    println("No valid input detected ")
                }
            }
        }
        println("You defeated your first enemy!")
        Thread.sleep(1000)
        println("You decapitated the rat. Inside the stomach of the rat you see something shining ")
        Thread.sleep(1000)
        println("""    ,     .
                       (\,;,/)
                        (x x)
                         \ / 
                         `+' 
         $ANSI_RED        
                          \_/
                          \/\\/     
                          _______           $ANSI_RESET
                         """)
        println("Do you wish to grab the shiny object?")
        println("Press 1 to grab the object")
        println("Press 2 to leave the object")
        options = readLine().toString()





        when (options) {
            "1" -> {
                println("You grabbed the object. It is a bloody sword!")
                println(""" $ANSI_RED 
         />_________________________________
[########[]_________________________________>
         \> $ANSI_RESET
      """)
                player.weapon = BloodySword
                println()
                Thread.sleep(1000)

            }
            "2" -> {
                println("You continued with your journey")
                Thread.sleep(1000)

            }
        }
        println("After the fight you finally noticed that you are on a street")
        Thread.sleep(1000)
        println("You see a car standing still on the road")
        println("""$ANSI_PURPLE_BACKGROUND
            
                                                         
            ______________________________________________________________________        
$ANSI_RESET                                                                 
                        00                        ___----'// \  
                      0/\/\0                ___---      //   \  
                        ||            ___---          //____  \  
                        ||      ___---              // /____\ \  
                        ||___---                  /// |==__==| \ 
                    ___ ||                      ///   ~||~~||~ \  
              ___---                          ////     '        \    
            --                              ////     //         \    
            
            
            
        """.trimIndent())
        Thread.sleep(3000)
        println("You decided to walk to wards it")
        Thread.sleep(1000)
        println("""                    
                    ___..................____
           _..--''~_______   _____...----~~~\\
       __.'    .-'~  ___  \\~      [_`.7     \\
 .---~~      .'    / 0  0\ \\           __..--\\_
/             `-._|    >  | \\   _...~~~_..---~  ~~~~~~~~~~~~--.._
\              /  ~~~~~~----_\`-~_-~~__          ~~~~~~~---.._    ~--.__
 \     _       |==            |   ~--___--------...__          `-   _.--""'"'|
  \ __/.-._\   |              |            ~~~~--.  `-._ ___...--~~~_.'|_Y |
   `--'|/~_\\  |              |     _____           _.~~~__..--~~_.-~~~.-~/
     | ||| |\\_|__            |.../.----.._.        | Y |__...--~~_.-~  _/
      ~\\\ || ~|..__---____   |||||  .'~-. \\       |_..-----~~~~   _.~~
        \`-'/ /     ~~~----...|'''|  |/"_"\ \\   |~~'           __.~
         `~~~'                 ~~-:  ||| ~| |\\  |        __..~~
                                   ~~|||  | | \\/  _.---~~
                                     \\\  //  | ~~~
                                      \`-'/  / 
                                       `~~~~'""")
        Thread.sleep(3000)
        println("There is a person at the right window you started talking to him")
        println("$ANSI_GREEN Hello $username $ANSI_RESET")
        Thread.sleep(1000)
        println("Press 1 to ask: How do you know my name?")
        println("Press 2 to ask: Who are you?")

        options = readLine().toString()

        when (options) {
            "1" -> {
                println("How do you know my name?")
                println("$ANSI_GREEN I know everything. $ANSI_RESET")
                println("How?")
                Thread.sleep(1000)
                println("$ANSI_GREEN This is al in your head $ANSI_RESET")
                println("How do I leave!")
                Thread.sleep(1000)
                println("$ANSI_GREEN You have so many questions... $ANSI_RESET")
                Thread.sleep(2000)
                println("$ANSI_GREEN To leave your own head you will need to kill the one trapping you in your own head $ANSI_RESET")
                println("Who is that then?")
                Thread.sleep(1000)
                println("$ANSI_GREEN That is your task to find out. Good luck with your journey $ANSI_RESET")
                Thread.sleep(1000)
                println("The car drives away in full speed")


            }
            "2" -> {
                println("Who are you?")
                println("$ANSI_GREEN I am no one. $ANSI_RESET")
                Thread.sleep(1000)
                println("What do you mean?")
                println("$ANSI_GREEN I am a person made by you. $ANSI_RESET")
                Thread.sleep(1000)
                println("I do not understand...")
                println("$ANSI_GREEN This is al in your head $ANSI_RESET")
                println("How do I leave!")
                Thread.sleep(1000)
                println("$ANSI_GREEN You have so many questions... $ANSI_RESET")
                Thread.sleep(2000)
                println("$ANSI_GREEN To leave your own head you will need to kill the one trapping you in your own head $ANSI_RESET")
                println("Who is that then?")
                Thread.sleep(1000)
                println("$ANSI_GREEN That is your task to find out. Good luck with your journey $ANSI_RESET")
                Thread.sleep(1000)
                println("The car drives away in full speed")

            }
        }
        println("$ANSI_YELLOW New Objective: find out who is trapping you$ANSI_RESET")
        println("You look behind you. You see mountains and an entrance to a cave!")
        println("""
                               /   \              /'\       _                              
\_..           /'.,/     \_         .,'   \     / \_                            
    \         /            \      _/       \_  /    \     _                     
     \__,.   /              \    /           \/.,   _|  _/ \                    
          \_/                \  /',.,''\      \_ \_/  \/    \                   
                           _  \/   /    ',../',.\    _/      \                  
             /           _/m\  \  /    |         \  /.,/'\   _\                 
           _/           /MMmm\  \_     |          \/      \_/  \                
          /      \     |MMMMmm|   \__   \          \_       \   \_              
                  \   /MMMMMMm|      \   \           \       \    \             
                   \  |MMMMMMmm\      \___            \_      \_   \            
                    \|MMMMMMMMmm|____.'  /\_            \       \   \_          
                    /'.,___________...,,'   \            \   \        \         
                   /       \          |      \    |__     \   \_       \        
                  _/        |           \      \_     \     \    \       \_      
              /                               \     \     \_   \        \     
                                               \     \      \   \__      \    
                                                \     \_     \     \      \   
                                                  |      \     \     \      \  
                                                   \            |            \ 
            
            
            
        """.trimIndent())
        Thread.sleep(2000)
        lvl3()




    }
fun lvl3() {

    println("You are inside the cave")
    println("You hear a sound")
    Thread.sleep(1000)
    println("$ANSI_BLUE ACK, ACK, ACK, $ANSI_RESET")
    println("A bat flies to wards you. The bat is also hostile")
    println("You are awesome about how many creatures are hostile to you")
    Thread.sleep(1000)

    val Bat = Bat("Bat", 2)
    while (Bat.life > 0) {
        println("""
                  -.                       .-
              _..-'(                       )`-.._
           ./'. '||\\.      _ _ /| ACK!  .//||` .`\.
        ./'.|'.'||||\\|..   \'o.O' /  ..|//||||`.`|.`\.
     ./'..|'.|| |||||\``````=(___)=''''''/||||| ||.`|..`\.
   ./'.||'.|||| ||||||||||||.  U  .|||||||||||| ||||.`||.`\.
  /'|||'.|||||| |||||||||||||     ||||||||||||| ||||||.`|||`\
 '.|||'.||||||| |||||||||||||     ||||||||||||| |||||||.`|||.`
'.||| ||||||||| |/'   ``\||``     ''||/''   `\| ||||||||| |||.`
|/' \./'     `\./         \!|\   /|!/         \./'     `\./ `\|
V    V         V          }' `\ /' `{          V         V    V
`    `         `               V               '         '    '
        
        
        
        
        
        
    """.trimIndent())
        println("You need to fight it!")
        Thread.sleep(1000)
        println("Press 1 to attack")
        Thread.sleep(1000)
        println("Press 2 to doge attack")
        Thread.sleep(1000)
        println("Press 3 to show player")
        Thread.sleep(1000)
        println("Press 4 to see objective")


        options = readLine().toString()

        if (Bat.life > 0) {
            println("Bat is starting an attack")
        }

        when (options) {
            "1" -> {
                player.attack(Bat, player.weapon.minDamage, player.weapon.maxDamage)
                Bat.attack(player, 1, 4)
            }
            "2" -> {
                var number = (0..1).random()


                if (number == 0) {
                    println("You tried to dodge the attack")
                    Thread.sleep(1000)
                    println("but you failed")
                    Bat.attack(player, 0, 2)
                } else {
                    println("You tried to dodge the attack")
                    Thread.sleep(1000)
                    println("And succeed")
                    player.attack(Bat, player.weapon.minDamage, player.weapon.maxDamage)
                }
            }
            "3" -> println(player)
            "4" -> println("$ANSI_YELLOW New Objective: Kill the bat and continue with your previous objective$ANSI_RESET")

            else -> {
                println("No valid input detected ")
            }
        }
    }
    println("You killed the bat with no mercy")
    println("You still hear a sound")
    Thread.sleep(2000)
    println("Is the bat still alive?")
    println("The bat turns into dust, you see an item in the dust")
    Thread.sleep(2000)
    println("But a ghost appears from the dust as well!")
    println("""
        
     .-.
   .'   `.
   :g g   :
   : o    `.
  :         ``.
 :             `.
:  :         .   `.
:   :          ` . `.
 `.. :            `. ``;
    `:;             `:'
       :              `.
       `.              `.     .
          `'`'`'`---..,___`;.-'
        
    """.trimIndent())
    Thread.sleep(2000)
    println("$ANSI_BLUE WHoooooo you saved me from this bodyyyyy $ANSI_RESET")
    println("Press 1 to ask your self if you are going insane")
    println("Press 2 to start a conversation")
    Thread.sleep(1000)
    options = readLine().toString()

    when (options) {
        "1" -> {
            println("AM I GOING CRAZY!")
            println("$ANSI_BLUE WHoooooo youuu are going crazyyyy $ANSI_RESET")
            Thread.sleep(1000)
            println("You aren't helping me")
            println("$ANSI_BLUE WHoooooo dooo you wish me to help youuuu $ANSI_RESET")
            Thread.sleep(1000)
            println("Press 1 to say: Yes")
            println("Press 2 to say: No")
            Thread.sleep(1000)
            options = readLine().toString()
            when (options) {
                "1" -> {
                    println("Yes")
                    println("$ANSI_BLUE WHoooooo yoouu can get 1 item of meeee $ANSI_RESET")
                    println("What kind?")
                    Thread.sleep(1000)
                    println("$ANSI_BLUE WHoooooo the cloak of dodge or the sword of the forgotten $ANSI_RESET")
                    println("Press 1 to say: Cloak")
                    println("Press 2 to say: Sword")
                    Thread.sleep(1000)
                    options = readLine().toString()
                    when (options) {
                        "1" -> {
                            println("The cloak.")
                            println("$ANSI_BLUE WHoooo okayyyyy here you have it $ANSI_RESET")
                            Thread.sleep(1000)
                            println("You got a new cloak! and the ghost faids away")
                            Thread.sleep(1000)
                        }
                        "2" -> {
                            println("The sword")
                            println("$ANSI_BLUE WHoooo okayyyyy here you have it $ANSI_RESET")
                            Thread.sleep(1000)
                            println("You got a new sword!and the ghost faids away")
                        }
                    }
                }
                "2" -> {
                    println("No go away!")
                    println("$ANSI_BLUE WHoooo as you wish $ANSI_RESET")
                    Thread.sleep(1000)
                    println("The ghost faids away")
                }


            }
        }
        "2" -> {
            println("A ghost you kidding me....")
            println("$ANSI_BLUE Whoooo no I am not! $ANSI_RESET")
            println("$ANSI_BLUE WHoooo dooo you wish my help? $ANSI_RESET")
            Thread.sleep(1000)
            println("Press 1 to say: Yes")
            println("Press 2 to say: No")
            Thread.sleep(1000)
            options = readLine().toString()
            when (options) {
                "1" -> {
                    println("Yes")
                    println("$ANSI_BLUE WHoooooo yoouu can get 1 item of meeee $ANSI_RESET")
                    println("What kind?")
                    println("$ANSI_BLUE WHoooooo the cloak of armor or the sword of the forgotten $ANSI_RESET")
                    Thread.sleep(1000)
                    println("Press 1 to say: Cloak")
                    println("Press 2 to say: Sword")
                    Thread.sleep(1000)
                    options = readLine().toString()
                    when (options) {
                        "1" -> {
                            println("The cloak.")
                            println("$ANSI_BLUE WHoooo okayyyyy here you have it $ANSI_RESET")
                            Thread.sleep(1000)
                            println("You got a new cloak! and the ghost faids away")
                            player.inventory.add(CloakOfDodge)
                            player = Player("$username", 3, 1, 0, 40)
                            Thread.sleep(1000)
                            println(player)

                        }
                        "2" -> {
                            println("The sword")
                            println("$ANSI_BLUE WHoooo okayyyyy here you have it $ANSI_RESET")
                            Thread.sleep(1000)
                            println("You got a new sword! and the ghost faids away")
                            player.weapon = TheSwordOfTheForgotten


                            Thread.sleep(1000)
                        }
                    }
                }

            }


        }
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


