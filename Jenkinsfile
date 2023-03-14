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

         stage('Build Docker Image') {
            steps {
                sh 'docker build -t ashishkulkarni410/scientificcalculator:latest .'
            }
        }

        stage('Publish Docker Image') {
            steps {
                withDockerRegistry([ credentialsId: "docker-jenkins", url: "" ]) {
                    sh 'docker push ashishkulkarni410/scientificcalculator:latest'
                }
            }
        }

         stage('Clean Docker Images and Containers') {
             steps {
                 sh 'docker rm -f scientificcalculator'
                 sh 'docker rmi -f ashishkulkarni410/scientificcalculator:latest'
             }
         }

         stage('Deploy and Run Image'){
             steps {
                 ansiblePlaybook playbook: 'playbook.yml'
             }
         }
    }
}
