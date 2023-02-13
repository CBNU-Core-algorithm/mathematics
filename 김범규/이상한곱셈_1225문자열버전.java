import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이상한곱셈_1225문자열버전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int aDigit[] = new int[A.length()];
        int bDigit[] = new int[B.length()];
        int sum = 0;

        for(int i = 0; i < A.length(); i++){
            aDigit[i] = A.charAt(i) - '0';
        }

        for(int j = 0; j < B.length(); j++){
            bDigit[j] = B.charAt(j) - '0';
        }

        for(int k = 0; k < A.length(); k++){
            for(int l = 0; l < B.length(); l++){
                sum += aDigit[k] * bDigit[l];
            }
        }

        System.out.println(sum);










    }
}
