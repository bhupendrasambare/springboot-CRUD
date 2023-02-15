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
        sh 'export MAVEN_HOME=/opt/homebrew/Cellar/maven/3.8.4/libexec'
        sh 'export PATH=$PATH:$MAVEN_HOME/bin'
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