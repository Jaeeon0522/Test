import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*{-3, 2, 4, -1, 5}  ������ ��� �κ� ���� => 2^5 = 32��
 �߿��� , ������ ���� 0�� �κ� ������ ������ ���
 00000
 10000
 01000
 00100
 ....
 11111
 */
/*	1<<1 => 10
 *  0 & 0 		=> 0
 *  0 & 1 		=> 0
 *  0 & 10		 => 0d
 *  0 & 100		 => 0
 *  0 & 1000 	 => 0
 *  0 & 10000	 => 0
 * */
/*
 * 01 & 10 = 00
 * */
public class Subset {
	static int[] res = new int[5];
	static int[] babygin = new int[10];

	public static void main(String[] args) {
		int[] src = { -3, 2, 4, -1, 5 };
		int len = src.length;
		int sum = 0, cnt = 0;
		int i = 0, tri = 0, run = 0;
		
		
		//������ �κ��� �ִ�.
		babygin[1] = 2; babygin[2] = 2; babygin[3] =2; 
		
		while(i < 10){
			if(babygin[i] >= 3){
				tri++;
				babygin[i] -= 3;
				continue;
			}
			if(babygin[i] >= 1 && babygin[i+1] >= 1 &&
					babygin[i+2] >= 1){
				run++;
				babygin[i]--; babygin[i+1]--;babygin[i+2]--;
				continue;
			}
			++i;
		}
		if(tri+run == 2){
			System.out.println("���̺���");
		}
		
		/*
		 * run : 3�ڸ� ���ڰ� ���������� ������ ��� triplet : 3�ڸ� ���ڰ� ��� ���� ���
		 */
		/*int run1 = 0, run2 = 0, tri1 = 0, tri2 = 0;
		// int [] data = {3, 3, 2, 2, 1, 1}; //112233
		int[] tmpdata = { 0, 0, 0 };
		int[] data = { 3, 4, 7, 7, 6, 5 };
		int tmp1 = 0, tmp2 = 0, flag = 0;
		int tmp3 = 0, tmp4 = 0;

		Arrays.sort(data); // quick sort => nlogn
		if (data[5] - data[0] == 2) {
			for (int k = 0; k < 6; ++k) {
				if (data[k] == data[0] + 1) {
					flag = 1;
					tmp1 = data[1];
					tmp2 = k;
					tmpdata[1] = data[k];
				}
			}
			if (flag == 1) {
				tmp3 = data[5];
				data[5] = data[2];
				data[2] = tmp3;
				data[1] = tmpdata[1];
				data[tmp2] = tmp1;
			}
			for (int i = 0; i < 2; ++i) {
				if (data[i] == data[i + 1]) {
					++cnt1;
				} else if (data[i + 2] == data[i + 3]) {
					++cnt2;
				}
				if (data[i + 1] == data[i] + 1) {
					++run1;
				} else if (data[i + 3] == data[i + 2] + 1) {
					++run2;
				}
			}
			if (cnt1 == 2)
				++tri1;
			
			if (cnt2 == 2)
				++tri2;
		}
		else {
			for (int i = 0; i < 2; ++i) {
				if (data[i] == data[i + 1]) {
					++cnt1;
				} else if (data[i + 2] == data[i + 3]) {
					++cnt2;
				}
				if (data[i + 1] == data[i] + 1) {
					++run1;
				} else if (data[i + 3] == data[i + 2] + 1) {
					++run2;
				}
			}
			if (cnt1 == 2)
				++tri1;
			if (cnt2 == 2)
				++tri2;
		}
		sum = tri1 + tri2 + run1 + run2;
		if (sum == 2) {
			System.out.println("���̺���");
		}*/
		
		//triplet �κа� run �κ����� �������� �ϱ�.
		
		
		
		
		
		// for(int i = 0; i < data.length; ++i){
		// System.out.println(data[i]+" ");
		// }

		// System.out.println(Collections.sort(new ArrayList<>()));

		/*
		 * for(int i = 0; i < (1 << len); ++i){ // i < 32 for(int j = 0; j <
		 * len; ++j){ // 5��(j : 0 ~ 4) if( (i&(1<<j)) == (1 << j)){ // �̰��� ������ ��
		 * �˾ƾ� �Ѵ�. sum += src[j]; res[cnt++] = src[j]; //if(0&(1<<0) == 1<<0) -
		 * false //if(1&(1<<0) == 1<<0) - true //System.out.print(src[j] +" ");
		 * } } if(sum == 0){ for(int k = 0; k < cnt; ++k){
		 * System.out.print(res[k] +" "); } } sum = 0; cnt = 0; for(int k = 0; k
		 * < cnt; ++k){ src[k] = 0; } //System.out.println();
		 * 
		 * }
		 */
		// 00001 - i�� 1�� ��
		// 00011
		// ...
		// 11111 - i�� 32�� ��
	}
}
///////// �������� �������� ���� �˰���, ���� �˰����� �ƴ�����, �ְ��� �˰����� �ƴϴ�.