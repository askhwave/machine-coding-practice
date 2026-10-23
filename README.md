# machine-coding-practice

Spring Boot playground for machine-coding interview practice.

## Stack

Java 21 · Spring Boot 3.5 · Maven

## Structure

```
src/main/java/com/codekatha/machinecodingpractice/
  logstreamer/
    controller/   -> REST endpoints
    service/      -> business logic
    model/        -> data classes
    config/       -> Spring configuration (WebSocket, etc.)
```

Each new problem gets its own top-level package under `machinecodingpractice/`, same shape as `logstreamer/` (controller/service/model/config).

## What's built so far

**logstreamer** — tails a log file and streams new lines to the browser in real time over WebSocket (STOMP).

- `POST /logs/start` — starts writing dummy log lines and watching the file
- Open `index.html` (served from `static/`) to see lines stream in live

## Run

```bash
./mvnw spring-boot:run
```

Then open `http://localhost:8080/index.html`.

## Notes

- `spring-boot-starter-validation` and `lombok` are already in `pom.xml`, ready to use whenever a problem needs them.
- `log.file.path` in `application.properties` is a hardcoded absolute path — update it if this folder ever moves.
