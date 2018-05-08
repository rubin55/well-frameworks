# A simple Spring Boot based java application

To create the keystore.p12, in the java-springboot directory, execute the following:

`keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 365`

To access the application:

`GET https://localhost:8443/hello`

`GET https://localhost:8443/hello/rubin`
