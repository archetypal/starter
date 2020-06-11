# Introduction

Example template for command line application that may be packaged in a docker image.

## Code Coverage

```bash
mvn jacoco:prepare-agent install jacoco:report
```

## Deploy

Docker image:

```bash
mvn clean package -DskipTests
docker build -t archetypal/example:v0.0.1 .
```

```bash
docker run --rm \
  -p 8787:8787 \
  archetypal/example:v0.0.1 World!
```

## Run Local

```bash
java -jar target/example-jar-with-dependencies.jar -h
```


## Test

```bash
curl http://localhost:8787/v1/aws-sh/README.md
```