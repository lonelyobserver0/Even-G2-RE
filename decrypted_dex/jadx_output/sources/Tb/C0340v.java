package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Tb.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0340v extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C0341w f7398a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0341w f7400c;

    /* renamed from: d, reason: collision with root package name */
    public int f7401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340v(C0341w c0341w, Continuation continuation) {
        super(continuation);
        this.f7400c = c0341w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7399b = obj;
        this.f7401d |= Integer.MIN_VALUE;
        return this.f7400c.a(null, this);
    }
}
