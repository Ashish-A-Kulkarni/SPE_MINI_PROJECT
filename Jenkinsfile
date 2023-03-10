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
                sh 'mvn clean validate comipler:compile compiler:testCompile test packege install'
            }
         }

         stage('Build Docker Images') {
            steps {
                sh 'docker build -t ashishkulkarni/scientificCalculator:1.0 .'
            }
        }
    }
}
