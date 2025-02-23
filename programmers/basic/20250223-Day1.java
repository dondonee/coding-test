/* 1-1. 문자열 출력하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.print(a);
    }
}


/* 1-2. a와 b 출력하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
//A Scanner break its input into tokens using a delimiter pattern, which by default matches whitespace. The resulting tokens may then be converted into values of different types using the various next methods(nextInt(), nextLong()...).


/* 1-3. 문자열 반복해서 출락하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}

//다른 사람의 풀이 - String 클래스에 repeat() 메소드가 있었다.
//return System.out.println(str.repeat(n));


/* 1-4. 대소문자 바꿔서 출력하기 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] chrArray = a.toCharArray();
        
        String answer = "";
        for(char chr : chrArray) {
            if(Character.isUpperCase(chr)) {
                chr = Character.toLowerCase(chr);
            }else if(Character.isLowerCase(chr)) {
                chr = Character.toUpperCase(chr);
            }
            
            answer = answer + chr;
        }
        
        System.out.println(answer); //출력은 성능상 한 번에 하는 것이 좋은 것 같다.
    }
}


/* 1.5 특수문자 출력하기 */
//출력 : !@#$%^&*(\'"<>?:;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        System.out.println("!@#$%^&*(\\\'\"<>?:;");
    }
}

//Escape Sequence : A character preceded by a backslash (\) is an escape sequence and has special meaning to the compiler. 위 출력 예시 중에서는 \, ', " 가 있다.
