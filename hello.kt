fun main(args: Array<String>) {
    //println("Finally, Hello Kotlin!");
    // var obj = Person()
    // obj.name = "Zyandeep"

    // println("City: ${obj.CITY}")
    // println("Name: ${obj.name}; AGE: ${obj.AGE}")

    // var obj = Align();

    // obj.name = "Zyandeep";  // invoking setter
    // println("Java Object: ${obj.name}");            // invoking getter


    // var num1: Int = 12
    // var num2: Int = 9
    // var num3: Int = 21

    ////// string interpolation
    //println("addition of ${num1} and ${num2} is ${res}")

    ///// if-else as expression
    /* var res = if(num1 < num2) {
        if(num1 < num3) {
            num1
        }
        else {
            num3
        }
    }
    else {
        if(num2 < num3) {
            num2
        }
        else {
            num3
        }
    } */

    /* var res = if(num1 > num2) {
                num1
            }
            else if(num2 > num1) {
                num2
            }
            else {
                0
            } 

    println("Result is: ${res}") */

    // var str1: String = "Navin"
    // var str2 : String = "Navin"

    
    ///// Kotlin variables: Null and non-null; by default not null
    // var name: String? = "null"
   

    ///// Kotlin "when" => improved switch-case
    //val AGE: Int = 10
    // val name: String = "ball"

    // when(name) {
    //     "apple" -> println("Apple")
    //     "ball" -> println("Ball")
    //     "same" -> println("Same")
    //     else -> println("no match") 
    // }

    // var res = when(AGE) {
    //     1 -> "One"
    //     2 -> "Two"
    //     10 -> "Ten"
    //     else -> "no match"
    // }

    ///// RANGES and LOOPS
    //var nums = 16 downTo 1
     //1..10
    //nums = 1 until 10

    /* for (i in nums step 2) {
        println(i)   
    }

    println("count = ${nums.count()}") */

    ///// LIST and MAPS
    //var nums = listOf(1, 2, 3.98, 4, "hello", false)

    /* for (i in nums) {
        println(i)
    } */

    /* for ((i, v) in nums.withIndex()) {              // touples => (i, e)
        println("$i => $v")
    } */

    var people = HashMap<String, Int>()
    people["bob"] = 12
    people["john"] = 13
    people["ram"] = 16

    //println(people["bob"])

    for ((k, v) in people) {
        println("key: $k; value: $v")
    }




}