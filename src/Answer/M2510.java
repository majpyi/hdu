package Answer;

import java.util.Scanner;

public class M2510 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        while(in.hasNext())
        {
            int num =Integer.parseInt(in.next());
            if(num==0)
            {
                break;
            }
//            int sum = 1<<num-1;
            int sum = (int)Math.pow(2,num)-1;
            int result=0;
            for(int i=0;i<=sum;i++)
            {
//                System.out.println(i);
//                System.out.println(Integer.toBinaryString(i));
                int num0=0;
                int num1=0;
                int postion = num-1;
                char[] array =new char[num];
                for(int k =0;k<num;k++)
                {
                    array[k]='0';
                }
                char[] a =Integer.toBinaryString(i).toCharArray();

//                for(int j=0;j<a.length;j++)
//                {
//                    array[j]=a[j];
//                }

                for(int j=a.length-1;j>=0;j--)
                {
                    array[postion--]=a[j];
                }

//                System.out.println(array);
                result += new M2510().diguia(array,num0,num1);
            }
            System.out.println(num+"  "+ result);
        }
    }

    int diguia(char [] a ,int num0,int num1)
    {
        for(int n=1;n<=a.length;n++)
        {

            for(char b : a)
            {
                if(b=='0')
                {
                    num0++;
                }
                else num1++;
            }
        }
        if(a.length==0)
        {
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
        return  diguia(b,num0,num1);
    }

}
