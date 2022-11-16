import java.util.*

fun coinFlip(): String{
    val randomCoinFlip = arrayOf("HEADS","TAILS")
    return randomCoinFlip[Random().nextInt(randomCoinFlip.size)]
}

fun diceRoller() : Int {
    val dice = arrayOf(1,2,3,4,5,6)
    return dice[Random().nextInt(dice.size)]
}

fun main (){
    val rollDice = diceRoller()
    val flipCoin = coinFlip()
    println ("Type Dice to roll Dice and Coin to flip a coin : ")
    var input = readLine()
    when(input){
        "Dice" -> println("it's $rollDice")
        "Coin" -> println("it's $flipCoin")
        else -> println("invalid input")
    }
}
