package q1;

import L0.B;
import java.util.HashMap;
import kotlin.jvm.internal.LongCompanionObject;
import l4.C1223z;
import r0.AbstractC1550k;
import r0.C1553n;
import r0.InterfaceC1542c;
import r0.InterfaceC1546g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class m implements InterfaceC1542c, InterfaceC1546g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19906a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f19907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19908c;

    public /* synthetic */ m(n nVar, long j, int i3) {
        this.f19908c = nVar;
        this.f19907b = j;
        this.f19906a = i3;
    }

    @Override // r0.InterfaceC1542c
    public void accept(Object obj) {
        C1505a c1505a = (C1505a) obj;
        n nVar = (n) this.f19908c;
        AbstractC1550k.h(nVar.f19916h);
        byte[] f10 = C1223z.f(c1505a.f19881c, c1505a.f19879a);
        C1553n c1553n = nVar.f19911c;
        c1553n.getClass();
        c1553n.E(f10.length, f10);
        nVar.f19909a.a(c1553n, f10.length, 0);
        long j = c1505a.f19880b;
        long j3 = this.f19907b;
        if (j == -9223372036854775807L) {
            AbstractC1550k.g(nVar.f19916h.f18221s == LongCompanionObject.MAX_VALUE);
        } else {
            long j10 = nVar.f19916h.f18221s;
            j3 = j10 == LongCompanionObject.MAX_VALUE ? j3 + j : j + j10;
        }
        nVar.f19909a.c(j3, this.f19906a, f10.length, 0, null);
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        w0.h hVar = (w0.h) obj;
        hVar.getClass();
        w0.a aVar = (w0.a) this.f19908c;
        B b2 = aVar.f21982d;
        if (b2 != null) {
            String c10 = hVar.f22016b.c(aVar.f21980b, b2);
            HashMap hashMap = hVar.f22022h;
            Long l9 = (Long) hashMap.get(c10);
            HashMap hashMap2 = hVar.f22021g;
            Long l10 = (Long) hashMap2.get(c10);
            hashMap.put(c10, Long.valueOf((l9 == null ? 0L : l9.longValue()) + this.f19907b));
            hashMap2.put(c10, Long.valueOf((l10 != null ? l10.longValue() : 0L) + this.f19906a));
        }
    }

    public /* synthetic */ m(w0.a aVar, int i3, long j, long j3) {
        this.f19908c = aVar;
        this.f19906a = i3;
        this.f19907b = j;
    }
}
