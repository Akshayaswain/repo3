package Cls01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Today {

	public static void main(String[] args) throws InterruptedException  {
		//1st Program
//		------------
//		int i=0;
//		while(i<=30)
//		{
//			if (i%2==0) 
//			{
//				System.out.print(i+ " ");
//			}
//			i=i+1;
//		}
		
//3rd program
//		int sum=0;
//		for(int i=0;i<=50;i++) 
//		{
//			if(i%2==0) 
//			{
//				sum=sum+i;
//			}
//		} //for(int i=0;i<=50;i++) 
//		if(sum%2==0) 
//		{
//			System.out.println(sum+" is even number");
//		}
//		else
//		{
//			System.out.println(sum+"is odd number");
//		
//		} //if(sum%2==0) 
		
	//-----------------4th Program-------------------------------
		/*int evencount=0,oddcount=0;
		
		for(int i=1;i<=30;i++)
		{
			String x="5"+"*"+i;
		    System.out.println(x+"="+(5*i));
		    if(5*i%2==0)
		    {
		    	System.out.println(x+"="+(5*i)+"is even number");
		    	evencount=evencount+1;
		    }
		    else {
		    	System.out.println(x+"="+(5*i)+"is Odd number");
		    	oddcount=oddcount+1;
		    }
		}
	 System.out.println("even count is "+(evencount));
	 System.out.println("Odd count is "+(oddcount));*/
		
//----------------5th Program***----------
		
		/*int sum=0;
		int i=1;
		while(i<=10)
		{
			if(i%2!=0) 
			{
				sum=sum+i;
				
			}
		 i=i+1;
		}
		System.out.println("sum is "+sum);*/
	//---------------6th Program------
		/*System.out.println("Please enter the the value m");
		Scanner sc=new Scanner(System.in);
		
		int count=1;
		int m=sc.nextInt();
		System.out.println("Please enter the the value i");
		int i=sc.nextInt();
		for(;i>=m;i--)
		{
			System.out.println(i-1);
			if(count==m)
			{
				break;
			}
			count++;
		}*/
		
		//****************----------------7 th program****-----------
		
		/*int a[]= {2,3,15,20,4};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max) 
			{
				max=a[i];
			}
		}
	   System.out.println("the maximum value is "+max);
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=min)
			{
				min=a[i];
			}
		}
	System.out.println("minmum value is "+min);*/
		//===******8 th program*********=============
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//========***9th pgm***==
		/*int count=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter the search");
		int search=sc.nextInt();
	
		while(num>0)
		{
			int r=num%10;
			
			if(search==r) 
			{
				count=count+1;
			}
			num=num/10;
		}
		System.out.println("the value of count is "+count);*/
		//=========********10 th pgm**********=======================
		
		
//		WebDriver d=new FirefoxDriver();
//		d.get("https://magento.com/");
//		Thread.sleep(3000);
//		d.findElement(By.linkText("SIGN UP NOW")).click();
		//d.findElement(By.partialLinkText(linkText))
//		int[] b=new int[2];
//		b[0]=100;
//		b[1]=200;
//		int c[]=b.clone();
//	
//		for(int x:c) 
//		{
//			System.out.println(x);
//		}
	}

}
