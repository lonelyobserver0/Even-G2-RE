package q0;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1504b {

    /* renamed from: A, reason: collision with root package name */
    public static final String f19825A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f19826B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f19827C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f19828D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f19829E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f19830F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f19831G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f19832H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f19833I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f19834J;

    /* renamed from: r, reason: collision with root package name */
    public static final String f19835r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f19836s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f19837t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f19838u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f19839v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f19840w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f19841x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f19842y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f19843z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19844a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f19845b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f19846c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f19847d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19849f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19850g;

    /* renamed from: h, reason: collision with root package name */
    public final float f19851h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19852i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f19853k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f19854l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19855m;

    /* renamed from: n, reason: collision with root package name */
    public final int f19856n;

    /* renamed from: o, reason: collision with root package name */
    public final float f19857o;

    /* renamed from: p, reason: collision with root package name */
    public final int f19858p;

    /* renamed from: q, reason: collision with root package name */
    public final float f19859q;

    static {
        new C1504b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i3 = AbstractC1560u.f20190a;
        f19835r = Integer.toString(0, 36);
        f19836s = Integer.toString(17, 36);
        f19837t = Integer.toString(1, 36);
        f19838u = Integer.toString(2, 36);
        f19839v = Integer.toString(3, 36);
        f19840w = Integer.toString(18, 36);
        f19841x = Integer.toString(4, 36);
        f19842y = Integer.toString(5, 36);
        f19843z = Integer.toString(6, 36);
        f19825A = Integer.toString(7, 36);
        f19826B = Integer.toString(8, 36);
        f19827C = Integer.toString(9, 36);
        f19828D = Integer.toString(10, 36);
        f19829E = Integer.toString(11, 36);
        f19830F = Integer.toString(12, 36);
        f19831G = Integer.toString(13, 36);
        f19832H = Integer.toString(14, 36);
        f19833I = Integer.toString(15, 36);
        f19834J = Integer.toString(16, 36);
    }

    public C1504b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i3, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z2, int i13, int i14, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC1550k.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f19844a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f19844a = charSequence.toString();
        } else {
            this.f19844a = null;
        }
        this.f19845b = alignment;
        this.f19846c = alignment2;
        this.f19847d = bitmap;
        this.f19848e = f10;
        this.f19849f = i3;
        this.f19850g = i10;
        this.f19851h = f11;
        this.f19852i = i11;
        this.j = f13;
        this.f19853k = f14;
        this.f19854l = z2;
        this.f19855m = i13;
        this.f19856n = i12;
        this.f19857o = f12;
        this.f19858p = i14;
        this.f19859q = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1504b.class == obj.getClass()) {
            C1504b c1504b = (C1504b) obj;
            if (TextUtils.equals(this.f19844a, c1504b.f19844a) && this.f19845b == c1504b.f19845b && this.f19846c == c1504b.f19846c) {
                Bitmap bitmap = c1504b.f19847d;
                Bitmap bitmap2 = this.f19847d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f19848e == c1504b.f19848e && this.f19849f == c1504b.f19849f && this.f19850g == c1504b.f19850g && this.f19851h == c1504b.f19851h && this.f19852i == c1504b.f19852i && this.j == c1504b.j && this.f19853k == c1504b.f19853k && this.f19854l == c1504b.f19854l && this.f19855m == c1504b.f19855m && this.f19856n == c1504b.f19856n && this.f19857o == c1504b.f19857o && this.f19858p == c1504b.f19858p && this.f19859q == c1504b.f19859q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19844a, this.f19845b, this.f19846c, this.f19847d, Float.valueOf(this.f19848e), Integer.valueOf(this.f19849f), Integer.valueOf(this.f19850g), Float.valueOf(this.f19851h), Integer.valueOf(this.f19852i), Float.valueOf(this.j), Float.valueOf(this.f19853k), Boolean.valueOf(this.f19854l), Integer.valueOf(this.f19855m), Integer.valueOf(this.f19856n), Float.valueOf(this.f19857o), Integer.valueOf(this.f19858p), Float.valueOf(this.f19859q)});
    }
}
