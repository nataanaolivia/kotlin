
import java.time.LocalDate
import java.time.LocalTime
import java.util.*


fun main(){

    classe()
    mit()


}

fun classe(){

//    while loop

    var home = 15

    while (home < 20){
        println(home)
        home++
    }

}

fun mit(){

        val systemTimeZone = TimeZone.getDefault()

        println("Current system time zone: ${systemTimeZone.id}")


       val localtime = LocalTime .now()

     println("current time  :${localtime}")


    val  localDate = LocalDate .now()
    println("current date :${localDate}")




}

