package enumeration.test;

public enum AuthGrade {

    /**
     * 문제와 풀이 1
     * 문제1 - 인증 등급 만들기
     * 설명 :
     *  패키지 위치는 enumeration.test를 사용하자.
     *  회원의 인증 등급을 AuthGrade라는 이름의 열거형으로 만들자.
     *  인증 듭근은 다음 3가지이고, 인증 등급에 따른 레벨과 설명을 가진다.
     *  레벨과 설명을 getXxx() 메서드로 조회할 수 있어야 한다.
     *  GUEST(손님)
     *   level=1
     *   description=손님
     *   LOGIN(로그인 회원)
     *    level=2
     *    description=로그인 회원
     *    ADMIN(관리자)
     *     level=3
     *     description - 관리자
     */

    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel (){
        return level;
    }

    public String getDescription(){
        return description;
    }
}