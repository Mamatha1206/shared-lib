def call() {
    stage('Checkout') {
        checkout scm
    }

    stage('Build with Maven') {
        sh 'mvn clean package'
    }
}
