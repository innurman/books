/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {
    println("groupBy---------------")
    //groupBy
    class User(val name: String, val age: Int)
    var list= listOf<User>(User("kkang", 33), User("lee", 28))
    list= listOf<User>(User("kkang", 33), User("lee", 28), User("kim", 28))
    list.groupBy { it.age }
            .forEach {
                println("key : ${it.key} ... count : ${it.value.count()}")
                it.value.forEach { println("${it.name} .. ${it.age}") }
            }
}