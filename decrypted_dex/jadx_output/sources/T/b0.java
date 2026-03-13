package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Zb.e f6835a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6836b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f6838d;

    /* renamed from: e, reason: collision with root package name */
    public int f6839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6838d = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6837c = obj;
        this.f6839e |= Integer.MIN_VALUE;
        return this.f6838d.c(null, this);
    }
}
