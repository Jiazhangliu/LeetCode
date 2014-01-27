/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class IsValidBST {
public:
    bool isValidBST(TreeNode *root) {
         return isValidBST(root, INT_MIN, INT_MAX);
    }
    
    bool isValidBST(TreeNode* root, int lower, int upper) {
          if (root == NULL) return true;
          return root->val > lower && root->val < upper
                  // everything in the left subtree 
                  // should between lower and root->val
                  && isValidBST(root->left, lower, root->val)
                  // everything in the right subtree 
                  // should between root->val and upper
                  && isValidBST(root->right, root->val, upper);
    }
};
