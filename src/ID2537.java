import java.util.Scanner;

/**
 * @program: hdu
 * @description: http://acm.hdu.edu.cn/showproblem.php?pid=2537
 * @author: Majpyi
 * @create: 2018-04-17 15:54
 **/
public class ID2537 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            if (in.nextInt() == 0) {
                break;
            }
//            System.out.println(in.next());
//            System.out.println(in.nextLine());
//            System.out.println(in.nextInt());
            int numY = 0, numR = 0;
            char[] result = in.next().toCharArray();
            int num = result.length;
            for (int i = 0; i < num - 1; i++) {
                if (result[i] == 'Y') {
                    numY++;
                }
                if (result[i] == 'R') {
                    numR++;
                }
            }
            if (result[num - 1] == 'B' && numR == 7) {
                System.out.println("Red");
            }
            if (result[num - 1] == 'B' && numR < 7) {
                System.out.println("Yellow");
            }
            if (result[num - 1] == 'L' && numY == 7) {
                System.out.println("Yellow");
            }
            if (result[num - 1] == 'L' && numY < 7) {
                System.out.println("Red");
            }
        }
    }
}


