import java.util.Scanner;
public class pat15 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern size : ");
        int n = sc.nextInt();
        int a;
        System.out.print("\n");

        for(int i=n;i>-1;i--)
        {
            for(int j=0;j<i;j++)
            {
                a = 65 + j;
                System.out.print((char)a);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        sc.close();
    }    
}
