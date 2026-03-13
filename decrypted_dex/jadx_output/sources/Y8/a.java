package Y8;

import Lc.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public e f8830a;

    /* renamed from: b, reason: collision with root package name */
    public long f8831b;

    /* renamed from: c, reason: collision with root package name */
    public long f8832c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f8834e;

    /* renamed from: f, reason: collision with root package name */
    public int f8835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f8834e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8833d = obj;
        this.f8835f |= Integer.MIN_VALUE;
        return this.f8834e.a(0L, this);
    }
}
