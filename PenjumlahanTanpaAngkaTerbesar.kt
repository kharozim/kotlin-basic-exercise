package kotlin_basic_exercise

fun main() {
    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    var hitung = 0
    for ((index, value) in numbers.sorted().withIndex()) {
        if (index == numbers.lastIndex) {
            break
        }
        hitung += value
    }
    println(hitung)
    // Output: 28
}