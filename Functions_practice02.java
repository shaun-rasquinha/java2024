import java.util.Arrays;;

public class Functions_practice02 {
    public static void main(String[] args) {
        int[] votes = { 1, 2, 34, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);

    }

    public static int mostVotes(int[] votes) {
        int highestVotes = votes[0];
        int index = -1;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > highestVotes) {
                highestVotes = votes[i];
            }
        }

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == highestVotes) {
                index = i;
                break;
            }
        }
        return index;

    }
}
