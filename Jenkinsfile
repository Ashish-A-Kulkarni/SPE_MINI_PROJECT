pipeline{
    agent any

    stages {
        stage ('Git Pull') {
            steps {
                git url: 'https://github.com/Ashish-A-Kulkarni/SPE_MINI_PROJECT.git',
                	branch: 'master'
            }
        }

         stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
         }

         stage('Build Docker Images') {
            steps {
                sh 'docker build -t ashishkulkarni/scientificcalculator:1.0 .'
            }
        }
    }
}
