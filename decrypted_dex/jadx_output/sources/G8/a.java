package G8;

import R8.C;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C f2452a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2454c;

    /* renamed from: d, reason: collision with root package name */
    public int f2455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2454c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2453b = obj;
        this.f2455d |= Integer.MIN_VALUE;
        return this.f2454c.a(0L, null, null, this);
    }
}
