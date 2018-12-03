// Sam Stein

// Bubble Sort implementation
public class BubbleSorter {

	// Methods

	// Display the current state of the bubble sort
	public void display(int[] input)
	{
		for(int i = 0 ; i < input.length ; i++)
			System.out.print(input[i] + " ");
	}

	// Display the final iteration of the bubble sort
	public void displayFinalSort(int[] input) 
	{
		System.out.print("Bubble Sort results: ");

		for(int i = 0 ; i < input.length ; i++)
			System.out.print(input[i] + " ");

		System.out.println();
	}

	// Sort the arguments passed to BubbleSorter
	public int[] sort (int[] arguments) 
	{
		int a;
		for(int i = 0 ; i < arguments.length - 1; i++) {
			for(int j = 0 ; j < arguments.length - i - 1 ; j++) {
				if (arguments[j] > arguments[j + 1]) {
					a = arguments[j];
					arguments[j] = arguments[j + 1];
					arguments[j + 1] = a;
				}
			}

			display(arguments);
			System.out.println();
		}

		return arguments;
	}
}