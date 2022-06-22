#!/bin/sh

docker pull mysql

#if not set up:
docker run -p 13306:3306 --name mysql-docker-local -eMYSQL_ROOT_PASSWORD=dupsko -d mysql:latest 2>/dev/null ||
#if set up but not working:
docker start mysql-docker-local;
	sleep 1;
#ensure that the database contains the proper data
mysql -uroot -pdupsko -h127.0.0.1 -P13306 < src/main/resources/script.sql
