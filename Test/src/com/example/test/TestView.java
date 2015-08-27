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
		Paint paint = new Paint();// newһ������
		  paint.setColor(Color.RED);// ���û�����ɫ
		  paint.setStyle(Style.FILL);// ���û������
		  canvas.drawCircle(50, 50, 40, paint);// �û����ڻ��������һ��Բ����ֻ�������Բ����������Ӿ��εȣ�
		  paint.setColor(Color.YELLOW);// ���û�����ɫ
		  canvas.drawText("LView", 50, 50, paint);// �û����ڻ�����������֣��м�����������Ӧ�������ꡣ
		
	}

}
