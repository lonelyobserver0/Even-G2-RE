package Tb;

import Qb.C0203k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class N implements Qb.Y {

    /* renamed from: a, reason: collision with root package name */
    public final P f7292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7293b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7294c;

    /* renamed from: d, reason: collision with root package name */
    public final C0203k f7295d;

    public N(P p8, long j, Object obj, C0203k c0203k) {
        this.f7292a = p8;
        this.f7293b = j;
        this.f7294c = obj;
        this.f7295d = c0203k;
    }

    @Override // Qb.Y
    public final void dispose() {
        P p8 = this.f7292a;
        synchronized (p8) {
            if (this.f7293b < p8.m()) {
                return;
            }
            Object[] objArr = p8.f7306h;
            Intrinsics.checkNotNull(objArr);
            if (Q.b(objArr, this.f7293b) != this) {
                return;
            }
            Q.c(objArr, this.f7293b, Q.f7310a);
            p8.h();
            Unit unit = Unit.INSTANCE;
        }
    }
}
