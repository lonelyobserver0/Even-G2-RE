package R8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import z7.C2014b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public y f6315a;

    /* renamed from: b, reason: collision with root package name */
    public com.mapbox.navigation.base.route.g f6316b;

    /* renamed from: c, reason: collision with root package name */
    public u8.h f6317c;

    /* renamed from: d, reason: collision with root package name */
    public C2014b f6318d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f6320f;

    /* renamed from: g, reason: collision with root package name */
    public int f6321g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6320f = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6319e = obj;
        this.f6321g |= Integer.MIN_VALUE;
        return y.a(this.f6320f, null, null, this);
    }
}
