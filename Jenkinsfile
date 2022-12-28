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
		    withSonarQubeEnv('sonarqube-9.8') {
			    bat 'mvn sonar:sonar'
            }
        }
    }
}
	
