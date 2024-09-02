package Java.Strings;

public class ShortestPath {

    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            int dir = str.charAt(i);

            // south
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X = x * x;
        int Y = y * y;
        return ((float) Math.sqrt(X + Y));

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
