import java.util.Scanner;

/**
 * @program: hdu
 * @description: http://acm.hdu.edu.cn/showproblem.php?pid=2013
 * @author: Majpyi
 * @create: 2018-05-24 20:52
 **/
public class ID2013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int sum = 1;
            int num = in.nextInt();
            for (int i = 1; i < num; i++) {
//        for(int i=1;i<in.nextInt();i++){   //   这种写法每次都会重新输入一个数字作为循环终止的地方
//            sum*=2+1;  //   这样也是错误的,会先计算等式右边的
                sum = (sum + 1)* 2;
            }
            System.out.println(sum);
        }
    }
}
