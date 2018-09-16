package junior2008;

public class GPSTextEntry {

	public static void main(String[] args) {
		ExpressionTree e = new ExpressionTree();
		String prefix = "+-A/BC*D^E^FG";
		Node root = e.buildExpTreePrefix(prefix.toCharArray());
		e.inorder(root);
		System.out.println();
		e.postOrder(root);
	}

}
