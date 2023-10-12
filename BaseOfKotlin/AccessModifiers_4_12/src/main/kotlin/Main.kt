Kotlin
    private val a = 0  //  внутри класса
    public val b = 0 //  везде // default
    protected val c = 0 // внутри класса и наследников
    internal val d = 0  // внутри модуля (для крупных проектов)

Java
    private val a = 0  //  внутри класса
    public val b = 0 //  везде
    protected val c = 0 // внутри класса и наследников
    package private val d = 0  // внутри пакета  // default
fun main(args: Array<String>) {
}