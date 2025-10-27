pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                sh "mvn compile"
            }
        }

        stage("Test") {
            steps {
                wrap([$class: "Xvfb", debug: true, autoDisplayName: true]) {
                    sh "mvn test"
                }
            }
        }

		stage("Publish Extent Report") {
            steps {
                publishHTML(target: [
                    reportDir: 'test-output',         // Folder where your report is saved
                    reportFiles: 'ExtentReport.html', // Name of your HTML file
                    reportName: 'Extent Report',      // Name shown in Jenkins sidebar
                    keepAll: true,                    // Keep reports for all builds
                    alwaysLinkToLastBuild: true
                ])
            }
    }
}