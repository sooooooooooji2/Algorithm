package com.example.algorithm.chapter2;

import java.io.IOException;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int n = sc.nextInt();
        int[][] arr=new int[n][n];

        //#1.[n][n] 배열의 수 만큼 입력 받아서 담음
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        //#2.n 만큼 이중 for문 돌려 true 일 경우 ++ 해줌
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(solution(i,j,arr)) score++;
            }
        }

        sb.append(score);
        System.out.println(sb.toString());
    }

    private static enum Direct{
        UP,RIGHT,DOWN,LEFT
    }

    private static boolean solution(int row, int col, int[][] arr){
        //상하좌우 체크
        for(Direct direct : Direct.values()){
            int newRow = row;
            int newCol = col;
            switch (direct){
                case UP :
                    newRow--; break;
                case RIGHT:
                    newCol++; break;
                case DOWN:
                    newRow++; break;
                case LEFT:
                    newCol--; break;
            }
            //가장자리는 다음 방향으로 넘어감
            if(newRow < 0 || newRow >= arr.length || newCol < 0 || newCol >=arr.length){
                continue;   //break 문 쓰면 안됨
            }
            //해당값이 자신보다 큰 경우 false
            if(arr[row][col] <= arr[newRow][newCol]) {
                return false;
            }
        }
        return true;
    }
}

//[문제]
//지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//각 격자 판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다.
//봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
//격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

//[입력]
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는 다.
//5
//53723
//37161
//72534
//43641
//87352
//
//[출력]
//봉우리의 개수를 출력하세요.
//10
