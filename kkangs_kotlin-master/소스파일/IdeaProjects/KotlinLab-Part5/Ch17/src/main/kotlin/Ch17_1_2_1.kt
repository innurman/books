package seventeen_one_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MyClass<T, A> {
    var info: T? = null
    var data: A? = null
}

fun main(args: Array<String>) {
    val obj: MyClass<String, Int> = MyClass()
    obj.info="hello"
    obj.data=10
}