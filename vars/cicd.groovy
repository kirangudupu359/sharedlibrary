def gitdownload(repo)
{
 git "https://github.com/IntelliqDevops/${repo}.git"
}

def Build()
{
 sh 'mvn package'
}

def Deployment(name,ipaddress,location)
{
 sh "scp /var/lib/jenkins/workspace/${name}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${location}"
}

def runselenium(name)
{
 sh "java -jar  /var/lib/jenkins/workspace/${name}/testing.jar"
}
