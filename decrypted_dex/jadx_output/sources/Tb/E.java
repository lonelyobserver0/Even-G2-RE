package Tb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class E extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f7268a;

    /* renamed from: b, reason: collision with root package name */
    public H5.F f7269b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7270c;

    /* renamed from: d, reason: collision with root package name */
    public int f7271d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7270c = obj;
        this.f7271d |= Integer.MIN_VALUE;
        return Q.i(null, this);
    }
}
