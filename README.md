# Spring Boot User Registration and Fetch API with H2 Database

## Running the Application

1. Clone the repository:
    ```
    git clone <repository_url>
    cd <repository_directory>
    ```

2. Build and run the application:
    ```
    ./mvnw spring-boot:run
    ```

## API Endpoints

### Register User

- URL: `/api/user/register`
- Method: `POST`
- Request Body:
    ```json
    {
        "username": "testuser",
        "email": "testuser@example.com",
        "password": "password"
    }
    ```
- Response: `200 OK` if successful

### Fetch User

- URL: `/api/user/fetch?username=testuser`
- Method: `GET`
- Response:
    ```json
    {
        "username": "testuser",
        "email": "testuser@example.com",
        "password": "password"
    }
    ```

## H2 Database Console

Access the H2 console at:
