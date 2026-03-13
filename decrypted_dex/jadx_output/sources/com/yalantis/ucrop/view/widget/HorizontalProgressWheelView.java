package com.yalantis.ucrop.view.widget;

import Pa.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f13031a;

    /* renamed from: b, reason: collision with root package name */
    public a f13032b;

    /* renamed from: c, reason: collision with root package name */
    public float f13033c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f13034d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f13035e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13036f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13037g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13038h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public float f13039k;

    /* renamed from: l, reason: collision with root package name */
    public int f13040l;

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13031a = new Rect();
        this.f13040l = getContext().getColor(2131034403);
        this.f13036f = getContext().getResources().getDimensionPixelSize(2131100043);
        this.f13037g = getContext().getResources().getDimensionPixelSize(2131100031);
        this.f13038h = getContext().getResources().getDimensionPixelSize(2131100034);
        Paint paint = new Paint(1);
        this.f13034d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f13034d.setStrokeWidth(this.f13036f);
        this.f13034d.setColor(getResources().getColor(2131034395));
        Paint paint2 = new Paint(this.f13034d);
        this.f13035e = paint2;
        paint2.setColor(this.f13040l);
        this.f13035e.setStrokeCap(Paint.Cap.ROUND);
        this.f13035e.setStrokeWidth(getContext().getResources().getDimensionPixelSize(2131100044));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f13031a;
        canvas.getClipBounds(rect);
        int width = rect.width() / (this.f13036f + this.f13038h);
        float f10 = this.f13039k % (r4 + r3);
        for (int i3 = 0; i3 < width; i3++) {
            int i10 = width / 4;
            if (i3 < i10) {
                this.f13034d.setAlpha((int) ((i3 / i10) * 255.0f));
            } else if (i3 > (width * 3) / 4) {
                this.f13034d.setAlpha((int) (((width - i3) / i10) * 255.0f));
            } else {
                this.f13034d.setAlpha(255);
            }
            float f11 = -f10;
            canvas.drawLine(rect.left + f11 + ((this.f13036f + this.f13038h) * i3), rect.centerY() - (this.f13037g / 4.0f), f11 + rect.left + ((this.f13036f + this.f13038h) * i3), rect.centerY() + (this.f13037g / 4.0f), this.f13034d);
        }
        canvas.drawLine(rect.centerX(), rect.centerY() - (this.f13037g / 2.0f), rect.centerX(), (this.f13037g / 2.0f) + rect.centerY(), this.f13035e);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13033c = motionEvent.getX();
            return true;
        }
        if (action == 1) {
            a aVar = this.f13032b;
            if (aVar != null) {
                this.j = false;
                aVar.a();
            }
        } else if (action == 2) {
            float x7 = motionEvent.getX() - this.f13033c;
            if (x7 != 0.0f) {
                if (!this.j) {
                    this.j = true;
                    a aVar2 = this.f13032b;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                this.f13039k -= x7;
                postInvalidate();
                this.f13033c = motionEvent.getX();
                a aVar3 = this.f13032b;
                if (aVar3 != null) {
                    aVar3.b(-x7);
                    return true;
                }
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i3) {
        this.f13040l = i3;
        this.f13035e.setColor(i3);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f13032b = aVar;
    }
}
