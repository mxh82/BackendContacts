# Xxxxxxxx Backend Coding Challenge
# This code was written as part of the interview process for a Sr. Java dev position. 
# I wrote this code in a couple of hours and therefore there are several improvements that can be made. 
# The code was good enough to get me an in-person interview. 
#
# I may improve this code as time permits or I may never look at it again.

RESTful Contacts API

This project was created in Intellij using Spring Boot 2.0.1, Maven, Lombok, SpringData JPA.
The H2 in-memory database was used. 
A BootStrap file implementing CommandLineRunner is used to populate the database.

The Spring Boot application file is ContactsBackendApplication.

Requirements:
   To develop a RESTful API to access backend contact records.
   A contact record consists of name, company, email, birthdate, phone number(work & personal), address, and profile image.
   
   Create a contact record
   Retrieve a contact record
   Update a contact record
   Search for a record by email or phone number
   Retrieve all records from the same state or city

**Endpoints**
POST ~/contacts - Create a contact record
GET ~/contacts/{id} - Retrieve a contact record
PUT ~/contacts/{id} - Update a contact record
DELETE ~/contacts/{id} - Delete a contact record
GET ~/contacts/email/{email} - Search for a record by email
GET ~/contacts/personalPhone/{personalPhone} - Search for a record by personal phone number
GET ~/contacts/workPhone/{workPhone} - Search for a record by work phone number
GET ~/contacts/state/{state} - Retrieve all records from the same state
GET ~/contacts/city/{city} - Retrieve all records from the same city



TODO:
 1. Implement DataTransferObjects (DTO)
 2. Write better JUnit tests(Which should have been done first)