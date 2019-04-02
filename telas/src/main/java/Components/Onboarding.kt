package Components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import com.example.customcommand.R

class Onboarding @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    //Background color
    private var pageBackgroundColor: Int = 0
    private val paint = Paint()
    private val backgroundRect = Rect(0,0,0,0)
    //Background color

    init{
        initialize(attrs)
    }

    private fun initialize(attrs: AttributeSet?){

        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.Onboarding)
        pageBackgroundColor = typeArray.getColor(R.styleable.Onboarding_pageBackgroundColor,Color.LTGRAY)

        //libera essa memoria se não vai dar erro la na frente weeee
        typeArray.recycle()

    }



    override fun onDraw(canvas: Canvas) {
        //não tem nada no super, então não precisa chamar o super
        val paint = Paint()

        paint.color = Color.BLACK

        canvas.drawRect(Rect(0,0,200,200),paint)

    }

    private fun dpToPx(value:Float)=
            TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, resources.displayMetrics)

}