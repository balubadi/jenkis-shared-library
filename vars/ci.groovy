def call() {
    pipeline {
        agent {
            node { label 'workstation' }
        }

        tages {

            stage('Compile') {
                expression { BRANCH_NAME == "main" }
                steps {
                    echo 'Compile'
                }
            }
        }
    }
}
