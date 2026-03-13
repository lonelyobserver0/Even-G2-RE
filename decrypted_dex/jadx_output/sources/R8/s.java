package R8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f6323b;

    /* renamed from: c, reason: collision with root package name */
    public int f6324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6323b = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6322a = obj;
        this.f6324c |= Integer.MIN_VALUE;
        return this.f6323b.c(null, 0L, this);
    }
}
