FROM ubuntu:latest
MAINTAINER krishna
WORKDIR /app
RUN sudo apt update
RUN sudo apt install -y openjdk-11-jdk-headless
RUN sudo apt install -y wget 
RUN sudo wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.28/bin/apache-tomcat-10.1.28.tar.gz 
RUN sudo tar -xvf apache-tomcat-10.1.28.tar.gz
RUN sudo rm -rf apache-tomcat-10.1.28.tar.gz
RUN cd apache-tomcat-10.1.28/bin/
RUN ./startup.sh  
