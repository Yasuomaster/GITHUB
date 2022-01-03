package Homeworks.RSP;

import java.util.Random;

public class Rsp {
    public static void main(String[] args) {
        Player one = new Player();
        Player theOther = new Player();
        System.out.println(one.toString());
        switch(one.one - theOther.one) {
            case 0 :
             System.out.println("비겼습니다."); break;

            case 1 : case -2: 
            System.out.printf("one이 the other을 이겼습니다."); break;

            case -1: case 2 : 
            System.out.println("one은 theOther에게 졌습니다."); break;

        }

    }
}


class Player {
    int one;

    Player() {
        this.one = (int)(Math.random()*100)%3+1;
        System.out.println(this.one);
    }
}

