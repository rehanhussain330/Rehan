/*
* This Program is about data types
* Data types are two types 
* 1. Primitive data types
* 2. Reference data types
* Here in this program we only will discuss about primitive data types
*/
public class DataTypes{
public static void main(String[] args)
{
	/*
	* Integer data type
	* 1. There are four types --> int , long , short and byte
	* 2. All these have signed positive and negative values
	* 3. Java does not support unsigned only positive Integers
	* 4. Integers are for whole value signed numbers
	*/
long l = 1;  // long has a signed 64 bit data type and it is used for large values and its range is --> –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
int i = 2; // int has a signed 32 bit data type and its range is --> –2,147,483,648 to 2,147,483,647
short s = 3; // short has a 16 bit data type and its range is --> –32,768 to 32,767
byte b = 4; // byte has a 8 bit data type and its range is-->  –128 to 127

System.out.println("long value is :" +l);
System.out.println("int value is :" +i);
System.out.println("short value is :" +s);
System.out.println("byte value is :" +b);

/*
* Floating-point data types
* 1. There are two types --> float and double
* 2. They represent with fractional precision
*/
/*
* float takes 4 to 5 decimal places
*/
float f = 5.123456f; // float has 32 bit and its range is --> 1.4e–045 to 3.4e+038 and it is a  single precision
System.out.println("float value is :" +f);

/*
* double takes 14 to 15 decimal places
*/
double d = 6.123456789012345; // double has 64 bit and its range is --> 4.9e–324 to 1.8e+308 and it is a double precision and it is used for large values to calculate fastly


System.out.println("double value is :" +d);

/*
* Character data type 
* The keyword is used for character data type  is --> char
* It represents symbols  in a character set like numbers and letters
*/

char c = 'R'; // in Java char is a 16 bit data type and its range is --> 0 to 65,536
System.out.println("char value is :" +c);

/*
* Boolean dada type
* It is used for  logical values and it can have  --> true or false
*/

boolean bool = true;
System.out.println("Boolean value is :" +bool);
/*
* These all are given below complex data types
*/


Integer I = 1;
Character C = 2;
Float F = 12.344f;
Double D = 123.3665;
Boolean B = true;
System.out.println("Integer value is :" +I);


}
}










