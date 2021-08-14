
import java.util.Scanner;
public class StringTaskRunner{
public static String getString(){
System.out.println("Enter the string:");
Scanner sc1=new Scanner(System.in);
String str=sc1.next();
System.out.println("the string is:"+ str);
return str;
}
public static String getMultipleString(){
System.out.println("Enter the string:");
Scanner sc1=new Scanner(System.in);
String str=sc1.nextLine();
System.out.println("the string is:"+ str);
return str;
}
public static void main(String [] args){
System.out.println("Enter the program number:");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
 switch(number){
     case 1:
        String str=getString();
        int length=StringTask.findLength(str);
        System.out.println("length of the string:"+length);
        break;
     case 2:
        String str1=getString();
        StringTask.convertIntoArray(str1);
        break;
    case 3:
        String str2=getString();
        char character=StringTask.findLastOne(str2);
        System.out.println("Last character in the string is:"+character);
        break;
    case 4:
        String str3=getString();
        int count=StringTask.findOccurence(str3);
        System.out.println(count);
        break;
    case 5:
        String str4=getString();
        int position=StringTask.findGreatestPosition(str4);
        System.out.println("Greatest position of the letter is:"+position);
        break;
    case 6:
       String str5=getString();
       String string=StringTask.printLastFive(str5);
       System.out.println("Required String is:"+string);
       break;
    case 7:
       String str6=getString();
       String string1=StringTask.printFirstThree(str6);
       System.out.println("Required String is:"+string1);
       break;
    case 8:
       String str7=getString();
       String replacedString=StringTask.replaceThree(str7);
       System.out.println("Replaced String is:"+replacedString);
       break;
   case 9:
       String str8=getString();
       boolean value=StringTask.checkEnd(str8);
       System.out.println("String ends with le:"+value);
       break;
   case 10:
       String str9=getString();
       boolean value2=StringTask.checkStart(str9);
       System.out.println("String starts with ent:"+ value2);
       break;    
   case 11:
       String str10=getString();
       String lowercase=StringTask.convertLowerCase(str10);
       System.out.println("Required String is:"+lowercase);
       break;
   case 12:
       String str11=getString();
       String uppercase=StringTask.convertUpperCase(str11);
       System.out.println("Required String is:"+uppercase);
       break;              
   case 13:
       String str12=getString();
       String reversedString=StringTask.reverseString(str12);
       System.out.println("Reversed String is :" +reversedString);
       break;
   case 14:
       String str13=getMultipleString();
       System.out.println("Multiple Strings:"+str13);
       break;
   case 15:
       String str14=getMultipleString();
       String concatenatedString=StringTask.concatenateStrings(str14);
       System.out.println("String without space is:"+concatenatedString);
       break;
   case 16:
       String str15=getMultipleString();
       StringTask.convertIntoStringArray(str15);
       break;
   case 17:
       String mergedString=StringTask.mergeString();
       System.out.println("merged string is:"+mergedString); 
       break;
  case 18:
      boolean check=StringTask.checkEquality();
      System.out.println("Two strings are equal:"+check);
      break;
  case 19:
      boolean checkString=StringTask.checkStringEquality();
      System.out.println("Two strings are equal:"+checkString);
      break;   
  case 20:
      String str16=getMultipleString();
      String noSpaceString=StringTask.noSpace(str16);     
      System.out.println("String without space:"+noSpaceString);
      break;     
  default:
      System.out.println("No program");
  }                    
}
}  
