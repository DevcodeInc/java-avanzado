package test;

import java.util.concurrent.ThreadLocalRandom;

public class Solution {

	public int solution(int[] A) {
		int valueReturn = 0;
		int indexInicial = 0, count = 0;
		for (int i = indexInicial; i < A.length; i++) {
			if (A[i] > 0 && valueReturn == 0 && count == 0) {
				valueReturn = A[i];
				count++;
			}
			if (A[i] < valueReturn && A[i] > 0 && valueReturn > 0) {
				valueReturn = A[i];
			}
		}
		return valueReturn;
	}

	public static void main(String[] args) {
		int[] A = new int[10];
		Solution s = new Solution();
		for (int i = 0; i < A.length; i++) {
			int numero = ThreadLocalRandom.current().nextInt(-1000000, 1000000);
			A[i] = numero;
			System.out.println("element: " + A[i]);
		}
		System.out.println("result: " + s.solution(A));
	}
}
