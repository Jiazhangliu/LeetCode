/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null) {return false;}
        if(p != null && q == null) {return false;}
        if(p == null && q == null) {return true;}
        
        if(p != null & q != null){
            if(p.val == q.val){    
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }else{
                return false;
            }
        }
       return true; 
    }

    public static void main(String args[]){
    	IsSameTree s = new IsSameTree();
    	
    	TreeNode T1 = new TreeNode(1);
    	TreeNode t11 = new TreeNode(2);
    	TreeNode t12 = new TreeNode(3);
    	T1.left = t11; T1.right = t12;
    	
    	TreeNode T2 = new TreeNode(1);
    	TreeNode t21 = new TreeNode(2);
    	TreeNode t22 = new TreeNode(3);
    	T2.left = t21; T2.right = t22;
    	
    	System.out.println(s.isSameTree(T1,T2));
    }
}
