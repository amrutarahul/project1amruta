package Casting;

public class Upcasting {

	public static void main(String[] args) 
	{
        Fatherupcasting fuc=new Fatherupcasting();
        Sonupcasting suc=new Sonupcasting();
        fuc.bike();
        fuc.car();
        suc.bike();
        suc.car();
        suc.degree();
        
        Fatherupcasting f1=new Sonupcasting();
        System.out.println("=================");
        f1.bike();
        f1.car();
        //f1.BE();
        System.out.println("================");
        //Sonupcasting s1=(Sonupcasting) new Fatherupcasting();
        //s1.bike();//java was not support
	}

}
