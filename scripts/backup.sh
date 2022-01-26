#!/bin/bash
BUILD_PATH=$(ls /home/ec2-user/*.jar)
JAR_NAME=$(basename $BUILD_PATH)

TIME_STAMP=$(date +%Y%m%d%H%M%S)
mkdir /${TIME_STAMP}

mv /home/ec2-user/${JAR_NAME} /${TIME_STAMP}/

aws s3 cp /${TIME_STAMP}/ s3://pmj-backup-bucket/ --recursive
