package n;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1300D extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C1296B f17395a;

    public C1300D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903777);
        O0.a(this, getContext());
        C1296B c1296b = new C1296B(this);
        this.f17395a = c1296b;
        c1296b.e(attributeSet, 2130903777);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Bitmap bitmap = (Bitmap) this.f17395a.f17363c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
