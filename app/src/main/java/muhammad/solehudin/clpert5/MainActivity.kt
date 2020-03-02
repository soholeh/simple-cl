package muhammad.solehudin.clpert5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView2.setOnClickListener({
            Toast.makeText(this, "Thanks!",Toast.LENGTH_LONG).show()
        })

        button2.setOnClickListener({
            Toast.makeText(this, "Soon!",Toast.LENGTH_LONG).show()
        })

        button.setOnClickListener({
            Toast.makeText(this, "Yeahhh!",Toast.LENGTH_LONG).show()
        })
    }
}
