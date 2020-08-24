public class FindNextSquare {
    public static void main(String[] args) {
        System.out.println((Math.sqrt(122) % 1 == 0));
        System.out.println(findNextSquare(121));
        System.out.println((int) Math.sqrt(121));
        System.out.println(3 % 2);
    }

    public static long findNextSquare(long sq) {
        if((Math.sqrt(sq) % 1 != 0))
            return -1;

        var result = (int) Math.sqrt(sq) + 1;

        return result * result;
    }
}
