import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 다리놓기_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N[] = new int[T];
        int M[] = new int[T];
        int bridge[] = new int[T];
        Arrays.fill(bridge, 1);

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N[i] = Integer.parseInt(st.nextToken());
            M[i] = Integer.parseInt(st.nextToken());
            for(int j = 0; j < N[i]; j++){
                bridge[i] *= (M[i]-j);
                bridge[i] /= j+1;
            }
            System.out.println(bridge[i]);
        }

        //조합 공식 활용 aCb = aPb / b! = a! / (a-b)! * b!

    }
}
