package basicDemo;

public class Demo {
	
	public static void StringRev1(String str) {
		
		String temp = " ";
		
		char[] ch = str.toCharArray();
		
		for(int i =ch.length-1; i>=0;i--) {
			
			temp = temp + ch[i];
		}
		
		System.out.println(temp);

	}
	
	public static void StringRev2(String str) {
		
String rev = " ";
		
		String[] st = str.split(" ");
		
		for(int i=0; i<st.length ;i++) {
			
			char[]ch =st[i].toCharArray();
		for (int j = ch.length-1; j >=0; j--) {
			
			rev = rev + ch[j];
		}	
		    rev = rev + " ";
		}
		System.out.println(rev);
		
	}
	
	public static void String_palindrom(String st) {
		
		String rev = "";
		
		
		for (int i = st.length()-1; i>=0; i--) {
			
			rev= rev +st.charAt(i);
			
		}//System.out.println(rev);
			
			if(st.equalsIgnoreCase(rev)) {
				
				System.out.println("its ia palindrom");
			}
			else 
			{
				System.out.println("its not a palindrom");
				
			}	
			}
		
	public static  void Number_Palindrom(int n) {
		
		int sum = 0 , r;
		int temp = n;
		
		while (n>0) {
			
			 r = n%10;
			 sum = (sum*10)+r;	
			 n=n/10;
	}
		if(temp == n) {
			System.out.println("it is a palindrom");
		}
		else
		{
			System.out.println("its not a palindroma");
		}
	}
	
	public static void AmstrogenNUm(int num) {
		
		int temp = num;
		
		int sum =0, r;
		
		while (num>0) {
			
			r = num%10;
			num = num/10;
			sum = sum+(r*r*r);
	}
		if(sum == temp) {
			
			System.out.println("its is Astrogennum");
		}else {
			
			System.out.println("its not a astr");
		}

	}
	
	public static int To_Find_Missing_Nu(int[] a , int n) {
		
		int i , total;
		total=(n+1)*(n+2)/2;
		for (int j = 0; j < n; j++) 
			
			total -= a[j];
			
			
		
		return total;
		
	}
	
	public static void Find_multiple_MissNUM() {
		
		int[] num = {1,3,5,6,7,9,};
		
		int[] register = new int[num.length];
		
		for(int i : num) {
			
			register[i]=1;
		}
		
		for (int i =1 ;i<register.length;i++) {
			
			if(register[i]==0) {
				System.out.println(i);
			}
			
		}

	}
		
	
	
	public static void main(String[] args) {
		 StringRev1("i love java");
		 StringRev2("i love java");
		 String_palindrom("boy");
		 Number_Palindrom(352);
		 AmstrogenNUm(153);
		
		 int[] a= {1,2,3,5,6};
		 int miss = To_Find_Missing_Nu(a, 5);
		 System.out.println(miss);
		 
		 Find_multiple_MissNUM();
	}

}
