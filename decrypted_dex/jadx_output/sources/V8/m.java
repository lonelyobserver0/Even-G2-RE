package V8;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public q f7841a;

    /* renamed from: b, reason: collision with root package name */
    public List f7842b;

    /* renamed from: c, reason: collision with root package name */
    public q f7843c;

    /* renamed from: d, reason: collision with root package name */
    public com.mapbox.navigation.base.route.g f7844d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f7846f;

    /* renamed from: g, reason: collision with root package name */
    public int f7847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7846f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7845e = obj;
        this.f7847g |= Integer.MIN_VALUE;
        return this.f7846f.f(null, 0, null, this);
    }
}
