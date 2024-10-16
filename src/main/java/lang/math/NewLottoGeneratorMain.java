package lang.math;

public class NewLottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lotto = lottoGenerator.generate();

        // 생성된 로또 번호 출력
        System.out.println("로또 번호 : ");
        for(int lottoNum : lotto) {
            System.out.print(lottoNum +  "  ");
        }
    }
}
