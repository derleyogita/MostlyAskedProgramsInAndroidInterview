import java.util.*

/**
 * EX: Input => List of City eg. => Nagpur, Mumbai, Pune, Nagpur, Pune, Nashik,Nagpur
 * Output =>Nagpur 3 times,Mumbai 1 time,Pune 2 times,Nashik 1 time
 */

fun main(){

    //1st approach using distinct
    val cities = mutableListOf("Nagpur","Mumbai","Pune","Nashik","Nagpur","Mumbai","Pune")
    for(i in cities.distinct()){
        println(i + " - " + Collections.frequency(cities,i))
    }

    //2nd approach groupingBy
    val cityCount = cities.groupingBy { it }.eachCount()
    println(cityCount)

    //3rd approach using Map - Using LinkedHashMap it helps to maintain the order
    val map: MutableMap<String, Int> = LinkedHashMap()
    for(i in cities){
        var count = map[i]
        if (count == null) count =0
        map[i] = count+1
      println(map)
    }

    //3rd approach - mutableMap
    var count = mutableMapOf<String,Int>()
    cities.forEach{it->
        if(count.containsKey(it))
         {
             var a =count?.get(it)!!
             count.put(it,a.plus(1)!!)
         }else {
             count.put(it,1)
        }
        }
    println(count)
}