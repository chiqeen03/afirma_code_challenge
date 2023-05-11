# Code Challenge for Manuel Avalos

## Como ejecutar
Navegar al root del proyecto y ejecutar:
`mvn spring-boot:run`
El servicio va a estar corriendo en `http://localhost:8081`

O con una IDE acceder al archivo `src\main\java\com\chllg\restservice\RestServiceApplication.java` y ejecutar con el botón de play.

## Questions
1. ¿Qué estrategia utilizaría para manejar errores en la capa de controladores REST?
    - un bloque de try...catch para regresar un error genérico en la respuesta, y un sistema de monitoreo como sentry para tener más información del lado del developer.
2. ¿Cómo garantizaría la seguridad de la aplicación y sus datos?
    - Con un sistema de login por token como JWT o similares, con permisos específicos para cada usuario, y una base de datos privada en algún servidor en la nube.
3. ¿Qué es un endpoint de salud y cómo lo implementaría en este microservicio?
    - Un endpoint designado para revisar si el microservicio está corriendo, lo implementaría como un "/healtcheck" que regrese simplemente "Healthy".

# Fuentes
Debido a que estoy utilizando nuevas tecnologías para mi, me basé en código de tutoriales. Comparto las referencias aquí:
- https://spring.io/guides/gs/spring-boot/#initial
- https://spring.io/guides/gs/guides-with-vscode/
- https://www.edureka.co/blog/spring-tutorial/
- https://www.bezkoder.com/spring-boot-jpa-h2-example/
- https://stackoverflow.com/questions/47835901/how-to-start-up-spring-boot-application-via-command-line
