package coffeecode.co.learnbroadcastreceiver

import android.app.IntentService
import android.content.Intent
import android.util.Log

class DownloadService : IntentService("DownloadService") {

    companion object{
       const val TAG = "DownloadService"
    }

    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG, "Download Service dijalankan")
        if (intent != null){
            try {
                Thread.sleep(3000)
            }catch (e: InterruptedException){
                e.printStackTrace()
            }

            val notifyFinishIntent = Intent(MainActivity.ACTION_DOWNLOAD_STATUS)
            sendBroadcast(notifyFinishIntent)
        }
    }

}
