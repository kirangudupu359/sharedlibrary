def gitdownload(repo)
{
 git "https://github.com/IntelliqDevops/${repo}.git"
}

def Build()
{
 sh 'mvn package'
}
