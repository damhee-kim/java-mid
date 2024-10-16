package lang.math;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumber;
    private int count;

    public int[] generate() {
        /**
         * 문제 - 로또 번호 자동 생성기
         * 로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
         * 로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
         * 각 숫자는 중복되면 안된다.
         * 실행할 때 마다 결과가 달라야 한다.
         */
        lottoNumber = new int[6];
        count = 0;

        while (count < 6) {
            int r = random.nextInt(46) + 1;

            // 중복되지 않은 경우에만 배열에 추가한다.
            if(isUnique(r)) {
                lottoNumber[count] = r;
                count++;
            }
        }
        return lottoNumber;
    }

    /**
     * 이미 생성된 번호와 중복되는지 검사
     *
     * @param number
     * @return
     */
    private boolean isUnique(int number) {
        for (int i = 0; i < 6; i++) {
            if(lottoNumber[i] == number) {
                return false;
            }
        }
        return true;
    }
}
