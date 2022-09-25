package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();

        String allStr = br.readLine().toUpperCase();
        char findStr = br.readLine().toUpperCase().charAt(0);

        int cnt = 0; //카운트

        for(char c : allStr.toCharArray()){
            if(findStr == c) cnt++;
        }

        System.out.println(cnt);
    }

}

//[문제]
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.
//문자열의 길이는 100을 넘지 않습니다.
//
//[입력]
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다. 문자열은 영어 알파벳으로만 구성되어 있습니다.
//Computercooler
//c
//
//[출력]
//첫 줄에 해당 문자의 개수를 출력한다.
//2