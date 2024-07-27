class Box
{
	double width,height,depth;
	double volume()
	{
		return (width*height*depth);
	}
	Box(double w,double h,double d)
	{
		height=h;
		width=w;
		depth=d;
	}	
}

class BoxDemo5
{
	public static void main(String args[])
	{
		double vol;
		Box mybox1=new Box(10,20,30);

		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
	}
}	