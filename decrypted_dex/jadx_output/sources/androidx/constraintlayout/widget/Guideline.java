package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import y.C1958d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i3) {
        C1958d c1958d = (C1958d) getLayoutParams();
        c1958d.f23219a = i3;
        setLayoutParams(c1958d);
    }

    public void setGuidelineEnd(int i3) {
        C1958d c1958d = (C1958d) getLayoutParams();
        c1958d.f23221b = i3;
        setLayoutParams(c1958d);
    }

    public void setGuidelinePercent(float f10) {
        C1958d c1958d = (C1958d) getLayoutParams();
        c1958d.f23223c = f10;
        setLayoutParams(c1958d);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
