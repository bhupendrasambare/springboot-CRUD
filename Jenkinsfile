pipeline {
	agent none
  stages {
  	stage('Maven Install') {
      steps {
        options {catchError(message: "lint failed", buildResult: 'SUCCESS')}
      	sh 'mvn clean install'
      }
    }
    stage('Docker Kill') {
    	agent any
      options {catchError(message: "lint failed", buildResult: 'SUCCESS')}
      steps {
          sh 'docker ps -a -q  --filter ancestor=spring-boot-curd'
      }
    }
    stage('Docker Build') {
    	agent any
      options {catchError(message: "lint failed", buildResult: 'SUCCESS')}
      steps {
      	sh 'docker build -t spring-boot-cured .'
      }
    }
    stage('Docker Push') {
    	agent any
      options {catchError(message: "lint failed", buildResult: 'SUCCESS')}
      steps {
          sh 'docker run -d -p 8081:8081 spring-boot-curd'
      }
    }
  }
}