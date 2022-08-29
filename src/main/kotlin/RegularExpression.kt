fun main() {
    val pattern1 = Regex("apple")
    val pattern2 = "apple".toRegex(RegexOption.IGNORE_CASE)
    val pattern3 = "[abc]strawberry".toRegex()
    val pattern4 = "Eliz[aei]abeth".toRegex()
    val pattern5 = "Sar[a-k]ah".toRegex()
    val pattern6 = "Jo[^a-d]hn".toRegex()
    val pattern7 = "favo(u)?rite".toRegex()
    val pattern8 = "(k)?night".toRegex()

    println(pattern1.containsMatchIn("I have two apples."))          /** True */
    println(pattern1.matches("I have an apple."))                    /** False */
    println(pattern1.matches("Apple"))                               /** False */
    println(pattern2.matches("Apple"))                               /** True */
    println(pattern3.containsMatchIn("I have a fstrawberry"))        /** False */
    println(pattern3.containsMatchIn("I have a bstrawberry"))        /** True */
    println(pattern4.containsMatchIn("My name is Elizabeth"))        /** False */
    println(pattern4.containsMatchIn("My name is Elizaabeth"))       /** True */
    println(pattern5.containsMatchIn("Her name is Sarah"))           /** False */
    println(pattern5.containsMatchIn("Her name is Sardah"))          /** True */
    println(pattern6.containsMatchIn("His name is John"))            /** False */
    println(pattern6.containsMatchIn("His name is Joahn"))           /** False */
    println(pattern6.containsMatchIn("His name is Jofhn"))           /** True */
    println(pattern7.containsMatchIn("This is my favourite!"))       /** True */
    println(pattern7.containsMatchIn("This is my favorite!"))        /** True */
    println(pattern7.containsMatchIn("This is my favorrite!"))       /** False */
    println(pattern8.containsMatchIn("night"))                       /** True */




}