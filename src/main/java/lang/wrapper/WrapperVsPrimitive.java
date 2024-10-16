package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;
        
        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.nanoTime();
        for(int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.nanoTime();
        System.out.println("Sum primitive : " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 => " + (endTime - startTime) + "ms");
        
        // 레퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.nanoTime();
        for(int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.nanoTime();
        System.out.println("sumWrapper : " + sumWrapper);
        System.out.println("기본 자료형 Long 실행 시간 => " + (endTime - startTime) + "ms");


        // long 에 더하는 래퍼 클래스 Long에 더하는 부분에 대해 테스트를 진행하였다.
        // Long 이 메모리 사용이 크기 때문에 약 3~5배 정도 시간 및 용량이 사용되는 것을 알 수 있다.

    }
}
