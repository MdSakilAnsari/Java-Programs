class a
{
	static int count=0;
		public a()
		{
			count++;
		System.out.print(count);
		}
		static void fun()
		{
			System.out.print("Hello");
		
		}
		void gun()
		{
			System.out.print("Sakil");
		
		}
}
class pep
{
	public static void main(String rgs[])
	{
		a obj=new a();
		obj.gun();
		a.fun();
		
	}
}
		