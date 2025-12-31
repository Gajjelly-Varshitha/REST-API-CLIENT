# REST-API-CLIENT

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: GAJJELLY VARSHITHA

*INTERN ID*: CTIS0641

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

##DESCRIPTION

This project involves the development of a Java-based REST API client that consumes data from a public web service and presents the information in a structured and readable format. The main objective of the application is to demonstrate how Java can be used to interact with RESTful web services by sending HTTP requests, handling responses, and parsing JSON data. REST (Representational State Transfer) APIs are widely used in modern software applications for communication between client and server, making this project highly relevant for real-world development.

The application uses a public weather REST API, specifically the Open-Meteo Weather API, which provides real-time weather information such as temperature, wind speed, and weather conditions. One of the key advantages of using this API is that it does not require an API key, making it ideal for academic projects and learning purposes. The application sends an HTTP GET request to the API endpoint using Java’s HttpURLConnection class. This class is part of the standard Java library and allows the client to establish a connection with the server, specify the request method, and retrieve the response.

Once the connection is successfully established, the application reads the response data using InputStreamReader and BufferedReader. The response returned by the API is in JSON (JavaScript Object Notation) format, which is commonly used for data exchange due to its lightweight and easy-to-read structure. To process this response, the program uses the org.json library, which simplifies JSON parsing in Java. The JSON response is converted into a JSONObject, allowing individual data fields to be accessed easily.

The program specifically extracts weather-related information such as current temperature, wind speed, and weather code from the JSON object. These values are then displayed in a structured format on the console, making the output clear and user-friendly. Proper formatting ensures that the data is easy to understand and visually organized, which is an important aspect of client-side applications.

The application also includes basic exception handling to manage potential runtime errors such as network issues, invalid responses, or input/output failures. This ensures that the program does not terminate unexpectedly and helps in debugging errors efficiently. The use of Maven for dependency management further enhances the project by simplifying library inclusion and ensuring compatibility across different environments.

This project demonstrates essential concepts such as REST API consumption, HTTP communication, JSON parsing, and console-based data presentation using Java. It is suitable for beginners as well as intermediate learners who want hands-on experience with web services.
