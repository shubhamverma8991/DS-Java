import java.util.Queue;

public class BinarySearchTree {
            private Node root;

            public BinarySearchTree() {
				this.root = null;
			}
			public BinarySearchTree(Node root) {
				this.root = root;
			}
			public void insert(int element)
			{
				Node temp=new Node();
				temp.setInfo(element);
				if(root==null)
					root=temp;
				else
				{
					Node curr=root;
				    Node parent=null;
				    while(curr!=null)
				    {
				    	parent=curr;
				    	if(element<=curr.getInfo())
				    		curr=curr.getLeft();
				    	else
				    		curr=curr.getRight();
				    }
				    if(element<=parent.getInfo())
				    	parent.setLeft(temp);
				    else
				    	parent.setRight(temp);
				}
			}
			public void breadthFS()
			{
				Node curr= root;
				QueueLL obj=new QueueLL();
				if(root != null)
				{
					System.out.println("Breadth First Traversal");
					obj.enqueue(root);
					while(!obj.isEmpty())
					{
						if(curr.getLeft()!=null)
						{
							obj.enqueue(curr.getLeft());
						}
						if(curr.getRight()!=null)
						{
							obj.enqueue(curr.getRight());
						}
						System.out.print(obj.dequeue()+" ");
						curr=obj.getFront();
				    }
				}else
				{
					throw new RuntimeException("Empty tree");
				}
			}
           
}
