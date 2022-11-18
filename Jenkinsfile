pipeline {
	environment {
		DOCKERHUB_CREDENTIALS=credentials('dockerhub')
	    }
	agent any
	stages {
		stage ('Build docker image Including build gradle') {
			steps {
				sh ' docker build -t wsanon19/boardperso-back:latest .'
			}
		}
		stage('Login to dockerhub') {
			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}
		stage('Publish to dockerhub') {
			steps {
				sh 'docker push wsanon19/boardperso-back:latest'
			}
		}
    }
}
