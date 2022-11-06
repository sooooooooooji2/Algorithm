package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for(int i = 0 ; i < inputStr.length() ; i++){
            if(i + 1 == inputStr.length()){
                //마지막 문자 일 경우 -> 바로 if문 안쓰고 문자 뽑기
                //sb.append(inputStr.charAt(i) + "" + (cnt == 1 ? "" : cnt));   // 태리꺼, 삼항연산자 참고
                if(cnt > 1 )sb.append(inputStr.charAt(i)+ "" + cnt);
                else sb.append(inputStr.charAt(i)+ "");
                break;
            }
            if(inputStr.charAt(i) == inputStr.charAt(i+1)){
                cnt ++;
            }else{
                //같지 않을 경우
                if(cnt > 1 )sb.append(inputStr.charAt(i)+ "" + cnt);
                else sb.append(inputStr.charAt(i)+ "");
                //sb.append(inputStr.charAt(i) + "" + (cnt == 1 ? "" : cnt));   // 태리꺼, 삼항연산자 참고
                cnt  = 1; //초기화

            }
        }
         System.out.println(sb.toString());
    }

}

//[문제]
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시요.
// 단 반복횟수가 1인 경우 생략합니다.

//[입력]
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//KKHSSSSSSSE

//[출력]
//첫 줄에 압축된 문자열을 출력한다.
//K2HS7E