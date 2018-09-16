package junior2008;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {

	char value;
	Node left, right;

	Node(char item) {
		value = item;
		left = right = null;
	}
}

public class ExpressionTree {

	Queue<Character> charQueue;

	public static boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
			return true;
		}
		return false;
	}

	public void inorder(Node t) {
		if (t != null) {
			inorder(t.left);
			System.out.print(t.value + " ");
			inorder(t.right);
		}
	}

	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value + " ");
		}
	}

	// build an expression tree and return the root node of the tree
	public Node buildExpTreePrefix(char[] prefix) {
		charQueue = new LinkedList<Character>();
		for (char c : prefix) {
			charQueue.add(c);
		}
		return build(charQueue.remove());
	}

	private Node build(char token) {
		Node treeNode;
		if (!isOperator(token)) {
			treeNode = new Node(token);
		} else {
			treeNode = new Node(token);
			treeNode.left = build(charQueue.remove());
			treeNode.right = build(charQueue.remove());
		}
		return treeNode;
	}
}
