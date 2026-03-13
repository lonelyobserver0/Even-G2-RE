package m6;

import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class i implements N5.p {

    /* renamed from: a, reason: collision with root package name */
    public final N5.h f17106a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17107b = new ArrayList();

    public i(N5.h hVar) {
        this.f17106a = hVar;
    }

    @Override // N5.p
    public final void a(N5.o oVar) {
        this.f17107b.add(oVar);
    }

    public N5.b b(N5.j jVar) {
        return new N5.b(new T5.e(jVar));
    }
}
