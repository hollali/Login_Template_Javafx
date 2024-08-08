Overview

This project is a simple JavaFX application featuring a login form, designed using Scene Builder. It demonstrates how to create a user interface with JavaFX and Scene Builder, handling basic user authentication with a sample username and password validation.
Features

    User Interface: Designed using Scene Builder for a visually appealing and user-friendly login form.
    Authentication: Basic authentication logic with hardcoded credentials for demonstration purposes.
    Responsive Design: The form adapts to different screen sizes and resolutions.

Prerequisites

Before running the application, ensure you have the following installed:

    Java Development Kit (JDK): Version 8 or higher. Download JDK
    JavaFX SDK: Required for JavaFX development. Download JavaFX
    Scene Builder: A tool for designing JavaFX user interfaces. Download Scene Builder

Setup

    Clone the Repository:

    bash

    git clone https://github.com/yourusername/javafx-login-form.git
    cd javafx-login-form

    Configure JavaFX:
        Make sure to set up your JavaFX SDK path in your IDE or build tool.
        Update the JavaFX SDK location in your project settings if necessary.

    Open the Project in Your IDE:
        Use an IDE like IntelliJ IDEA or Eclipse with JavaFX support.
        Import the project as a JavaFX project.

    Design the Form Using Scene Builder:
        Open LoginForm.fxml in Scene Builder.
        Customize the layout, styles, and controls as needed.
        Save your changes.

Running the Application

    Compile and Run:
        Use your IDE's build and run configurations, or use the command line:

        bash

        mvn clean install
        mvn javafx:run

        Alternatively, run the LoginApp.java main class directly from your IDE.

    Test the Login:
        Enter the sample username and password (user and password) to test authentication.
        Update the credentials in the LoginController.java class to match your desired credentials.

Code Structure

    src/main/java/com/example/login/: Java source files.
        LoginApp.java: The main application class that launches the JavaFX application.
        LoginController.java: Controller class handling the login logic and UI interaction.
    src/main/resources/com/example/login/: Resources.
        LoginForm.fxml: FXML file designed using Scene Builder.
        styles.css: Optional CSS file for styling the application.

Customization

    Modify UI Elements: Open LoginForm.fxml in Scene Builder to adjust the layout, styles, and controls.
    Change Authentication Logic: Update the LoginController.java to use different authentication methods or integrate with a backend service.

Troubleshooting

    JavaFX SDK Issues: Ensure that the JavaFX SDK path is correctly configured in your IDE or build tool.
    Scene Builder Errors: If Scene Builder does not display correctly, check for compatibility with your JavaFX version.

Contributing

Feel free to contribute to this project by submitting issues or pull requests. Ensure that your changes align with the project goals and adhere to coding standards.
License

This project is licensed under the MIT License - see the LICENSE file for details.
Contact

For any questions or feedback, please contact:

    GitHub: https://github.com/hollali/javafx-login-form
