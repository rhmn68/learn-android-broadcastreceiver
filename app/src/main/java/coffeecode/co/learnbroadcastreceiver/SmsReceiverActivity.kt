package coffeecode.co.learnbroadcastreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sms_receiver.*

class SmsReceiverActivity : AppCompatActivity() {

    private var senderNo: String? = null
    private var senderMessage: String? = null

    companion object{
        val EXTRA_SMS_NO = "extra_sms_no"
        val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)

        title = "Incoming Message"

        setView()
        onClick()
    }

    private fun setView() {
        senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)

        tvNo.text = senderNo
        tvMessage.text = senderMessage
    }

    private fun onClick() {
        btnClose.setOnClickListener {

        }
    }
}
