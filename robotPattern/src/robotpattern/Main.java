package robotpattern;

/**
* Make a robot follow a set of three different movements with an algorithm 
* that makes such pass through all the points exactly once.
**/
public class Main {

    public static void main(String[] args) {
        int n = 6;

        // Square (N x N) grid with the robot in the North-East corner
        Robot robot = new Robot(n, n, n - 1, 0);
        challenge1(robot);
        robot.say("\tDone!");

        robot = new Robot(n, n, n - 1, 0);
        challenge2(robot);
        robot.say("\tDid it!");

        robot = new Robot(n, n, n - 1, 0);
        challenge3(robot);
        robot.say("\tFinished!");
    }

    private static void challenge1(Robot robot) {
        int sector = 0;
        int n = 5;

        while (sector < 2) {
            for (int i = 0; i < n; i++) {
                robot.go('W');
            }
            robot.go('S');
            for (int j = 0; j < n; j++) {
                robot.go('E');
            }
            robot.go('S');
            sector++;
        }

        for (int k = 0; k < n; k++) {
            robot.go('W');
        }
        robot.go('S');
        for (int l = 0; l < n; l++) {
            robot.go('E');
        }
    }

    private static void challenge2(Robot robot) {
        int n = 5;
        int x = 0;

        while (x < n) {
            for (int i = 0; i < (n - x); i++) {
                robot.go('S');
            }
                for (int j = 0; j < (n - x); j++) {
                    if(x == 1){
                        x++;
                    }
                    if(x == 3){
                        x++;
                    }
                    robot.go('W');
                }
            for (int k = 0; k < (n - x); k++) {
                robot.go('N');
            }
            x++;
            for(int i2 = 0; i2 < (n-x); i2++) {
                robot.go('E');
            }
        }
    }

    private static void challenge3 (Robot robot){
        int n = 5;
        int a = 0;

        while (a < n)  {
            for (int i = 0; i < (n - a); i++) {
                robot.go('S');
            }
            for (int j = 0; j < (n - a); j++) {
                robot.go('W');
            }
            robot.go('N');
            a++;

                if(a == n) {
                    break;
                }

            for (int k = 0; k < (n - a); k++) {
                robot.go('E');
            }
            for (int l = 0; l < (n - a); l++) {
                robot.go('N');
            }
            robot.go('W');
            a++;
        }
    }
}
