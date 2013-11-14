#!/bin/bash
FAILED=0
ant -f tm-example/eGov/ant-testng-selenium/build.xml  
wget --server-response http://localhost:8080/wd/hub/status
echo "All Done, nothing done."
exit 0
