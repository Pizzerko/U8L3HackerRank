public class Main
{
    public static void main(String[] args) {

    }

    public int hourglassSum(int[][] arr) {
        int highest = 0;
        int sum = 0;
        for (int rr = 0; rr < 4; rr++) {
            for (int cc = 0; cc < 4; cc++) {
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        if(r == 1) {
                            sum += arr[r + rr][c + 1]
                        }
                        sum += arr[r + rr][cc + c];

                    }

                }

            }
        }
    }
}
