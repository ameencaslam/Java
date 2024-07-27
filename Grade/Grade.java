class Student
{
	int phy,cs,mat;
	
	void total()
	{
		System.out.println("Total marks: "+(phy+mat+cs));
	}
	
	void average()
	{
		int avg;
		avg=(phy+mat+cs)/3;
		System.out.println("Average marks: "+avg);
	}
	
	void grade()
	{
		int avg=(phy+mat+cs)/3;
		if(avg<50)
		{
			System.out.println("C grade");
		}
		else if(avg>=50 && avg<75)
		{
			System.out.println("B grade");
		}
		else if(avg>=75 && avg<=100)
		{
			System.out.println("A grade");
		}
		else
		{
			System.out.println("Wrong marks entered!");
		}
	}
}

class Grade
{
	public static void main(String args[])
	{
		Student A = new Student();
		A.phy=60;
		A.cs=70;
		A.mat=75;

		A.total();
		A.average();
		A.grade();
	}
}
		
