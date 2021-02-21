import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		int temp=0;
		
		for(int i=2;i<=(num-1);i++){
			if(num%i==0)
			{
				temp=1;
			}
		}
		if(num==0||num==1){
			System.out.println("Not a prime Number");
		}
		else if (temp==0){
			System.out.println(+num+ " is a Prime Number");
		}
		else{
			System.out.println(+num+ " is Not Prime Number");
		}		
	}
}
