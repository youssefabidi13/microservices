# **Master Microservices with Spring Boot, Docker, and Kubernetes**

Welcome to the repository for the **Master Microservices** course, where we cover everything from the fundamentals of microservices architecture to advanced deployment techniques with Docker and Kubernetes.

## **Table of Contents**

### **1. Introduction to Microservices Architecture**
- Understanding Microservices vs Monolithic and SOA architectures

### **2. Building Microservices with Spring Boot**
- Leveraging Spring Boot to build production-ready microservices

### **3. Right-Sizing Microservices & Identifying Boundaries**
- How to determine the boundaries and responsibilities of each microservice

### **4. Deployment, Portability & Scalability with Docker**
- Using Docker to handle deployment, portability, and scalability of microservices

### **5. Cloud-Native Apps & 15-Factor Methodology**
- Understanding Cloud-Native principles and the 15-factor methodology for microservices

### **6. Configuration Management with Spring Cloud**
- Managing configurations across microservices with **Spring Cloud Config**

### **7. Using MySQL with Microservices**
- Integrating MySQL databases inside microservices for persistent data storage

### **8. Service Discovery & Registration with Spring Eureka**
- Implementing service discovery and registration patterns in microservices

### **9. Gateway, Routing & Cross-Cutting Concerns with Spring Cloud Gateway**
- Managing cross-cutting concerns such as routing, load balancing, and API gateways

### **10. Resilience in Microservices**
- Making your microservices resilient using the **Resilience4J** framework

### **11. Observability and Monitoring**
- Implementing observability with **Prometheus**, **Grafana**, **Loki**, and **Tempo**

### **12. Securing Microservices**
- Securing microservices with **OAuth2**, **OpenID Connect**, and **Spring Security**

### **13. Event-Driven Microservices with RabbitMQ, Spring Cloud Functions & Stream**
- Building event-driven microservices with **RabbitMQ** and **Spring Cloud**

### **14. Event-Driven Microservices with Kafka, Spring Cloud Functions & Stream**
- Leveraging **Kafka** for event-driven microservices architecture

### **15. Container Orchestration with Kubernetes**
- Orchestrating containers with **Kubernetes** for high availability and scalability

### **16. Helm for Kubernetes**
- Deploying applications to Kubernetes using **Helm** charts

### **17. Server-Side Service Discovery & Load Balancing with Kubernetes**
- Managing service discovery and load balancing with **Kubernetes**

### **18. Deploying Microservices to Cloud Kubernetes Clusters**
- Deploying microservices to cloud-based Kubernetes clusters

### **19. K8s Ingress, Service Mesh (Istio) & mTLS**
- Understanding **K8s Ingress**, **Istio**, and **mTLS** for advanced networking

---

## **Important Links**

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Create Spring Boot Project](https://start.spring.io)
- [DTO Pattern Blog](https://martinfowler.com/eaaCatalog/dataTransferObject.html)
- [Model Mapper](http://modelmapper.org/)
- [MapStruct](https://mapstruct.org/)
- [Spring Doc](https://springdoc.org/)
- [Open API](https://www.openapis.org/)
- [Lucidchart Blog on DDD & Event Storming](https://www.lucidchart.com/blog/ddd-event-storming)
- [Docker Website](https://www.docker.com)
- [Docker Hub](https://hub.docker.com)
- [Buildpacks](https://buildpacks.io)
- [Google Jib](https://github.com/GoogleContainerTools/jib)
- [Docker Compose](https://docs.docker.com/compose/)
- [Twelve-Factor Methodology](https://12factor.net)
- [Beyond the Twelve-Factor App Book](https://www.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631/)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Spring Cloud Config](https://spring.io/projects/spring-cloud-config)
- [Spring Cloud Bus](https://spring.io/projects/spring-cloud-bus)
- [RabbitMQ](https://www.rabbitmq.com)
- [Hookdeck](https://hookdeck.com)
- [Spring Cloud Netflix](https://spring.io/projects/spring-cloud-netflix)
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
- [Netflix Blog](https://netflixtechblog.com/netflix-oss-and-spring-boot-coming-full-circle-4855947713a0)
- [Resilience4J](https://resilience4j.readme.io)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [Grafana](https://grafana.com)
- [Prometheus](https://prometheus.io/)
- [Keycloak](https://www.keycloak.org/)
- [Apache Kafka](https://kafka.apache.org)
- [Helm](https://helm.sh)
- [GCP](https://cloud.google.com)

---

## **Useful Commands**

### **Maven Commands**
| Command                                      | Description |
| -------------------------------------------- | ----------- |
| `mvn clean install -Dmaven.test.skip=true`   | Generate a JAR inside the target folder |
| `mvn spring-boot:run`                        | Start a Spring Boot application |
| `mvn spring-boot:build-image`                | Generate a Docker image using Buildpacks |
| `mvn compile jib:dockerBuild`                | Build a Docker image using Google Jib |

### **Docker Commands**
| Command                                       | Description |
| --------------------------------------------- | ----------- |
| `docker build . -t eazybytes/accounts:s4`     | Build a Docker image from a Dockerfile |
| `docker run -p 8080:8080 eazybytes/accounts:s4` | Run a Docker container from an image |
| `docker ps`                                   | List running containers |
| `docker image rm image-id`                    | Remove a Docker image |

### **Kubernetes Commands**
| Command                                   | Description |
| ----------------------------------------- | ----------- |
| `kubectl apply -f filename`               | Create resources from a YAML file |
| `kubectl get all`                         | List all components in your cluster |
| `kubectl get pods`                        | List all pods in the cluster |
| `kubectl get services`                    | List all services in the cluster |

### **Helm Commands**
| Command                                   | Description |
| ----------------------------------------- | ----------- |
| `helm create [NAME]`                      | Create a new Helm chart |
| `helm install [NAME] [CHART]`             | Install a Helm chart into your cluster |
| `helm upgrade [NAME] [CHART]`             | Upgrade a Helm release |
| `helm list`                               | List Helm releases in the cluster |
