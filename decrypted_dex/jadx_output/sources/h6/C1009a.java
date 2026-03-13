package h6;

import V6.b;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1009a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1009a f14464e = new C1009a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f14465a = new int[929];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14466b = new int[929];

    /* renamed from: c, reason: collision with root package name */
    public final b f14467c;

    /* renamed from: d, reason: collision with root package name */
    public final b f14468d;

    public C1009a() {
        int i3 = 1;
        for (int i10 = 0; i10 < 929; i10++) {
            this.f14465a[i10] = i3;
            i3 = (i3 * 3) % 929;
        }
        for (int i11 = 0; i11 < 928; i11++) {
            this.f14466b[this.f14465a[i11]] = i11;
        }
        this.f14467c = new b(this, new int[]{0});
        this.f14468d = new b(this, new int[]{1});
    }

    public final int a(int i3, int i10) {
        return (i3 + i10) % 929;
    }

    public final int b(int i3) {
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        return this.f14465a[928 - this.f14466b[i3]];
    }

    public final int c(int i3, int i10) {
        if (i3 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f14466b;
        return this.f14465a[(iArr[i3] + iArr[i10]) % 928];
    }
}
