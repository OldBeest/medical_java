package p0618;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // 1에서 100 사이의 랜덤 숫자를 생성합니다.
        int ran_num = (int)(Math.random() * 100) + 1;
        // 사용자가 입력한 숫자를 저장할 배열을 생성합니다. (크기: 10)
        int[] my_arr = new int[10];
        // 정답을 맞췄는지 여부를 확인하는 플래그 변수입니다.
        boolean correct_flag = false;
        System.out.println("랜덤 숫자 " + ran_num);
        
        // 사용자가 10번의 기회를 가집니다.
        for(int i = 0; i < 10; i++) {
            // 사용자가 정답을 맞출 때까지 반복합니다.
            while(!correct_flag) {
                System.out.println("임의의 숫자를 입력하세요");
                int my_num = scan.nextInt();
                // 사용자가 1에서 100 사이의 숫자를 입력했는지 확인합니다.
                if(my_num < 1 || my_num > 100) {
                    System.out.println("잘못된 숫자를 입력했습니다. 다시 입력하세요.");
                } else {
                    // 유효한 숫자를 입력한 경우 배열에 저장합니다.
                    my_arr[i] = my_num;
                    // 사용자가 입력한 숫자가 랜덤 숫자보다 큰 경우
                    if(my_num > ran_num) {
                        System.out.println("입력한 수보다 작습니다. 입력한 숫자: " + my_num);
                        break;
                    // 사용자가 입력한 숫자가 랜덤 숫자보다 작은 경우
                    } else if(my_num < ran_num){
                        System.out.println("입력한 수보다 큽니다. 입력한 숫자: " + my_num);
                        break;
                    // 사용자가 정답을 맞춘 경우
                    } else {                    
                        System.out.println("정답! 입력한 숫자: " + my_num);
                        correct_flag = true; 
                    }
                }
            }
            // 정답을 맞춘 경우 반복문을 종료합니다.
            if(correct_flag) {
                System.out.println((i + 1) + "번째로 맞추셨네요");
                break;
            }            
        }
        // 10번의 기회를 모두 사용했지만 정답을 맞추지 못한 경우
        if(!correct_flag) {
            System.out.println("10번의 기회를 모두 사용했지만 아쉽게도 못맞췄네요. 정답은 " + ran_num + "이었습니다.");
            int[] gap_arr = new int[10];
            
            // 입력한 숫자와 랜덤 숫자 간의 차이를 계산하여 배열에 저장합니다.
            for(int i = 0; i < 10; i++) {
                gap_arr[i] = Math.abs(my_arr[i] - ran_num);
            }
            System.out.print("근사 값의 차: ");
            for(int i = 0; i < 10; i++) {
                System.out.print(gap_arr[i] + " ");
            }
            System.out.println();
            
            // 원본 배열을 복사합니다.
            int[] gap_origin = gap_arr.clone(); // 배열 복사
            
            // 배열을 오름차순으로 정렬합니다.
            for(int val : gap_arr) {
                for(int j = 0; j < 9; j++) {
                    if(gap_arr[j] > gap_arr[j + 1]) {
                        int temp = gap_arr[j];
                        gap_arr[j] = gap_arr[j + 1];
                        gap_arr[j + 1] = temp;
                    }
                }
            }
            System.out.print("정렬된 근사 값의 차: ");
            for(int i = 0; i < 10; i++) {
                System.out.print(gap_arr[i] + " ");
            }
            System.out.println();
            
            // 원본 배열과 비교하여 가장 근사한 값을 출력합니다.
            System.out.print("근사 값: ");
            for(int i = 0; i < 10; i++) {
                // 정렬된 배열의 첫 번째 값과 원본 배열의 값을 비교하여 가장 근사한 값을 찾습니다.
                if(gap_arr[0] == gap_origin[i]) {
                    System.out.print(my_arr[i] + " (인덱스 " + i + ") ");
                }
            }
        }
    }
}