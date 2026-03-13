package Nb;

import Qb.I;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Map f5017a;

    /* renamed from: b, reason: collision with root package name */
    public Zb.a f5018b;

    /* renamed from: c, reason: collision with root package name */
    public Zb.g f5019c;

    /* renamed from: d, reason: collision with root package name */
    public Sb.i f5020d;

    /* renamed from: e, reason: collision with root package name */
    public Sb.i f5021e;

    /* renamed from: f, reason: collision with root package name */
    public Sb.i f5022f;

    /* renamed from: g, reason: collision with root package name */
    public long f5023g;

    /* renamed from: h, reason: collision with root package name */
    public int f5024h;
    public /* synthetic */ Object j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f5025k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f5025k = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f5025k, continuation);
        qVar.j = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010c, code lost:
    
        if (r14 != r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0129, code lost:
    
        if (r14.a(r31) == r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01ee -> B:7:0x01f2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
