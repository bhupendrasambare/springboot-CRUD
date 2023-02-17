node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/bhupendrasambare/springboot-CRUD'
  }

  stage("Compilation") {
    sh "./mvnw clean install"
  }

  steps {
    catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
      sh 'docker ps -a -q  --filter ancestor=spring-boot-curd'
    }
  }

  steps {
    catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
      sh 'docker build -t spring-boot-cured .'
    }
  }

  steps {
    catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
      sh 'docker run -d -p 8081:8081 spring-boot-curd'
    }
  }
}



// pipeline {
// 	agent none
//   stages {
//   	stage('Maven Install') {
//       steps {
//         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
//       	  sh 'mvn clean install'
//         }
//       }
//     }
//     stage('Docker Kill') {
//     	agent any
//       steps {
//         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
//           sh 'docker ps -a -q  --filter ancestor=spring-boot-curd'
//         }
//       }
//     }
//     stage('Docker Build') {
//     	agent any
//       steps {
//         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
//           sh 'docker build -t spring-boot-cured .'
//         }
//       }
//     }
//     stage('Docker Push') {
//     	agent any
//       steps {
//         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
//           sh 'docker run -d -p 8081:8081 spring-boot-curd'
//         }
//       }
//     }
//   }
// }