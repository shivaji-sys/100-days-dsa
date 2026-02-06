// 
// 34. Find First and Last Position of Element in Sorted Array

//learned
// binary seach 
// BFS  
// Level order





class Solution {
    public int[] searchRange(int[] nums, int target ) {
  int start = 0;
  int end = nums.length-1;
 int res[] = {-1, -1};
  while(start <= end){
  int mid =  start +(end-start)/2;

    if(nums[mid] == target){
        res [0] = mid;
        end= mid-1;
    } else if(nums[mid] < target){
        start = mid +1;
    }else{
        end = mid-1;
    }
  }
 
  start = 0;
   end = nums.length-1;
  
  while(start <= end){
  int mid =  start +(end-start)/2;

    if(nums[mid] == target){
        res [1] = mid;
        start= mid+1;
    } else if(nums[mid] < target){
        start = mid +1;
    }else{
        end = mid-1;
    }
  }

    
    

     return res;
    }
}



// 102. Binary Tree Level Order Traversal


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        } 
   
        Queue<TreeNode> q =new LinkedList<>();
    
      q.add(root);
    //   q.add(null);

      while(!q.isEmpty()){
        List<Integer> level = new ArrayList<>();
        int size = q.size();

        for(int i=0 ; i<size; i++){
            TreeNode currNode =q.poll();
            level.add(currNode.val) ;
        
            if(currNode.left!=null){
                q.add(currNode.left);
            }

            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
        list.add(level);
       
      }
    return list;
    
   
    
    

}
}
