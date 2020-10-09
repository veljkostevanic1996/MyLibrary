import java.text.SimpleDateFormat

class Data {

    String getCurrentData(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        Data data = new Data()

        String time = dateFormat.format(data)
        return  time
    }
}
