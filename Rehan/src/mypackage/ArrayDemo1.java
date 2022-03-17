/*
* In this topic we will learn about  single dimensional array
* How to declare array
*/
public class ArrayDemo1{
public static void main(String[] args){
int a1[] ={10,20,30,40,50};  // we can not specify the size of array otherwise we will get compile time error
int []a2; // Array initialization is mandatory other we will get compile time error
 int[] a3;  //recommended to use because name is clearly separated from the type
// If we declare more than one value  so we have to write every seraprate statement to print the values 
// If we want to print the values in a single with the help of loops
System.out.println("size of the array: " +a1.length);

for(int i=0;i<a1.length;i++)  // we  have used final variable 'length' , It represents the size of array 
{
System.out.println("\na1["+i+"] : " +a1[i]);
}
// System.out.println(a2[0]); 

/*
* we can create array by using 'new' operator
*/

int[] a = new int[10]; // we should specify the size otherwise we will get compile time error
a[0] = 1;
a[1] = 2;
a[3] = 4;
a[4] = 5;
a[5] = 6;
a[6] = 7;
a[7] = 8;
a[8] = 9;
a[9] = 10;

System.out.println("size of the array: " +a.length);
for(int i=0;i<a.length;i++)
{
System.out.println("\na[" +i+ "]:" +a[i]); // In this case if we do not declare the values of array so it will print the default value zero
}
int[] a4=new int['a'];// it is valid
byte b=10;
int[] a5=new int[b];// it is valid
short s=20;
int[] a6=new int[s];// it is valid
int ri = 30;
int[] a7 = new int[ri]; // it is valid
// int[] a=new int[10l];// it is invalid
// int[] a=new int[10.5]; // it is invalid
}
}










