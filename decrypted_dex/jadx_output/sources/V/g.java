package V;

import Kc.y;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public h f7654a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7655b;

    /* renamed from: c, reason: collision with root package name */
    public y f7656c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7657d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f7659f;

    /* renamed from: g, reason: collision with root package name */
    public int f7660g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7659f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7658e = obj;
        this.f7660g |= Integer.MIN_VALUE;
        return this.f7659f.b(null, this);
    }
}
