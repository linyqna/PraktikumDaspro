package function.Jobsheet13;

public class WeeklyGrades {
    static String student[] = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int grades[][] = {
        {20, 19, 25, 20, 10, 0, 10},
        {30, 30, 40, 10, 15, 20, 25},
        {5, 0, 20, 25, 10, 5, 45},
        {50, 0, 7, 8, 0, 30, 60},
        {15, 10, 16, 15, 10, 10, 5}
    };
    static void displayGrades(){
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void highestWeek(){
        int highest = 0;
        int week = 0;
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < grades.length; j++) {
                if (grades[i][j] > highest) {
                    highest = grades[i][j];
                    week = j + 1;
                }
            }
        }
        System.out.println("The highest score was in week " + week + "with a score of " + highest);
    }
    static void highestStudent(){
        int highest = 0;
        int index = 0;
        int week = 0;
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > highest) {
                    highest = grades[i][j];
                    index = i;
                    week = j + 1;
                }
            }
        }
        System.out.println("Student with the highest grade is " + student[index]);
        System.out.println("The highest score is ");
    }
}
