The sensor measures the temperature of the surrounding air and can determine whether it is raining or not.
The sensor has access to the Internet, so it can send HTTP requests to our server.
Every time it makes a measurement, it will send an HTTP request with data in JSON format to our server - for this, in real life, we would specify the IP address of the computer where we run Spring
REST API application. After that, we will be able to receive requests from the sensor on our computer.
Since we don't have a real sensor, it will serve as a sensor
perform our own computer!
The project is divided into 2 parts: 
1.Application REST API using Spring REST
2.A Java client that sends data to the REST API application - using the RestTemplate class.