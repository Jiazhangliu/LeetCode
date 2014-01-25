/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class MinimumDepthofBinaryTree  {
public:
    int minDepth(TreeNode *root) {
        if(!root) {return 0;}
        if(!root->left && !root->right) {return 1;}
        
        if(root->left && !root->right){
            return 1+minDepth(root->left);
        }else if(!root->left && root->right){
            return 1+minDepth(root->right);
        }else if(root->left && root->right){
            int leftDepth = 1+minDepth(root->left);
            int rightDepth = 1+minDepth(root->right);
            return leftDepth < rightDepth ? leftDepth : rightDepth;
        }else{
            return 0;
        }
        
    }
};
