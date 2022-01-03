package Homeworks.Lotto;

import static java.lang.Math.*;

public class LottoTester {
    public static void main(String[] args) {
        RandomLotto lotto = new RandomLotto();
        lotto.startLottto();
    }
}

class RandomLotto {

    void startLottto() {
        int[] arr = new int[6];
        // int j = 0;
        String str = "";
        // for (int i : arr) {
        // arr[j] = (int) (random() * 10);
        // j++;
        // str += (char)(arr[j]) + " ";
        // }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 10);
            System.out.print(arr[i] + " ");
            str += arr[i] + " ";
        }
        System.out.println();
        System.out.println(str);
    }
}
