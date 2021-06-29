
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
	
			public void inorder(Node treeroot)
			{
				if(treeroot != null)
				{
				inorder(treeroot.getLeft());
				System.out.print(treeroot.getInfo()+" ");
			    inorder(treeroot.getRight());
				}
			}
			public void inorder()
			{
				inorder(root);
			}
			public void preorder(Node treeroot)
			{
				if(treeroot != null)
				{
				System.out.print(treeroot.getInfo()+" ");
				preorder(treeroot.getLeft());
				preorder(treeroot.getRight());
				}
			}
			public void preorder()
			{
				preorder(root);
			}
			public void postorder(Node treeroot)
			{
				if(treeroot != null)
				{
				postorder(treeroot.getLeft());
				postorder(treeroot.getRight());
				System.out.print(treeroot.getInfo()+" ");
				}
			}
			public void postorder()
			{
				postorder(root);
			}
			@SuppressWarnings("unused")
			public void deleteNode(int element)
			{
				Node curr=null;
				Node parent=null;
				if(root==null)
				{
					System.out.println("Tree is Empty");
				}
				else
				{
					curr=root;
					while((curr != null) && (curr.getInfo()!=element))
					{
						parent = curr;
						if(element>curr.getInfo())
							curr=curr.getRight();
						else
							curr=curr.getLeft();
					}
					if(curr == null)
					{
						System.out.println("Node not Present");
					}
					//else if(parent == null)
					//{
						//
					else if(root.getLeft()==null && root.getRight()==null)
						{	
						System.out.println("Node to be removed is the root node");
						root=null;
						}
					//}
					else if (curr.getLeft()==null && curr.getRight()==null)
					{
						System.out.println("Node to be removed is a leaf node.");
						if(parent.getLeft()==curr)
							parent.setLeft(null);
						else
							parent.setRight(null);
					}				
					else if(curr.getLeft()!=null && curr.getRight()!=null)
					{
						System.out.println("Node to be removed has 2 children");
						parent=curr;
						curr=curr.getRight();
						Node prev=null;
					      prev=curr;
						while(curr.getLeft()!=null)
						{
							prev=curr;
							curr=curr.getLeft();							
						}
						if(prev==curr)
						{
							parent.setInfo(curr.getInfo());
							parent.setRight(curr.getRight());
						}
						else
						{
						parent.setInfo(curr.getInfo());
						prev.setLeft(curr.getRight());
						}
					}
					else 
					{
						System.out.println("Node to be removed has only 1 child");
						//if(parent == null)
						//{
							//if(curr.getRight()!=null)
							//	curr=curr.getRight();
							//else
							//{
								//curr=curr.getLeft();
							//}
							//root = curr;
//						}
						if(parent.getLeft()==curr)
						{
						  if(curr.getLeft()!=null)						   
							parent.setLeft(curr.getLeft());
						  else
							  parent.setLeft(curr.getRight());
						}
						else
						{
						  if(curr.getLeft()!=null)						   
							parent.setRight(curr.getLeft());
						  else
							  parent.setRight(curr.getRight());
						}
					}
					
				}	
				
			}
           
}
