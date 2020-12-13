### **Install Rabbit MQ Image From Docker Hub**
#### Run docker compose file using terminal :
`docker-compose -f docker-compose.yml up -d`
#### open url : http://localhost:15672
    username: guest
    password: guest
###  Send Message to Queue
#### url : http://localhost:8080/send , Request Type : POST
#### Result
![send message](https://s1.imghub.io/a6KKr.png)
### Read Message From Queue

![read message](https://s1.imghub.io/awElJ.md.png)