package studentsystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(generateCode());
    }

    private static String generateCode() {
        ArrayList<Character> letterList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            letterList.add((char)('a' + i));
            letterList.add((char)('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int randomIndex = r.nextInt(letterList.size());
            sb.append(letterList.get(randomIndex));
        }
        int numberIndex = r.nextInt(5);
        sb.setCharAt(numberIndex, (char)('0' + r.nextInt(10)));

        return sb.toString();
    }
}
