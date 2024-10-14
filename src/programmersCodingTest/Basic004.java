package programmersCodingTest;

import java.util.Scanner;

public class Basic004 {
//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
	//내풀이
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            if(Character.isUpperCase(a.charAt(i))) {
            	System.out.print(Character.toLowerCase(a.charAt(i)));
            }else {
            	System.out.print(Character.toUpperCase(a.charAt(i)));
            }
        }

	}
	//다른 풀이
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        String answer = "";
//
//        for(int x : a.toCharArray()){
//        if(x>=97 && x<=122)answer += (char)(x-32); else answer += (char)(x+32);
	
//		  }
//        System.out.print(answer);
//    }

}
