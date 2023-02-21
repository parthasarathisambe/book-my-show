# book-my-show

## Steps to setup postgresql.
* Download PostgreSQL from its official website - https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
* Proceed with installation after downloading the windows installer for PostgreSQL.
* After installing, open **SQL Shell (psql)** under **PostgreSQL** folder from the start menu.
* Choose default options for the first time to start and connect to database.
    * Server: localhost
    * Database: postgres
    * Port: 5432
    * Username: postgres
    * Password: <Whatever you provided during installation>
* This will connect you to the default database.
* Now create Database for your project.
    * create database bookmyshow;
* Once this command is executed successfully, exit the database and start again. This time choose below options.
    * Server: localhost
    * Database: bookmyshow
    * Port: 5432
    * Username: postgres
    * Password: <Whatever you provided during installation>
* Now we create a role for this project to connect to this database and assign privileges to it.
    * CREATE USER bms WITH PASSWORD 'bmsisnice';
    * GRANT CONNECT ON DATABASE bookmyshow TO bms;
    * GRANT pg_read_all_data TO bms;
    * GRANT pg_write_all_data TO bms;
* Once this is done, you can switch to bms role to check/debug the data.
    * SET ROLE bms;
* For now I am using public schema to create tables automatically when the service start. So to provide permissions to public schema you need to execute below commands.
    * Go to default (postgres) database and execute, **ALTER DATABASE bookmyshow OWNER TO bms;**
    * Then open the DB with bms user and execute, **GRANT ALL ON DATABASE bookmyshow TO public;**