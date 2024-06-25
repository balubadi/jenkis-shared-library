def call() {
    pipeline {
        agent {
            node { label 'workstation' }
        }

        stages {

            stage('Compile') {
                expression { BRANCH_NAME == "main" }
                steps {
                    echo 'Compile'
                }
            }
        }
    }
}
