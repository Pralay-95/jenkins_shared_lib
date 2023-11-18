// vars/downloadFromArtifactory.groovy
def call(String repoName, String artifactName, String destinationPath) {
    // Replace with actual JFrog CLI command to download artifact from Artifactory
    sh "jfrog rt dl ${repoName}/${artifactName} ${destinationPath}"
}
