package com.x.vuinner.basics;

public class InnerClasses {

	static String name = "name";
	Integer id = 1;

	class InnerClass {

		void display() {
			System.out.println("Innerclass" + name + ", " + id);
		}

	}

	static class StaticInnerClass {
		void display() {
			System.out.println("StaticInnerclass" + name);
		}

	}

	public static void main(String... strings) {
		InnerClasses outerClass = new InnerClasses();
		InnerClass localInnerClass = outerClass.new InnerClass();
		localInnerClass.display();

		InnerClasses.StaticInnerClass staticInnerClass = new InnerClasses.StaticInnerClass();
		staticInnerClass.display();

		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Child thread: anonymous");
			}
		};

		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable interface in thread: anonymous");
			}
		};
		Thread t2 = new Thread(r);

		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("overridden method in runnable argument");
			}
			
		});

		t.start();
		t2.start();
		t3.start();
		
		System.out.println("Main thread");
	}
}
