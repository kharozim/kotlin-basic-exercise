package kotlin_basic_exercise


fun main() {
    var a = 2
    val b = 1000

    while (a < b) {
        var flag = false
        for (i in 2..a / 2) {
            // kondisi bukan bilangan prima
            if (a % i == 0) {
                flag = true
            }
        }
        if (!flag)
            print("$a ")
        a++
    }
}
