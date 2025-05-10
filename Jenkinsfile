pipeline{
    tools{
        jdk 'Java 11'
        maven '3.3.9'
    }
    agent none
    stages {
        stage('Test'){
             agent any
             steps{
                 sh 'mvn test'
             }}

        stage('Package'){
             agent any
             steps{
                 sh 'mvn package'
             }
         }

    }
}