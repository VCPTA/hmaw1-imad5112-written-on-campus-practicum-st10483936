package vcmsa.ci.myapplicatio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val inputplaylist = findViewById<Button>(R.id.btnAddplaylist)
        val songInput = findViewById<TextView>(R.id.txtSonginput)
        val artistinput = findViewById<TextView>(R.id.txtArtistinput)

        //Component validation
        inputplaylist.isActivated
        if (songInput.isActivated){
            "controller"
            "isitacrime"
            "belongtogether"
            "myboo"
        }else{artistinput
            "mawhoo"
            "rema"
            "kabza"
            "maphorisa"
        }
//        if (ratinginput.isActivated)

        {
        }
        // add to paralleL arrays
        songInput.isActivated
        artistinput.isActivated
//        ratinginput.isActivated


        //validation
        val string = "controller"
        "isitacrime"
        "belongtogether"
        "myboo"
    }
}
