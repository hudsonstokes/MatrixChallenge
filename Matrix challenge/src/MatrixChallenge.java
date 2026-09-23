
public class MatrixChallenge
	{

		public static void main(String[] args)
			{
				int [ ] [ ] myArray = {{3, 5, 9, 2, -1, 8, 13}, {-2, 5, 1, 11, 8, 2, 0}, {9, 1, -3, 4, 8, 4, 8}, {6, 0, 0, -1, 4, 12, 7}, {2, 6, -1, 5, 3, 10, 0}, {2, 5, 1, 7, 9, 2, 3}, {-3, 1, 1, 4, 11, 12, 4}};
				int small = myArray [0][0];
				int biiig = myArray [0][0];
				double average = 0;
				double number = 0;
				int sum = 0;
					for (int row = 0; row < myArray.length; row++) 
						{
							for (int column = 0; column < myArray[row].length; column++) 
								{
									if (myArray [row][column] > biiig) 
										{
											biiig = myArray [row][column];
										}
									else if (myArray [row][column] < small) 
										{
										small =	myArray [row][column];
										}
									sum += myArray[row][column];
									number++;
								}
							average = sum / number;
						}
System.out.println("The average number is " + average + ".");
System.out.println("The biggest number is " + biiig + ".");
System.out.println("The smallest number is " + small + ".");
			}

	}
