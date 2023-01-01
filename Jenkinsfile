pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
               script {
                    sh 'mvn clean package'
                }

            }
        }
        /* stage('SonarQube') {
            steps {
		    withSonarQubeEnv('sonarqube-9.8') {
			     sh "mvn clean verify sonar:sonar -Dsonar.projectKey=as-employees"
		    }
            }
        } */
	stage('Build Docker Image') {
            steps {
                sh 'docker build -t ankushrat25/as-employee:1.0 .'
        	sh 'echo y| docker image prune'
            }
        }
	stage('Push Docker Image') {
            steps {
		withCredentials([string(credentialsId: 'GitHubPassword', variable: 'GitHubPassword')]) {
    			sh "docker login -u ankushrat25 -p ${GitHubPassword}"
		}
                sh 'docker push ankushrat25/as-employee:1.0'
            }
        }
	stage('Pull And Run Docker Image') {
            steps {
		sh 'docker run -d -p 8081:8080 --name employee-container ankushrat25/as-employee:1.0'
            }
        }

    }
}
	
