Continuous Integration
======================
This is the CI build.  To test locally, build image and run:

```
docker build -t archetypal/ui-web .
docker run -d -p 80:4111 archetypal/ui-web
```

For testing, use (within docker-machine):
```
docker run --rm -ti -p 80:80 archetypal/ui-web
```


Configuration
=============
The default inplementation has two configuration files, nginx.conf which is in /etc/nginx and 
default.conf which is in /etc/nginx/conf.d  These two files are in this repo with .orig as the suffix.

