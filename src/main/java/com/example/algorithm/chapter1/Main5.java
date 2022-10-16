package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        char[] arrStr = str.nextToken().toCharArray();
        char[] newArrStr = new char[arrStr.length];
        int leng = arrStr.length - 1;

        for(int i = 0 ; i < arrStr.length; i++){
            if(Character.isLetter(arrStr[i])){
                newArrStr[leng-i] = arrStr[i];
            }else{
                newArrStr[i] = arrStr[i];
            }
        }

        for (char c : newArrStr){
            System.out.print(c);
        }
    }
}

//[문제]
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//
//[입력]
//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//a#b!GE*T@S
//
//[출력]
//첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
//S#T!EG*b@a