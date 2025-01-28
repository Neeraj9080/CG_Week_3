package singlelinkedlist.studentrecordmanagement;

class StudentInformation
{
        //Attribute of the class
        int rollNumber;
        String name;
        int age;
        String grade;
        StudentInformation next;

        // Constructor of the class
        public StudentInformation(int rollNumber, String name, int age, String grade)
        {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
}
