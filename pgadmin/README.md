# pgAdmin Docker Setup

This folder runs `pgAdmin` as a standalone Docker service, separate from the main project.

It also preloads one server entry:

- Name: `spring boot`
- Host: `host.docker.internal`
- Port: `5432`
- User: `postgres`

## Start

1. Copy the environment file:

   ```bash
   cp .env.example .env
   ```

   Change `PGADMIN_PORT` in `.env` if the default port is already used.

2. Start the service:

   ```bash
   docker compose up -d
   ```

   If you already started `pgAdmin` before adding `servers.json`, reload it with:

   ```bash
   docker compose down -v
   docker compose up -d
   ```

3. Open `http://localhost:5051`

4. Log in with the values from `.env`
5. Open the preloaded `spring boot` server and enter your PostgreSQL password

## Stop

```bash
docker compose down
```

## Notes

- Data is persisted in the Docker volume `pgadmin_data`.
- This setup only starts `pgAdmin`; it does not start PostgreSQL.
- You can connect `pgAdmin` to any PostgreSQL server by adding a new server from the UI.
- Host port is configurable with `PGADMIN_PORT` in `.env`.
- `host.docker.internal` is mapped so `pgAdmin` can reach PostgreSQL running on your host machine.
