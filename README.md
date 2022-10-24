# eureka-service

<h1 align="center">*EJERCICIOS 24-1-22 | MICRO SERVICIOS CON M.ANGEL*</h1>

<h2>🚀 Tecnologías usadas:</h2>

* Spring Boot

<h2>💊 Dependencias usadas en el projecto eureka-service</h2>

* eureka-server: Dentro del pom de eureka-service.
* boot-starter: Dentro del pom eureka-service y product-service

<h2>💊 Dependencias usadas en el projecto product-service</h2>

* devTools: Dentro del pom de product-service para desplegar cambios automáticamente (útil en local).
* eureka-client: Dentro del pom de product-service (se conectará al eureka connect para registrar el servicio).
* web-starter: Dentro del pom de product-service.

<h3><i>Ejercicio propuesto:</i></h3>

<ol>
  <li>Levantar un servidor Eureka Server y acceder --> http://localhost:8761/ </li>
  <li>Levantar un servicio, conectado al Eureka server y comprobar que aparece la aplicación en Eureka Server.</li>
  <li>En el servicio agregar un endpoint que saque el puerto del servidor ---> http://localhost:8091/port </li>
</ol>

