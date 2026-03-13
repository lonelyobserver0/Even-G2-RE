package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public H5.K f7253a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7254b;

    /* renamed from: c, reason: collision with root package name */
    public int f7255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H5.K f7256d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(H5.K k3, Continuation continuation) {
        super(continuation);
        this.f7256d = k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7254b = obj;
        this.f7255c |= Integer.MIN_VALUE;
        return this.f7256d.a(null, this);
    }
}
