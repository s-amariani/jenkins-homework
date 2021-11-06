pipeline {
  agent any
  stages {
    stage('maven compile') {
      steps {
        bat 'cd jenkins-homework && mvn clean test'
      }
    }

  }
}