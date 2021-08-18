jte {
  pipeline_template = "Jenkinsfile-maven"
}

libraries{
  git {
    url =  "https://infygithub.ad.infosys.com/DevOpsCoeOrg/java-maven.git"
    credentialsId = "subir_infygit_cred"
  }
  maven {
    settingsXmlCred = "settings_xml"
  }
  sonarqube {
    sonarToken = "sonar_token"
  }
  jfrog {
    credentialId = "settings_xml"
  }
  docker {
    registry_cred = "infyartifactory_cred"
  }
}
