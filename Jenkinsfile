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
               sh 'mvn clean install'
            }
        }
        stage('Hello3') {
            steps {
                echo 'Hello World3 4'
            }
        }
    }
}
	