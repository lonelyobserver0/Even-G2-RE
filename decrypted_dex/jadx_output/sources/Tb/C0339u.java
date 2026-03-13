package Tb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* renamed from: Tb.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0339u extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f7395a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7396b;

    /* renamed from: c, reason: collision with root package name */
    public int f7397c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7396b = obj;
        this.f7397c |= Integer.MIN_VALUE;
        return Q.f(null, null, this);
    }
}
