/**
 * Magic Eight Ball
 * @author LeviathanKodex
 * This was made for JVM NOT for a phone Application.
 ************************
 * How it works:
 ************************
 * Get user's Question
 * Sends user's Question
 * Sends a Random String from 20 possible answers
 * */
 fun main(){
    val options = arrayOfNulls<Int>(20)
    var isGameOver : Boolean = false
   loop@  while(!isGameOver) {
        val optionsParam = (Math.random() * options.size).toInt()
        println("The Magic 8-Ball Knows all, ask a question of your choice.")
        println("Just ask a Yes or No Answer, and you shall get a Valid Answer.")
        println("To exit the game, simply type in Exit.")
        val userChoice = UserSide().getUserInput()
        if(userChoice == "Exit" || userChoice == "exit"){
            println("Thanks for playing!")
            break
        } else if(userChoice == ""){ //Checks to ensure user placed something valid
            println("Please put in a valid answer.")
            continue@loop //Restarts loop at beginning
        }

        println("User: $userChoice.")

        //Debugging
        //println("Number Randomly assigned: $optionsParam")

        //Gives an answer based on the random number given
        when (optionsParam) {
            0 -> println("Magic 8-Ball: It is Certain.")
            1 -> println("Magic 8-Ball: It is Decidedly so.")
            2 -> println("Magic 8-Ball: Without a doubt.")
            3 -> println("Magic 8-Ball: Yes - definitely.")
            4 -> println("Magic 8-Ball: You may rely on it.")
            5 -> println("Magic 8-Ball: As I see it, yes.")
            6 -> println("Magic 8-Ball: Most Likely.")
            7 -> println("Magic 8-Ball: Outlook good.")
            8 -> println("Magic 8-Ball: Yes.")
            9 -> println("Magic 8-Ball: Signs point to yes.")
            10 -> println("Magic 8-Ball: Reply hazy, try again.")
            11 -> println("Magic 8-Ball: Ask again later.")
            12 -> println("Magic 8-Ball: Better not tell you now.")
            13 -> println("Magic 8-Ball: Cannot predict now.")
            14 -> println("Magic 8-Ball: Concentrate and ask again.")
            15 -> println("Magic 8-Ball: Don't count on it.")
            16 -> println("Magic 8-Ball: My reply is no.")
            17 -> println("Magic 8-Ball: My sources ay no.")
            18 -> println("Magic 8-Ball: Outlook not so good.")
            19 -> println("Magic 8-Ball: Very doubtful.")
        }

    }


}
//Made it into a class, but could easily be placed into main()
class UserSide {
    fun getUserInput(): String {
        val isValid = false
        var userChoice = ""
        val userInput = readLine()
         //Null check
        if (userInput != null) userChoice = userInput

        return userChoice
    }
}



