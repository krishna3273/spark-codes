def square(x :Int):Int={
  x*x
}

def cube(x: Int):Int={
  x*x*x
}

def transform(x:Int,f:Int=>Int):Int={
  f(x)
}

val x_square=square(10)

val x_cube=transform(3,cube)

transform(4,x=>x+3)

transform(3,x=>{
  val y=x*x
  2*y
})