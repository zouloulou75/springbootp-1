# PostgreSQL Docker Setup

This folder runs a standalone PostgreSQL server for the project.

## Default credentials

- Host: `localhost`
- Port: `5434`
- Database: `springboot`
- User: `postgres`
- Password: `postgres`

## Start

1. Copy the environment file:

   ```bash
   cp .env.example .env
   ```

2. Start PostgreSQL:

   ```bash
   docker compose up -d
   ```

## Stop

```bash
docker compose down
```

## Notes

- Data is persisted in the Docker volume `postgres_data`.
- Default host port is `5434` to avoid conflicts with local services already using `5432` or `5433`.
