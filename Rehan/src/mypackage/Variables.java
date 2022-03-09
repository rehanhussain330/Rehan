public class Variables  
{  
public static void main(String[] args)   
{  
int A = 10;  // Upper case letters are allowed
int a = 20;  // Lower case letters are allowed
int a1b = 30; // Numbers between letters are allowed
int _R = 1; // Variable can with underscore(_)
int $R = 2; // Variable can start with dollar sign($)
int A_B = 3; // underscore is allowed  between letters
int a$b = 4; // dollar sign is allowed between letters
int a1 = 5; // number can take in last the of variable
int _$_ = 6; // This is valid
// int a@b = 8; // This is not valid
// int a b = 6; // space between letters is not allowed
// int a# = 7 ;// symbols are not allowed in the last of variable
// int 2a = 8; // variables can not start with numbers and symbols except ( underscore _ , dollar $)
/* we can not use pre-defined class names and interfaces names  as a variables */
System.out.println(A);
System.out.println(a);
System.out.println(a1b);
System.out.println(_R);
System.out.println($R);
System.out.println(A_B);
System.out.println(a$b);
System.out.println(a1);

}
}