import java.util.Random;
import java.util.Scanner;
public class mainquiz {
	static int count=0;
	static int lifeline=2;
	static int fifty=1;
	static int audiencepoll=1;
	static Random ran=new Random();
	static int rand= ran.nextInt(3)+1;
	static int ans1=1;
	static int ans2=3;
	static int ans3=1;
	static int ans4=4;
	static int ans5=1;
	static int ans6=3;
	static int ans7=4;
	static int ans8=4;
	static int ans9=1;
	static int ans10=2;
	static int b;
	
	
	
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		
		Participant p=new Participant();
		
		//Static int amount=0;

		
		// TODO Auto-generated method stub
		try {
			System.out.println("welcome to the quiz");
			System.out.println("enter the name of the partcipant");
			p.setName(sc.next());
			
			System.out.println("enter your age");
			p.setAge(sc.nextInt());
			System.out.println("enter your address");
			p.setAddress(sc.next());
			System.out.println("enter your city");
			p.setCity(sc.next());
			System.out.println("enter your phone number");
			p.setPhonenumber(sc.nextInt());
			System.out.println("************************************************************");
			System.out.println("Are you ready");
			System.out.println("Lets begin the game");
			System.out.println("1:YES             2:NO");
			int a=sc.nextInt();
			if(a==1)
			{
				displayrules();
				System.out.println("**************************************************************");
				question1();
				Thread.sleep(2000);
				question2();
				Thread.sleep(2000);
				question3();
				Thread.sleep(2000);
				question4();
				Thread.sleep(2000);
				question5();
				Thread.sleep(2000);
				question6();
				Thread.sleep(2000);
				question7();
				Thread.sleep(2000);
				question8();
				Thread.sleep(2000);
				question9();
				Thread.sleep(2000);
				question10();
				Thread.sleep(2000);
				winner();
							}
			else if(a==2) {
				System.exit(0);
			}
			else {
				System.out.println("invalid input");
				mainquiz.main(null);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public static void displayrules() {
		try {
			System.out.println("******************************************************************");
			System.out.println("One right answer will give 10+ score ");
			System.out.println("Multiple answer is not allowed  ");
			System.out.println("Can use lifeline only once  ");
			System.out.println("if you already used the life line once dont use it for one more time or else game will get quit");
			System.out.println("******************************************************************");

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void question1() {
		try {
		System.out.println("What is the capital of India ?");
		System.out.println("1.New Delhi");//      2:Uttar Pradesh     3:Karnataka     4:Punjab    5:Lifeline");
		System.out.println("2:Uttar Pradesh");
		System.out.println("3:Karnataka");
		System.out.println("4:Punjab");
		System.out.println("5:Lifeline");
		System.out.println("6.exit");
		System.out.println("life line left "+lifeline);
		System.out.println("********************************************************************************");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		//int lfeln=sc.nextInt();
		if(b==1)
		{
			System.out.println("your answer is correct");
			//int amount=0;
			count+=10;
			System.out.println("your score is "+count);
			
		}
		else if(b==5)
		{
			System.out.println("1:50-50           2:Audience poll");
			Scanner sc1 = new Scanner(System.in);
			int opt=sc1.nextInt();
			if (opt==1) {
				lifeline();
				fifty--;
				}
			else if(opt==2) {
				lifeline--;
				System.out.println("1:NEW DELHI(87%)   2:UTTAR PRADESH(67%)     3:KARNATAKA(53%)     4:PUNJAB(59%)");
				question1();
				audiencepoll--;
			}
//			lifeline--;
//			System.out.println("life lline used");
//			System.out.println("50/50");
//			question1();
//			System.out.println("life line left"+lifeline);
			
//			
		}
		else if(b==6)
		{
			System.out.println("thank you for thefor participating your scored points is  \"+count");
			System.exit(0);
			
		}
		else
		{
			System.out.println("Answer is wrong ! thanks for participating your scored points is  "+count);
			System.exit(0);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void question2() {
		System.out.println("How many continents are there in the world ? ");
		System.out.println("1.five      2:two     3:seven     4:eight      5:lifeline       6:exit");
		System.out.println("life line left "+lifeline);
		System.out.println("*************************************************************");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		if(b==3)
		{
			
			System.out.println("your answer is correct");
			//int amount=0;
			count+=10;
			System.out.println(+count);
		}
		else if(b==5)
		{
			
			 if(lifeline==0)

			{
				System.exit(0);
			}
			 else  if(fifty==1 && audiencepoll==1  && lifeline==2 )
			{
			System.out.println("1:50-50       2:Audience poll");
			Scanner sc1 = new Scanner(System.in);
			int opt=sc1.nextInt();
				if(opt==1)
				{
				lifeline();
//				fifty--;
//				lifeline--;
				question2();
				}
				else if(opt==2)
				{
					System.out.println("1:FIVE(37%)   2:TWO(67%)     3:SEVEN(89%)     4:EIGHT(59%)");
					audiencepoll--;
					lifeline--;
					question2();
				}
			
			
			}
			 else if(audiencepoll==1 && lifeline==1)
			{
				System.out.println("1:Audience poll");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
					if(opt==1)
					{
					System.out.println("1:FIVE(37%)   2:TWO(67%)     3:SEVEN(89%)     4:EIGHT(59%)");
					audiencepoll--;
					lifeline--;
					question2();
				}
			}
//					else if(audiencepoll==0)
//					{
//						System.out.println("LIFELINE ALREDY EXHAUSTED");
//						question2();
//					}
			
					else if(lifeline==0) 
					{
						System.out.println("you dont have any lifeline left");
						question2();
					}

					
				
				
				//write code here
					else if(fifty==1 && lifeline==1)
			{
				System.out.println("1:50/50");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
				if(opt==1) {
					lifeline1();
					fifty--;
					question2();
				}
					 if(fifty==0 || lifeline==0)
					{
						System.out.println("LIFELINE ALREDY EXHAUSTED");
						question2();
					}
					 
			
			}
			}
	


		else if(b>6) 
	{
			System.out.println("invalid answer");
			question2();
		}
		else if(b==6)
		{
		 System.out.println("thanks for participating your scored points is  \"+count");	
		 System.exit(0);
		}

		
		else
		{
			System.out.println("Answer is wrong ! thanks for participating your scored points is  "+count);
			System.exit(0);
		}
}
	public static void question3() {
		System.out.println("how many states  are there in india");
		System.out.println("1.Twenty eight      2:Twenty nine     3:Twenty seven     4:Thirty       5:Lifeline       6:exit");
		System.out.println("life line left "+lifeline);
		System.out.println("*****************************************************************************************");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		if(b==1)
		{
			System.out.println("your answer is correct");
			count+=10;
			System.out.println(+count);

		}
		else if(b==5)
		{
		if(lifeline==0)
			{
				System.out.println("you dont have any lifeline left");
						question3();
			}
			
			if(fifty==1 && audiencepoll==1  && lifeline==2 )
			{
				System.out.println("1:50-50       2:Audience poll");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
					if(opt==1)
					{
					lifeline2();
//					fifty--;
//					lifeline--;
					//question3();
					}
					else if(opt==2)
					{
						System.out.println("1:TWENTY EIGHT(97%)   2:TWENTY NINE(37%)     3:TWENTY SEVEN(83%)     4:THIRTY(19%)");
						audiencepoll--;
						lifeline--;
						question3();
					}
			
			}
			else if(audiencepoll==1 && lifeline==1)
			{
				System.out.println("1:Audience poll");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
				if(opt==1) {
					System.out.println("1:TWENTY EIGHT(97%)   2:TWENTY NINE(37%)     3:TWENTY SEVEN(83%)     4:THIRTY(19%)");
					audiencepoll--;
					lifeline--;
					question3();
				}
					else if(audiencepoll==0) {
						System.out.println("LIFELINE ALREDY EXHAUSTED");
						question3();
					}
					else 
					{
						System.out.println("you dont have any lifeline left");
						question3();
					}
					
				}
				
				//write code here
			else if(fifty==1 && lifeline==1)
			{
				System.out.println("1:50/50");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
				if(opt==1) {
					lifeline2();
//					fifty--;
//					lifeline--;
					question3();
				}
					else if(fifty==0 || lifeline==0) {
						System.out.println("LIFELINE ALREDY EXHAUSTED");
						question3();
					}
					
				}
		}

		else if(b>6) 
		{
			System.out.println("invalid answer");
			question3();
		}
		else if(b==6)
		{
			System.out.println(" thanks for participating your scored points is  "+count);
			System.exit(0);
		}
		
		else
		{
			System.out.println("Answer is wrong ! thanks for participating your scored points is  "+count);
			System.exit(0);
		}
	}

	public static void question4() {
		System.out.println("how many union territories are there in india");
		System.out.println("1.Nine      2:One     3:Seven     4:Eight     5:Lifeline       6:exit");
		System.out.println("life line left "+lifeline);
		System.out.println("*****************************************************************");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		if(b==4)
		{
			System.out.println("your answer is correct");
			count+=10;
			System.out.println(+count);

		}
		else if(b==5)
		{
			if(lifeline==0)
			{
				System.out.println("you dont have any lifeline left");
				question4();
			}
			
			if(fifty==1 && audiencepoll==1  && lifeline==2 )
			{
			System.out.println("1:50-50       2:Audience poll");
			Scanner sc1 = new Scanner(System.in);
			int opt=sc1.nextInt();
				if(opt==1)
				{
				lifeline3();
//				fifty--;
//				lifeline--;
				question4();
				}
				else if(opt==2)
				{
					System.out.println("1:NINE(28%)   2:ONE(37%)     3:SEVEN(19%)     4:EIGHT(73%)");
					audiencepoll--;
					lifeline--;
					question4();
				}
		
			
			}
			else if(audiencepoll==1 && lifeline==1)
			{
				System.out.println("1:Audience poll");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
				if(opt==1) {
					System.out.println("1:NINE(28%)   2:ONE(37%)     3:SEVEN(19%)     4:EIGHT(73%)");
					audiencepoll--;
					lifeline--;
					question4();
				}
					else if(audiencepoll==0) {
						System.out.println("LIFELINE ALREDY EXHAUSTED");
						question4();
					}
					else 
					{
						System.out.println("you dont have any lifeline left");
						question4();
					}
					
				}
				
				//write code here
			else if(fifty==1 && lifeline==1)
			{
				System.out.println("1:50/50");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
				if(opt==1) {
					lifeline3();
//					fifty--;
//					lifeline--;
					//question3();
				}
					else if(fifty==0 || lifeline==0) {
						System.out.println("LIFELINE ALREDY EXHAUSTED");
						question4();
					}
					
				}
		}

		else if(b>6) 
		{
			System.out.println("invalid answer");
			question4();
		}
		else if(b==6)
		{
			System.out.println("thanks for participating your scored points is "+count);
			System.exit(0);
		}
		
		else
		{
			System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
			System.exit(0);
		}
	}
	
	public static void question5() {
		System.out.println("who is the current prime minister of india");
		System.out.println("1.Narendra Modi      2:Saumy mishra     3:Amit shah     4:Athul k         5.Lifeline       6:exit");
		System.out.println("life line left "+lifeline);
		System.out.println("*******************************************************************************************************");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		if(b==1)
		{
			System.out.println("your answer is correct");
			count+=10;
			System.out.println(+count);

		}
		else if(b==5)
		{
			{
				if(lifeline==0)
				{
					System.out.println("you dont have any lifeline left");
					question5();
				}
				
				if(fifty==1 && audiencepoll==1  && lifeline==2 )
				{
				System.out.println("1:50-50       2:Audience poll");
				Scanner sc1 = new Scanner(System.in);
				int opt=sc1.nextInt();
					if(opt==1)
					{
					lifeline4();
//					fifty--;
//					lifeline--;
					//question5();
					}
					else if(opt==2)
					{
						System.out.println("1:NARENDRA MODI(87%)   2:SAUMY MISHRA(7%)     3:AMIT SHAH(53%)     4:ATHUL K(9%)");
						audiencepoll--;
						lifeline--;
						question5();
				
				}
				}
				else if(audiencepoll==1 && lifeline==1)
				{
					System.out.println("1:Audience poll");
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
					if(opt==1) {
						System.out.println("1:NARENDRA MODI(87%)   2:SAUMY MISHRA(7%)     3:AMIT SHAH(53%)     4:ATHUL K(9%)");
						audiencepoll--;
						lifeline--;
						question5();
					}
						else if(audiencepoll==0) {
							System.out.println("LIFELINE ALREDY EXHAUSTED");
							question5();
						}
						else 
						{
							System.out.println("you dont have any lifeline left");
							question5();
						}
						
					}
					
					//write code here
				else if(fifty==1 && lifeline==1)
				{
					System.out.println("1:50/50");
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
					if(opt==1) {
						lifeline4();
//						fifty--;
//						lifeline--;
						//question5();
					}
						else if(fifty==0 || lifeline==0) {
							System.out.println("LIFELINE ALREDY EXHAUSTED");
							question5();
						}
						
					}

			else if(b>6) 
			{
				System.out.println("invalid answer");
				question5();
			}
			else if(b==6)
			{
				System.out.println("thanks for participating your scored points is "+count);
				System.exit(0);
			}
			
			else
			{
				System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
				System.exit(0);
			}
		}
	}
	}
		public static void question6() {
			System.out.println("Which planet is known as red planet");
			System.out.println("1.Jupiter      2:Saturn     3:Mars     4:Earth         5.Lifeline       6:exit");
			System.out.println("life line left "+lifeline);
			System.out.println("*******************************************************************************************************");
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
			if(b==3)
			{
				System.out.println("your answer is correct");
				count+=10;
				System.out.println(+count);

			}
			else if(b==5)
			{
					if(lifeline==0)
					{
						System.out.println("you dont have any lifeline left");
						question6();
					}
					
					if(fifty==1 && audiencepoll==1  && lifeline==2 )
					{
					System.out.println("1:50-50       2:Audience poll");
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
						if(opt==1)
						{
						lifeline5();
//						fifty--;
//						lifeline--;
						//question6();
						}
						else if(opt==2)
						{
							System.out.println("1:JUPITER(47%)   2:SATURN(67%)     3:MARS(83%)     4:EARTH(59%)");
							audiencepoll--;
							lifeline--;
							question6();
					
					}
					
					}
					else if(audiencepoll==1 && lifeline==1)
					{
						System.out.println("1:Audience poll");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							System.out.println("1:JUPITER(47%)   2:SATURN(67%)     3:MARS(83%)     4:EARTH(59%)");
							audiencepoll--;
							lifeline--;
							question6();
						}
							else if(audiencepoll==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question6();
							}
							else 
							{
								System.out.println("you dont have any lifeline left");
								question6();
							}
							
						}
						
						//write code here
					else if(fifty==1 && lifeline==1)
					{
						System.out.println("1:50/50");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							lifeline5();
//							fifty--;
//							lifeline--;
//							question6();
						}
							else if(fifty==0 || lifeline==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question6();
							}
							
						}
			}
				

				else if(b>6) 
				{
					System.out.println("invalid answer");
					question6();
				}
				else if(b==6)
				{
					System.out.println("thanks for participating your scored points is "+count);
					System.exit(0);
				}
				
				else
				{
					System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
					System.exit(0);
				}
			}
public static void question7() {
			System.out.println("Which is the largest mammal in the world");
			System.out.println("1.Elephant      2:Giraffe     3:Blue whale     4:kangaroo        5.Lifeline       6:exit");
			System.out.println("life line left "+lifeline);
			System.out.println("*******************************************************************************************************");
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
			if(b==3)
			{
				System.out.println("your answer is correct");
				count+=10;
				System.out.println(+count);

			}
			else if(b==5)
			{
					if(lifeline==0)
					{
						System.out.println("you dont have any lifeline left");
						question7();
					}
					
					if(fifty==1 && audiencepoll==1  && lifeline==2 )
					{
					System.out.println("1:50-50       2:Audience poll");
					
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
						if(opt==1)
						{
						lifeline6();
//						fifty--;
//						lifeline--;
						question7();
						}
						else if(opt==2)
						{
							System.out.println("1:ELEPHANT(87%)   2:GIRAFFE(67%)     3:BLUE WHALE(93%)     4:KANGAROO(59%)");
							audiencepoll--;
							lifeline--;
							question7();
					
					}
					
					
					}
					else if(audiencepoll==1 && lifeline==1)
					{
						System.out.println("1:Audience poll");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							System.out.println("1:ELEPHANT(87%)   2:GIRAFFE(67%)     3:BLUE WHALE(93%)     4:KANGAROO(59%)");
							audiencepoll--;
							lifeline--;
							question7();
						}
							else if(audiencepoll==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question7();
							}
							else 
							{
								System.out.println("you dont have any lifeline left");
								question7();
							}
							
						}
						
						//write code here
					else if(fifty==1 && lifeline==1)
					{
						System.out.println("1:50/50");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							lifeline6();
							fifty--;
							lifeline--;
							question7();
						}
							else if(fifty==0 || lifeline==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question7();
							}
							
						}
				}

				else if(b>6) 
				{
					System.out.println("invalid answer");
					question7();
				}
				else if(b==6)
				{
					System.out.println("thanks for participating your scored points is "+count);
					System.exit(0);
				}
			
			else
			{
				System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
				System.exit(0);
				
			}
		}

		public static void question8() {
			System.out.println("Which is the largest ocen in the world?");
			System.out.println("1.Indian ocean      2:Atlantic ocea     3:Arctic ocean     4:Pacific ocean         5.Lifeline       6:exit");
			System.out.println("life line left "+lifeline);
			System.out.println("*******************************************************************************************************");
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
			if(b==4)
			{
				System.out.println("your answer is correct");
				count+=10;
				System.out.println(+count);

			}
			else if(b==5)
			{
					if(lifeline==0)
					{
						System.out.println("you dont have any lifeline left");
						question8();
					}
					
					if(fifty==1 && audiencepoll==1  && lifeline==2 )
					{
					System.out.println("1:50-50       2:Audience poll");
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
						if(opt==1)
						{
						lifeline7();
//						fifty--;
//						lifeline--;
						question8();
						}
						else if(opt==2)
						{
							System.out.println("1:INDIAN OCEAN(87%)   2:ATLANTIC OCEAN(67%)     3:ARCTIC OCEAN(53%)     4:PACIFIC OCEAN(89%)");
							audiencepoll--;
							lifeline--;
							question8();
					
					}
					
					}
					else if(audiencepoll==1 && lifeline==1)
					{
						System.out.println("1:Audience poll");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							System.out.println("1:INDIAN OCEAN(87%)   2:ATLANTIC OCEAN(67%)     3:ARCTIC OCEAN(53%)     4:PACIFIC OCEAN(89%)");
							audiencepoll--;
							lifeline--;
							question8();
						}
							else if(audiencepoll==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question8();
							}
							else 
							{
								System.out.println("you dont have any lifeline left");
								question8();
							}
							
						}
					else if(fifty==1 && lifeline==1)
					{
						System.out.println("1:50/50");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							lifeline7();
							fifty--;
							lifeline--;
							question8();
						}
							else if(fifty==0 || lifeline==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question8();
							}
							
						}
				}
			else if(b==6)
			{
				System.out.println("thanks for participating your scored points is "+count);
			System.exit(0);
			}

			
			else
			{
				System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
				System.exit(0);
				
			}
		}
	
		public static void question9() {
			System.out.println("Who wrote romeo & juliet ?");
			System.out.println("1.William Shakespear      2:Christopher Marlowe     3:Ben Johnson     4:john webster         5.Lifeline       6:exit");
			System.out.println("life line left "+lifeline);
			System.out.println("*******************************************************************************************************");
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
			if(b==1)
			{
				System.out.println("your answer is correct");
				count+=10;
				System.out.println(+count);

			}
			else if(b==5)
			{
					if(lifeline==0)
					{
						System.out.println("you dont have any lifeline left");
						question9();
					}
					
					if(fifty==1 && audiencepoll==1  && lifeline==2 )
					{
					System.out.println("1:50-50       2:Audience poll");
					
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
						if(opt==1)
						{
						lifeline8();
//						fifty--;
//						lifeline--;
						question9();
						}
						else if(opt==2)
						{
							System.out.println("1:WILLIAM SHAKESPEAR(87%)   2:CHIRSTOPHER MARLOWE(37%)     3:BEN JOHNSON(23%)     4:JOHN WEBSTER(19%)");
							audiencepoll--;
							lifeline--;
							question9();
					
					}
					
					}
					else if(audiencepoll==1 && lifeline==1)
					{
						System.out.println("1:Audience poll");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							System.out.println("1:WILLIAM SHAKESPEAR(87%)   2:CHIRSTOPHER MARLOWE(37%)     3:BEN JOHNSON(23%)     4:JOHN WEBSTER(19%)");
							audiencepoll--;
							lifeline--;
							question9();
						}
							else if(audiencepoll==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question9();
							}
							else 
							{
								System.out.println("you dont have any lifeline left");
								question9();
							}
							
						}
						
						//write code here
					else if(fifty==1 && lifeline==1)
					{
						System.out.println("1:50/50");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							lifeline8();
							fifty--;
							lifeline--;
							question9();
						}
							else if(fifty==0 || lifeline==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question9();
							}
							
						}
				}
			else if(b==6)
			{
				System.out.println("thanks for participating your scored points is "+count);
				System.exit(0);
			}

			
			else
			{
				System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
				System.exit(0);
				
			}
		}
		public static void question10() {
			System.out.println("Which animal is called king of the jungle ?");
			System.out.println("1.Tiger      2:Lion     3:Elephant     4:Leopard         5.Lifeline       6:exit");
			System.out.println("life line left "+lifeline);
			System.out.println("*******************************************************************************************************");
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
			if(b==2)
			{
				System.out.println("your answer is correct");
				count+=10;
				System.out.println(+count);

			}
			else if(b==5)
			{
					if(lifeline==0)
					{
						System.out.println("you dont have any lifeline left");
						question10();
					}
					if(fifty==1 && audiencepoll==1  && lifeline==2 )
					{
					System.out.println("1:50-50       2:Audience poll");
					
					Scanner sc1 = new Scanner(System.in);
					int opt=sc1.nextInt();
						if(opt==1)
						{
						lifeline9();
//						fifty--;
//						lifeline--;
						question10();
						}
						else if(opt==2)
						{
							System.out.println("1:WILLIAM SHAKESPEAR(87%)   2:CHIRSTOPHER MARLOWE(37%)     3:BEN JOHNSON(23%)     4:JOHN WEBSTER(19%)");
							audiencepoll--;
							lifeline--;
							question10();
					
					}
					
					}
					else if(audiencepoll==1 && lifeline==1)
					{
						System.out.println("1:Audience poll");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							System.out.println("1:WILLIAM SHAKESPEAR(87%)   2:CHIRSTOPHER MARLOWE(37%)     3:BEN JOHNSON(23%)     4:JOHN WEBSTER(19%)");
							audiencepoll--;
							lifeline--;
							question10();
						}
							else if(audiencepoll==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question10();
							}
							else 
							{
								System.out.println("you dont have any lifeline left");
								question10();
							}
							
						}
						
						//write code here
					else if(fifty==1 && lifeline==1)
					{
						System.out.println("1:50/50");
						Scanner sc1 = new Scanner(System.in);
						int opt=sc1.nextInt();
						if(opt==1) {
							lifeline9();
							fifty--;
							lifeline--;
							question10();
						}
							else if(fifty==0 || lifeline==0) {
								System.out.println("LIFELINE ALREDY EXHAUSTED");
								question10();
							}
							
						}
				}
			else if(b==6)
			{
				System.out.println("thanks for participating your scored points is "+count);
				System.exit(0);
			}

			
			else
			{
				System.out.println("Answer is wrong ! thanks for participating your scored points is "+count);
				System.exit(0);
				
			}
		}
			public static void winner() {
				System.out.println("You played well you scored "+count +"on "+ count );
				System.exit(0);
			}
		
	public static void lifeline() {
		if(lifeline==0) {
			System.out.println("lifeline is already exhausted");
			question1();
		}
		System.out.println("lifeline is used");
		fifty--;
		lifeline--;
			if (rand >= ans1) {
			        rand += 1;
			    }
			 System.out.println("hint asnwer might "+rand+ "or" +ans1);
			 System.out.println("***********************************************");
			 question1();
		}
	public static void lifeline1() {
		if(lifeline==0) {
			System.out.println("lifeline is already exhausted");
			question2();
			
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans2) {
			        rand += 1;
			    }
			 System.out.println("hint asnwer might "+ans2+ "or" +rand);
			 System.out.println("***********************************************");
			 question2();
		}
	public static void lifeline2() {
		if(lifeline==0) {
			System.out.println("lifeline is already exhausted");
			question3();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans3) {
			        rand += 1;
			    }
			 System.out.println("hint asnwer might "+rand+ "or" +ans3);
			 System.out.println("**********************************************");
			 question3();
		}
	public static void lifeline3() {
		if(lifeline==0) {
			System.out.println("lifeline is already exhausted");
			question4();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans4) {
			        rand += 1;
			    }
			 System.out.println("hint asnwer might "+rand+ "or" +ans4);
			 System.out.println("*********************************************");
			 question4();
		}
	public static void lifeline4() {
		if(lifeline==0) {
			System.out.println("lifeline is already exhausted");
			question5();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans5) {
			        rand += 1;
			    }
			 System.out.println("hint asnwer might "+ans5+ "or" +rand);
			 System.out.println("*******************************************");
			 question5();
		}
	public static void lifeline5() {
		if(lifeline==0) {
			System.out.println("lifeline is already exhausted");
		question6();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans6) {
			        rand += 1;
		    }
		System.out.println("hint asnwer might "+ans6+ "or" +rand);
		 System.out.println("*******************************************");
		 question6();
	}
	public static void lifeline6() {
		if(lifeline==0) 
		{
			System.out.println("lifeline is already exhausted");
		question7();
		}
		System.out.println("lifeline is used");
		fifty--;
		lifeline--;
		if (rand >= ans7) {
			        rand += 1;
		    }
		System.out.println("hint asnwer might "+ans7+ "or" +rand);
		 System.out.println("*******************************************");
		 question7();
	}
	public static void lifeline7() {
		if(lifeline==0) 
		{
			System.out.println("lifeline is already exhausted");
		question8();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans8) {
			        rand += 1;
		    }
		System.out.println("hint asnwer might "+rand+ "or" +ans8);
		 System.out.println("*******************************************");
		 question8();
	}
	public static void lifeline8() {
		if(lifeline==0) 
		{
			System.out.println("lifeline is already exhausted");
		question9();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans9) {
			        rand += 1;
		    }
		System.out.println("hint asnwer might "+ans9+ "or" +rand);
		 System.out.println("*******************************************");
		 question9();
	}
	public static void lifeline9() {
		if(lifeline==0) 
		{
			System.out.println("lifeline is already exhausted");
		question10();
		}
		System.out.println("lifelin is used");
		fifty--;
		lifeline--;
		if (rand >= ans10) {
			        rand += 1;
		    }
		System.out.println("hint asnwer might "+rand+ "or" +ans10);
		 System.out.println("*******************************************");
		 question10();
	}
	
}



