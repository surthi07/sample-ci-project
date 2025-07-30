pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'  // Name must match what you configure in Jenkins global tools
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/sample-ci-project.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
