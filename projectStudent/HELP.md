# ProjectStudent

ProjectStudent is a Java application that manages student basic information for a project. It provides functionality to
add, update, fetch and delete student records.

## Features

- Add a new student: Allows you to add a new student to the project.
- Update student information: Enables you to update the information of an existing student.
- Delete a student: Allows you to remove a student from.
- View student details: Provides the Student id to view the details of a specific student.
- List all students: Displays a list of all the students.

## Technologies Used to Run APP

- Java(17)
- Spring Boot(3.x)
- PostgresSQL (or any other database of your choice, for other database need to change db config accordingly)
- Maven

## Getting Started

To get started with the ProjectStudent application, follow these steps:

1. Clone the repository:
   - https://github.com/rana123harsh/Basic_Java_CURD_operations.git


2. Navigate to the project directory:


3. Configure the database:

    - Open the `application.properties` file located in the `src/main/resources` directory.
    - Update the database connection details (URL, username, password) according to your database setup.

4. Build the application:


5. Run the application:


6. Access the application:

   Open your web browser and go to `http://localhost:8081` to access the ProjectStudent application.

## API Endpoints

The ProjectStudent application provides the following API endpoints:

- `GET /getAll-student`: Retrieves a list of all students.
- `GET /get-student/{student_id}`: Retrieves the details of a specific student.
- `POST /addStudent`: Creates a new student.
- `PUT /update-student/{student_id}`: Updates the information of an existing student.
- `DELETE /delete-student/{id}`: Deletes a student.

## Contributing

Contributions to the ProjectStudent application are welcome. If you find any issues or have suggestions for improvement,
please feel free to open an issue or submit a pull request.


## Contact

If you have any questions or need further assistance, please
contact [harshprana234@gmail.com](mailto:harshprana234@gmail.com).

---

Feel free to customize the README file according to your specific project requirements. Include any additional sections
or information that you think would be helpful for users or contributors.


   
