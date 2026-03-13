package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l4.E0;

/* renamed from: Tb.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0338t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7390a;

    /* renamed from: b, reason: collision with root package name */
    public int f7391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E0 f7392c;

    /* renamed from: d, reason: collision with root package name */
    public E0 f7393d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0328i f7394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338t(E0 e02, Continuation continuation) {
        super(continuation);
        this.f7392c = e02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7390a = obj;
        this.f7391b |= Integer.MIN_VALUE;
        return this.f7392c.p(null, this);
    }
}
