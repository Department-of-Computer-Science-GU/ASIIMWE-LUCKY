Here’s an updated README.md file with instructions on how to set up and run your Spring Boot application:

markdown
Copy code
# Fun Fact Generator

A simple Spring Boot application that provides random fun facts using an external API. The application allows users to fetch a random fun fact and view the history of previously fetched facts.

## Project Structure

fun-fact-generator/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── com/ │ │ │ └── example/ │ │ │ └── funfactgenerator/ │ │ │ ├── controller/ │ │ │ │ └── FunFactController.java │ │ │ └── service/ │ │ │ └── FunFactService.java │ │ └── resources/ │ │ └── templates/ │ │ └── index.html ├── pom.xml └── README.md

kotlin
Copy code

## Prerequisites

- Java 23 or later
- Apache Maven 3.9.9 or later

## Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/fun-fact-generator.git
   cd fun-fact-generator
Build the Project

Ensure that Maven is installed and properly set up on your system. Run the following command to build the project:

bash
Copy code
mvn clean install
Run the Application

After successfully building the project, start the application using:

bash
Copy code
mvn spring-boot:run
The application will start, and you should see log messages indicating that it is running.

Access the Application
Open a web browser and go to http://localhost:8080 to view the main page.
Use the "Get Another Fun Fact" button to fetch a new fact.
The fact history will be updated with each new fact fetched.
Endpoints
GET /: Displays a random fun fact and the history of previously fetched facts.
GET /new-fact: Returns a new fun fact in response to an AJAX request.
Troubleshooting
Error: mvn is not recognized: Ensure that Maven is installed and added to your system’s PATH.
Compilation Errors: Check that all Java files are correctly named and located in the appropriate directories. Verify that dependencies in pom.xml have the correct versions.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributing
Feel free to open issues or submit pull requests to improve the application.

For additional help or questions, please contact your-email@example.com.

less
Copy code

### Notes:
- Replace `https://github.com/yourusername/fun-fact-generator.git` with the actual URL of your GitHub repository.
- If you have a license file or other additional details, include them in the relevant sections.
