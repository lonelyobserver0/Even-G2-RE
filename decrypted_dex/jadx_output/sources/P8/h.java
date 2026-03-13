package P8;

import Qb.I;
import com.mapbox.navigator.RouteInterface;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f5622a;

    /* renamed from: b, reason: collision with root package name */
    public int f5623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RouteInterface f5624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f5625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f5626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f5627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RouteInterface routeInterface, List list, i iVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f5624c = routeInterface;
        this.f5625d = list;
        this.f5626e = iVar;
        this.f5627f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f5624c, this.f5625d, this.f5626e, this.f5627f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e8, code lost:
    
        if (r13 == r0) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193 A[EDGE_INSN: B:41:0x0193->B:28:0x0193 BREAK  A[LOOP:0: B:22:0x017f->B:40:?], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P8.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
