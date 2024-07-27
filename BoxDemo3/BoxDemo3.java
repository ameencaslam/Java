class Box
{
	double width,height,depth;
	void setDim(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return (width*height*depth);
	}
}

class BoxDemo3
{
	public static void main(String args[])
	{
		double vol;
		Box mybox1=new Box();
		
		mybox1.setDim(10,20,15);

		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
	}
}	