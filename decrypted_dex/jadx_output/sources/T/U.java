package T;

import Qb.C0215q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final SuspendLambda f6810a;

    /* renamed from: b, reason: collision with root package name */
    public final C0215q f6811b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f6812c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f6813d;

    /* JADX WARN: Multi-variable type inference failed */
    public U(Function2 transform, C0215q ack, e0 e0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f6810a = (SuspendLambda) transform;
        this.f6811b = ack;
        this.f6812c = e0Var;
        this.f6813d = callerContext;
    }
}
