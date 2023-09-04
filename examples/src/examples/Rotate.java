package examples;

public class Rotate {

	class Solution {
	    public int[] solution(int[] A, int K) {
	        for(int i=0;i<K;i++){
	            int l=A[A.length-1];
	            for(int j=A.length-1;j>0;j--){
	                A[j]=A[j-1];
	            }
	            A[0]=l;

	        }
	        return A;
	    }
	}
}

