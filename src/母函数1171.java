import java.util.Scanner;

/**
 * @program: hdu
 * @description: http://acm.hdu.edu.cn/showproblem.php?pid=1171
 * @author: Majpyi
 * @create: 2018-05-04 10:35
 **/
public class 母函数1171 {
    public static void re(int[] val,int[] num){
        int sum=0;

        for(int i=0;i<num.length;i++)
             sum+=num[i]*val[i];
        int mm = sum/2;
        int[] re1 =new int[mm+1];
        int[] re2 =new int[mm+1];

        for(int i=0;i<=val[0]*num[0]&&i<=mm;i+=val[0]){
            re1[i]=1;
        }

        for(int i=2;i<=num.length;i++){
            for(int j=0;j<=mm;j++){
                for(int k=0;k+j<=mm&&k<=val[i-1]*num[i-1];k+=val[i-1]){
                    re2[k+j]+=re1[j];
                }
            }

            for(int m=0;m<=mm;m++){
                re1[m]=re2[m];
                re2[m]=0;
            }
        }

        if(re1[mm] == 0)
        {
            while(mm>0 && re1[mm]==0) {
                mm--;
            }

            System.out.println(sum-mm+" "+(mm));
        }
        else System.out.println(sum-mm+" "+(mm));

    }

    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        while(a.hasNext()){
            int sorts = a.nextInt();
            if(sorts<0) break;
//            if(sorts==-1) break;      看清题目,并不是举得例子中的-1的时候停止,而是题目中说的为负数的时候才停止.
            int[] val=new int[sorts];
            int[] num=new int[sorts];
            for(int i=0;i<sorts;i++){
                val[i]=a.nextInt();
                num[i]=a.nextInt();
            }

            re(val,num);

        }
    }
}
