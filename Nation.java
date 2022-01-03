package Homeworks;

public class Nation {
    //클래스 Nation 필드설정    
    private String nationName; // 멤버변수 '나라이름'
    public double nationSize; // '면적'
    public int nationPopul;  // '인구'
    static String planetName = "Earth";

    //메서드 생성
    String nameChange (String nationName) {
        return this.nationName = nationName;
    }

    double sizeChange (double nationSize) {
        return this.nationSize = nationSize;
    }

    int populChange (int nationpopul) {
        return this.nationPopul = nationpopul;
    }
}

class Korea extends Nation {
    // 멤버변수 생성
    String koreaFashion;

    // 메서드 생성

    String inputBrand(String koreaFashion) {
        return this.koreaFashion = koreaFashion;
    }
}

class Japan extends Nation {
    // 멤버변수 생성
    String japanFashion;
    
    // 메서드 생성
    String showStyle() {
        return "Japenese American Casual Style";
    }
    
}

class Sweden extends Nation {
    // 멤버변수 설정
    String swedenFashion;
    
    // 메서드 설정
    String showBrand() {
        swedenFashion = "Acne studios";
        return swedenFashion;
    }
}
