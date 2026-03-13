package Z8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public f f9038a;

    /* renamed from: b, reason: collision with root package name */
    public com.mapbox.navigation.base.route.g f9039b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f9041d;

    /* renamed from: e, reason: collision with root package name */
    public int f9042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f9041d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9040c = obj;
        this.f9042e |= Integer.MIN_VALUE;
        return this.f9041d.c(null, this);
    }
}
