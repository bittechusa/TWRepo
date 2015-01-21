package com.bit.test;

public class BaseTest 
{
	private int j1=7;
	
	final int j=9;
	static int h=8;
	private int z=8;
	int r=6;
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
		System.out.println("this is protectted modifier same package");
	}
	private void m4(int e,String k,int g)
	{
		//int a=6;
		//String b="hi";
		System.out.println("this is private modifier");
	}
	static void m5()
	{
		//m1();nonstatic method cannt use in static
		//System.out.println(z);nonstatic can nt use in static method
	}
	/*void m6()
	{
		r++;
		h++;
		//r++;
		//h++;
		//System.out.println(r);
		//System.out.println(h);
		System.out.println(r);
		System.out.println(h);
	}
	void m7()
	{
		r++;
		h++;
		//r++;
		//h++;
		//System.out.println(r);
		//System.out.println(h);
		System.out.println(r);
		System.out.println(h);
	}
*/
	BaseTest()
	{
		h++;
		r++;
		//j++;because of final
		System.out.println(j);
		System.out.println(r);
		System.out.println(h);
		
	}
}
