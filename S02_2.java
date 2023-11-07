import java.util.Scanner;

class CricketPlayer {
    String name;
    int inn;
    int notout;
    int total;
    double bat_avg;

    public CricketPlayer(String name, int inn, int notout, int total) {
        this.name = name;
        this.inn = inn;
        this.notout = notout;
        this.total = total;
        this.bat_avg = avg(total, inn, notout);
    }

    public static double avg(int total, int inn, int notOuts) {
        return (double) total / (inn - notOuts);
    }

    public String toString() {
        return "Name: " + name +", Innings: " + inn +", Not Out: " + notout +", Total Runs: " + total +", Batting Average: " + bat_avg;
    }
}

public class S02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of cricket players: ");
        n = sc.nextInt(); 

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Number of Innings: ");
            int innings = sc.nextInt();
            System.out.print("Number of Times Not Out: ");
            int notOuts = sc.nextInt();
            System.out.print("Total Runs: ");
            int totalRuns = sc.nextInt();

            players[i] = new CricketPlayer(name, innings, notOuts, totalRuns);
        }
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) 
                if (players[j].bat_avg < players[j + 1].bat_avg) {
                    CricketPlayer temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }

        System.out.println("\nPlayer Details (Sorted by Batting Average):");
        for (int i = 0; i<n; i++) 
            System.out.println(players[i]);

    }
}
