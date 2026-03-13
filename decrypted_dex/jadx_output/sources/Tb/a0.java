package Tb;

import Qb.InterfaceC0221t0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public b0 f7333a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0328i f7334b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f7335c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0221t0 f7336d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7337e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f7339g;

    /* renamed from: h, reason: collision with root package name */
    public int f7340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f7339g = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7338f = obj;
        this.f7340h |= Integer.MIN_VALUE;
        return this.f7339g.p(null, this);
    }
}
