package subject;

public class Subject {
    private String subjectName;     // Private
    private int subjectCredits;     // Private

    public void setSubjectDetails(String name, int credits) {
        this.subjectName = name;
        this.subjectCredits = credits;
    }

    public void displaySubjectDetails() {
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Subject Credits: " + subjectCredits);
    }
}
