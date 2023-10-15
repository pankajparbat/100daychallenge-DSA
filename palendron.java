package seventhday;

public class palendron {
    public static void main(String[] args) {
        String sc="avccba";
        int l=0;
        int r=sc.length()-1;
        System.out.println( ispalendrom(sc,l,r));
    }
   static boolean ispalendrom(String s,int l,int r)
    {
        if (l>=r)
        {
            return true;
        }
        if (s.charAt(l)!=s.charAt(r))
        {
            return false;
        }
        return ispalendrom(s,l+1,r-1);
    }
}
