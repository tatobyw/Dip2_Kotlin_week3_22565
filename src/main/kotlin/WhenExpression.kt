fun WhenExpression(){
    val extname = ".kt"
    when(extname){
        ".kt"-> println("Kotlin File")
        ".java"-> println("Java File")
        else-> println("Unknow")
    }
}

fun WhenExpression2(){
    val country = "THAULAND"
    when(country){
        "UK","USA","AUS","CANADA"-> println("ENGLISH")
        "VIETNAM","LOA","THAILAND"-> println("SUWANNAPHUM")
        "CHINA","TAIWAN","HONG KONG"-> println("CHINESE")
    }
}

fun WhenExpression3(){
    val device = "OPPO"
    val os = when(device){
        "OPPO","VIVO","SAMSUNG"->"ANDROID"
        "IPHONE"->"IOS"
        "IPAD"->"IpadOS"
        else->"Unknow"
    }
    println(os)
}