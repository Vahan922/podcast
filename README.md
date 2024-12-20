Task: Develop a Role-Based Data Access System
Objective
Model and implement a system that restricts data access based on user roles using enums, encapsulation, and generics.
Requirements
Role Management:
Define an enum Role with roles like ADMIN, QA, and USER.
Each role should include permissions (e.g., READ, WRITE, DELETE) stored in a map.
User Class:
Fields: id, name, role.
Methods:
hasPermission(String operation) to check access rights.
accessData<T>(T data) to log access attempts.
Data Restriction:
Use generics to simulate role-based access:
An ADMIN can view and modify all data.
A QA can view but not modify sensitive data.
A USER can view only specific sections.
Complexity:
Incorporate nested classes for data storage (e.g., public vs. sensitive data).
Add logging for all access attempts and enforce restrictions programmatically.
