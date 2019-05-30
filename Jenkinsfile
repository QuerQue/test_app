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
         stage('Sonar analysis') {
            steps {
               echo 'Sonar analysis'
               bat("mvn sonar:sonar")
            }
         }
         stage('Sending raport') {
            steps {
               echo 'Sending results'
            }
         }
      }
}
