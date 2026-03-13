package L5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f4206a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f4207b;

    /* renamed from: c, reason: collision with root package name */
    public int f4208c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f4210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.f4210e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f4210e, continuation);
        cVar.f4209d = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((JSONObject) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01f2, code lost:
    
        if (r14 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01cb, code lost:
    
        if (r14 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x019f, code lost:
    
        if (r14 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0175, code lost:
    
        if (r14 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        if (r14 == r4) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Type inference failed for: r14v13, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
