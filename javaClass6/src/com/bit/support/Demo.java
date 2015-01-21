package com.bit.support;

public final class Demo 
{
	
	private int z=8;
	public int getZ()
	{
		return z;
	}
	public int setZ(int q)
	{
		z=q;
		return z;
	}
	void m1()
	{
		int a=6;
		String b="hi";
		System.out.println(a+b);
	}
	public void m2(int c,String d)
	{
		//int a=6;
		//String b="hi";
		System.out.println(c+d);
	}
	protected void m3(int e,int f,int g)
	{
		//int a=6;
		//String b="hi";
		System.out.println("this is protectted modifier");
	}
	private void m4(int e,String k,int g)
	{
		//int a=6;
		//String b="hi";
		System.out.println("this is private modifier");
	}
	public final void m8()
	{
		System.out.println(9);
	}

}
