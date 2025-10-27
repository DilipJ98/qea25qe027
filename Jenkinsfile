pipeline {
	agent  any
	
	stages {
		stage("Build") {
			steps {
				"mvn compile"
			}	
		}
		
		stage("Test") {
			steps {
				wrap([$class: 'Xvfb']) {
					"mvn test"
				}
			}
		}
		
		stage("Publish") {
			steps {
				testNG()
			}
		}
	}
}