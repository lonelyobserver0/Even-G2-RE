package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: T.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0295k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public D5.B f6864a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D5.B f6866c;

    /* renamed from: d, reason: collision with root package name */
    public int f6867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0295k(D5.B b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6866c = b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6865b = obj;
        this.f6867d |= Integer.MIN_VALUE;
        return this.f6866c.x(this);
    }
}
