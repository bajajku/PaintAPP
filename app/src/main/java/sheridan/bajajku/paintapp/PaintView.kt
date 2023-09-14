package sheridan.bajajku.paintapp

import android.content.Context
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class PaintView : View {

    companion object{
        var pathList = ArrayList<Path>()
        var colorList = ArrayList<Int>()
    }
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    }