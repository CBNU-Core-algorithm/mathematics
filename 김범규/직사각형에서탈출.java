import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken()); //가로
        int h = Integer.parseInt(st.nextToken()); //세로

        int minX = distance(x, w);
        int minY = distance(y, h);
        int minResult = 1000;

        if(minX > minY){
            minResult = minY;
        }
        else{
            minResult = minX;
        }

        System.out.println(minResult);



    }

    public static int distance(int a, int b){
        if(b - a > a){
            return a;
        }
        else{
            return b - a;
        }
    }

}
