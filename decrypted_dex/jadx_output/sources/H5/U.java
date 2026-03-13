package H5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class U extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public V f2802a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f2804c;

    /* renamed from: d, reason: collision with root package name */
    public int f2805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2804c = v2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2803b = obj;
        this.f2805d |= Integer.MIN_VALUE;
        return V.a(this.f2804c, this);
    }
}
