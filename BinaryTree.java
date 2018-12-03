// Sam Stein
// Sorting and displaying by using a BST


// Binary Search Tree
public class BinaryTree {
	
	// Constructors
	BinaryTree(int key) 
	{
		this.root = new Node(key);
	}

	BinaryTree() 
	{
		this.root = null;
	}

	//Properties;
	Node root;


	// Methods

	// Insert a new node into the tree
	public void insert(int item) 
	{
		if (this.root == null) {
			// Empty tree, set new item to root
			this.root = new Node (item);
			return;
		}

		Node thisNode = root;

		while(true) {

			if (item <= thisNode.key) {
				// Traversing left side
				if (thisNode.left == null) {
					thisNode.right = new Node(item);
					break;
				}
				else {
					thisNode = thisNode.left;
					continue;
				}
			}
			else {
				// Traversing right side
				if (thisNode.right == null) {
					thisNode.right = new Node(item);
					break;
				}
				else {
					thisNode = thisNode.right;
					continue;
				}
			}
		}
	}

	// Traverse and display the tree
	public void display() 
	{
		if (this.root == null) {
			System.out.println("The tree is empty, ya dummy");
			return;
		}
		
		System.out.print("Binary Tree results: ");
		displayNode(this.root);
		System.out.println();
	}

	// Displays the value in the individual node
	private void displayNode(Node thisNode) 
	{
		if (thisNode.left != null) {
			displayNode(thisNode.left);
		}

		else {
			System.out.print(thisNode.key + " ");
			if (thisNode.right != null) {
				displayNode(thisNode.right);
			}
		}
	}

}

// The nodes that make up the Binary Search Tree
class Node 
{

	// Constructor
	 Node (int item)
	{
		key = item;
		this.left = null;
		this.right = null;
	}


	// Properties
	int key;
	Node left;
	Node right;	
}