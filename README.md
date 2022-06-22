# Data driven selenium testing

### Scope:

The scope of the project was to practice interacting with the database in java, as well as seting up a database in a docker container. The tests covers log in functionality.

### Setup:

First thing first you need to have docker and mysql installed.

In order to set the environment run: `./mysql_init.sh`

In order to stop the docker container run: `docker stop mysql-docker-local`

If you want to interact with the mysql-database from the cli, run: `mysql -uroot -pdupsko -h127.0.0.1 -P13306`
