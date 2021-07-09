val testTuple=("krishna","key"->12,1.234)
println(testTuple._1)
println(testTuple._2)
println(testTuple._2._1)
println(testTuple._3)

// must be of same type
val myName=List("krishna","mahesh","teja")
println(myName(0))
println(myName.head)
println(myName.tail)

for(name<- myName){
  println(name)
}

val reverseNames=myName.map((name: String)=>{name.reverse})

val numbers=List(1,2,3,4,5)
val result=numbers.reduce((x:Int,y:Int)=>{
  println(f"x=$x,y=$y")
  x+y
})

val filterResult1=numbers.filter((x:Int)=>x!=5)
val filterResult2=numbers.filter(_!=5)

val anotherNumbers=List(6,7,8)
println(s"${numbers++anotherNumbers}")
numbers.reverse
val duplicates=List(1,1,1,2,3,4,4,5,5,6)
numbers.sorted
duplicates.distinct
numbers.max
numbers.sum
numbers.contains(10)
val myMap=Map("firstName"->"krishna","lastName"->"N")
myMap("firstName")
util.Try(myMap("middleName")) getOrElse "key not present"
