package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* renamed from: T.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0296l extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6868a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6869b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6870c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f6871d;

    /* renamed from: e, reason: collision with root package name */
    public Q f6872e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0297m f6874g;

    /* renamed from: h, reason: collision with root package name */
    public int f6875h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296l(C0297m c0297m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6874g = c0297m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6873f = obj;
        this.f6875h |= Integer.MIN_VALUE;
        return this.f6874g.a(null, this);
    }
}
