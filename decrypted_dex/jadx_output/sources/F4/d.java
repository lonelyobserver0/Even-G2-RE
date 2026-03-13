package F4;

import E.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f2221a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f2222b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2223c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2224d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2225e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorStateList f2226f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2227g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2228h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2229i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2230k = false;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2231l;

    public d(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC1567a.f20339s);
        this.f2221a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2222b = L1.o(context, obtainStyledAttributes, 3);
        L1.o(context, obtainStyledAttributes, 4);
        L1.o(context, obtainStyledAttributes, 5);
        this.f2223c = obtainStyledAttributes.getInt(2, 0);
        this.f2224d = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.j = obtainStyledAttributes.getResourceId(i10, 0);
        this.f2225e = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2226f = L1.o(context, obtainStyledAttributes, 6);
        this.f2227g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2228h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f2229i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2231l;
        int i3 = this.f2223c;
        if (typeface == null && (str = this.f2225e) != null) {
            this.f2231l = Typeface.create(str, i3);
        }
        if (this.f2231l == null) {
            int i10 = this.f2224d;
            if (i10 == 1) {
                this.f2231l = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f2231l = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f2231l = Typeface.DEFAULT;
            } else {
                this.f2231l = Typeface.MONOSPACE;
            }
            this.f2231l = Typeface.create(this.f2231l, i3);
        }
    }

    public final void b(Context context, AbstractC0624h2 abstractC0624h2) {
        a();
        int i3 = this.j;
        if (i3 == 0) {
            this.f2230k = true;
        }
        if (this.f2230k) {
            abstractC0624h2.q(this.f2231l, true);
            return;
        }
        try {
            b bVar = new b(this, abstractC0624h2);
            ThreadLocal threadLocal = l.f1716a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                l.a(context, i3, new TypedValue(), 0, bVar, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2230k = true;
            abstractC0624h2.p(1);
        } catch (Exception e10) {
            Log.d(StubApp.getString2(2011), StubApp.getString2(2010) + this.f2225e, e10);
            this.f2230k = true;
            abstractC0624h2.p(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, AbstractC0624h2 abstractC0624h2) {
        a();
        d(textPaint, this.f2231l);
        b(context, new c(this, textPaint, abstractC0624h2));
        ColorStateList colorStateList = this.f2222b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2226f;
        textPaint.setShadowLayer(this.f2229i, this.f2227g, this.f2228h, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i3 = (~typeface.getStyle()) & this.f2223c;
        textPaint.setFakeBoldText((i3 & 1) != 0);
        textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2221a);
    }
}
