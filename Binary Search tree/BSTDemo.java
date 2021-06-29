
public class BSTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BinarySearchTree tree=new BinarySearchTree();
       tree.insert(50);
       tree.insert(57);
       //tree.insert(57);
       tree.insert(53);
       tree.insert(67);
       tree.insert(58);
       tree.insert(69);
       //tree.insert(33);
       System.out.println("Inorder Traversal");
       tree.inorder();
       System.out.println();
       //System.out.println("preorder Traversal");
       //tree.preorder();
       System.out.println();
       //System.out.println("postorder Traversal");
      // tree.postorder();
       tree.deleteNode(0);
       tree.inorder();
	}

}
