package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Tb.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0342x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C0343y f7404a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7405b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0343y f7407d;

    /* renamed from: e, reason: collision with root package name */
    public int f7408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0342x(C0343y c0343y, Continuation continuation) {
        super(continuation);
        this.f7407d = c0343y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7406c = obj;
        this.f7408e |= Integer.MIN_VALUE;
        return this.f7407d.a(null, this);
    }
}
