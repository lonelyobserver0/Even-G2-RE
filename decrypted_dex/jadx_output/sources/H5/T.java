package H5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public B f2794a;

    /* renamed from: b, reason: collision with root package name */
    public V f2795b;

    /* renamed from: c, reason: collision with root package name */
    public Q f2796c;

    /* renamed from: d, reason: collision with root package name */
    public R4.h f2797d;

    /* renamed from: e, reason: collision with root package name */
    public O f2798e;

    /* renamed from: f, reason: collision with root package name */
    public L5.j f2799f;

    /* renamed from: g, reason: collision with root package name */
    public int f2800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V f2801h;
    public final /* synthetic */ O j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(V v2, O o5, Continuation continuation) {
        super(2, continuation);
        this.f2801h = v2;
        this.j = o5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.f2801h, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        if (r2 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004c, code lost:
    
        if (r2 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
