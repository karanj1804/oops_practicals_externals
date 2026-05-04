import java.util.Scanner;

class MarksOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        int sum = 0;
        int absent = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + " (-1 for absent): ");
            marks[i] = sc.nextInt();

            if (marks[i] == -1) {
                absent++;
            } else {
                sum = sum + marks[i];
            }
        }

        int highest = -1;
        int lowest = 101;

        for (int i = 0; i < n; i++) {
            if (marks[i] != -1) {
                if (marks[i] > highest) {
                    highest = marks[i];
                }

                if (marks[i] < lowest) {
                    lowest = marks[i];
                }
            }
        }

        int maxFrequency = 0;
        int frequentMark = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (marks[i] != -1 && marks[i] == marks[j]) {
                    count++;
                }
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                frequentMark = marks[i];
            }
        }

        int present = n - absent;
        double average = (double) sum / present;

        System.out.println("Average score = " + average);
        System.out.println("Highest score = " + highest);
        System.out.println("Lowest score = " + lowest);
        System.out.println("Absent students = " + absent);
        System.out.println("Mark with highest frequency = " + frequentMark);

        sc.close();
    }
}