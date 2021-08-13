
import java.util.Scanner;
public class StringTask{
public static int findLength(String str){
int length=str.length();
return length;
}
public static void convertIntoArray(String str){
char [] ch=str.toCharArray();
System.out.println("Character array is:");
  for(char c:ch){
    System.out.println(c);
}
}
public static char findLastOne(String str){
int length=findLength(str);
char ch=str.charAt(length-2);
return ch;
}
public static int findOccurence(String str){
int length=findLength(str);
int count=0;
System.out.println("Enter the letter:");
Scanner sc=new Scanner(System.in);
char letter=sc.next().charAt(0);
  for(int i=0;i<length;i++){
    if(str.charAt(i)==letter){
         count++;
    }
 }
return count;
}
public static int findGreatestPosition(String str){
int length=findLength( str);
int greatestPosition=0;
System.out.println("Enter the letter:");
Scanner sc=new Scanner(System.in);
char letter=sc.next().charAt(0);
  for(int i=0;i<length;i++){
    if(str.charAt(i)==letter){
         greatestPosition=i;
    }
 }
 return greatestPosition;
}
public static String printLastFive(String str){
int length=findLength( str);
String str1=str.substring(length-5,length);
return str1;
}
public static String printFirstThree(String str){
int length=findLength(str);
String str1=str.substring(0,3);
return str1;
}
public static String replaceThree(String str){
String str1=str.replace(str.substring(0,3),"xyz");
return str1;
}
public static boolean checkEnd(String str){
boolean value=str.endsWith("le");
return value;
}
public static boolean checkStart(String str){
boolean value=str.startsWith("ent");
return value;
}
public static String convertLowerCase(String str){
String str1=str.toLowerCase();
return str1;
}
public static String convertUpperCase(String str){
String str1=str.toUpperCase();
return str1;
}
public static String reverseString(String str){
int length=findLength(str);
char [] ch=new char[length];
for(int i=length-1,j=0;i>=0&j<length;i--,j++){
ch[j]=str.charAt(i);
}
String str1 = String.valueOf(ch);
return str1;
}
public static String concatenateStrings(String str){
String [] array=str.split(" ");
 for(String a:array){
     System.out.println(a);
 } 
 int length=array.length;
 System.out.println("length is:"+length);
 String newString=array[0];
    for(int i=1;i<length;i++){
     newString=newString.concat(array[i]);
     }
  return newString;
  }
public static void convertIntoStringArray(String str){
String [] array=str.split(" ");
 for(String a:array){
     System.out.println(a);
 } 
}
public static String mergeString(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of string you want to enter:");
String[]string=new String[sc.nextInt()];
sc.nextLine();
   for(int i=0;i<string.length;i++){
        string[i]=sc.nextLine();
   }
 String newString=String.join("-",string);
return newString;
 }
public static boolean checkEquality(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first string:");
 String str1=sc.nextLine();
 System.out.println("Enter the second string:");
 String str2=sc.nextLine();
 boolean value=str1.equals(str2);
 return value;
 }
 public static boolean checkStringEquality(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first string:");
 String str1=sc.nextLine();
 System.out.println("Enter the second string:");
 String str2=sc.nextLine();
 boolean value=str1.equalsIgnoreCase(str2);
 return value;
 }
 public static String noSpace(String str){
  String newString=str.trim();
  return newString;
  }
}















