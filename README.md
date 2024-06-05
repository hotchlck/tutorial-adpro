<details>
<summary> Tutorial 1 </summary>

## Reflection 1
In developing my project, I implemented key coding standards to enhance readability, maintainability, and security:

1. **Clear Naming:** Variables and functions have clear, descriptive names, following camelCase in Java. This minimizes the need for comments by making the code self-explanatory.

2. **Effective Functions:** Functions are concise and focused on a single responsibility, reducing repetition and ensuring clarity. They avoid side effects and do not return null.

3. **Minimal Comments:** Comments are only added where necessary, such as explaining data formats or complex logic, instead of describing what the code does.

4. **Structured Code:** The code is organized using objects, repositories, services, and implementations for clear structure and separation of concerns.

5. **Feature Branch Workflow:** Development follows a "feature branch workflow," enhancing code safety by isolating changes until tested and reviewed.

For improvement, I identified the need for better secure coding practices:

1. **Enhanced Input Validation:** Beyond preventing runtime errors, more specific input validation and authentication/authorization mechanisms are necessary to protect against security threats.

2. **Robust Error Handling:** Anticipating potential errors and exceptions ensures smooth operation under various conditions.

Testing has increased confidence in the program's correctness. Effective testing covers expected behavior, error conditions, and edge cases, aiming for about 80% code coverage. Meaningful tests are essential for true robustness.

In summary, the focus has been on writing clear, maintainable, and secure code by following best practices and continuously improving. 
The goal is to develop functional, resilient, and manageable software.

## Reflection 2 
The number of unit tests should vary based on the class complexity, with at least one test per method covering different scenarios. 
Adequate unit testing requires focusing on code coverage, which measures how much code is executed by tests. 
However, 100% coverage does not guarantee bug-free code, as it only indicates executed code, not business logic validity.
Thus, high coverage is important, but comprehensive test design is crucial.

Repetition in functional test suites, such as identical setup procedures and instance variables, harms code cleanliness. 
This can be mitigated by creating a base class with common setups and variables to avoid duplication.

Unit tests boost confidence in code functionality. 
The exact number of tests depends on program functionality and required unit coverage. 
Tests are sufficient when all features and units are thoroughly covered. 
While 100% coverage is ideal, it doesn't ensure error-free code as some cases may be untested.

Improving code quality involves reducing redundancy by consolidating repetitive code into a single base class or file,
enhancing maintainability and clarity.







</details>