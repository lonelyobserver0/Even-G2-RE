package Tb;

import Qb.C0203k;
import Ub.AbstractC0346b;
import Ub.AbstractC0348d;
import kotlin.coroutines.Continuation;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class S extends AbstractC0348d {

    /* renamed from: a, reason: collision with root package name */
    public long f7313a;

    /* renamed from: b, reason: collision with root package name */
    public C0203k f7314b;

    @Override // Ub.AbstractC0348d
    public final boolean a(AbstractC0346b abstractC0346b) {
        P p8 = (P) abstractC0346b;
        if (this.f7313a >= 0) {
            return false;
        }
        long j = p8.j;
        if (j < p8.f7307k) {
            p8.f7307k = j;
        }
        this.f7313a = j;
        return true;
    }

    @Override // Ub.AbstractC0348d
    public final Continuation[] b(AbstractC0346b abstractC0346b) {
        long j = this.f7313a;
        this.f7313a = -1L;
        this.f7314b = null;
        return ((P) abstractC0346b).v(j);
    }
}
