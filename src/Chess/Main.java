package Chess;

import java.util.*;

public class Main {
    public static void main(String args[]) {

    }

    public static int getBloomday(int[] bloomDay, int m ,int k){

        int low=Integer.MAX_VALUE,high = 0;
        for(int i:bloomDay){
            low = Math.min(i,low);
            high = Math.max(i,high);
        }

        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans = Math.min(ans,mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }

    public static boolean isPossible(int[] bloomDay, int mid, int m, int k){
        int cnt=0;
        int boq =0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                cnt++;
            }else{
                cnt =0;
            }

            if(cnt == k){
                boq++;
                cnt =0;
            }
        }

        if(boq>=m){
            return true;
        }else{
            return false;
        }
    }

//    Input: nums = [1,2,3], sequences = [[1,2],[1,3]] Output: false Explanation: There are two possible supersequences: [1,2,3] and [1,3,2].The sequence [1,2] is a subsequence of both: [1,2,3] and [1,3,2].The sequence [1,3] is a subsequence of both: [1,2,3] and [1,3,2].Since nums is not the only shortest supersequence, we return false.
//    Example 2:
//    Input: nums = [1,2,3], sequences = [[1,2]] Output: false Explanation: The shortest possible supersequence is [1,2].The sequence [1,2] is a subsequence of it: [1,2].Since nums is not the shortest supersequence, we return false.
//    Example 3:
//    Input: nums = [1,2,3], sequences = [[1,2],[1,3],[2,3]] Output: trueExplanation: The shortest possible supersequence is [1,2,3].The sequence [1,2] is a subsequence of it: [1,2,3].The sequence [1,3] is a subsequence of it: [1,2,3].The sequence [2,3] is a subsequence of it: [1,2,3].
//    Since nums is the only shortest supersequence, we return true.
//    inorder
//[0,0,1,2]
//
//        1->2->3
    public boolean Topo(int[] nums, int[][] sequences){

        int[] g = new int[nums.length];
        int[] indeg = new int[nums.length];
        for(int i=0;i<sequences.length;i++){
            int src = sequences[i][0];
            int dest = sequences[i][1];
            g[src] = dest;
            indeg[dest]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i=1;i<indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        if(q.size()>1){
            return false;
        }

        List<Integer> ans = new ArrayList<>();
        while(q.size()>0){
            int s = q.size();
            while(s-->0){
                int rem = q.remove();
                ans.add(rem);
                indeg[g[rem]]--;
                if(indeg[g[rem]] == 0){
                    q.add(g[rem]);
                }
            }

            if(q.size()>1){
                return false;
            }
        }

        if(ans.size()!=nums.length){
            return false;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=ans.get(i)){
                return false;
            }
        }
        return true;
    }
}
