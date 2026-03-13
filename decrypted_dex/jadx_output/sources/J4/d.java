package J4;

import D4.j;
import N.AbstractC0179z;
import N.B;
import N.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final c f3405d = new c();

    /* renamed from: a, reason: collision with root package name */
    public int f3406a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3407b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3408c;

    public d(Context context, AttributeSet attributeSet) {
        super(j.d(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1567a.f20338r);
        if (obtainStyledAttributes.hasValue(4)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            WeakHashMap weakHashMap = I.f4732a;
            B.k(this, dimensionPixelSize);
        }
        this.f3406a = obtainStyledAttributes.getInt(2, 0);
        this.f3407b = obtainStyledAttributes.getFloat(3, 1.0f);
        this.f3408c = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3405d);
        setFocusable(true);
    }

    public float getActionTextColorAlpha() {
        return this.f3408c;
    }

    public int getAnimationMode() {
        return this.f3406a;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3407b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = I.f4732a;
        AbstractC0179z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        super.onLayout(z2, i3, i10, i11, i12);
    }

    public void setAnimationMode(int i3) {
        this.f3406a = i3;
    }

    public void setOnAttachStateChangeListener(a aVar) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3405d);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(b bVar) {
    }
}
