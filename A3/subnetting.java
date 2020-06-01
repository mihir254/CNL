import java.util.Scanner;
import java.math.*;
public class subnetting
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the IP address");
		Scanner sc=new Scanner(System.in);
		String ip=sc.next();
		String[] companies = ip.split("\\.");
		String[] mask = new String[4];
		mask[0]="0";
		mask[1]="0";
		mask[2]="0";
		mask[3]="0";
		
		
		int ip1=Integer.parseInt(companies[0]);
		int ip2=Integer.parseInt(companies[1]);
		int ip3=Integer.parseInt(companies[2]);
		int ip4=Integer.parseInt(companies[3]);
		char type;
		//determining the type of class
		if(ip1<128)
		{
			int k=1;
			type='A';
			System.out.println("Class:-"+type+"     mask:-"+"255.0.0.0");
			System.out.println("enter the number of subnets ");
			int p=0;
			p=sc.nextInt();
			while(p>Math.pow(2, 24))
			{
			
			//if(p>Math.pow(2, 24))
				System.out.println("enter again amount too high");
			p=sc.nextInt();
			}
			int j=0;
			for(int i=0;p>Math.pow(2, i);i++)
			{
				j++;
			}
			int total_parts=j;
			//System.out.println(j);
			mask[0]="255";
			while(j>8)
			{
				j=j-8;
				mask[k]=".255";
				k++;
			}
			double sum=0;
			for(int y=0;y<j;y++)
			{
				sum=sum+Math.pow(2,7-y);
				
			}
			int jo=(int)sum;
			String o="";
			mask[k]=Integer.toString(jo);
			for(int i=0;i<4;i++)
			{
				
				//System.out.println("sahil");
				if(i!=0)
				System.out.print("."+mask[i]);
				//o=mask[i];
				else
					System.out.print("Subnet mask:-"+mask[i]);
			}
			
			
			
			
			double res=Math.pow(2,total_parts);
			double interval=256/res;
			//System.out.println(interval);
			int fin=(int)interval;
			int mul=0;
			for(int y=0;y<10;y++)
			{
				mul=y*fin;
				if(mul>ip2)
				{
					break;
				}
			}
			int low=mul-fin;
			int high=mul;
			String[] fip=new String[4];
			fip[0]=companies[0];
			fip[1]=Integer.toString(low);
			System.out.println();
			fip[2]="0";
			fip[3]="0";
			System.out.println("the network id is");
			for(int i=0;i<4;i++)
			{
				if(i==0)
				{
					System.out.print(fip[0]);
				}
				else
				{
					System.out.print("."+fip[i]);
				}
			}
			System.out.println();
			System.out.println("broadcast address");
			String[] lip=new String[4];
			lip[0]=companies[0];
			lip[1]=Integer.toString(high-1);
			lip[2]="255";
			lip[3]="255";
			for(int i=0;i<4;i++)
			{
				if(i==0)
				{
					System.out.print(lip[0]);
				}
				else
				{
					System.out.print(":"+lip[i]);
				}
			}
			
			
			
			/////////////////////////////////////
			System.out.println("\nenter the ip address to ping");
			System.out.println("enter the IP address");
			//sc=new Scanner(System.in);
			String ipt=sc.next();
			String[] companiest = ipt.split("\\.");
			String[] maskt = new String[4];
			maskt[0]="0";
			maskt[1]="0";
			maskt[2]="0";
			maskt[3]="0";
			
			
			int ip1t=Integer.parseInt(companiest[0]);
			int ip2t=Integer.parseInt(companiest[1]);
			int ip3t=Integer.parseInt(companiest[2]);
			int ip4t=Integer.parseInt(companiest[3]);
			
			if(ip1t==ip1 && ip2t>low+1 && ip2t<high-1)
			{
				
				//System.out.println("It can be pinged "+ip1t+ip1+(ip1t==ip1));
				System.out.println("It can be pinged ");
			}
			else
			{
				System.out.println("It cannot be pinged");
			}
		}
		else if(ip1>=128 & ip1<192)
		{
			int k=2;
			type='B';
			System.out.println("Class:-"+type+"     mask:-"+"255:255:0:0");
			mask[0]="255";
			mask[1]="255";
			System.out.println("enter number of subnets");
			int p=0;
			p=sc.nextInt();
			while(p>Math.pow(2, 16))
			{
			
			//if(p>Math.pow(2, 16))
				System.out.println("enter again amount too high");
			p=sc.nextInt();
			}
			int j=0;
			for(int i=0;p>Math.pow(2, i);i++)
			{
				j++;
			}	
			int total_parts=j;
			//System.out.println(j);
			mask[0]="255";
			while(j>8)
			{
				j=j-8;
				mask[k]=":255";
				k++;
			}
			double sum=0;
			for(int y=0;y<j;y++)
			{
				sum=sum+Math.pow(2,7-y);
				
			}
			int jo=(int)sum;
			String o="";
			mask[k]=Integer.toString(jo);
			for(int i=0;i<4;i++)
			{
				

				if(i!=0)
				System.out.print(":"+mask[i]);
				
				else
					System.out.print("subnet mask:-"+mask[i]);
			}
			
			
			
			
			
			
			double res=Math.pow(2,total_parts);
			double interval=256/res;
			//System.out.println(interval);
			int fin=(int)interval;
			int mul=0;
			for(int y=0;y<10;y++)
			{
				mul=y*fin;
				if(mul>ip2)
				{
					break;
				}
			}
			int low=mul-fin;
			int high=mul;
			String[] fip=new String[4];
			fip[0]=companies[0];
			fip[1]=companies[1];
			System.out.println();
			fip[2]=Integer.toString(low);
			fip[3]="0";
			System.out.println("\nthe network id is");
			for(int i=0;i<4;i++)
			{
				if(i==0)
				{
					System.out.print(fip[0]);
				}
				else
				{
					System.out.print(":"+fip[i]);
				}
			}
			System.out.println();
			System.out.println("\nbroadcast address");
			String[] lip=new String[4];
			lip[0]=companies[0];
			lip[1]=companies[1];
			lip[2]=Integer.toString(high-1);
			lip[3]="255";
			for(int i=0;i<4;i++)
			{
				if(i==0)
				{
					System.out.print(lip[0]);
				}
				else
				{
					System.out.print(":"+lip[i]);
				}
			}
			
			
			
			System.out.println("\nenter the ip address to ping");
			System.out.println("enter the IP address");
			//sc=new Scanner(System.in);
			String ipt=sc.next();
			String[] companiest = ipt.split("\\.");
			String[] maskt = new String[4];
			maskt[0]="0";
			maskt[1]="0";
			maskt[2]="0";
			maskt[3]="0";
			
			
			int ip1t=Integer.parseInt(companiest[0]);
			int ip2t=Integer.parseInt(companiest[1]);
			int ip3t=Integer.parseInt(companiest[2]);
			int ip4t=Integer.parseInt(companiest[3]);
			
			if(ip1t==ip1 && ip3t>low+1 && ip3t<high-1 && ip2t==ip2)
			{
				
				//System.out.println("it is pingable "+ip1t+ip1+(ip1t==ip1));
				System.out.println("it can be pinged ");
			}
			else
			{
				System.out.println("cannot ping");
			}
			
			
			
			
					
		}
		else if(ip1>=192 & ip1<224)
		{
			int k=3;
			type='C';
			System.out.println("Class:-"+type+"     mask:-"+"255.255.255.0");
			
			mask[0]="255";
			mask[1]="255";
			mask[2]="255";
			int p=0;
			System.out.println("\nEnter number of subnets:");
			p=sc.nextInt();
			while(p>Math.pow(2, 8))
			{
			
			//if(p>Math.pow(2, 16))
				System.out.println("enter again amount too high");
			p=sc.nextInt();
			}
			int j=0;
			for(int i=0;p>Math.pow(2, i);i++)
			{
				j++;
			}	
			int total_parts=j;
			//System.out.println(j);
			mask[0]="255";
			while(j>8)
			{
				j=j-8;
				mask[k]=".255";
				k++;
			}
			double sum=0;
			for(int y=0;y<j;y++)
			{
				sum=sum+Math.pow(2,7-y);
				
			}
			int jo=(int)sum;
			String o="";
			mask[k]=Integer.toString(jo);
			for(int i=0;i<4;i++)
			{
				
				//System.out.println("sahil");
				if(i!=0)
				System.out.print("."+mask[i]);
				//o=mask[i];
				else
					System.out.print("The subnet mask is:-"+mask[i]);
			}
			
			
		
			
			double res=Math.pow(2,total_parts);
			double interval=256/res;
			//System.out.println(interval);
			int fin=(int)interval;
			int mul=0;
			for(int y=0;y<10;y++)
			{
				mul=y*fin;
				if(mul>ip2)
				{
					break;
				}
			}
			int low=mul-fin;
			int high=mul;
			String[] fip=new String[4];
			fip[0]=companies[0];
			fip[1]=companies[1];
			System.out.println();
			fip[2]=companies[2];
			fip[3]=Integer.toString(low);
			System.out.println("\nthe network id is");
			for(int i=0;i<4;i++)
			{
				if(i==0)
				{
					System.out.print(fip[0]);
				}
				else
				{
					System.out.print("."+fip[i]);
				}
			}
			System.out.println();
			System.out.println("\nbroadcast address");
			String[] lip=new String[4];
			lip[0]=companies[0];
			lip[1]=companies[1];
			lip[2]=companies[2];
			lip[3]=Integer.toString(high-1);
			for(int i=0;i<4;i++)
			{
				if(i==0)
				{
					System.out.print(lip[0]);
				}
				else
				{
					System.out.print("."+lip[i]);
				}
			}
		
			
			
			
			
			System.out.println("\nEnter IP address to ping");
			System.out.println("\nenter IP address");
			//sc=new Scanner(System.in);
			String ipt=sc.next();
			String[] companiest = ipt.split("\\.");
			String[] maskt = new String[4];
			maskt[0]="0";
			maskt[1]="0";
			maskt[2]="0";
			maskt[3]="0";
			
			
			int ip1t=Integer.parseInt(companiest[0]);
			int ip2t=Integer.parseInt(companiest[1]);
			int ip3t=Integer.parseInt(companiest[2]);
			int ip4t=Integer.parseInt(companiest[3]);
			
			if(ip1t==ip1 && ip4t>low+1 && ip4t<high-1 && ip2t==ip2 && ip3t==ip3)
			{
				
				//System.out.println("\nIt can be pinged "+ip1t+ip1+(ip1t==ip1));
				System.out.println("\nIt can be pinged ");
			}
			else
			{
				System.out.println("\nCannot ping");
			}
			
			
			
			
			
		}
		else if(ip1>=224 & ip1<240)
		{
			type='D';
			System.out.println("Class:-"+type+"     mask:-"+"not defined");
		}
		else
		{
			type='E';
			System.out.println("Class:-"+type+"     mask:-"+"not defined");
		}
		
	}

}
