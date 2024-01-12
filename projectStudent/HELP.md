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


2. Navigate to the project directory:


3. Configure the database:

    - Open the `application.properties` file located in the `src/main/resources` directory.
    - Update the database connection details (URL, username, password) according to your database setup.

4. Build the application:


5. Run the application:


6. Access the application:

   Open your web browser and go to `http://localhost:8080` to access the ProjectStudent application.

## API Endpoints

The ProjectStudent application provides the following API endpoints:

- `GET /students`: Retrieves a list of all students.
- `GET /students/{id}`: Retrieves the details of a specific student.
- `POST /students`: Creates a new student.
- `PUT /students/{id}`: Updates the information of an existing student.
- `DELETE /students/{id}`: Deletes a student.

## Contributing

Contributions to the ProjectStudent application are welcome. If you find any issues or have suggestions for improvement,
please feel free to open an issue or submit a pull request.

## License

The ProjectStudent application is open-source and is released under
the [MIT License](https://opensource.org/licenses/MIT).

## Contact

If you have any questions or need further assistance, please
contact [your-email@example.com](mailto:your-email@example.com).

---

Feel free to customize the README file according to your specific project requirements. Include any additional sections
or information that you think would be helpful for users or contributors.


   