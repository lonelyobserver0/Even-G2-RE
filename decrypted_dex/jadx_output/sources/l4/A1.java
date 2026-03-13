package l4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class A1 extends w1 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f15909c;

    public A1(F1 f12) {
        super(f12);
        this.f16651b.f16075t++;
    }

    public final void l() {
        if (!this.f15909c) {
            throw new IllegalStateException(StubApp.getString2(19590));
        }
    }

    public final void m() {
        if (this.f15909c) {
            throw new IllegalStateException(StubApp.getString2(5166));
        }
        n();
        this.f16651b.f16076v++;
        this.f15909c = true;
    }

    public abstract void n();
}
