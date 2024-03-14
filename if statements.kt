
fun main(){

    ifss()

    classes()
    grades()


}


fun ifss(){


//    variables



    var eng:Int = 44
    var kis:Int = 77

    if (eng > kis) {
        println("eng > kis")
    }else if(eng < kis){
        println("eng < kis")


    }
    else{
        println("eng == kis")
    }


}


fun classes(){

//    variables

    var number:Int = 2

    if(number>0){

        println("Positive")
    }else if(number<0){

        println("Negative")}

    else {

        println("Zero")
    }




}

fun grades(){

//    variables

    var math:Int = 90
    var phy:Int = 90
    var geo:Int = 90


    var sum:Int = math+phy+geo
    println("sum: $sum")

    var average:Int = (math+phy+geo)/3
    println("average: $average")

    if(average>80){

        println("A")

    }else if (average<= 70){
        println("B")

    }else{
        println("c")
    }



    }















