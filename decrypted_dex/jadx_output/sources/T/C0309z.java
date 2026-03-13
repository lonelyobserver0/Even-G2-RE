package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: T.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0309z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q f6920a;

    /* renamed from: b, reason: collision with root package name */
    public Zb.e f6921b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6923d;

    /* renamed from: e, reason: collision with root package name */
    public int f6924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0309z(Q q10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6923d = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6922c = obj;
        this.f6924e |= Integer.MIN_VALUE;
        return Q.d(this.f6923d, this);
    }
}
