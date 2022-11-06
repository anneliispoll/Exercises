package sdaAdvancedExercises.Task2;

import sdaAdvancedExercises.Task2.Person;

public class Student extends Person {

    private String typeOfStudy;
    private int yearOfStudy;
    private float studyPrice;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, float studyPrice){
        super(name,address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;

    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public float getStudyPrice() {
        return studyPrice;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(float studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudies='" + typeOfStudy + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", studiesPrice=" + studyPrice +
                '}';
    }
}
