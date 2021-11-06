pipeline {
  agent any
  stages {
    stage('maven compile') {
      parallel {
        stage('maven compile') {
          steps {
            bat 'cd \\Users\\Sergi\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\jenkins-homework_master && mvn clean test'
          }
        }

        stage('maven version') {
          steps {
            bat 'mvn -version'
          }
        }

      }
    }

  }
}