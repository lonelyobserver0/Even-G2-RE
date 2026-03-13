package V;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public h f7648a;

    /* renamed from: b, reason: collision with root package name */
    public b f7649b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7650c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f7652e;

    /* renamed from: f, reason: collision with root package name */
    public int f7653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7652e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7651d = obj;
        this.f7653f |= Integer.MIN_VALUE;
        return this.f7652e.a(null, this);
    }
}
