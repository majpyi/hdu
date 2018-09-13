package Answer;
import java.util.Scanner;

public class A2510 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int num =Integer.parseInt(in.next());
            if(num==0)
            {
                break;
            }
            int sum = (int)Math.pow(2,num)-1;
            int result=0;
            for(int i=0;i<=sum;i++)
            {
                int num0=0;
                int num1=0;
                int postion = num-1;
                char[] array =new char[num];
                for(int k =0;k<num;k++)
                {
                    array[k]='0';
                }
                char[] a =Integer.toBinaryString(i).toCharArray();
                for(int j=a.length-1;j>=0;j--)
                {
                    array[postion--]=a[j];
                }
//                System.out.println(array);
                result += A2510.digui(array,num0,num1);  // 在这里可以不用 new 一个新的对象而是直接使用类方法.
            }
            System.out.println(num+"  "+ result);
        }
    }

    static int digui(char [] a ,int num0,int num1)
    {
//        System.out.println(a);

//        for(int n=1;n<=a.length;n++)
//        {
        for(char b : a)
        {
            if(b=='0')
            {
                num0++;
//                    System.out.println("num0:   "+num0);
            }
            else
            {
                num1++;
//                    System.out.println("num1:   "+num1);
            }
        }
//            System.out.println("------");
//        }
        if(a.length==0)
        {
//            System.out.println("num0:    "+num0+"num1:     "+num1);
            if(num0==num1)
                return 1;
            else
                return 0;
        }
        char[] b=new char[a.length-1];
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                b[i]='1';
            }
            else b[i]='0';
        }
//        System.out.println(b);
        return  digui(b,num0,num1);
    }

}
