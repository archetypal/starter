# Introduction

Example template for command line application that may be packaged in a docker image.

# Deploy

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

# Run Local

```bash
java -jar target/git-api-jar-with-dependencies.jar https://github.com/dockcmd/aws-sh
```

# Test

```bash
curl http://localhost:8787/v1/aws-sh/README.md
```