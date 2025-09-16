#include <iostream>
#include <string>

using namespace std;

#define SIZE 20

class Student {
private:
    int rollNumber;
    string name;
    float marks[3];
    float total;
    float average;
    char grade;
    
public:
    static int studentCount;

    Student() {
        rollNumber = 0;
        name = "";
        total = 0.0f;
        average = 0.0f;
        grade = 'F';
        for (int i = 0; i < 3; ++i) {
            marks[i] = 0.0f;
        }
    }

    void calculate() {
        total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
        average = total / 3.0f;
        assignGrade();
    }

    void assignGrade() {
        if (average >= 75) {
            grade = 'A';
        } else if (average >= 50) {
            grade = 'B';
        } else if (average >= 25) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    void input() {
        cout << "\nEnter Student Details:\n";
        cout << "Roll Number: ";
        cin >> rollNumber;
        
        cin.ignore(); 
        
        cout << "Name: ";
        getline(cin, name);
        
        cout << "Marks for 3 subjects: ";
        for (int i = 0; i < 3; i++) {
            cin >> marks[i];
        }
        
        calculate();
        
        studentCount++; 
    }

    void display() const {
        cout << "Roll No.: " << rollNumber << endl;
        cout << "Name: " << name << endl;
        cout << "Marks of 3 Subjects: ";
        for (int i = 0; i < 3; i++) {
            cout << marks[i] << "\t";
        }
        cout << "\nTotal Marks: " << total << endl;
        cout << "Average Marks: " << average << endl;
        cout << "Grade: " << grade << endl;
    }

    static void displayStudentCount() {
        cout << "\nTotal number of student records: " << studentCount << endl;
    }

    static void searchRollNumber(Student students[], int rollToFind) {
        bool found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber == rollToFind) {
                cout << "\n--- Student Found ---\n";
                students[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            cout << "Student with roll number " << rollToFind << " not found.\n";
        }
    }

    static void sortStudentsByTotalMarks(Student students[]) {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].total < students[j + 1].total) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    float getAverage() const {
        return average;
    }
};

int Student::studentCount = 0;

int main() {
    Student students[SIZE];
    bool running = true;

    while (running) {
        int choice;
        cout << "\n--- Student Record Management ---\n";
        cout << "1. Add Student Record\n";
        cout << "2. Display All Records\n";
        cout << "3. Find Student with Highest Average\n";
        cout << "4. Search by Roll Number\n";
        cout << "5. Display Records Sorted by Total Marks\n";
        cout << "6. Display Total Student Count\n";
        cout << "7. Exit\n";
        cout << "---------------------------------\n";
        cout << "Total Students: " << Student::studentCount << "/" << SIZE << "\n";
        cout << "Enter your Choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                if (Student::studentCount < SIZE) {
                    students[Student::studentCount].input();
                } else {
                    cout << "Maximum student limit reached.\n";
                }
                break;

            case 2:
                if (Student::studentCount == 0) {
                    cout << "No student data available.\n";
                } else {
                    for (int i = 0; i < Student::studentCount; i++) {
                        cout << "\n--- Student " << i + 1 << " ---\n";
                        students[i].display();
                    }
                }
                break;

            case 3:
                if (Student::studentCount == 0) {
                    cout << "No student data available.\n";
                } else {
                    int highestIdx = 0;
                    for (int i = 1; i < Student::studentCount; i++) {
                        if (students[i].getAverage() > students[highestIdx].getAverage()) {
                            highestIdx = i;
                        }
                    }
                    cout << "\n--- Student with Highest Average ---\n";
                    students[highestIdx].display();
                }
                break;

            case 4:
                if (Student::studentCount == 0) {
                    cout << "No student data available.\n";
                } else {
                    int rollNo;
                    cout << "Enter Roll Number to search: ";
                    cin >> rollNo;
                    Student::searchRollNumber(students, rollNo);
                }
                break;

            case 5:
                if (Student::studentCount == 0) {
                    cout << "No student data available.\n";
                } else {
                    Student::sortStudentsByTotalMarks(students);
                    cout << "\n--- Students Sorted by Total Marks (Descending) ---\n";
                    for (int i = 0; i < Student::studentCount; i++) {
                        cout << "\n--- Rank " << i + 1 << " ---\n";
                        students[i].display();
                    }
                }
                break;
            
            case 6:
                Student::displayStudentCount();
                break;

            case 7:
                running = false;
                cout << "Exiting program. Goodbye!\n";
                break;

            default:
                cout << "Invalid choice. Please enter a number between 1 and 7.\n";
                break;
        }
    }
    return 0;
}