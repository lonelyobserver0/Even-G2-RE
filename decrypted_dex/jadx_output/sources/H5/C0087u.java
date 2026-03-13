package H5;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0087u implements K5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2918a;

    /* renamed from: b, reason: collision with root package name */
    public final K5.c f2919b;

    public /* synthetic */ C0087u(K5.c cVar, int i3) {
        this.f2918a = i3;
        this.f2919b = cVar;
    }

    @Override // Pb.a
    public final Object get() {
        switch (this.f2918a) {
            case 0:
                Context appContext = (Context) this.f2919b.f3721a;
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                return X.f.b(new U.a(r.f2913b), new C0085s(appContext, 0));
            default:
                return new L5.a((Context) this.f2919b.f3721a);
        }
    }
}
