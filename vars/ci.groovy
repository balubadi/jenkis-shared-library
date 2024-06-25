def call() {
    node {

        common.codeCheckout()

        if (app_type == "nodejs") {
            stage('Download Dependencies') {
                sh 'npm install'
            }
        }


        if (env.JOB_BASE_NAME ==~ "PR.*") {
            sh 'echo PR'
            stage('Test Cases') {
                //sh 'npm test'
            }

            stage('Code Quality') {
                echo ' code quality...'
            }

        } else if (env.BRANCH_NAME == "main") {
            sh 'echo main'
            stage('Build') {}
        } else if (env.TAG_NAME ==~ ".*") {
            sh 'echo TAG'
            stage('Build') {
                echo 'Build...'
            }


            stage('Release App') {
                echo 'Release the buid to artifactory...'
            }
        } else {
            sh 'echo branch'
            stage('Test Cases') {
                //sh 'npm test'
                //These test cases in organization is ideally written and we dont skip this step. Since it is LAB, So we are moving further ahead.
            }
        }

    }
}