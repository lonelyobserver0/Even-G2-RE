package L8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u5.d f4296b;

    /* renamed from: c, reason: collision with root package name */
    public int f4297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u5.d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4296b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4295a = obj;
        this.f4297c |= Integer.MIN_VALUE;
        return this.f4296b.u(null, this);
    }
}
