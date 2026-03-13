package L5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public j f4230a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4232c;

    /* renamed from: d, reason: collision with root package name */
    public int f4233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4232c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4231b = obj;
        this.f4233d |= Integer.MIN_VALUE;
        return this.f4232c.b(this);
    }
}
