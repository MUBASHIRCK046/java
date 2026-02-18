import java.util.Scanner;
public class stringmanupilation{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String s1 = sc.nextLine();
System.out.println("orginal string:"+s1);
System.out.println("length ofclear string:"+s1.length());
System.out.println("Enter another string to concatenate:");
String s2 = sc.nextLine();
String s3=s1.concat("").concat(s2);
System.out.println("connected string:"+s3);
System.out.println("Enter the index to extract character :");
int index=sc.nextInt();
if(index>=0&&index<s1.length()){
System.out.println("character at index"+index+":"+s1.charAt(index));
}
else{System.out.println("Invalid input");}
String s4 = sc.nextLine();
System.out.println("Using equals():"+s1.equals(s4));
System.out.println("using compareto():"+s1.compareTo(s4));
System.out.println("Enter a string to seartch:");
String sub = sc.nextLine();
System.out.println("Index of substring:"+s1.indexOf(sub));
System.out.println("Enter letter to replace:");
String oldword=sc.nextLine();
System.out.println("Enter new letter");
String newword=sc.nextLine();
System.out.println("After replace:"+s1.replace(oldword,newword));
System.out.println("Upper case string:"+s1.toUpperCase());
System.out.println("Enter the integer");
int num=sc.nextInt();
String numstr=String.valueOf(num);
System.out.println("String value of number:"+numstr);
sc.nextLine();
System.out.println("Enter the comma seprated string:");
String data=sc.nextLine();
String[] parts=data.split(",");
for (String part:parts){
System.out.println(part);
StringBuffer sb = new StringBuffer(s1);
System.out.println("Enter a string to append:");
String appendstr=sc.nextLine();
sb.append(appendstr);
System.out.println("String Buffer result:"+sb);
} 
}
}


