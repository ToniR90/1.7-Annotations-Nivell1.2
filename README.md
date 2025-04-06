# 1.7.1.2: Worker Salary Calculation & Obsolet Methods

This project demonstrates a simple implementation of a worker salary calculation system using inheritance in Java. It features three types of workers: remote workers, in-office workers, and presencial workers, each with different salary calculation methods.

## Classes

### Worker (Abstract Class)
- Base class for all worker types.
- Contains attributes: `name`, `surename`, and `salaryPerHour`.
- Contains the abstract method `calculateSalary(double workedHoursPerMonth)`.

### InOfficeWorker
- Extends `Worker`.
- Calculates salary based on hours worked and adds a fixed gas cost.
- Contains a deprecated method `deprecatedMethod()`.

### RemoteWorker
- Extends `Worker`.
- Calculates salary based on hours worked and adds a fixed internet fee.
- Contains a deprecated method `deprecatedMethod()`.

### Main
- Entry point of the application.
- Creates instances of `RemoteWorker` and `InOfficeWorker`.
- Invokes salary calculation and deprecated methods.

# Notes
- The project demonstrates the use of the `@Deprecated` annotation to indicate methods that should not be used anymore.
- Warnings for deprecated methods are suppressed in the `Main` class using `@SuppressWarnings("deprecation")`.

## How to Run

Copy this repository: https://github.com/ToniR90/1.7-Annotations-Nivell1.2.git
 
