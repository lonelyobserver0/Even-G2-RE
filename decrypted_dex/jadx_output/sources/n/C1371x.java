package n;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC0997a;

/* renamed from: n.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1371x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f17628a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.d f17629b;

    public C1371x(TextView textView) {
        this.f17628a = textView;
        this.f17629b = new s2.d(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((Y3.a) this.f17629b.f20712b).l(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f17628a.getContext().obtainStyledAttributes(attributeSet, AbstractC0997a.f14402i, i3, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z2) {
        ((Y3.a) this.f17629b.f20712b).u(z2);
    }

    public final void d(boolean z2) {
        ((Y3.a) this.f17629b.f20712b).x(z2);
    }
}
