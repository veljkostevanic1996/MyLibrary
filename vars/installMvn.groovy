
def install(){

    def pom = "mvn clean install".execute()
    return pom.toString()
}
