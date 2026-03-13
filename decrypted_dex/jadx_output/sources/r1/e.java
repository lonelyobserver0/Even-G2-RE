package r1;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean[] f20244A;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f20245B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f20246C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f20247D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f20248E;

    /* renamed from: v, reason: collision with root package name */
    public static final int f20249v = c(2, 2, 2, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final int f20250w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f20251x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f20252y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f20253z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20254a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f20255b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f20256c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20257d;

    /* renamed from: e, reason: collision with root package name */
    public int f20258e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20259f;

    /* renamed from: g, reason: collision with root package name */
    public int f20260g;

    /* renamed from: h, reason: collision with root package name */
    public int f20261h;

    /* renamed from: i, reason: collision with root package name */
    public int f20262i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f20263k;

    /* renamed from: l, reason: collision with root package name */
    public int f20264l;

    /* renamed from: m, reason: collision with root package name */
    public int f20265m;

    /* renamed from: n, reason: collision with root package name */
    public int f20266n;

    /* renamed from: o, reason: collision with root package name */
    public int f20267o;

    /* renamed from: p, reason: collision with root package name */
    public int f20268p;

    /* renamed from: q, reason: collision with root package name */
    public int f20269q;

    /* renamed from: r, reason: collision with root package name */
    public int f20270r;

    /* renamed from: s, reason: collision with root package name */
    public int f20271s;

    /* renamed from: t, reason: collision with root package name */
    public int f20272t;

    /* renamed from: u, reason: collision with root package name */
    public int f20273u;

    static {
        int c10 = c(0, 0, 0, 0);
        f20250w = c10;
        int c11 = c(0, 0, 0, 3);
        f20251x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f20252y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f20253z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f20244A = new boolean[]{false, false, false, true, true, true, false};
        f20245B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        f20246C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f20247D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f20248E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            r0.AbstractC1550k.e(r4, r0)
            r0.AbstractC1550k.e(r5, r0)
            r0.AbstractC1550k.e(r6, r0)
            r0.AbstractC1550k.e(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f20255b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        ArrayList arrayList = this.f20254a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f20267o != -1) {
            this.f20267o = 0;
        }
        if (this.f20268p != -1) {
            this.f20268p = 0;
        }
        if (this.f20269q != -1) {
            this.f20269q = 0;
        }
        if (this.f20271s != -1) {
            this.f20271s = 0;
        }
        while (true) {
            if (arrayList.size() < this.j && arrayList.size() < 15) {
                this.f20273u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f20255b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f20267o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f20267o, length, 33);
            }
            if (this.f20268p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f20268p, length, 33);
            }
            if (this.f20269q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f20270r), this.f20269q, length, 33);
            }
            if (this.f20271s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f20272t), this.f20271s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f20254a.clear();
        this.f20255b.clear();
        this.f20267o = -1;
        this.f20268p = -1;
        this.f20269q = -1;
        this.f20271s = -1;
        this.f20273u = 0;
        this.f20256c = false;
        this.f20257d = false;
        this.f20258e = 4;
        this.f20259f = false;
        this.f20260g = 0;
        this.f20261h = 0;
        this.f20262i = 0;
        this.j = 15;
        this.f20263k = 0;
        this.f20264l = 0;
        this.f20265m = 0;
        int i3 = f20250w;
        this.f20266n = i3;
        this.f20270r = f20249v;
        this.f20272t = i3;
    }

    public final void e(boolean z2, boolean z10) {
        int i3 = this.f20267o;
        SpannableStringBuilder spannableStringBuilder = this.f20255b;
        if (i3 != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f20267o, spannableStringBuilder.length(), 33);
                this.f20267o = -1;
            }
        } else if (z2) {
            this.f20267o = spannableStringBuilder.length();
        }
        if (this.f20268p == -1) {
            if (z10) {
                this.f20268p = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f20268p, spannableStringBuilder.length(), 33);
            this.f20268p = -1;
        }
    }

    public final void f(int i3, int i10) {
        int i11 = this.f20269q;
        SpannableStringBuilder spannableStringBuilder = this.f20255b;
        if (i11 != -1 && this.f20270r != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f20270r), this.f20269q, spannableStringBuilder.length(), 33);
        }
        if (i3 != f20249v) {
            this.f20269q = spannableStringBuilder.length();
            this.f20270r = i3;
        }
        if (this.f20271s != -1 && this.f20272t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f20272t), this.f20271s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f20250w) {
            this.f20271s = spannableStringBuilder.length();
            this.f20272t = i10;
        }
    }
}
