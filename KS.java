//WAP to create class name with Sybca create a function same as class name and also create a constructor which is called a static method named as run_method 
import java.util.*;
class Sybca
{
	Sybca()
	{
		System.out.println("This is Constructor");
		runmethod();
	}
	public static void runmethod()
	{
		System.out.println("This is static runmethod");
	}
	public void Sybca()
	{
		System.out.println("This is Sybca method");		
	}
}
public class KS
{
	public static void main(String[] args)
	{
		Sybca s1=new Sybca();
		s1.Sybca();
	}
}