package com.yalantis.ucrop.view.widget;

import Ja.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.stub.StubApp;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f13024a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f13025b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13026c;

    /* renamed from: d, reason: collision with root package name */
    public float f13027d;

    /* renamed from: e, reason: collision with root package name */
    public String f13028e;

    /* renamed from: f, reason: collision with root package name */
    public float f13029f;

    /* renamed from: g, reason: collision with root package name */
    public float f13030g;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13024a = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3464a);
        setGravity(1);
        this.f13028e = obtainStyledAttributes.getString(0);
        this.f13029f = obtainStyledAttributes.getFloat(1, 0.0f);
        float f10 = obtainStyledAttributes.getFloat(2, 0.0f);
        this.f13030g = f10;
        float f11 = this.f13029f;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.f13027d = 0.0f;
        } else {
            this.f13027d = f11 / f10;
        }
        this.f13026c = getContext().getResources().getDimensionPixelSize(2131100039);
        Paint paint = new Paint(1);
        this.f13025b = paint;
        paint.setStyle(Paint.Style.FILL);
        f();
        e(getResources().getColor(2131034400));
        obtainStyledAttributes.recycle();
    }

    public final void e(int i3) {
        Paint paint = this.f13025b;
        if (paint != null) {
            paint.setColor(i3);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i3, getContext().getColor(2131034399)}));
    }

    public final void f() {
        if (!TextUtils.isEmpty(this.f13028e)) {
            setText(this.f13028e);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.f13029f) + StubApp.getString2(478) + ((int) this.f13030g));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f13024a);
            float f10 = (r0.right - r0.left) / 2.0f;
            float f11 = r0.bottom - (r0.top / 2.0f);
            int i3 = this.f13026c;
            canvas.drawCircle(f10, f11 - (i3 * 1.5f), i3 / 2.0f, this.f13025b);
        }
    }

    public void setActiveColor(int i3) {
        e(i3);
        invalidate();
    }

    public void setAspectRatio(La.a aVar) {
        this.f13028e = aVar.f4379a;
        float f10 = aVar.f4380b;
        this.f13029f = f10;
        float f11 = aVar.f4381c;
        this.f13030g = f11;
        if (f10 == 0.0f || f11 == 0.0f) {
            this.f13027d = 0.0f;
        } else {
            this.f13027d = f10 / f11;
        }
        f();
    }
}
