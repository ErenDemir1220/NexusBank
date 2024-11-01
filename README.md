Nexus Bank This project is a Java-based banking application called Nexus Bank, developed using both JavaFX and core Java. The application provides a user-friendly interface for different types of users and allows for essential banking operations. Below is a detailed overview of the application's features and functionality.

Features Login Screen: The application opens with a login screen where users can enter their ID and password.

If the user is an Admin, they are directed to the Admin Dashboard. If the user is a Customer (Soldier, Retiree, Student, or Regular Customer), they are directed to their respective Customer Dashboard. User Types: There are four customer types in this application, each with a different priority for campaigns and raffle draws:

Soldier (highest priority) Retiree Student Regular Customer (lowest priority) Admin Features: The admin has control over:

Setting and adjusting interest rates for loans. Viewing and managing customer data. Customer Features:

Deposits: Customers can deposit money into their accounts. Withdrawals: Customers can withdraw money from their accounts. Loan Management: Customers can apply for loans with interest rates set by the admin. Raffle System: A raffle feature is included where customers can participate. The winner selection respects the hierarchy order:

Soldier > Retiree > Student > Regular Customer Getting Started Prerequisites Java Development Kit (JDK) version 8 or higher JavaFX library Installation Clone the repository: bash Kodu kopyala git clone Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse). Set up the JavaFX library if not already included in your IDE. Compile and run the application. Usage Login: Start by entering your ID and password. Depending on your user type, you will be directed to the appropriate dashboard. Admins can manage interest rates and view customer details. Customers can perform standard banking operations like deposit, withdrawal, and apply for loans. Participate in the raffle for a chance to win, with priority given to higher-tier customers. Contributing Feel free to submit issues or fork the repository to contribute to this project.
