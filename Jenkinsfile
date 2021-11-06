pipeline {
  agent any
  stages {
    stage('maven compile') {
      steps {
        sh '''pipeline {
  agent any
  stages {
    stage(\'Compile Maven Project\') {
      parallel {
        stage(\'Compile Maven Project\') {
          steps {
            sh \'mvn compile\'
          }
        }
        stage(\'Maven Version\') {
          steps {
            sh \'mvn -version\'
          }
        }
      }
    }
  }
}'''
        }
      }

    }
  }