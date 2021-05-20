import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int n=S.nextInt();
        int x=S.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0; i<n;i++)
            a.add(S.nextInt());
        Collections.sort(a);
        int ans=1;
        for (int i=0; i<a.size()-1; i++)
        {
           if(a.get(i)+a.get(i+1)<=x)
               ans++;
           else break;
        }
        System.out.println(ans);
    }
}
