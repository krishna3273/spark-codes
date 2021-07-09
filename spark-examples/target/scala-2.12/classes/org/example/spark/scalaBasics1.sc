val hello: String="HI"

var helloVar :String=hello

helloVar=helloVar+" Krishna"

println(helloVar)
var test :Int=5
val testBoolean :Boolean=true

val testDouble : Double=3.143
val testFloat : Float=3.14f
val testByte :Byte=64
val testLOng :Long=1234567
val testChar :Char='k'

println("Demo "+testDouble+" "+testChar)

println(f"Hi the value of pi is $testDouble%.2f")
println(f"The value of variable test is $test")
println(s"the sum of test and testFloat is ${test+testFloat}")

val temp="My age is 21"
val pattern=""".* ([\d]).*""".r
val pattern(answerString)=temp
val ans=answerString.toInt