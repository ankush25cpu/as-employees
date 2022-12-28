pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build') {
            steps {
               script {
                    bat 'mvn clean package'
                }

            }
        }
        stage('SonarQuve') {
            steps {
		    withSonarQubeEnv() {
			     bat "mvn clean verify sonar:sonar -Dsonar.projectKey=as-employees"
		    }
            }
        }
    }
}
	
