package app3;
class T
{
	int i;
	T(int i)
	{
		this.i = i;	
	}
}
class Manager12 
{
	public static void main(String[] args) 
	{
		T t1 = new T(90);
		T t2 = t1;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
