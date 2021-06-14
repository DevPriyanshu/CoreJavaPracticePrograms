import java.util.Scanner;
class CountVowel
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String Value");
        String name=sc.nextLine();
        int len=name.length();
        int vowel=0;
        for(int i=0;i<len;i++)
        {
            char ch=name.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            {
                vowel++;
            }
        }
        System.out.println("Number Of Vowel Is :"+vowel);
    }
}