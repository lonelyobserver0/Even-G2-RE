package xb;

import i5.C1059c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: xb.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1948e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1059c f23147a;

    /* renamed from: b, reason: collision with root package name */
    public wb.e f23148b;

    /* renamed from: c, reason: collision with root package name */
    public Zb.e f23149c;

    /* renamed from: d, reason: collision with root package name */
    public int f23150d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1059c f23152f;

    /* renamed from: g, reason: collision with root package name */
    public int f23153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1948e(C1059c c1059c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23152f = c1059c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23151e = obj;
        this.f23153g |= Integer.MIN_VALUE;
        return this.f23152f.i(0, null, this);
    }
}
