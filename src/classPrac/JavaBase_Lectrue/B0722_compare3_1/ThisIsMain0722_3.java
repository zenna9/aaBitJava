package classPrac.JavaBase_Lectrue.B0722_compare3_1;

import java.util.Scanner;

public class ThisIsMain0722_3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input First String");
        
        String s = inp.next();
        System.out.println("input Second String");
        String t = inp.next();
        inp.close();
        

        Tr3 P = new Select3(s,t);
        if (P.check(s, t)){ // s와 t의 형식이 동일하면
            System.out.println("하");
            // isSame = P.; // Numcmp로 값비교
            //호출 방법을 모르겠어요
        }else { 
            System.out.println("호");
            //호출 방법을 모르겠어요
        }

    }
}
