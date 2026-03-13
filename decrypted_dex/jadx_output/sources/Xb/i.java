package Xb;

import Qb.L;
import com.stub.StubApp;
import i2.o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f8635c;

    public i(Runnable runnable, long j, o oVar) {
        super(j, oVar);
        this.f8635c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8635c.run();
        } finally {
            this.f8634b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(25940));
        Runnable runnable = this.f8635c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(L.h(runnable));
        String string2 = StubApp.getString2(81);
        sb2.append(string2);
        sb2.append(this.f8633a);
        sb2.append(string2);
        sb2.append(this.f8634b);
        sb2.append(']');
        return sb2.toString();
    }
}
