FROM openjdk:21-jdk-slim

EXPOSE 25565/tcp
EXPOSE 25565/udp

ARG memory_size=1G
ENV MEMORYSIZE=$memory_size

WORKDIR /data

CMD java -Xms$MEMORYSIZE -Xmx$MEMORYSIZE -jar paper-1.21.3-81.jar nogui
