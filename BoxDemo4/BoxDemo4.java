class Box
{
	double width,height,depth;
	double volume()
	{
		return (width*height*depth);
	}
	Box()
	{
		height=depth=width=10;
	}	
}

class BoxDemo4
{
	public static void main(String args[])
	{
		double vol;
		Box mybox1=new Box();

		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
	}
}	