package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class r extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7384a;

    /* renamed from: b, reason: collision with root package name */
    public int f7385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z9.C f7386c;

    /* renamed from: d, reason: collision with root package name */
    public Z9.C f7387d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0328i f7388e;

    /* renamed from: f, reason: collision with root package name */
    public Ub.v f7389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Z9.C c10, Continuation continuation) {
        super(continuation);
        this.f7386c = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7384a = obj;
        this.f7385b |= Integer.MIN_VALUE;
        return this.f7386c.p(null, this);
    }
}
