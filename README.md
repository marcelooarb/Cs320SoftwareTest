# CS 320 Portfolio Submission


## How can I ensure that my code, program, or software is functional and secure?


I can ensure my code is functional by writing tests that directly align with the software requirements. In the contact service project, I tested both valid and invalid inputs, including null values, overly long fields, duplicate contact IDs, and invalid phone numbers. This confirmed that the program behaved correctly under both normal and unexpected conditions. I can also improve functionality by reviewing test coverage and ensuring important methods and logic paths are tested.

To help ensure software is secure, I need to validate user input, prevent invalid data from entering the system, and design code so that important fields are protected. 

## How do I interpret user needs and incorporate them into a program?


I interpret user needs by first breaking the requirements into smaller, testable rules.

Incorporating user needs into a program also requires considering how the user will depend on the software. For the contact service, the user needs to add, update, and delete contacts reliably. As a result, the program had to prevent duplicate IDs and reject invalid data. By linking the tests directly to the requirements, I was able to confirm that the software met the customer’s expectations.

## How do I approach designing software?


I approach software design by first understanding the requirements, then identifying the main objects, services, and responsibilities in the program. For this project, the Contact class stored and protected contact data, while the ContactService class managed contacts using an in-memory data structure. Separating these responsibilities made the code easier to understand, test, and maintain.

I also design software with testing in mind. This means writing smaller methods, using clear validation logic, and keeping the structure simple enough that each requirement can be tested. In this project, JUnit tests guided my design because each requirement needed to be verified through automated tests. Going forward, I will continue to use this approach because it helps reduce errors, improve maintainability, and build confidence in the quality of the software.