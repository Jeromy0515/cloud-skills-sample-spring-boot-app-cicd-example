#!/bin/bash

if [[ -n "$(netstat -ano | grep tcp | grep 8081)" ]];
then
  echo "Server is running"
  fuser -k -n tcp 8081
fi
