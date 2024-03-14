fun main(){

    digits()

}

fun digits(){

//    variables

    var home:Int=300

    if(home > 1 && home<=9){
        println("one digit")

    }else if (home >10 && home<=99){
        println("two digits")

    }else if (home>=100 && home<=999){
        println("three digits")
    }else if(home<-1){
        println("negative")

    }else{
        println("four digits")
    }




}
