
static int f(int x) {return x * x;

 }
staticint f(int x)  { return (x) + f(x+1);
  }

public static void main (String [] args){
int x = 2;

System .out.println(g(x) + " " +  f(g(1)));
System.out.println(x);
}
//Respuesta: 13 25
//2

