pipeline {
	agent none
  stages {
  	stage('Maven Install') {
      steps {
      	sh 'mvn clean install'
      }
    }
    stage('Docker Kill') {
    	agent any
      steps {
          sh 'docker ps -a -q  --filter ancestor=spring-boot-curd'
      }
    }
    stage('Docker Build') {
    	agent any
      steps {
      	sh 'docker build -t spring-boot-cured .'
      }
    }
    stage('Docker Push') {
    	agent any
      steps {
          sh 'docker run -d -p 8081:8081 spring-boot-curd'
      }
    }
  }
}