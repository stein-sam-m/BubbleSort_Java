// Sam Stein

import java.util.Scanner;

// Class that uses both bubble sorting and the binary tree
// TODO: Expand this project to include a quicksort, maybe other algos as well
public class Sorter {

	public static void main(String[] args) 
	{
		Sorter sorter = new Sorter();
		sorter.run();
	}

	public void run() 
	{
		// Create scanner and sorting objects
		Scanner scanner = new Scanner(System.in);
		BubbleSorter bubbleSorter = new BubbleSorter();
		BinaryTree binaryTree = new BinaryTree();
		int i = 0;

		// Loop to allow multiple sorts
		while(i < 1) {
			System.out.println("Enter the array: ");

			int[] arguments = parseArgumentsForSorting(scanner.nextLine());
			
			// Use bubble sort and display
			int[] sortedArguments = bubbleSorter.sort(arguments);
			bubbleSorter.displayFinalSort(sortedArguments);

			// Form the binary search tree
			for (int j = 0 ; j < arguments.length ; j++)
				binaryTree.insert(arguments[j]);

			binaryTree.display();

			i++;
		}

		scanner.close();
	}

	// Take arguments from commandline and make them 'sortable'
	public int[] parseArgumentsForSorting(String arguments) 
	{
		String[] noCommaArguments = arguments.split(",");
		int[] parsedArguments = new int[noCommaArguments.length];

		for (int i = 0 ; i < noCommaArguments.length ; i++) 
			parsedArguments[i] = Integer.parseInt(noCommaArguments[i]);

		return parsedArguments;
	} 
}