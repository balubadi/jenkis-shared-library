pipeline {
    agent any
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world 12!'
            }
        }
        stage('Stage 2') {
            steps {
                echo 'Hello world 23!'
            }
        }
        stage('Stage 3') {
            steps {
                echo 'Hello world 34!'
            }
        }
        stage('Stage 4') {
            steps {
                echo 'Hello world 4!'
            }
        }
    }
}