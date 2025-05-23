import java.io.*;
import java.util.*;

public class Main {
		
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ary = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			ary[i] = Integer.parseInt(br.readLine());
			sum += ary[i];
		}
		
		br.close();
		
		for(int i = 0; i < 8; i++) {
			for(int j = i+1; j < 9; j++) {
				if(sum - ary[i] - ary[j] == 100) {
					ary[i] = 0;
					ary[j] = 0;
					Arrays.sort(ary);
					for(int k = 2; k < 9; k++) {
						System.out.println(ary[k]);
					}
					return;
				}
			}	
				
		}
	}
}