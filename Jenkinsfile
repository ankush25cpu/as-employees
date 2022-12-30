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
            }
        }
	stage('Build Push Image') {
            steps {
                bat 'docker push ankushrat25/as-employee:1.0'
            }
        }

    }
}
	
