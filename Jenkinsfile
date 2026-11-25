pipeline{
   agent any
   tools{
      maven 'maven_devops'
   }
   triggers{
      githubPush()
   }
   environment{
        POM="Calculos/pom.xml"
   }
   stages{
      stage('Descarga'){
         steps{
            git url:'https://github.com/kay220104/CalculadoraBasica2.git', branch:'main'
         }
      }
      stage('Compilacion'){
        steps{
            sh 'mvn -f $POM -B package'
        }
      }
      stage('Prueba'){
        steps{
            sh 'mvn -f $POM test'
        }
        post{
            always{
                junit 'Calculos/target/surefire-reports/*.xml'
            }
        }
      }
      stage('Empaquetado'){
        steps{
            archiveArtifacts artifacts: 'Calculos/target/*.jar', fingerprint:true
        }
      }  
   }
}
