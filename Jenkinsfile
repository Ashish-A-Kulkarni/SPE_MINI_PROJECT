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

//         stage('Clean Docker Images') {
//             steps {
//                 sh 'docker rmi -f inspiringrai/calcproj:latest'
//             }
//         }
//
//         stage('Deploy and Run Image'){
//             steps {
//                 ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
//             }
//         }
    }
}
