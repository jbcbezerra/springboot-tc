#!/bin/bash
docker run --name dev-mysql \
 --rm -it \
 -p 3306:3306 \
 -e "MYSQL_ROOT_PASSWORD=d0N#t73L1n08o|)y" \
 -e MYSQL_USER=my_app \
 -e MYSQL_PASSWORD=se3ret \
 -e MYSQL_DATABASE=my_app \
 -d mysql:8.0.33