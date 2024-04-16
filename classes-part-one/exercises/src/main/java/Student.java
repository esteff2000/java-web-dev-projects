public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public void setName(String name) {
                this.name = name;
        }
        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        public void setStudentId(int studentID) {
                this.studentId = studentID;
        }

        private void setNumberOfCredits(int numberofCredits) {
                this.numberOfCredits = numberofCredits;
        }

        public String getName() {
                return name;
        }
        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.


}
