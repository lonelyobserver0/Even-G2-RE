package T;

import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6751a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6752b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f6753c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f6754d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6755e;

    /* renamed from: f, reason: collision with root package name */
    public int f6756f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q f6758h;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Q q10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6758h = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6757g = obj;
        this.j |= Integer.MIN_VALUE;
        return Q.f(this.f6758h, false, this);
    }
}
