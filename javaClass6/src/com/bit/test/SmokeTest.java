package com.bit.test;

import com.bit.support.Demo;

public class SmokeTest 

{
	public static void main(String[] args) 
	{
		BaseTest x=new BaseTest();
		BaseTest x1=new BaseTest();
		//x.m1();
		//x.m2(4, "sdgfjghkfkln sdjkhdgjfd");
		//x.m3(4,6,8);
		//x.m4();cannt reach
		//x.getZ();
		//x.setZ(280);
		//x.m6();
		//x.m7();
	
		Demo y=new Demo();//if different package u have to import that package
		//y.m1();cant reach.
		//y.m2(3, "gsd");
		//y.m3();cannt reach
		//y.m4();cannt reach
		//y.getZ();
		//y.setZ(34);
		y.m8();
		
		
		

	}

}
