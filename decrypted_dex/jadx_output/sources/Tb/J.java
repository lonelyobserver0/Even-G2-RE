package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class J extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7286a;

    /* renamed from: b, reason: collision with root package name */
    public int f7287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H5.K f7288c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7289d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0328i f7290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(H5.K k3, Continuation continuation) {
        super(continuation);
        this.f7288c = k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7286a = obj;
        this.f7287b |= Integer.MIN_VALUE;
        return this.f7288c.a(null, this);
    }
}
