package sheridan.bajajku.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sheridan.bajajku.paintapp.PaintView.Companion.currentBrush
import sheridan.bajajku.paintapp.ui.theme.PaintAPPTheme

class MainActivity : ComponentActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val greenBtn = findViewById<ImageButton>(R.id.greenColor)

        redBtn.setOnClickListener {
            paintBrush.setColor(Color.RED)
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            paintBrush.setColor(Color.BLUE)
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            paintBrush.setColor(Color.BLACK)
            currentColor(paintBrush.color)
        }
        greenBtn.setOnClickListener {
            paintBrush.setColor(Color.GREEN)
            currentColor(paintBrush.color)
        }

    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}


