import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main(args: Array<String>) {
//Задача 1
    val myAge = 18
    val isTeenager = (13 < myAge) && (myAge < 19)
//-----------------------------

//Задача 2
    val theirAge = 30
    val bothTeenagers = (13 < theirAge) && (theirAge < 19) && isTeenager
//----------------------------------

//Задача 3
    val reader = "Андрей"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
//-----------------------------

//Задача 4
    val readerBeforeAuthor = reader < author
//----------------------

//Задача 5
    val myAge2 = 18
    if (13 < myAge2 && myAge2 < 19) println("Подросток")
    else println("Не подросток")
//------------------------

//Задача 6
    val answer:String
    if (13 < myAge2 && myAge2 < 19)  answer = "Подросток"
    else  answer = "Не подросток"
    println(answer)
//-------------------------

//Задача 7
    var counter = 0
    while (counter < 10)
    {
        print("counter равен $counter; ")
        counter+=1
    }

//----------------------------

//Задача 8
    println()
    counter = 0
    var roll = 0
    do {
        roll = (0..5).random()
        counter++
        println("После $counter бросков roll равен $roll")
    }
        while (roll != 0)
//--------------------------

//Задача 9
    val range = 0..10
    for (i in range)
    print(" " + i.toDouble().pow(2.0))
//-----------------------------

//Задача 10
    println()
    for (i in range)
        print(" " + sqrt(i.toDouble()))
    println()
//-----------------------

//Задача 11
    var sum = 0
    for (row in 1 until 8 step 2) {
        /*if (row % 2 == 0)
            continue*/
    for (column in 0 until 8)
    sum+= row * column

}
    println(sum)
}