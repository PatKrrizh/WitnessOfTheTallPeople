package MyPackage;

public class Murder {

    public static void main(String args[])
    {
        int num[] = new int[] {3, 5, 6, 2, 4, 3, 1};
        int flag[] = new int[] {0, 0, 0, 0, 0, 0, 0};
        for(int i=0; i<num.length; i++)
        {
            for(int j=i+1; j<num.length; j++)
            {
                if(num[i] < num[j])
                {
                    flag[i] = 1;
                }
            }
        }

        for(int i=0; i<num.length; i++)
        {
            if(flag[i] == 0)
            {
                System.out.println(num[i]);
            }
        }
    }
}
