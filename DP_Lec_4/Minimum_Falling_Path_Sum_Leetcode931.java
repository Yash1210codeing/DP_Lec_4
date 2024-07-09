package DP_Lec_4;

public class Minimum_Falling_Path_Sum_Leetcode931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]arr= {{2,1,3},{6,5,4},{7,8,9}};
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
        	ans=Math.min(ans,minpathsum(arr,0,i));        	
        }
        System.out.println(ans);
	}
   private static int minpathsum(int[][]arr,int i,int j) {
	   if(j>=arr[0].length) {
		   return Integer.MAX_VALUE;
	   }
	   if(i==arr.length-1) {
		   return arr[i][j];
	   }
	   int ld=minpathsum(arr,i+1,j-1);
	   int rd=minpathsum(arr,i+1,j+1);
	   int down=minpathsum(arr,i+1,j);
	   return Math.min(rd,Math.min(ld,down))+arr[i][j];
   }
}
