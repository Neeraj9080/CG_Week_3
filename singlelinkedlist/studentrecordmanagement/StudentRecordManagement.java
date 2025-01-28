package singlelinkedlist.studentrecordmanagement;

public class StudentRecordManagement
{
    public static void main(String[] args)
    {
        OperationsOnStudentRecords studentlist = new OperationsOnStudentRecords();

        // Adding student record at the beginning
        studentlist.addAtBeginning(101,"Rajan",24,"A");

        // Adding student record at a specific postion
        studentlist.addAtSpecificPosition(102,"Rishab",22,"A+",1);

        // Adding student record at end position
        studentlist.addAtEnd(103,"Pratik",21,"A+");

        // Deleting student record by using roll number
        studentlist.deleteStudentRecord(103);

        // Searching student record by using roll number
        studentlist.searchStudentRecord(102);

        // Updating student grade record by using roll number
        studentlist.updateGrade(101,"A+");

        // Displaying all student records
        studentlist.displayAllStudentsRecords();
    }
}
