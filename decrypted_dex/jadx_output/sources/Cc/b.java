package Cc;

import Ac.o;
import Kc.B;
import Kc.C0101h;
import Kc.H;
import Kc.J;
import Kc.p;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class b implements H {

    /* renamed from: a, reason: collision with root package name */
    public final p f1190a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f1192c;

    public b(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1192c = this$0;
        this.f1190a = new p(((B) this$0.f1207a).f3773a.b());
    }

    public final void a() {
        h hVar = this.f1192c;
        int i3 = hVar.f1209c;
        if (i3 == 6) {
            return;
        }
        if (i3 != 5) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(hVar.f1209c)));
        }
        h.i(hVar, this.f1190a);
        hVar.f1209c = 6;
    }

    @Override // Kc.H
    public final J b() {
        return this.f1190a;
    }

    @Override // Kc.H
    public long n(long j, C0101h sink) {
        h hVar = this.f1192c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((B) hVar.f1207a).n(j, sink);
        } catch (IOException e10) {
            ((o) hVar.f1211e).k();
            a();
            throw e10;
        }
    }
}
