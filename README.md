## run docker-compose with database
docker-compose up -d

## run jar
maven package
o
mvn clean install
o
mvn install

## build Dockerfile
docker build -t NOMBREAPP .

## run Dockerfile
docker run NOMBREAPP

## create docker-compose to run dockerfile linked with database container