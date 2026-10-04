# Chatter Backend

Spring Boot REST API powering the Chatter platform.

This service manages user authentication, channel administration, message persistence, and communication between application users.

## ✨ Key Features

* User Management
* Channel Management
* Message Management
* RESTful API Design
* PostgreSQL Persistence
* OpenAPI / Swagger Documentation
* CORS Configuration

## 🏗️ Architecture

* Controller Layer
* Service Layer
* Repository Layer
* JPA Entity Model
* PostgreSQL Database

## 🛠️ Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* Swagger / OpenAPI

## 🔌 Main Endpoints

### Channels

```http
GET /api/channels
POST /api/channels
PUT /api/channels/{id}
PATCH /api/channels/{id}
DELETE /api/channels/{id}
```

### Users

```http
GET /api/users
GET /api/users/{id}
POST /api/users
```

### Messages

```http
GET /api/channels/{channelId}/messages
POST /api/channels/{channelId}/users/{userId}/messages
```

## 📦 Project Status

**Completed • Backend Module**
