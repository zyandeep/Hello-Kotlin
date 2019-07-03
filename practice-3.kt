fun add(t: Int): Unit = println(t + 10)

fun main(args: Array<String>) {

    ///// HIGHER ORDER FUNCTIONS(LAMDAS)
    var nums: List<Int> = listOf(10, 20, 30, 40)

    //nums.forEach({ n -> println(n) })
    nums.forEach(:: add)



    ///// ARRAYS
    //var nums = intArrayOf(12, 5, 67, 4, 33)
  /*   var nums = IntArray(4)
    nums.set(0, 12)
    nums.set(1, 16)
    nums[2] = 18
    nums[3] = 4 */

    /* var names = arrayOfNulls<String>(3)
    names[0] = "Bob"
    names[1] = "zyan"
    names.set(2, "John") */
/* 
    var students = arrayOfNulls<Student>(3)
    students.set(0, Student("bob", 12))
    students.set(1, Student("ram", 23))
    students.set(2, Student("nitin", 10))
 */

    //nums[2] = 33
    //nums.set(2, 40)

    /* for (i in nums) {
        println(i)    
    } */

   /*  for(i in 1..nums.size) {
        println(nums.get(i-1))
    } */


    ///// LIST => READ-ONLY AND MUTABLE
    //var nums = listOf<Int>(12, 3, 45, 6)

   /*  var nums = mutableListOf<Int>(12, 3, 45, 6)
    nums.add(21)
    nums.set(1, 11)
    nums.remove(45) */

    //var students: List<Student> = listOf<Student>(Student("navin", 12), Student("sweta", 10)) 

   /*  var students = mutableListOf<Student>()
    students.add(Student("navin", 12))
    students.add(Student("sweta", 10)) 

    for (s in students) {
        s.age += 10
        println(s)
    } */
}