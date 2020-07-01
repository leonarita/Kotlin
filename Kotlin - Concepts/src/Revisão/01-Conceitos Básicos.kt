package Revisão

/*  Kotlin
    -> open source
    -> compilada
    -> possui 100% interoperabilidade com java

TYPE		BIT
Double		64
Float		32
Long		64
Int		    32
Short		16
Byte		8
Boolean		?
String		?
Char		?

Lembrando...
	1 byte = 8 bits
	1 kilobyte (KB) = 1024 bytes
	1 megabyte (MB) = 1024 kilobytes
	1 gigabyte (GB) = 1024 megabytes
*/

fun main () {

    println('\n')
    println("Double: \tMax: ${Double.MAX_VALUE} \tMin: ${Double.MIN_VALUE}")
    println("Float: \t\tMax: ${Float.MAX_VALUE} \t\t\t\tMin: ${Float.MIN_VALUE}")
    println("Long: \t\tMax: ${Long.MAX_VALUE} \t\tMin: ${Long.MIN_VALUE}")
    println("Int: \t\tMax: ${Int.MAX_VALUE} \t\t\t\tMin: ${Int.MIN_VALUE}")
    println("Short: \t\tMax: ${Short.MAX_VALUE} \t\t\t\t\t\tMin: ${Short.MIN_VALUE}")
    println("Byte: \t\tMax: ${Byte.MAX_VALUE} \t\t\t\t\t\tMin: ${Byte.MIN_VALUE}")

    var str1 = "Visitante"
    var str2 = "Olá $str1"
}