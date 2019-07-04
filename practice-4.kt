//// LAMBDAS
fun main(args: Array<String>) {
    //add(2, 13, {s: Int -> println(s)} )
    var lambda =  {s1: String, s2: String -> "$s1 : $s2"}

    myFunc("hello", "world", lambda)
}

//// HIGHER ORDER FUNCTION
fun myFunc(s1: String, s2: String, lambda: (String, String) -> String) {
    var res = lambda(s1, s2)
    println(res)
}



/* fun add(a: Int, b: Int, myLambda: (Int) -> Unit): Unit {
    var res = a + b
    myLambda(res)
} */