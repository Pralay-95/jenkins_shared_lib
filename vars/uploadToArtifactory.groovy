// vars/uploadToArtifactory.groovy
def call(String artifactPath, String repoName) {
    // Replace with actual JFrog CLI command to upload artifact to Artifactory
    sh "jfrog rt u ${artifactPath} ${repoName}/"
}
