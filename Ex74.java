package bookExercises;

import javax.swing.JOptionPane;

public class Ex74 {

	static void arrayValues(int a) {

		int[] values = new int[a];

		for (int i = 0; i < values.length; i++) {

			values[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input" + "\nIndex: " + i));

		}

		for (int i = 0; i < values.length; i++) {

			System.out.print(values[i] + " | ");

		}

	}

	static void orderedArray(int a) {

		int[] values = new int[a];

		for (int i = 0; i < values.length; i++) {

			values[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input" + "\nIndex: " + i));

		}

		int swap;

		for (int i = 0; i < values.length; i++) {

			for (int j = i + 1; j < values.length; j++) {

				if (values[i] > values[j]) {

					swap = values[i];
					values[i] = values[j];
					values[j] = swap;
				}

			}
		}

		for (int i = 0; i < values.length; i++) {

			System.out.print(values[i] + " | ");
		}

	}

	static void evenValues(int a) {

		int[] values = new int[a];

		int[] evenValues = new int[a];

		for (int i = 0; i < values.length; i++) {

			values[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input" + "\nIndex: " + i));

		}

		for (int i = 0; i < values.length; i++) {

			if (values[i] % 2 == 0) {

				evenValues[i] = values[i];
			}
		}

		for (int i = 0; i < values.length; i++) {

			System.out.print(evenValues[i] + " | ");
		}

	}

	static void multipleByFive(int a) {

		int[] values = new int[a];

		int[] multipleBy5 = new int[a];

		for (int i = 0; i < values.length; i++) {

			values[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input" + "\nIndex: " + i));

		}

		for (int i = 0; i < values.length; i++) {

			if (values[i] % 5 == 0) {

				multipleBy5[i] = values[i];
			}
		}

		for (int i = 0; i < values.length; i++) {

			System.out.print(multipleBy5[i] + " | ");
		}

	}

	public static void main(String[] args) {

		String userAnswer;

		int userChoice;

		int arrayLength;

		do {

			userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1- Fill matrix A.\r\n" + "2- Sort the elements of matrix A.\r\n"
							+ "3- Generate a matrix containing only the even numbers\r\n"
							+ "4- Generate a matrix containing only the numbers that are multiples of 5"));

			arrayLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array Length"));

			if (arrayLength <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value and greater than zero");
			}

			else {

				switch (userChoice) {

				case 1:

					arrayValues(arrayLength);

					break;

				case 2:

					orderedArray(arrayLength);

					break;

				case 3:

					evenValues(arrayLength);

					break;

				case 4:

					multipleByFive(arrayLength);

					break;

				default:

					JOptionPane.showMessageDialog(null, "You did not select any option");

				}

			}
			
			
			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");

	}

}
