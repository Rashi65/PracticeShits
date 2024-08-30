package StringsPackage;

public class Foo {

	public static void main(String args[]) {
		int foo = 13;
		System.out.println(foo);
		setFoo(foo);
		System.out.println(foo);
	}

	public static void setFoo(int bar) {
		System.out.println(bar);
		bar = 2;
		System.out.println(bar);
	}
}
