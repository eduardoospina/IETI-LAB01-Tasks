# IETI-LAB01-Tasks

## AUTOR.

> Eduardo Ospina Mejia



### Desplegando localmente.

En esta seccion se daran intrucciones de como descargar y correr localmente la API REST de users:

##### Requisitos:
1)   [Java 11](https://www.java.com/download/ie_manual.jsp) 
2)   [Git](https://git-scm.com/downloads) 
3)   IDE de java. (intellij o visual studio code)

##### Despliegue local API

para esto se siguen los siguientes pasos:

1) clonar el repositorio, ya se a traves de cmd o de GIT: 

	git clone https://github.com/eduardoospina/IETI-LAB01-Tasks.git

2) ingresamos al proyecto clonado y desde cmd hacer uso de gradle. 

```maven
	gradle build
      gradlew bootRun
```


3) Ejecutamos el proyecto utilizando los comandos en el cmd o corremos directamente desde la ide.


### Desarrollo:


##### Part 2: Implementing the Tasks Microservice RESTFUL API

    1) Follow the previous part steps
    2) Create a new package called dto and inside define your TaskDto object with at least the following fields:
	  - id
        - name
        - description
        - status ( TODO, DOING, REVIEW and DONE )
        - assignedTo
        - dueDate
        - createdAt
    3) Create a new package called entities and inside define your Task entity object with the same fields as the dto version:
    4) Create a new package called service and inside create the following interface:
    5) Create an implementation of the TaskService using a HashMap data structure inside.
    6) Make sure your service implementation TaskServiceHashMap is injectable using the @Service annotation.
    7) Implement your TaskController (Try to avoid copy paste, use the User Microservice as a reference but try doing it conciously).
    8) Test ALL the endpoints of your API using Insomnia.




##### Estructure: 

![](https://i.postimg.cc/hPndfZxb/estrucutura-tareas.png)

##### hashmap: 

![](https://i.postimg.cc/fR2tqwPB/implementacion-hashmap-tareas.png)

##### Controller:

![](https://i.postimg.cc/jdhJN64V/controller-tareas.png)



### Insomnia: 


##### getall()
![](https://i.postimg.cc/KzL1Yt8H/insomian-task-1.png)

##### create()
![](https://i.postimg.cc/90hrwz4F/insomian-task-2.png)

##### create()
![](https://i.postimg.cc/NFkL6YT8/insomian-task-3.png)

##### getall()
![](https://i.postimg.cc/Y264KNV4/insomian-task-4.png)

##### findbyid()
![](https://i.postimg.cc/FsG71rhN/insomian-task-5.png)

##### update()
![](https://i.postimg.cc/1zVtWDw3/insomian-task-6.png)

##### getall()
![](https://i.postimg.cc/0QgNhr0d/insomian-task-7.png)

##### delete()
![](https://i.postimg.cc/8cNzP337/insomian-task-8.png)

##### getall()
![](https://i.postimg.cc/TY23zzgS/insomian-task-9.png)
