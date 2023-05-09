pipeline {
            agent any
            
    
            
            stages {
                        
                        stage('clonando repositorio') {
                    steps {
                        echo 'Clonando Repositorio'        
                    }
                        }
                        
                        
               
                        
                        
                            stage('maven build') {
                    steps {
                        sh 'mvn -version'
                    echo 'Hola pruebas de OpenShift'
                    sh 'mvn package'       
                    }
                        }
                        
                        
                        
            } // stages
        } // pipeline
