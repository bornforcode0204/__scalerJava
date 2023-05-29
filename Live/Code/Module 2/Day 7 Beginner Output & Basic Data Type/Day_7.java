class Day_7 {
	public static void main(String args[]) {
		// Your code goes here
		
		// Rules-:
		// 1. end statement with a semi colon ;
		// 2. case sensitive -> System, system
		// 3. to print text -> " "
		// 4. {}, (), " " --> they are in pairs
		// 5. Comments -->
				//single line comment 
				/*
				this is a 
				multi line
				comment
				*/
		// 6. print --> type the output
		//	 println --> type the output and press ENTER
		
		
		// Quizzes -> 1 to 11
		
		//Quiz 1:
		// System.out.print("Welcome in playground")
				// Error : ; is missing
	
		//Quiz 2:
		// system.out.print("Hi Everyone");
			// Error : s in System should be uppercase

		//Quiz 3:
		// System.out.prinT("Hi Guys");
			// Error: t in print should be lowercase

		
		//Quiz 4:
		// System.out.print(Good Morning Everyone);
			// Error : " " are missing

		
		//Quiz 5:
		// System.out.print('Happy Thursday');
			// Error : " " are missing

		
		//Quiz 6:
		// System.out.print(10 + 20); // 30
		
		//Quiz 7:
		// System.out.print(5 - 10); // -5
		
		//Quiz 8:
		// System.out.println("Hello");
		// System.out.print("World);
			// Error: " is missing at the end

		//Quiz 9:
		// System.out.print("Hello");
		// System.out.println("World");
		
			// HelloWorld
			
			
		//Quiz 10:
		// System.out.println("Hello");
		// System.out.print("World");
		// System.out.println("Welcome")
			// Error: ; is missing
		
		
				
		//Quiz 11:
		// System.out.printLN("Hello");
		// System.out.println("World);
			// Error : 1. LN in println should be lowercase
			// 		   2. " is missing at the end
		
		
		
		//Basic Operators/ Operands + Number Rules
		
		
		
		//Quiz 12: Which of the below symbol is an operator?
			// + , - , * , /	
		
		
		//Quiz 13:
			// 10 + 30 
			// Operator -> + 
			// Operands -> 10 & 30
			
			// 40 / 3
			// Operator -> /
			// Operands -> 40 & 3
			
		
		
		// Numbers -> 2 types
		/*
			1. Decimal numbers - numbers having Decimal point 
				Ex: 4.56, -5.78, 19.67, 20.0
			2. Non-decimal / Integers 
				Ex: -97, 0, 34, 555555
				
		Note: For today's class, the discussion is about Integers
		*/
		
		
		//Quiz 14:
		// System.out.print(5+8); // 13

		//Quiz 15:
		// System.out.print(5-8); // -3

		//Quiz 16:
		// System.out.print(5*8); // 40


		//Quiz 17:
		// System.out.print(8/2); // 4



		//Quiz 18:
		// System.out.print(10/3); // 3
			// In calculator, 10 / 3 = 3.3333
		
		// Rule: In Java, when we divide Integers we only get quotient 

		
			
		//Quiz 19:
		// System.out.print(24/9); // 2


		
		//Quiz 20:
		// System.out.print(3/6); // 0
			// In calculator 3/6 = 0.5
		
		
		//Quiz 21:
		// System.out.print(24/0);
			// Error
		
		// Rule : Dividing Integers by zero is not allowed


		
			
		
			
		//Quiz 22:
		// System.out.print(6*7/6);
			// 7

			
		
		//Quiz 23:
		
		
		
		/* Rule : Priority in Operators
			1. ()
			2. * , / 
			3. +, -
			
			If we have same priority operators, whichever comes 
			first from left to right that will be evaluated first
		
			If we have different priority operators, whichever has highest
			priority that will be evaluated first.
		*/
		
		
		//Quiz 24:
		// System.out.println(5 + 2 * 3);
			// 5 + 2 * 3
			// 5 + 6
			// 11 
		
		
		
		
		//Quiz 25:
		// System.out.println(5 + 15 / 5 + 6 * 3);
			// 5 + 15 / 5 + 6 * 3
			// 5 + 3 + 6 * 3
			// 5 + 3 + 18
			// 8 + 18
			// 26
			
		
			
		
		//Quiz 26:
		// System.out.println(7 - 2 * 4 + 18 / 3);
			// 7 - 2 * 4 + 18 / 3
			// 7 - 8 + 18 / 3
			// 7 - 8 + 6
			// -1 + 6
			// 5 
		
			
			
			
		//Quiz 27:	
		// System.out.println(3 * 4 / 2 + 7 + 3 - 4 / 2);
			// 3 * 4 / 2 + 7 + 3 - 4 / 2
			// 12 / 2 + 7 + 3 - 4 / 2
			// 6 + 7 + 3 - 4 / 2
			// 6 + 7 + 3 - 2
			// 13 + 3 - 2
			// 16 - 2
			// 14
			
		
		
		
		//Quiz 28:
		// System.out.println(5 + 2 * 4 + 8 - 6 + 12 / 4);
			// 5 + 2 * 4 + 8 - 6 + 12 / 4
			// 5 + 8 + 8 - 6 + 12 / 4
			// 5 + 8 + 8 - 6 + 3
			// 13 + 8 - 6 + 3
			// 21 - 6 + 3
			// 15 + 3
			// 18
			
		
	
		
		//Quiz 29:
		// System.out.println((5 + 2) * 3);
			// (5 + 2) * 3 
			// 7 * 3
			// 21
			
			
		
			
			
		
		
		
		//Quiz 30:
		// System.out.println("Hello" + "World");
			// HelloWorld
			

		
		//Quiz 31:
		// System.out.println("Hi" + "Students" + "Namaste");
			// "Hi" + "Students" + "Namaste"
			// "HiStudents" + "Namaste"
			// "HiStudentsNamaste"
		
		
		
		
		//Quiz 32:
		// System.out.println("Hi" + " " + "Namaste");
			// "Hi" + " " + "Namaste"
			// "Hi " + "Namaste"
			// "Hi Namaste"
		
		
		
			
		
		
		//Quiz 33:
		// System.out.println("Hi" * "Guys");
			// Error : only + can be used
			
		// Rule : With text Operand, only + operator can be used	
			
		
			
		//Quiz 34:
		// System.out.println("WelcomeHome" - "Home");
			// Error : only + can be used
		
		
		//Quiz 35:
		// System.out.println("Hello" + 3);  // Hello3
			// Operator -> + 
			// Operands -> "Hello" : text 
			// 				3 : Number 
			
		//Rule: With + operators, if one of the operand is text it will concatenate both operands
		 
			
		
		
		//Quiz 36:
		// System.out.println("Hello" + 3 + 4); 
			// "Hello" + 3 + 4
			// "Hello3" + 4
			// "Hello34"
		
		//Quiz 37:
		// System.out.println("Hello" + 10 + "World");
			// "Hello" + 10 + "World"
			// "Hello10" + "World"
			// "Hello10World"
			
			
		//Quiz 38:
		// System.out.println(10 + "Welcome");
			
			// 10 + "Welcome"
			// "10Welcome"
		
		
		//Quiz 39:
		// System.out.println(10 + 20 + "WakeUp" + 3 + 2);
			// 10 + 20 + "WakeUp" + 3 + 2
			// 30 + "WakeUp" + 3 + 2
			// "30WakeUp" + 3 + 2
			// "30WakeUp3" + 2
			// "30WakeUp32"
			
		
		//Quiz 40:
		// System.out.println("HiGuys" * 2);
			// Error : only + can be used with text 
			
		//Quiz 41:
		// System.out.println(10 + 20 + "WakeUp" + 3 * 2);
			// 10 + 20 + "WakeUp" + 3 * 2
			// 10 + 20 + "WakeUp" + 6
			// 30 + "WakeUp" + 6
			// "30WakeUp" + 6
			// "30WakeUp6"
			
		
			
		// Quiz 42:
		// System.out.println(10 + "Hello" * "World" + 3);
			// 10 + "Hello" * "World" + 3
			// Error 
		
		
		//Quiz 43:
		// System.out.println(10 + "WelcomeHome" - "Home" + 3);
			// 10 + "WelcomeHome" - "Home" + 3
			// "10WelcomeHome" - "Home" + 3
			// Error 
			
		
		
			
			
		 
		//Intro to Datatype
		
		// creating a variable -: type name = value;
			
			
		//Quiz 44:	Create a variable of type int and 
		// give name as num and assign 34 in it.
		
			// int num = 34;

		//Quiz 45:
		// int val = 30; // val[30]
		// System.out.println(val); // 30
		
		// Rule: Whenever we use variable name, the value of that variable is used
		
		
		//Quiz 46:	
		// int a = 10; // a[10]
		// int b = 20; // b[20]
		// System.out.println(a + b); // 10 + 20 => 30
		
		
		
		
		//Quiz 47:
		// int a = 10;
		// int b = 20;
		// System.out.println("Sum of Number is " + a + b);
			// "Sum of Number is " + a + b
			// "Sum of Number is " + 10 + 20
			// "Sum of Number is 10" + 20
			// "Sum of Number is 1020"
		
		
		// System.out.println("Sum of Number is " + (a + b) );
			// Sum of Number is 30

			

		//Quiz 48:	
		// int a = 10;
		// int b = 20;
		// System.out.println("Product of Number is " + a * b);
			// "Product of Number is " + a * b
			// "Product of Number is " + 10 * 20
			// "Product of Number is " + 200
			// "Product of Number is 200"
			
			
			
		
		//Quiz 49:
		// System.out.println(10 + 20 + "Hello);
			// Error : " is missing

		
			
			
		
		// Ctrl + right arrow key
		

		
	}
}