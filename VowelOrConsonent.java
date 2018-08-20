import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a letter :");
	char ch[]={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	char vow[]= {'a','e','i','o','u'};
	char c = in.next().charAt(0);
	for(int i=0;i<=26;i++) {
		if(c==vow[i])
		{
			System.out.println("Vowel");
			break;
		}
		else if(c==ch[i])
		{
			System.out.println("Consonent");
			break;
		}
		else {
			System.out.println("Invalid");
			break;
		}
		
	}
}
}
