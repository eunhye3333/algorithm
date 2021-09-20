package com.baekjoon.stage07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {
	public void no11720() {
		// ������ ��	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.print("���� �Է� : ");
			int num = Integer.parseInt(br.readLine());
			System.out.print("���� �Է� : ");
			String str = br.readLine();
			
			if(num == str.length()) {
				int sum = 0;
				for(int i = 0; i < str.length(); i++) {
					sum += Character.getNumericValue(str.charAt(i));
				}
				System.out.println("�հ� : " + sum);
			} else {
				System.out.println("������ ������ �߸� �Է��Ͽ����ϴ�.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void no10809() {
		// ���ĺ� ã��
//		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
//			System.out.print("�ܾ� �Է� : ");
//			String word = br.readLine();
//			int[] alphabet = new int[26];
//			Arrays.fill(alphabet, -1);
//			
//			for(int i = 0; i < word.length(); i++) {
//				for(int j = 0; j < alphabet.length; j++) {
//					if(word.charAt(i) == 'a' + j && alphabet[j] == -1) {
//						alphabet[j] = i;
//						break;
//					}
//				}
//			}
//			
//			for(int i = 0; i < alphabet.length; i++) {
//				if(i == alphabet.length -1) {
//					System.out.print(alphabet[i]);
//				} else {
//					System.out.print(alphabet[i] + " ");
//				}
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// for�� �� ���� ����Ͽ� ����
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.print("�ܾ� �Է� : ");
			String word = br.readLine();
			int[] alphabet = new int[26];
			Arrays.fill(alphabet, -1);
			
			for(int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if(alphabet[c -'a'] == -1) {
					alphabet[c -'a'] = i;
				}
			}
			
			for(int i = 0; i < alphabet.length; i++) {
				if(i == alphabet.length -1) {
					System.out.print(alphabet[i]);
				} else {
					System.out.print(alphabet[i] + " ");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void no2675() {
		// ���ڿ� �ݺ�
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.print("�׽�Ʈ���̽� ���� �Է� : ");
			int tc = Integer.parseInt(br.readLine());
			StringTokenizer[] st = new StringTokenizer[tc];
			
			System.out.println("�� �׽�Ʈ���̽� �Է�");
			for(int i = 0; i < tc; i++) {
				st[i] = new StringTokenizer(br.readLine());
			}
			
			for(int i = 0; i < st.length; i++) {
				int r = Integer.parseInt(st[i].nextToken());
				String str = st[i].nextToken();
				for(int j = 0; j < str.length(); j++) {
					for(int k = 0; k < r; k++) {
						System.out.print(str.charAt(j));
					}
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void no2908() {
		// ���
		System.out.println("���� �Է�");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());;
			int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());;
			
			if(a > b) {
				System.out.println(a);
			} else if(a < b) {
				System.out.println(b);
			} else {
				System.out.println("�� ���� �����ϴ�.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}