package com.exmample.android.reportcard;

/**
 * Created by bgangadharaiah on 10/6/2017.
 */

public class ReportCard {

    private String SCHOOL_NAME = "MySchool";
    private int TOTAL_MARKS = 600;

    private String studentName = "";
    private int rollNumber;

    private int regionalLanguageMarks;
    private int englishLanguageMarks;
    private int physicsMarks;
    private int chemistryMarks;
    private int mathematicsMarks;
    private int biologyMarks;

    private int sum;
    private float percentage;

    public ReportCard(String studentName, int rollNumber, int regionalLanguageMarks, int englishLanguageMarks,
                      int physicsMarks, int chemistryMarks, int mathematicsMarks, int biologyMarks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.regionalLanguageMarks = regionalLanguageMarks;
        this.englishLanguageMarks = englishLanguageMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathematicsMarks = mathematicsMarks;
        this.biologyMarks = biologyMarks;
    }

    @Override
    public String toString() {
        return "ReportCard{" + " SchoolName=" + SCHOOL_NAME +
                ", StudentName=" + studentName +
                ", RollNumber=" + rollNumber +
                ", RegionalLanguageMarks" + regionalLanguageMarks +
                ", EnglishMarks=" + englishLanguageMarks +
                ", PhysicsMarks=" + physicsMarks +
                ", ChemistryMarks=" + chemistryMarks +
                ", MathematicsMarks=" + mathematicsMarks +
                ", BiologyMarks=" + biologyMarks +
                ", Grade='" + getGrade(regionalLanguageMarks, englishLanguageMarks,
                physicsMarks, chemistryMarks, mathematicsMarks, biologyMarks) + '\'' +
                '}';
    }

    private String getGrade(int regionalLanguageMarks, int englishLanguageMarks, int physicsMarks,
                            int chemistryMarks, int mathematicsMarks, int biologyMarks) {
        String grade;
        sum = regionalLanguageMarks + englishLanguageMarks + physicsMarks + chemistryMarks + mathematicsMarks + biologyMarks;
        percentage = sum / TOTAL_MARKS;

        if (percentage >= 90.0) {
            grade = "A";
        } else if (percentage < 90.0 && percentage >= 80.0) {
            grade = "B";
        } else if (percentage < 80.0 && percentage >= 70.0) {
            grade = "C";
        } else if (percentage < 70.0 && percentage >= 60.0) {
            grade = "D";
        } else if (percentage < 60.0) {
            grade = "Fail";
        } else {
            grade = "error";
        }
        return grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRegionalLanguageMarks() {
        return regionalLanguageMarks;
    }

    public void setRegionalLanguageMarks(int regionalLanguageMarks) {
        this.regionalLanguageMarks = regionalLanguageMarks;
    }

    public int getEnglishLanguageMarks() {
        return englishLanguageMarks;
    }

    public void setEnglishLanguageMarks(int englishLanguageMarks) {
        this.englishLanguageMarks = englishLanguageMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getMathematicsMarks() {
        return mathematicsMarks;
    }

    public void setMathematicsMarks(int mathematicsMarks) {
        this.mathematicsMarks = mathematicsMarks;
    }

    public int getBiologyMarks() {
        return biologyMarks;
    }

    public void setBiologyMarks(int biologyMarks) {
        this.biologyMarks = biologyMarks;
    }


}
