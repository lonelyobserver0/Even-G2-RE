package androidx.lifecycle;

import Z9.C0366a;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E implements InterfaceC0444t {
    public static final E j = new E();

    /* renamed from: a, reason: collision with root package name */
    public int f9866a;

    /* renamed from: b, reason: collision with root package name */
    public int f9867b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f9870e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9868c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9869d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0446v f9871f = new C0446v(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.o f9872g = new B0.o(this, 14);

    /* renamed from: h, reason: collision with root package name */
    public final C0366a f9873h = new C0366a(this, 2);

    public final void b() {
        int i3 = this.f9867b + 1;
        this.f9867b = i3;
        if (i3 == 1) {
            if (this.f9868c) {
                this.f9871f.e(EnumC0438m.ON_RESUME);
                this.f9868c = false;
            } else {
                Handler handler = this.f9870e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f9872g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f9871f;
    }
}
