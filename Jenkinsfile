pipeline{
    agent any

    stages {
        stage ('Git Pull') {
            steps {
                git url: 'https://github.com/Ashish-A-Kulkarni/SPE_MINI_PROJECT.git',
                	branch: 'main'
            }
        }

         stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
         }

         stage('Build Docker Images') {
            steps {
                sh 'docker build -t ashishkulkarni/scientificCalculator:1.0 .'
            }
        }
    }
}