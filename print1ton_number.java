package seventhday;

public class print1ton_number {
    public static void main(String[] args) {
       printNos(64);
    }
    public static void printNos(int N)
    {  if (N >= 1) {
        printNos(N - 1); // First, print numbers from 1 to N-1
        System.out.println(N); // Then, print N
    }

    }
}
