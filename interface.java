interface printable
{
	public void print();
}
class a implements printable
{
	public void print()
	{
		System.out.println("Print method of class a :");
	}
}
class interface1
{
	public static void main(String [] args)
	{
		a a1 = new a();
		a1.print();
	}
}