import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이상한곱셈_1225정수형버전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int aLength = (int)(Math.log10(A)+1);
        int bLength = (int)(Math.log10(B)+1);
        int[] aDigit = new int[aLength];
        int[] bDigit = new int[bLength];

        for(int i = aLength - 1 ; i >= 0; i--){
            aDigit[i] = A % 10;
            A /= 10;
        }

        for(int j = bLength - 1 ; j >= 0; j--){
            bDigit[j] = B % 10;
            B /= 10;
        }

        for(int k = 0; k < aLength; k++){
            for(int l = 0; l < bLength; l++){
                sum += aDigit[k] * bDigit[l];
            }
        }
        System.out.println(sum);
    }
}
