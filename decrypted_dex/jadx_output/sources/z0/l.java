package z0;

import M4.I;
import Z9.C0366a;
import android.net.Uri;
import java.util.ArrayList;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final j f23692f;

    /* renamed from: g, reason: collision with root package name */
    public final C0366a f23693g;

    public l(C1438m c1438m, I i3, r rVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c1438m, i3, rVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((C1986b) i3.get(0)).f23642a);
        long j = rVar.f23710e;
        j jVar = j <= 0 ? null : new j(rVar.f23709d, null, j);
        this.f23692f = jVar;
        this.f23693g = jVar == null ? new C0366a(new j(0L, null, -1L), 28) : null;
    }

    @Override // z0.m
    public final String b() {
        return null;
    }

    @Override // z0.m
    public final y0.h c() {
        return this.f23693g;
    }

    @Override // z0.m
    public final j e() {
        return this.f23692f;
    }
}
