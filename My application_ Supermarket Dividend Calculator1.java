import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("지불한 금액을 입력하세요");
		a = sc.nextInt();
        System.out.println("소비자가 처음 낸 금액은 "+a+"입니다.");

        int b;
        b = a*10/11;
        System.out.println("공급가는 "+b+"입니다.");

        int c;
        c = a/11;
        System.out.println("부가세는 "+c+"입니다.");

        int d;
        d = b*3/10;
        System.out.println("재료비는 "+d+"입니다.");

        int e;
        e = b*7/10;
        System.out.println("총 순수익은 "+e+"입니다.");

        int f = e*5/10;
        int g = e*3/10;
        int h = e*2/10;
        System.out.println("A, B, C가 받는 배당은 "+f+","+g+","+h+" 입니다.");
    }
}
