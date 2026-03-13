package l7;

import T.C0304u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: l7.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1237g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16752a;

    /* renamed from: b, reason: collision with root package name */
    public int f16753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0304u f16754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1237g(C0304u c0304u, Continuation continuation) {
        super(continuation);
        this.f16754c = c0304u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16752a = obj;
        this.f16753b |= Integer.MIN_VALUE;
        return this.f16754c.a(null, this);
    }
}
