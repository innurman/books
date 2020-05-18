package com.example.part11_33
/**
 * Created by kkang
 * 깡샘의 안드로이드 프로그래밍 - 루비페이퍼
 * 위의 교재에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
class PropertyTest {
    var greeting: String="Hello"
        set(value) {
            field=field+value
        }
        get()=field.toUpperCase()

    val name: String="Kim"
        get()=field.toUpperCase()
}