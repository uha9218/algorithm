package cantSolve;

import java.util.Stack;

public class MakingHamburger {
    public static void main(String[] args) {
        int[] ingredients = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredients));
    }
    public static int solution(int[] ingredient) {
        int answer=0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ingredient.length; i++) {
            stringBuilder.append(ingredient[i]);
            if(stringBuilder.length()>3 && stringBuilder.substring(stringBuilder.length()-4,stringBuilder.length()).equals("1231")){
                answer++;
                stringBuilder.delete(stringBuilder.length()-4,stringBuilder.length());
            }
        }
        return answer;
    }
}
