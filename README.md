## To run tests and generate Allure report:

* use maven command: `mvn clean test`

## To access the report manually:
1. Generate the report by running: `mvn allure:report`
2. Use an HTTP server to expose the content of `target/site/allure-maven-plugin/` <br/>
   In [Intellij IDEA], you can access the report by opening `target/site/allure-maven-plugin/index.html` in a browser

## To access the report automatically:
To Generate and open the report in your default browser run: `mvn allure:serve`