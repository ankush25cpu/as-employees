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
                    // Get the Maven tool.
                    // ** NOTE: This 'M3' Maven tool must be configured
                    // **       in the global configuration.
                    
                    def mvnHome = tool 'Maven 3.8.6'
                    
                        bat(/"${mvnHome}\bin\mvn" clean package/)
                   
                }

            }
        }
        stage('Hello3') {
            steps {
                echo 'Hello World3 4'
            }
        }
    }
}
	