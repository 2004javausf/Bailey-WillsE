--CRUD OPS!-->
/*
Create 
Read 
Update
Delete

Sub-Languages of SQL
DDL- Data Definition Language - Auto-Commit!!
Structure of DB
Commands:
    Create
        ex. CREATE TABLE A(NUMBER ID, VARCHAR2 (50) NAME);
    Alter
        ex. ALTER TABLE A DROP COLUMN ID;
    Drop
        ex. DROP TABLE A;
    Truncate
        deleting the data w/o deleting the table
        
DML- Data Manipulation Language - NOT Auto-Commit
Data entries themselves 
Commands:
    Insert
        Inserts a row (data entry)
        ex. INSERT INTO A VALUES(14, 'BOB'); (all the data is present for a complete row and in order)
            INSERT INTO A (ID) (VALUES 15); (when not all data is present or only adding certain parts)
            INSERT INTO TABLE_NAME [(COLUMN1, COLUMN2)] SELECT [('COLUMN1', 'COLUMN2')] FROM TABLE_NAME2 [WHERE CONDITIONS];
            ^Insert data from another table
    Update
        Modify a row(s) (data modification)
        ex. UPDATE A SET NAME = 'DALE' WHERE NAME = 'BOB';
    Delete
        Deletes a row(s)
        ex.  DELETE FROM A WHERE NAME = 'BOB';
        
DQL- Data Query Language 
Command:
    Select 
        ex. SELECT * FROM *;
        ex. SELECT * FROM A;
        ex. SELECT NAME FROM A;
        
DCL- Data Control Language
 Control access of who can see/use data
 Commands:
    Grant
    Revoke
        ex. of use- View- virtual table/saved select statement 
        grant access ONLY to that to preserve sensitive data
        
TCL- Transaction Control Language
 Controls transactions
 Commands:
    Commit - permanate save 
        COMMIT;
    Savepoint - save a point temporarily
        SAVEPOINT spl;
    Rollback - Roll the DB back to last commit or a specified savepoint
        ROLLBACK spl;
*/

