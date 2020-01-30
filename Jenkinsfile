node{
     
    stage('SCM Checkout'){
        git credentialsId: 'GIT_CREDENTIALS_NEW', url:  'https://github.com/sannaman/ms1.git',branch: 'master'
    }
    
    stage(" Maven Clean Package"){
      def mavenHome =  tool name: "Maven-3.6.3", type: "maven"
      def mavenCMD = "${mavenHome}/bin/mvn"
      sh "${mavenCMD} clean package"
      
    } 
    
    stage('Build Docker Image'){
        sh 'docker build -t sannaman/ms1:${BUILD_NUMBER} .'
    }
    
    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'DOKCER_HUB_PASSWORD', variable: 'DOKCER_HUB_PASSWORD')]) {
          sh "docker login -u sannaman -p ${DOKCER_HUB_PASSWORD}"
        }
        sh 'docker push sannaman/ms1:${BUILD_NUMBER}'
     }
   
      stage("Deploy To Kuberates Cluster"){
        sh 'kubectl apply -f k8s/ms1-deployment.yaml'
         sh 'kubectl set image deployments/ms1-deployment ms1=sannaman/ms1:${BUILD_NUMBER}'
      } 
      
      /**  
     stage("Deploy To Kuberates Cluster"){
       kubernetesDeploy(
         configs: 'ms1-deployment.yaml', 
         kubeconfigId: 'KUBERNATES_CONFIG',
         enableConfigSubstitution: true
        )
     }**/
	 
	 
}
