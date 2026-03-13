package z1;

import com.stub.StubApp;

/* renamed from: z1.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1994F {

    /* renamed from: a, reason: collision with root package name */
    public final String f23751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23752b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23753c;

    /* renamed from: d, reason: collision with root package name */
    public int f23754d;

    /* renamed from: e, reason: collision with root package name */
    public String f23755e;

    public C1994F(int i3, int i10) {
        this(Integer.MIN_VALUE, i3, i10);
    }

    public final void a() {
        int i3 = this.f23754d;
        this.f23754d = i3 == Integer.MIN_VALUE ? this.f23752b : i3 + this.f23753c;
        this.f23755e = this.f23751a + this.f23754d;
    }

    public final void b() {
        if (this.f23754d == Integer.MIN_VALUE) {
            throw new IllegalStateException(StubApp.getString2(24860));
        }
    }

    public C1994F(int i3, int i10, int i11) {
        String str;
        if (i3 != Integer.MIN_VALUE) {
            str = i3 + StubApp.getString2(601);
        } else {
            str = "";
        }
        this.f23751a = str;
        this.f23752b = i10;
        this.f23753c = i11;
        this.f23754d = Integer.MIN_VALUE;
        this.f23755e = "";
    }
}
