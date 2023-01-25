/**
 * Below program used to reverse string using In-built method and without in-built method
 */
fun main(){

    //Example with in-built method
    var name ="Yogita Derle"
    println(name.reversed())

    //Example without in-built method
    println(stringReverse(name))

    println(reverseString(name))
}

/**
 * Method used to reverse string using String Builder
 */
fun stringReverse(strName:String): String{
    return StringBuilder(strName).reverse().toString();
}

/**
 * Method used to reverse string using for loop
 */
fun reverseString(strName: String):String{
    var reverseString =""
    for(i in strName.length-1 downTo 0){
        reverseString+=strName[i]
    }
    return reverseString
}