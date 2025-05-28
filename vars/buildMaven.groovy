def call() {
    stage('Build with Maven') {
        sh 'mvn clean package'
    }
}
