# Profile API — Spring Boot

A  RESTful API that returns profile information, current date/time and a random cat fact. It is hosted on railway. 

## Clone repo
git clone https://github.com/<your-username>/profile-api.git
cd profile-api

## Run Locally
mvn spring-boot:run

## 🚀 Endpoint
**GET** `/me`

### ✅ Response Format
```json
{
  "status": "success",
  "user": {
    "email": "your.email@example.com",
    "name": "Your Full Name",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-20T12:34:56.789Z",
  "fact": "Cats sleep for 70% of their lives."
}



