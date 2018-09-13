import java.util.Scanner;

/**
 * @program: hdu
 * @description: http://acm.hdu.edu.cn/showproblem.php?pid=2602
 * @author: Majpyi
 * @create: 2018-05-04 15:50
 **/
public class 简单01背包问题2602 {
     private static void re (int capacity,int[] val,int[] weight){
         int nums =weight.length;
//         int[][] v =new int[nums][capacity];
         int[][] v =new int[nums+1][capacity+1];

//         for(int i=0;i<capacity;i++){
         for(int i=0;i<=capacity;i++){
             v[0][i]=0;
         }

//        for(int i=1;i<nums;i++){
        for(int i=1;i<=nums;i++){
//            for(int j=0;j<capacity;j++){
//            for(int j=0;j<=capacity;j++){
            for(int j=capacity;j>=0;j--){
                if(weight[i-1]<=j) {     //    需要判断否则就会数组下标溢出
                    if (v[i - 1][j - weight[i - 1]] + val[i-1] > v[i - 1][j])
                        v[i][j] = v[i - 1][j - weight[i - 1]] + val[i-1] ;

                    //  一开始下面的 else 没有写导致错误
                    else
                        v[i][j]=v[i-1][j];
                }
                else
                    v[i][j]=v[i-1][j];
            }
        }
//        for(int i=0;i<=nums;i++)
//        {
//            for(int j=0;j<=capacity;j++)
//                System.out.print(v[i][j]+"  ");
//            System.out.println();
//        }


//        return v[nums-1][capacity-1];
         System.out.println(v[nums][capacity]);
     }

    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        int nums =a.nextInt();
        while(nums--!=0){
            int iterms = a.nextInt();
            int capacity = a.nextInt();
            int[] val=new int[iterms];
            int[] weight =new int[iterms];
            for(int i=0;i<iterms;i++){
                val[i]=a.nextInt();
            }
            for(int i=0;i<iterms;i++){
                weight[i]=a.nextInt();
            }

            re(capacity,val,weight);

        }

    }
}