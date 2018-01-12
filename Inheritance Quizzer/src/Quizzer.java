import java.util.ArrayList;
import java.util.Scanner;
public class Quizzer
	{
		static int questions;
		static int numberRight;
		static String userAnswer;
		public static ArrayList<Data>dataArray = new ArrayList<Data>();

		public static void main(String[] args)
			{
//				public static void playQuizzer()
//				{
				fillArray();
				askNumberOfQuestions();
				askQuestions();
				finishGame();
				//}
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
					Scanner userInput = new Scanner(System.in);
					int randomNum = (int)(Math.random()*12)+1;
					System.out.println("Calling the " + dataArray.get(randomNum).getMethod() + " method, what would the answer be to this instantiation: ");
					System.out.println("    " + dataArray.get(randomNum).getInstantiation());
					System.out.println();
					showAnswerOptions();
					userAnswer = userInput.nextLine();
					System.out.println();
					
					dataArray.remove(randomNum);
					
					if(userAnswer.equals(dataArray.get(randomNum).getCorrectAnswer()))
					{
						System.out.println("   Ding ding ding!");
						numberRight++;
						System.out.println("   Your score is " + numberRight + " / " + questions);
						System.out.println();
					}
					else
					{
						System.out.println("   Maybe next time");
						System.out.println("   Your score is " + numberRight + " / " + questions);
						System.out.println();
					}
					
					
				}
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
		public static void fillArray()
		{
			dataArray.add(new Data("Plant x = new Plant()", "grow()","B" ));
			dataArray.add(new Data("Plant x = new Plant()", "water()","C" ));
			dataArray.add(new Data("Plant x = new Plant()", "hasColors()","E" ));
			
			dataArray.add(new Data("Plant x = new Flower()", "grow()", "A"));
			dataArray.add(new Data("Plant x = new Flower()", "water()", "C"));
			dataArray.add(new Data("Plant x = new Flower()", "hasColors()", "E"));
			
			dataArray.add(new Data("Flower x = new Plant()", "hasColors()", "E"));
			dataArray.add(new Data("Flower x = new Plant()", "water()", "E"));
			dataArray.add(new Data("Flower x = new Plant()", "grow()", "E"));
			
			dataArray.add(new Data("Flower x = new Flower()", "water()", "C"));
			dataArray.add(new Data("Flower x = new Flower()", "grow()", "A"));
			dataArray.add(new Data("Flower x = new Flower()", "hasColors()", "D"));
		}
		public static void finishGame()
		{
			System.out.println("All done!");
			System.out.println("You got " + numberRight + " correct :)");
			Scanner userInput = new Scanner(System.in);
			System.out.println("Would you like to play again? Press 1 for yes and 2 for no");
			int userNum = userInput.nextInt();
			if(userNum == 1)
			{
//				playQuizzer();
			}
			else
			{
				System.out.println("Okay!");
			}
			
		}
		
		

	}
