package M;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f4429c;

    public c() {
        super(12);
        this.f4429c = new Object();
    }

    @Override // M.b
    public final Object a() {
        Object a3;
        synchronized (this.f4429c) {
            a3 = super.a();
        }
        return a3;
    }

    @Override // M.b
    public final boolean b(Object instance) {
        boolean b2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f4429c) {
            b2 = super.b(instance);
        }
        return b2;
    }
}
