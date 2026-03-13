package V;

import Kc.B;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f7631a;

    /* renamed from: b, reason: collision with root package name */
    public B f7632b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f7634d;

    /* renamed from: e, reason: collision with root package name */
    public int f7635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7634d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7633c = obj;
        this.f7635e |= Integer.MIN_VALUE;
        return b.a(this.f7634d, this);
    }
}
