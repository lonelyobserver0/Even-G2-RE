package R0;

import Tb.U;
import o0.C1425W;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f6050a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6051b;

    /* renamed from: c, reason: collision with root package name */
    public final Lc.e f6052c = new Lc.e();

    /* renamed from: d, reason: collision with root package name */
    public final U f6053d = new U();

    /* renamed from: e, reason: collision with root package name */
    public final U f6054e = new U();

    /* renamed from: f, reason: collision with root package name */
    public final Ab.g f6055f;

    /* renamed from: g, reason: collision with root package name */
    public C1425W f6056g;

    /* renamed from: h, reason: collision with root package name */
    public C1425W f6057h;

    /* renamed from: i, reason: collision with root package name */
    public long f6058i;
    public long j;

    public r(A0.c cVar, n nVar) {
        this.f6050a = cVar;
        this.f6051b = nVar;
        Ab.g gVar = new Ab.g(4);
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        gVar.f275b = 0;
        gVar.f276c = 0;
        gVar.f278e = new long[highestOneBit];
        gVar.f277d = highestOneBit - 1;
        this.f6055f = gVar;
        this.f6057h = C1425W.f18113d;
        this.j = -9223372036854775807L;
    }
}
