package g6;

import N5.i;
import N5.o;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0957b {

    /* renamed from: a, reason: collision with root package name */
    public final T5.b f14219a;

    /* renamed from: b, reason: collision with root package name */
    public final o f14220b;

    /* renamed from: c, reason: collision with root package name */
    public final o f14221c;

    /* renamed from: d, reason: collision with root package name */
    public final o f14222d;

    /* renamed from: e, reason: collision with root package name */
    public final o f14223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14224f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14225g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14226h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14227i;

    public C0957b(T5.b bVar, o oVar, o oVar2, o oVar3, o oVar4) {
        boolean z2 = oVar == null || oVar2 == null;
        boolean z10 = oVar3 == null || oVar4 == null;
        if (z2 && z10) {
            throw i.a();
        }
        if (z2) {
            oVar = new o(0.0f, oVar3.f4927b);
            oVar2 = new o(0.0f, oVar4.f4927b);
        } else if (z10) {
            int i3 = bVar.f7183a;
            oVar3 = new o(i3 - 1, oVar.f4927b);
            oVar4 = new o(i3 - 1, oVar2.f4927b);
        }
        this.f14219a = bVar;
        this.f14220b = oVar;
        this.f14221c = oVar2;
        this.f14222d = oVar3;
        this.f14223e = oVar4;
        this.f14224f = (int) Math.min(oVar.f4926a, oVar2.f4926a);
        this.f14225g = (int) Math.max(oVar3.f4926a, oVar4.f4926a);
        this.f14226h = (int) Math.min(oVar.f4927b, oVar3.f4927b);
        this.f14227i = (int) Math.max(oVar2.f4927b, oVar4.f4927b);
    }

    public C0957b(C0957b c0957b) {
        this.f14219a = c0957b.f14219a;
        this.f14220b = c0957b.f14220b;
        this.f14221c = c0957b.f14221c;
        this.f14222d = c0957b.f14222d;
        this.f14223e = c0957b.f14223e;
        this.f14224f = c0957b.f14224f;
        this.f14225g = c0957b.f14225g;
        this.f14226h = c0957b.f14226h;
        this.f14227i = c0957b.f14227i;
    }
}
