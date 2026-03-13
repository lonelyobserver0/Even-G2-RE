package Nb;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f5001a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5002b;

    /* renamed from: c, reason: collision with root package name */
    public Sb.i f5003c;

    /* renamed from: d, reason: collision with root package name */
    public Map f5004d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5005e;

    /* renamed from: f, reason: collision with root package name */
    public Zb.a f5006f;

    /* renamed from: g, reason: collision with root package name */
    public int f5007g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5008h;
    public final /* synthetic */ Zb.g j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5009k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f5010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f5011m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Zb.a f5012n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Sb.i f5013p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5014q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Sb.i f5015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f5016s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Zb.g gVar, boolean z2, a aVar, c cVar, Zb.a aVar2, Sb.i iVar, long j, Sb.i iVar2, Map map, Continuation continuation) {
        super(2, continuation);
        this.j = gVar;
        this.f5009k = z2;
        this.f5010l = aVar;
        this.f5011m = cVar;
        this.f5012n = aVar2;
        this.f5013p = iVar;
        this.f5014q = j;
        this.f5015r = iVar2;
        this.f5016s = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.j, this.f5009k, this.f5010l, this.f5011m, this.f5012n, this.f5013p, this.f5014q, this.f5015r, this.f5016s, continuation);
        pVar.f5008h = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((k) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0215, code lost:
    
        if (r22.f5015r.k(r0, r22) == r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c9, code lost:
    
        if (r7.k(r2, r22) == r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ee, code lost:
    
        if (r7.k(r2, r22) == r4) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x038f A[Catch: all -> 0x0396, TryCatch #2 {all -> 0x0396, blocks: (B:8:0x0381, B:10:0x038f, B:12:0x039a), top: B:7:0x0381 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02b5 A[Catch: all -> 0x02bc, TryCatch #3 {all -> 0x02bc, blocks: (B:30:0x02a7, B:32:0x02b5, B:34:0x02c0), top: B:29:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:83:0x014d, B:85:0x0159, B:87:0x0164), top: B:82:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
