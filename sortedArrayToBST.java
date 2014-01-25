/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class sortedArrayToBST {
    TreeNode sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) return null;
        // same as (start+end)/2, avoids overflow.
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = sortedArrayToBST(arr, start, mid-1);
        node.right = sortedArrayToBST(arr, mid+1, end);
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num,0,num.length-1);
    }
}
