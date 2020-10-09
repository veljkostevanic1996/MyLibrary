import java.text.SimpleDateFormat

class JenkinsData {

    String getCurrentData(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        Date data = new Date()

        String time = dateFormat.format(data)
        return  time
    }
}
