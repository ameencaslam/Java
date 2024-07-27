class Fibonacci
{
	public static void main(String args[])
	{
		int num=1,temp=0,temp2=0;
		System.out.print("0 1 ");
		while(num<10)
		{
			temp2=(num+temp);
			if(temp2<10)
			{
				System.out.print(temp2+" ");
			}
			temp=num;
			num=temp2;
		}
	}
}	