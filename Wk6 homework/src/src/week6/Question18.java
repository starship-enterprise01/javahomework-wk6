package src.week6;

public class Question18 {
    public static void main(String[] args) {
        String studentName = "Sam Bahadur";
        String schoolName = "Be Creative School";
        int mathMarks = 98;
        int scienceMarks = 95;
        int historyMarks = 90;
        int englishMarks = 92;

        // Display the marksheets
        System.out.println("***************************");
        System.out.println("        Education Marksheets");
        System.out.println("***************************");
        System.out.println("Name: " + studentName);
        System.out.println("School: " + schoolName);
        System.out.println("----------------------------");
        System.out.println("Subject          Marks");
        System.out.println("----------------------------");
        System.out.println("Mathematics:     " + mathMarks);
        System.out.println("Science:         " + scienceMarks);
        System.out.println("History:         " + historyMarks);
        System.out.println("English:         " + englishMarks);
        System.out.println("----------------------------");
        System.out.println("Total:           " + (mathMarks + scienceMarks + historyMarks + englishMarks));
        System.out.println("***************************");
    }
}
