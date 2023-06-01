FROM postgres:15.1-alpine

LABEL author="Wilfried SANON"
LABEL description="db local dev "
LABEL version="1.0"

ENV POSTGRES_USER=localdev
ENV POSTGRES_PASSWORD=devlocaldocker

EXPOSE 5432

COPY init.sql /docker-entrypoint-initdb.d/

#docker build -t board-local-img .
#docker run -d -p 5432:5432 --name board-local board-local-img
