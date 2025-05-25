# Database Tasks

This repository contains solutions for database-related tasks involving SQL and MongoDB. The project includes two main tasks: one for SQL queries on an Employee table and another for MongoDB queries on a Product dataset.

## Project Structure

- **Task1.sql**: Contains SQL queries for the Employee table (Task 1).
- **Task2.java**: A Java program using JDBC to connect to a database and insert employee data (Task 2).
- **Task3.mongodb**: Contains MongoDB queries for the Product dataset (MongoDB Day 1).
- **1.png, 2.png, 3.png**: Screenshots of the code implementations for each task.

## Task Descriptions

### Task 1: SQL Queries on Employee Table
This task involves creating a table `Empl` to store employee details and writing SQL queries to retrieve specific information.

#### Table Structure
- **Empl**:
  - `EName`: Employee name
  - `Sal`: Salary
  - `Comm`: Commission
  - `Job`: Job title
  - `Mgr`: Manager ID
  - Other fields as per standard employee details

#### Queries
1. Display `EName` and `Sal` of employees with a salary greater than or equal to 2200.
2. Display details of employees who are not receiving a commission.
3. Display `EName` and `Sal` of employees whose salary is not in the range of 2500 to 4000.
4. Display `EName`, job title, and `Sal` of employees who do not have a manager.
5. Display `EName` of employees whose name has "A" as the third letter.
6. Display `EName` of employees whose name ends with "S".

### Task 2: JDBC Program for Employee Data Insertion
This task involves writing a Java program using JDBC to connect to a database and insert employee data into the `Empl` table.

### MongoDB Day 1: Queries on Product Dataset
This task involves writing MongoDB queries on a product dataset provided in JSON format ([product.json](https://github.com/rvsp/database/blob/master/mongodb/product.json)).

#### Queries
1. Retrieve all information about each product.
2. Find products with a price between 400 and 800.
3. Find products with a price not between 400 and 600.
4. List the first four products with a price greater than 500.
5. Retrieve the `product_name` and `product_material` of each product.
6. Find the product with a `row_id` of 10.
7. Retrieve only the `product_name` and `product_material` for all products.
8. Find products with "soft" in their `product_material`.
9. Find products with `product_color` as "indigo" and `product_price` as 492.00.
10. Delete products with a `product_price` of 28.

## How to Run

### SQL Queries (Task 1)
1. **Set Up the Database**:
   - Create a database (e.g., using MySQL).
   - Create the `Empl` table with the appropriate columns.
2. **Run the Queries**:
   - Open `Task1.sql` in a SQL editor (e.g., MySQL Workbench).
   - Execute the queries to view the results.

### JDBC Program (Task 2)
1. **Set Up the Database**:
   - Ensure the `Empl` table exists in your database.
   - Configure your JDBC driver (e.g., MySQL Connector/J).
2. **Compile and Run**:
   ```bash
   javac Task2.java
   java Task2
   ```
   - Ensure your database credentials are updated in the code.

### MongoDB Queries (MongoDB Day 1)
1. **Set Up MongoDB**:
   - Install MongoDB and start the MongoDB server.
   - Import the `product.json` dataset into a MongoDB collection (e.g., `products`).
   ```bash
   mongoimport --db mydatabase --collection products --file product.json --jsonArray
   ```
2. **Run the Queries**:
   - Open a MongoDB shell or a client like MongoDB Compass.
   - Copy and execute the queries from `Task3.mongodb`.

## Requirements

- **SQL**:
  - MySQL or any SQL database system.
  - A SQL client (e.g., MySQL Workbench).
- **JDBC**:
  - Java Development Kit (JDK) 8 or higher.
  - MySQL Connector/J for JDBC connectivity.
- **MongoDB**:
  - MongoDB server installed.
  - A MongoDB client (e.g., MongoDB shell or Compass).

## Screenshots

The repository includes screenshots (1.png, 2.png, 3.png) that show the code implementations for each task. Refer to these images to view the solutions visually.
