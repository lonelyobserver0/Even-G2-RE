package n6;

import java.util.Comparator;
import m6.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f17849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f17850b;

    public k(l lVar, q qVar) {
        this.f17850b = lVar;
        this.f17849a = qVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = this.f17849a;
        l lVar = this.f17850b;
        return Float.compare(lVar.a((q) obj2, qVar), lVar.a((q) obj, qVar));
    }
}
