import java.util.*

/**
 * Input => List of City eg. => Nagpur, Mumbai, Pune, Nagpur, Pune, Nashik,Nagpur
 * Output =>Nagpur 3 times,Mumbai 1 time,Pune 2 times,Nashik 1 time
 */

fun main(){
    val list = mutableListOf("Nagpur","Mumbai","Pune","Nashik","Nagpur","Mumbai","Pune","Nashik")
    for(i in list.distinct()){
        println(i + " - " + Collections.frequency(list,i))
    }
}