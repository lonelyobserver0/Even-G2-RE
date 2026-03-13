package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.D1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9486a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9486a);
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : D1.m(context, resourceId));
        obtainStyledAttributes.recycle();
    }
}
