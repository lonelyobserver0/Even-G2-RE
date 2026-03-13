package k5;

import com.stub.StubApp;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1106a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15434a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15435b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15436c;

    public /* synthetic */ C1106a(boolean z2, boolean z10, boolean z11) {
        this.f15434a = z2;
        this.f15435b = z10;
        this.f15436c = z11;
    }

    public x0.d a() {
        if (this.f15434a || !(this.f15435b || this.f15436c)) {
            return new x0.d(this);
        }
        throw new IllegalStateException(StubApp.getString2(19108));
    }
}
