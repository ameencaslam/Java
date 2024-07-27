class Box
{
	double width,height,depth;
	double volume()
	{
		return (width*height*depth);
	}
}

class BoxDemo2
{
	public static void main(String args[])
	{
		double vol;
		Box mybox1=new Box();
		
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=15;

		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
	}
}	