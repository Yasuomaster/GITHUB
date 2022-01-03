package Homeworks.Computer;

public class Computer {
    CPU cpu;
    CPU cpu01;
    GraphicCard gc;
    Monitor monitor;
    boolean power = false;
    
    
    public void powerChange() {
        power = !power;
    }

    public void cpuPower() {
        if (power == false) return; 
        cpu.coreNum =8;
        cpu.company = "intel";
        cpu.gen = 8;
        System.out.printf("cpu의 코어개수는 %d, 제조사는 %s, cpu 세대는 %d세대 %n", cpu.coreNum, cpu.company,cpu.gen);
        cpu01.coreNum = 3;
        System.out.printf("cpu의 코어개수는 %d, 제조사는 %s, cpu 세대는 %d세대 %n", cpu01.coreNum, cpu.company,cpu.gen);
    }

}

/*질문 : new 클래스()를 사용하지 않고도 지역변수 사용이 가능 한 이유
정리
클래스명 c1 ; // 객체 선언
클래스명 c1 = new 클래스명(); // 객체 선언 + 생성자 초기화
new 클래스명()을 쓰지 않고도 클래스의 지역 변수를 사용할 수 있다.
new 클래스명()는 생성자에서 객체의 지역변수를 초기화 하는 역할을 함 (편집됨) */
