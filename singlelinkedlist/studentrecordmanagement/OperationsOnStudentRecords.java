package singlelinkedlist.studentrecordmanagement;

class OperationsOnStudentRecords
{
        StudentInformation head;

        // Constructor of the class
        public OperationsOnStudentRecords()
        {
            this.head = null;
        }

        // Add a new student record at the beginning
        public void addAtBeginning(int rollNumber, String name, int age, String grade)
        {
            StudentInformation newStudent = new StudentInformation(rollNumber, name, age, grade);
            newStudent.next = head;
            head = newStudent;
        }

        // Add a new student record at the end
        public void addAtEnd(int rollNumber, String name, int age, String grade)
        {
            StudentInformation newStudent = new StudentInformation(rollNumber, name, age, grade);
            if (head == null)
            {
                head = newStudent;
            }
            else
            {
                StudentInformation temp = head;

                while (temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = newStudent;
            }
        }

        // Add a student record at a specific position
        public void addAtSpecificPosition(int rollNumber, String name, int age, String grade, int position)
        {
            StudentInformation newStudent = new StudentInformation(rollNumber, name, age, grade);
            if (position == 0)
            {
                newStudent.next = head;
                head = newStudent;
                return;
            }

            StudentInformation temp = head;
            int index = 0;
            while (temp != null && index < position - 1)
            {
                temp = temp.next;
                index++;
            }
            if (temp != null)
            {
                newStudent.next = temp.next;
                temp.next = newStudent;
            }
            else
            {
                System.out.println("Position out of range");
            }
        }

        // Delete a student record by Roll Number
        public void deleteStudentRecord(int rollNumber)
        {
            if (head == null)
            {
                System.out.println("Student Record is empty");
                return;
            }

            if (head.rollNumber == rollNumber)
            {
                head = head.next;
                return;
            }

            StudentInformation temp = head;
            while (temp.next != null && temp.next.rollNumber != rollNumber)
            {
                temp = temp.next;
            }

            if (temp.next != null)
            {
                temp.next = temp.next.next;
            }
            else
            {
                System.out.println("Student with roll number " + rollNumber + " not found");
            }
        }

        // Search for a student record by Roll Number
        public StudentInformation searchStudentRecord(int rollNumber)
        {
            StudentInformation temp = head;
            while (temp != null)
            {
                if (temp.rollNumber == rollNumber)
                {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }

        // Update a student's grade based on their Roll Number
        public void updateGrade(int rollNumber, String newGrade)
        {
            StudentInformation student = searchStudentRecord(rollNumber);
            if (student != null)
            {
                student.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber);
            }
            else
            {
                System.out.println("Student with roll number " + rollNumber + " not found");
            }
        }

        // Display all student records
        public void displayAllStudentsRecords()
        {
            if (head == null)
            {
                System.out.println("No student records to display");
                return;
            }
            StudentInformation temp = head;
            while (temp != null)
            {
                System.out.println("Student Roll Number is " + temp.rollNumber);
                System.out.println("Student Name is " + temp.name);
                System.out.println("Student Age is " + temp.age);
                System.out.println("Student Grade is " + temp.grade);
                temp = temp.next;
            }
        }
}

