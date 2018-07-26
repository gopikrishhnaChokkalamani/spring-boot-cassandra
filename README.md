# spring-boot-cassandra
A simple example with Springboot and Cassandra

A simple example explaining the spring boot cassandra implementation

It has two implementations - auto configuration and using AbstractCassandraConfiguration.

Exmaple walks through a GET and POST request

Also it explains how to have new TYPE in a cassandra table

Create a table

CREATE TABLE location ( vehicle_id text, date text, time timestamp, latitude double, longitude double, PRIMARY KEY ((vehicle_id, date), time) ) WITH CLUSTERING ORDER BY (time DESC);

Create a type address for the above table,

CREATE TYPE address ( street text, city text, zip_code int, phone text);

Alter table to add the new type as a column,

alter table location add address frozen//<address//>;
