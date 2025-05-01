pipeline {
    agent any
        
     environment {
        JAVA_HOME='C:/Program Files/Java/jdk-21'
        PATH='${JAVA_HOME}\\bin ${env.PATH};'
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo "Cloning repository..."
                git url: "${https://github.com/madhuk54/PDS_system.git}"
            }
        }

        stage('Build') {
            steps {
                echo "Building the project..."
                bat 'javac Aadhaar .java' 
            }
        }

        stage('Run') {
            steps {
                echo "Running the application..."
                bat 'java Aadhaar.java' 
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo ' Pipeline failed.'
        }
    }
}
