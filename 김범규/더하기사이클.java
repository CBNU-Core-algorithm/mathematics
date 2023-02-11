import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int cycleDistance = plusCycle(N);
        System.out.println(cycleDistance);
    }

    public static int plusCycle(int a){
        int k = a;
        int tens = 0;
        int units = 0;
        int newNum = 0;
        int sum = 0;
        int count = 0;

        while(true){
            tens = k / 10;
            units = k % 10;
            sum = tens + units;
            newNum = (units * 10) + (sum % 10);
            count++;
            if(newNum == a){
                break;
            }
            k = newNum;

        }

        return count;
    }
}
