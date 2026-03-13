package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.IntRef f6787a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6789c;

    /* renamed from: d, reason: collision with root package name */
    public int f6790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6789c = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6788b = obj;
        this.f6790d |= Integer.MIN_VALUE;
        return this.f6789c.j(null, false, this);
    }
}
