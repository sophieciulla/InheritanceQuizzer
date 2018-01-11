import java.util.Scanner;
public class Quizzer
	{
		static int questions;
		static int numberRight;

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

			}
		public static void askNumberOfQuestions()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many questions would you like to have?");
			questions = userInput.nextInt();
			numberRight = 0;
		}
		public static void askQuestions()
		{
			for (int i =0;i<questions; i++)
				{
					System.out.println("If the code runs:
						System.out.println("Plant x = new Plant( ); /n x.grow()");
						
						
				}
		public static void showAnswerOptions()
		{
					System.out.println("What will the code output?");
					System.out.println("    A. There are some types of flowers that can grow in complete shade");
					System.out.println("    B. I need sun to grow");
					System.out.println("    C. If you don't water me, I will die");
					System.out.println("    D. Flowers are usually very colorful");
					System.out.println("    E. The code will not execute");
				
		}
		}

	}
