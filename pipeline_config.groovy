libraries{
  git {
    url =  "https://infygithub.ad.infosys.com/DevOpsCoeOrg/java-maven.git"
    credentialsId = "subir_infygit_cred"
  }
  maven
  sonarqube {
    sonarTokenCred = "sonar_token"
  }
  jfrog {
    credentialId = "artifactory_API_key"
    releaseRepo = "devopscoe-maven-virtual"
    snapshotRepo = "devopscoe-maven-virtual"
  }
}