package L5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f4201a;

    /* renamed from: b, reason: collision with root package name */
    public Zb.a f4202b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f4204d;

    /* renamed from: e, reason: collision with root package name */
    public int f4205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4204d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4203c = obj;
        this.f4205e |= Integer.MIN_VALUE;
        return this.f4204d.d(this);
    }
}
