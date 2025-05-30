# SHOP INVENTORY MANAGEMENT SYSTEM


Writing an end 2 end solution for the application to test the end points for each scenarion on the acceptance criteria.

## Description

This project includes 20 different scenarios including happy paths.
Reusable code when suitable.
I made sure Lower and Upper camel case is used throughout the project.
A good test coverage including negatice test and boundary testing.
Scenarios are able to add, delete and update products.
I have also used google java format style to keep high standards

## Getting Started

* Test includes @Before which is used to login and authenticate details

### Dependencies

* cucumber
* Java
* Maven

### Installing

* git clone git@github.com:dwp6/ShopInventory.git
* Run from - mvn clean
* mvn test - run all the test from command line
* mvn install - Installs all dependencies needed

### Reporting
To view reporting - click on target, right click on cucumber-report.html, hover at open in and browser, select the browser.

### CICD
These test cases can be executed on a CI/CD pipeline by:
1. creating a docker image.
2. createing .gitlab-ci.yml file
3. To do that we need to follow the steps which include creating a yamel file  

### Executing program

* Right click on top of each scenario and click Run
* mvn test - run all the test from command line


## Branch control
Branch name to have the same standard
For UI changes branch should be: feat/add-find-job-title-ui-test
For API changes branch should be: feat/add-find-job-title-api-test

## Useful commands

* git status
* git add .
* git commit -m “[descriptive message]”

## Authors

Enis Kraja 

## Version History

* 0.3 
    * Update the Readme file     
* 0.2
    * Removing gitignote file
* 0.1
    * Initial push
