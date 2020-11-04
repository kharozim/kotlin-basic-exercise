package kotlin_basic_exercise

/*fun main() {

    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    val indices = listOf(8, 7, 2, 8, 2, 6)
    val irisan = numbers.slice(indices)
    println(irisan)

}*/

fun main() {
    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    val indices = listOf(8, 7, 2, 8, 2, 6)
    print(irisan(numbers, indices))
}

fun irisan(first: List<Int>, second: List<Int>): List<Int> {
    return first.intersect(second).toList() //fungsi .intersect untuk mencari nilai yang sama antara 2 list
}