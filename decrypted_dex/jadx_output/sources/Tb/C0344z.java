package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l4.E0;

/* renamed from: Tb.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0344z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7412a;

    /* renamed from: b, reason: collision with root package name */
    public int f7413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E0 f7414c;

    /* renamed from: d, reason: collision with root package name */
    public H5.K f7415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0344z(E0 e02, Continuation continuation) {
        super(continuation);
        this.f7414c = e02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7412a = obj;
        this.f7413b |= Integer.MIN_VALUE;
        return this.f7414c.p(null, this);
    }
}
