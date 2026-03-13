package x;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1903j extends k {

    /* renamed from: c, reason: collision with root package name */
    public float f22629c = 0.0f;

    public final void f() {
        this.f22631b = 0;
        this.f22630a.clear();
        this.f22629c = 0.0f;
    }

    public final void g(int i3) {
        int i10 = this.f22631b;
        if (i10 == 0 || this.f22629c != i3) {
            this.f22629c = i3;
            if (i10 == 1) {
                c();
            }
            b();
        }
    }
}
