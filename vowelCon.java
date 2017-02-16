package week3program;

public class vowelCon {
	

	public static void main(String []args){
        System.out.println("Hello World");
        printVowels("AbhiSHEK");
        printConsonants("Abhishek");
        printDigits("ReadDead2@2017");
        System.out.println(processExpression("132+5"));
     }
    
     public static void printVowels(String str)
     {
         int l = str.length();
         String str1 = str.toUpperCase();
         Character ch;
         for (int i=0;i<l;i++)
         {
            ch = new Character(str1.charAt(i));
            if(ch.equals('A') || ch.equals('E') || ch.equals('I') || ch.equals('O') || ch.equals('U'))
            System.out.println(str.charAt(i));
         }
     }
    
     public static void printConsonants(String str)
     {
         int l = str.length();
         String str1 = str.toUpperCase();
         Character ch;
         for (int i=0;i<l;i++)
         {
            ch = new Character(str1.charAt(i));
            if(!(ch.equals('A') || ch.equals('E') || ch.equals('I') || ch.equals('O') || ch.equals('U')))
            System.out.println(str.charAt(i));
         }
     }
    
     public static void printDigits(String str)
     {
         int l = str.length();
         char ch;
         for (int i=0;i<l;i++)
         {
            ch = str.charAt(i);
            if(Character.isDigit(ch))
            System.out.println(ch);
         }
     }
    
     public static int processExpression(String str)
     {
         int l = str.length();
         Character ch;
         boolean flag = false;
         int num1=0, num2=0, index=0;
         for (int i=0;i<l;i++)
         {
             ch = new Character(str.charAt(i));
             if(Character.isDigit(ch))
                if(flag == false)
                    num1 = (num1*10) + Character.getNumericValue(ch);
                else
                    num2 = (num2*10) + Character.getNumericValue(ch);
             else if(ch.equals('+') || ch.equals('-') || ch.equals('/') || ch.equals('*'))
             {
                index = i;
                flag = true;
             }
         }
        
         ch = str.charAt(index);
         if(ch == '+')
            return num1+num2;
         else if(ch == '-')
            return num1-num2;
         else if(ch == '/')
            return num1/num2;
         else if(ch == '*')
            return num1*num2;
         else
            return 0;
     }
}
 
