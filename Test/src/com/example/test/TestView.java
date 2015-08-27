package com.example.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View {

	public TestView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void onMeasure(int measuredWidth, int measuredHeight) {
		// TODO Auto-generated method stub
		super.onMeasure(measuredWidth, measuredHeight);
		setMeasuredDimension(measuredWidth, measuredHeight);
		
	}
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();// new一个画笔
		  paint.setColor(Color.RED);// 设置画笔颜色
		  paint.setStyle(Style.FILL);// 设置画笔填充
		  canvas.drawCircle(50, 50, 40, paint);// 用画笔在画布上添加一个圆，不只可以添加圆，还可以添加矩形等！
		  paint.setColor(Color.YELLOW);// 设置画笔颜色
		  canvas.drawText("LView", 50, 50, paint);// 用画笔在画布上添加文字，中间两个参数对应的是坐标。
		
	}

}
