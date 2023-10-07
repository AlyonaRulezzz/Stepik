package kot

private  var name: String? = null

    fun main () {
        val length = name?.length?:0
        println(length)

        val s1: String? = ""
        val s2: String? = null
        val s3: String? = "fdhghgf54"

        val length1 = s1?.length
        val length2 = s2?.length ?: 0
        val length3 = s3?.length ?: 0

        val result = (length1 ?: 0) + (length2 ?: 0) + (length3 ?: 0)
        println(result)
    }