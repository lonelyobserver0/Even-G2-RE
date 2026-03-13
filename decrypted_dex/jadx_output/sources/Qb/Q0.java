package Qb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Q0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Function2 f5829a;

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f5830b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5831c;

    /* renamed from: d, reason: collision with root package name */
    public int f5832d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5831c = obj;
        this.f5832d |= Integer.MIN_VALUE;
        return R0.b(0L, null, this);
    }
}
