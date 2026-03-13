package J7;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3420a;

    /* renamed from: b, reason: collision with root package name */
    public int f3421b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3420a = obj;
        this.f3421b |= Integer.MIN_VALUE;
        return Ec.l.s(null, null, null, null, 0L, this);
    }
}
