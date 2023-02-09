import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long F[] = new long[21];
        for(int i = 0 ; i < 21 ; i++){
            F[i] = factorial(i);
        }

        for(long j = 20 ; j >= 0 ; j--){
            if(N >= factorial(j)){
                N -= factorial(j);
            }

        }

        System.out.println(N);
        if(N == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        System.exit(1);
    }

    public static long factorial (long num){
        if(num == 0){
            return num = 1;
        }

        else{
            return num * factorial(num - 1);
        }
    }
}
