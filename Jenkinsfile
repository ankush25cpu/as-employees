pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
               script {
                    bat 'mvn clean package'
                }

            }
        }
        /* stage('SonarQube') {
            steps {
		    withSonarQubeEnv('sonarqube-9.8') {
			     bat "mvn clean verify sonar:sonar -Dsonar.projectKey=as-employees"
		    }
            }
        } */
	stage('Build Docker Image') {
            steps {
                bat 'docker build -t ankushrat25/as-employee:1.0 .'
        	bat 'echo Y | docker image prune'
            }
        }
	stage('Push Docker Image') {
            steps {
		withCredentials([string(credentialsId: 'GitHubPassword', variable: 'GitHubPassword')]) {
    			bat "docker login -u ankushrat25 -p ${GitHubPassword}"
		}
                bat 'docker push ankushrat25/as-employee:1.0'
            }
        }
	stage('Pull And Run Docker Image') {
            steps {
                bat "docker stop employee-container || true"
		bat "docker rm employee-container || true"
		bat 'docker run -d -p 8080:8080 --name employee-container ankushrat25/as-employee:1.0'
            }
        }

    }
}
	
