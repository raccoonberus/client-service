#!/usr/bin/env bash

# Test
mvn spring-boot:run --debug
curl -i --header "content-type: text/xml" -d @src/test/resources/ws-samples/saveCommissionSchedulePlanRequest.xml -X POST http://localhost:8051/ws