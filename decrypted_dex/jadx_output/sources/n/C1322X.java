package n;

import a.AbstractC0378a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import h.AbstractC0997a;
import java.lang.ref.WeakReference;

/* renamed from: n.X, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1322X {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f17471a;

    /* renamed from: b, reason: collision with root package name */
    public Q0 f17472b;

    /* renamed from: c, reason: collision with root package name */
    public Q0 f17473c;

    /* renamed from: d, reason: collision with root package name */
    public Q0 f17474d;

    /* renamed from: e, reason: collision with root package name */
    public Q0 f17475e;

    /* renamed from: f, reason: collision with root package name */
    public Q0 f17476f;

    /* renamed from: g, reason: collision with root package name */
    public Q0 f17477g;

    /* renamed from: h, reason: collision with root package name */
    public Q0 f17478h;

    /* renamed from: i, reason: collision with root package name */
    public final C1332d0 f17479i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f17480k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f17481l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17482m;

    public C1322X(TextView textView) {
        this.f17471a = textView;
        this.f17479i = new C1332d0(textView);
    }

    public static Q0 c(Context context, C1365u c1365u, int i3) {
        ColorStateList f10;
        synchronized (c1365u) {
            f10 = c1365u.f17620a.f(context, i3);
        }
        if (f10 == null) {
            return null;
        }
        Q0 q02 = new Q0();
        q02.f17458b = true;
        q02.f17459c = f10;
        return q02;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i3 >= 30) {
            G.a.f(editorInfo, text);
            return;
        }
        text.getClass();
        if (i3 >= 30) {
            G.a.f(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            AbstractC0378a.A(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            AbstractC0378a.A(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0378a.A(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int min = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
        int min2 = Math.min(i12, i16 - min);
        int i17 = i12 - min2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
            min--;
        }
        int i18 = min2 + i15;
        AbstractC0378a.A(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i10, min + i10)) : text.subSequence(i17, i18 + min + i17), min2, i18);
    }

    public final void a(Drawable drawable, Q0 q02) {
        if (drawable == null || q02 == null) {
            return;
        }
        C1365u.e(drawable, q02, this.f17471a.getDrawableState());
    }

    public final void b() {
        Q0 q02 = this.f17472b;
        TextView textView = this.f17471a;
        if (q02 != null || this.f17473c != null || this.f17474d != null || this.f17475e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f17472b);
            a(compoundDrawables[1], this.f17473c);
            a(compoundDrawables[2], this.f17474d);
            a(compoundDrawables[3], this.f17475e);
        }
        if (this.f17476f == null && this.f17477g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f17476f);
        a(compoundDrawablesRelative[2], this.f17477g);
    }

    public final ColorStateList d() {
        Q0 q02 = this.f17478h;
        if (q02 != null) {
            return (ColorStateList) q02.f17459c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        Q0 q02 = this.f17478h;
        if (q02 != null) {
            return (PorterDuff.Mode) q02.f17460d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1322X.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0997a.f14415w);
        a5.c cVar = new a5.c(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f17471a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, cVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC1320V.d(textView, string);
        }
        cVar.I();
        Typeface typeface = this.f17481l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f17478h == null) {
            this.f17478h = new Q0();
        }
        Q0 q02 = this.f17478h;
        q02.f17459c = colorStateList;
        q02.f17458b = colorStateList != null;
        this.f17472b = q02;
        this.f17473c = q02;
        this.f17474d = q02;
        this.f17475e = q02;
        this.f17476f = q02;
        this.f17477g = q02;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.f17478h == null) {
            this.f17478h = new Q0();
        }
        Q0 q02 = this.f17478h;
        q02.f17460d = mode;
        q02.f17457a = mode != null;
        this.f17472b = q02;
        this.f17473c = q02;
        this.f17474d = q02;
        this.f17475e = q02;
        this.f17476f = q02;
        this.f17477g = q02;
    }

    public final void k(Context context, a5.c cVar) {
        String string;
        int i3 = this.j;
        TypedArray typedArray = (TypedArray) cVar.f9283c;
        this.j = typedArray.getInt(2, i3);
        int i10 = typedArray.getInt(11, -1);
        this.f17480k = i10;
        if (i10 != -1) {
            this.j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f17482m = false;
                int i11 = typedArray.getInt(1, 1);
                if (i11 == 1) {
                    this.f17481l = Typeface.SANS_SERIF;
                    return;
                } else if (i11 == 2) {
                    this.f17481l = Typeface.SERIF;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f17481l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f17481l = null;
        int i12 = typedArray.hasValue(12) ? 12 : 10;
        int i13 = this.f17480k;
        int i14 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface t3 = cVar.t(i12, this.j, new C1318T(this, i13, i14, new WeakReference(this.f17471a)));
                if (t3 != null) {
                    if (this.f17480k != -1) {
                        this.f17481l = AbstractC1321W.a(Typeface.create(t3, 0), this.f17480k, (this.j & 2) != 0);
                    } else {
                        this.f17481l = t3;
                    }
                }
                this.f17482m = this.f17481l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f17481l != null || (string = typedArray.getString(i12)) == null) {
            return;
        }
        if (this.f17480k != -1) {
            this.f17481l = AbstractC1321W.a(Typeface.create(string, 0), this.f17480k, (this.j & 2) != 0);
        } else {
            this.f17481l = Typeface.create(string, this.j);
        }
    }
}
