package ch00;

public class Study05 {
    public static void main(String[] args) {
        // 스코프
        // 글로벌
        // 어디서든 접근 할 수 있는 변수
        // 함수
        // 함수 내에서만 작동하고 벗어나면 없어지는 변수
        // 블록   
        // 블록 내에서만 작동하고 벗어나면 없어지는 변수
        // if/for/while 등 중괄호로 감싸지는 영역
        // 자바 변수는 기본적으로 블록 단위

        // int i = 0;
        // while(i<10){
        //     int a = 1;
        //     System.out.println(a);
        //     i++;
        //     a++;

        // }
        // System.out.println(i);

        
        // 블록 스코프 내에서 만든 변수는
        // 블록을 빠져나오면 없어진다
        // if(true){
        //     int a = 1;

        // }
        // System.out.println(a); 작동안됨.

        // for에서 만든 변수는
        // 반복이 끝날 때까지 살아있다.
        // 반복이 종료되면 없어진다.
        // for (int i = 0; i < 10; i++) {
            
        // }
        // System.out.println(i); //작동 안됨
        
        // while을 쓸 때 같은 변수로 여러개의 whlie을 사용하려면
        // 새로운 while을 쓰기 전에 변수를 초기값으로 변갱해야한다.
        // int i = 0;
        // while(i<10){
        //     System.out.println("첫번째 whlie");
        //     i++;
        // }
        // while(i<10){
        //     System.out.println("첫번째 whlie");
        //     i++;
        // }

        // for (int j = 0; j < 10; j++) {
        //     System.out.println("첫번째 for");
        // }

        // for (int j = 0; j < 10; j++) {
        //         System.out.println("두번째 for");
        // }
        // 프로그래밍 작동되는 동안 계속 사용할 변수라면 글로벌
        // while  에서는 횟수가 정해진 반복문을 사용할 때는
        // 외부에 먼저 변수를 만들고 변수를 변경하면서 사용

        // for문에서는 소괄호 안에 변수를 만들고 변경하면서 사용

        // if, whlie, for등의 블록에서 반복회차마다 새로 사용할 변수는
        //블록 안에서 만든 후 사용

    }
}
