package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < num ; i ++){
            sb.append(new StringBuffer(br.readLine()).reverse() + "\n");
        }
        System.out.println(sb);
    }
}



//[문제]
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//
//[입력]
//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되 어 있습니다.
//3
//good
//Time
//Big
//
//[출력]
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
//doog
//emiT
//giB