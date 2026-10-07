# Chatter Backend

Backend service powering the Chatter platform.

---

$ Context

This module exposes the REST API responsible for authentication, channel management, message persistence and application business workflows.

---

$ What Was Built

> \> User management<br>
> \> Channel management<br>
> \> Message management<br>
> \> REST API endpoints<br>
> \> PostgreSQL persistence<br>
> \> OpenAPI documentation<br>
> \> CORS configuration<br>

---

$ Technical Stack

> \> Java 17<br>
> \> Spring Boot 3.2<br>
> \> Spring Data JPA<br>
> \> PostgreSQL<br>
> \> Maven<br>
> \> Swagger / OpenAPI<br>

---

$ Architecture

The backend follows a layered architecture separating controllers, services and repositories.

Business operations are exposed through REST endpoints while persistence is handled through Spring Data JPA and PostgreSQL.

---

$ Main Endpoints

```http
GET    /api/channels
POST   /api/channels
PUT    /api/channels/{id}
PATCH  /api/channels/{id}
DELETE /api/channels/{id}

GET    /api/users
GET    /api/users/{id}
POST   /api/users

GET    /api/channels/{channelId}/messages
POST   /api/channels/{channelId}/users/{userId}/messages
```

---

$ Project Status

> \> Completed backend module<br>
> \> Spring Boot REST API<br>
> \> PostgreSQL persistence<br>
