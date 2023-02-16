pipeline {
	agent none
  stages {
  	stage('Maven Install') {
    	agent {
      	docker {
        	image 'maven:3.8.4'
        }
      }
      steps {
      	sh 'mvn clean install'
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
          sh 'docker push spring-boot-cured'
      }
    }
  }
}