// Attempt 1
fun romanToInt(s: String): Int {
    val romanNumerals = mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )

    var integer = 0

    for (i in s.indices) {
        integer += if (i < s.length - 1) {
            if ((romanNumerals[s[i].toString()]!!) >= (romanNumerals[s[i + 1].toString()]!!)) {
                romanNumerals[s[i].toString()]!!
            } else {
                -(romanNumerals[s[i].toString()]!!)
            }
        } else {
            romanNumerals[s.last().toString()]!!
        }
    }
    return integer
}
