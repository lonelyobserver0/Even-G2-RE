package androidx.preference.internal;

import C1.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.IntCompanionObject;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public int f9994a;

    /* renamed from: b, reason: collision with root package name */
    public int f9995b;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9994a = IntCompanionObject.MAX_VALUE;
        this.f9995b = IntCompanionObject.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1042h, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, IntCompanionObject.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, IntCompanionObject.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f9995b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f9994a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i3);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i3 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i3) {
        this.f9995b = i3;
        super.setMaxHeight(i3);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i3) {
        this.f9994a = i3;
        super.setMaxWidth(i3);
    }
}
