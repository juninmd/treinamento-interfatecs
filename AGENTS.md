```markdown
# AGENTS.md File Guidelines

These guidelines are designed to ensure consistent, maintainable, and high-quality code for the AGENTS repository. Adherence to these principles will promote a robust and scalable codebase.

**1. DRY (Don't Repeat Yourself)**

*   **Single Responsibility Principle:** Each agent should have a single, well-defined purpose.  Avoid creating functions or components with overlapping functionality.
*   **Common Logic:**  All common logic (e.g., data processing, communication protocols) should be encapsulated within separate, reusable components.
*   **Code Patterns:**  Favor established code patterns over crafting every solution from scratch.

**2. KISS (Keep It Simple, Stupid)**

*   **Minimize Complexity:**  Keep functions and classes as short and focused as possible.
*   **Readability:**  Use clear variable and function names.  Employ meaningful indentation and formatting.
*   **Avoid Over-Engineering:**  Don't introduce unnecessary complexity to solve a simple problem.  Prioritize clarity over cleverness.

**3. SOLID Principles**

*   **Single Responsibility:** Agents should have a single, clearly defined responsibility.
*   **Open/Closed Principle:**  The agent's functionality should be easily extensible through well-defined interfaces without modifying the existing code.
*   **Liskov Substitution Principle:**  Subclasses should be substitutable for their base classes without altering the correctness of the program.
*   **Interface Segregation Principle:**  Clients should not be forced to implement interfaces they don't use.
*   **Dependency Inversion Principle:**  High-level modules should be populated by low-level modules.

**4. YAGNI (You Aren't Gonna Need It)**

*   **Future-Proofing:**  Don't implement features or solutions that are not currently required.  Focus on what is necessary *now*.
*   **Avoid Unnecessary Complexity:** Resist the urge to add functionality just because it's possible or desired.  Weigh the benefits of new features against their added complexity.

**5. Code Length & Structure**

*   **Maximum Code Length:** Each file should not exceed 180 lines of code.
*   **File Structure:**  Organize code into logical files based on functionality (e.g., `agent_core.py`, `agent_communication.py`, `agent_data_management.py`).
*   **Modularization:**  Break down complex agents into smaller, self-contained modules with well-defined interfaces.

**6. Testing**

*   **Unit Tests:** All code must be thoroughly tested with unit tests.
*   **Test Coverage:** Aim for at least 80% test coverage.
*   **Test-Driven Development:** Prioritize writing tests *before* writing the code.
*   **Mocking/Stubbing:** Utilize mocks and stubs extensively to isolate agent functionality during testing.  No use of real implementations.

**7. Development Process**

*   **Version Control:**  Use Git for version control and commit frequently.
*   **Code Reviews:**  Implement a code review process to ensure code quality and consistency.
*   **Documentation:**  Provide clear and concise documentation for each agent, including its purpose, input, output, and dependencies.
*   **Configuration:** Employ a consistent configuration format to minimize variations.

**8. Specific Guidelines**

*   **Data Structures:** Use appropriate data structures for efficiency and readability.
*   **Error Handling:** Implement robust error handling to prevent unexpected crashes.
*   **Logging:** Include logging to track agent activity and potential issues.
*   **Documentation Comments:**  Add detailed comments to explain complex logic and algorithms.
*   **Naming Conventions:** Follow consistent naming conventions throughout the codebase (e.g., snake_case).

**9.  Block Structure**

*   Each file is a single logical unit.  Files are not nested.


**10.  Agencies List**

*   Each agent will have a dedicated file explaining its purpose and dependencies.

```