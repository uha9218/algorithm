package cantSolve;

public class MakingHamburger {
    public static void main(String[] args) {
        int[] ingredients = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredients));
    }
    public static int solution(int[] ingredient) {
        int answer=0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : ingredient){stringBuilder.append(i);}
        String ingredientString = stringBuilder.toString();
        while(ingredientString.contains(String.valueOf("1231"))){
             ingredientString = ingredientString.replaceFirst("1231","");
             answer++;
        }
        return answer;
    }
}
