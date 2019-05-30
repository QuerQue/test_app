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
               bat("git clone https://github.com/QuerQue/test_app.git")
            }
         }
         stage('Deploy') {
            steps {
               echo 'Deploy'
               bat("mvn clean deploy -DskipTests")
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
