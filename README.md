# Profile API — Spring Boot

A  RESTful API that returns profile information, current date/time and a random cat fact and hosted on railway. 

## Clone repo
git clone https://github.com/van2jazz/hng_endpoint.git
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
    "email": "van2jazz@gmail.com",
    "name": "Balogun Dayo",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-20T12:34:56.789Z",
  "fact": "Cats sleep for 70% of their lives."
}



