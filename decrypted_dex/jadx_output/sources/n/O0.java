package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import h.AbstractC0997a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f17441a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17442b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17443c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17444d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f17445e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17446f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f17447g = new int[1];

    public static void a(View view, Context context) {
        String string2 = StubApp.getString2(16811);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0997a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e(StubApp.getString2("21235"), string2 + view.getClass() + StubApp.getString2("21236"));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList d8 = d(context, i3);
        if (d8 != null && d8.isStateful()) {
            return d8.getColorForState(f17442b, d8.getDefaultColor());
        }
        ThreadLocal threadLocal = f17441a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return F.a.d(c(context, i3), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i3) {
        int[] iArr = f17447g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f17447g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = D1.j(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
