package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: T.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0306w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q f6907a;

    /* renamed from: b, reason: collision with root package name */
    public Zb.e f6908b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6910d;

    /* renamed from: e, reason: collision with root package name */
    public int f6911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306w(Q q10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6910d = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6909c = obj;
        this.f6911e |= Integer.MIN_VALUE;
        return Q.b(this.f6910d, this);
    }
}
