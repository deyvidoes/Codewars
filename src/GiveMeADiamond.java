public class GiveMeADiamond {
    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n) {
        if (n <= 0 || n % 2 == 0)
            return null;

        var sb = new StringBuilder();
        for (int i = 1; i <= n; i += 2){
            var spaces = (n - i) / 2;
            for(int j = 0; j < spaces; j++)
                sb.append(" ");

            for(int k = 0; k < i; k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = n - 2; i >= 1; i -= 2){
            var spaces = (n - i) / 2;
            for(int j = 0; j < spaces; j++)
                sb.append(" ");

            for(int k = 0; k < i; k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
