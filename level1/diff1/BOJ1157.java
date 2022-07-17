package level1.diff1;

import java.util.*;

// 몇년전에 풀었던 코드가 더 빠름... 개손해 본 코드
public class BOJ1157 {
    public static void main(String[] args) {
        char answer = ' ';
        int maxCount = 0;

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toUpperCase();

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

        for (char x: word.toCharArray()) {
            if (map1.containsKey(x)) {
                map1.put(x, map1.get(x) + 1);
            } else {
                map1.put(x, 1);
            }
        }

        for(Map.Entry<Character, Integer> elem: map1.entrySet()){
            if(elem.getValue() > maxCount) {
                maxCount = elem.getValue();
                answer = elem.getKey();
            } else if (elem.getValue() == maxCount) {
                maxCount = elem.getValue();
                answer = '?';
            }
        }

        System.out.println(answer);

    }
}
