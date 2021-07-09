if(1>3) println("false") else println("true")

if(false){
  println("false")
}
else{
  println("true")
}

val number=3
number match{
  case 1=>println("one")
  case 2=>println("three")
  case 3=>println("two")
  case _=>println("Something else")
}

for(x<- 1 to 4){
  val x_square=x*x
  println(x)
}

var x=10
while(x>5){
  println(x)
  x-=1
}

{
  val x=10
  x+20
}