package com.example.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intNum1 = Integer.parseInt(br.readLine());         // 첫 번째 줄에 첫 번째 배열의 크기
        String[] intStr1  = br.readLine().split(" ");    // 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

        int intNum2 = Integer.parseInt(br.readLine());         // 세 번째 줄에 두 번째 배열의 크기
        String[] intStr2  = br.readLine().split(" ");    // 네 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

        ArrayList<String> result1 = solution(intNum1, intStr1);
        ArrayList<String> result2 = solution(intNum2, intStr2);

        result1 = solution2(result1, result2);
        Collections.sort(result1);

        for(int i = 0 ; i < result1.size(); i++){
            System.out.print(result1.get(i) + " ");
        }
    }

    static ArrayList<String> solution(int intNum, String[] arr){
        ArrayList<String> resultArr = new ArrayList<>();
        for (int i = 0 ; i < intNum ; i++){
            resultArr.add(arr[i]);
        }

        return resultArr;
    }

    static ArrayList<String> solution2(ArrayList<String> result1, ArrayList<String> result2){
        result1.addAll(result2);

        List<String> distinctLi = result1.stream()
                .distinct()
                .collect(Collectors.toList());

        for (String distinctElement : distinctLi) {
            result1.remove(distinctElement);
        }

        return result1;
    }
}

//[문제]
//A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로 그램을 작성하세요.
//
//[입력]
//첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
//두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다. 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
//네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다. 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
//5
//1 3 9 5 2
//5
//3 2 5 7 8
//
//[출력]
//두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
//2 3 5