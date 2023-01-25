import java.util.*

/**
 * EX: Input => List of City eg. => Nagpur, Mumbai, Pune, Nagpur, Pune, Nashik,Nagpur
 * Output =>Nagpur 3 times,Mumbai 1 time,Pune 2 times,Nashik 1 time
 */

fun main(){

    //1st approach using distinct
    val list = mutableListOf("Nagpur","Mumbai","Pune","Nashik","Nagpur","Mumbai","Pune")
    for(i in list.distinct()){
        println(i + " - " + Collections.frequency(list,i))
    }

    //2nd approach groupingBy
    val cityCount = list.groupingBy { it }.eachCount()
    println(cityCount)

    //3rd approach using Map - Using LinkedHashMap it helps to maintain the order
    val map: MutableMap<String, Int> = LinkedHashMap()
    for(i in list){
        var count = map[i]
        if (count == null) count =0
        map[i] = count+1
        println(map)
    }


}