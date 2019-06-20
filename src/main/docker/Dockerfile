FROM 		java:8
FROM        tomcat:8
# 环境变量
ENV APP 	demo-01-0.0.1-SNAPSHOT.jar

#RUN         docker stop demo01 \ docker rm demo01 \ docker rmi demo01:0.0.1-SNAPSHOT
WORKDIR     /ysw/app
VOLUME 		/ysw/app
ADD			$APP /ysw/app/demo01.jar
ENTRYPOINT 	["java", "-jar", "/ysw/app/demo01.jar"]
EXPOSE 		8080
#RUN         docker run -d --name="demo02" -p 8080:8080 demo01:0.0.1-SNAPSHOT
