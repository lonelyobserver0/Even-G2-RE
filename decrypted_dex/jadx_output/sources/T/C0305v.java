package T;

import Tb.InterfaceC0328i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: T.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0305v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C0288d f6903a;

    /* renamed from: b, reason: collision with root package name */
    public int f6904b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0305v(Q q10, Continuation continuation) {
        super(2, continuation);
        this.f6906d = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0305v c0305v = new C0305v(this.f6906d, continuation);
        c0305v.f6905c = obj;
        return c0305v;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0305v) create((InterfaceC0328i) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d2, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r3.a(r11, r10) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0305v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
