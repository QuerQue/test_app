pipeline {
   agent any
      stages {
         stage('Preparing environment') {
            steps {
               echo 'Preparing environment'
            }
         }
         stage('Clone SCM') {
            steps {
               echo 'Clone SCM'
            }
         }
         stage('Build') {
            steps {
               echo 'Build'
               bat("mvn clean install -DskipTests")
            }
         }
         stage('Unit Tests') {
            steps {
               echo bat("mvn test")
            }
         }
         stage('Integration Tests') {
            steps {
               echo 'Integration Tests'
            }
         }
         stage('Sending results') {
            steps {
               echo 'Sending results'
            }
         }
      }
}
