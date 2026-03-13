package x9;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class J extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public K f22962a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f22964c;

    /* renamed from: d, reason: collision with root package name */
    public int f22965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22964c = k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22963b = obj;
        this.f22965d |= Integer.MIN_VALUE;
        return this.f22964c.a(null, null, this);
    }
}
