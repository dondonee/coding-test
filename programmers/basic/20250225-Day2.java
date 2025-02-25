/* 2-1. 덧셈식 출력하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = a + b;

        System.out.println(a + " + " + b + " = " + result);

	//다른 사람의 풀이 - 아래와 같은 출력도 가능하다!
	//System.out.println("%d + %d = %d", a, b, a + b);
    }
}


/* 2-2. 문자열 붙여서 출력하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.print(a + b);
    }
}


/* 2-3. 문자열 돌리기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}


/* 2-4. 홀짝 구분하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String result = n % 2 == 0? "even": "odd";
        System.out.print(n + " is " + result);
    }
}


/* 2-5. 문자열 겹쳐쓰기 */
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String head = my_string.substring(0, s);
        String tail = my_string.substring(s + overwrite_string.length(), my_string.length());
	//다른 사람의 풀이 - 파라미터를 하나만 주면 마지막 index를 자동으로 처리한다.
        //String tail = my_string.substring(s + overwrite_string.length());
        
        return head + overwrite_string + tail;
    }
}


