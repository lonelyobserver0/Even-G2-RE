package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Tb.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0335p extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7377a;

    /* renamed from: b, reason: collision with root package name */
    public int f7378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0336q f7379c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7380d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0328i f7381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335p(C0336q c0336q, Continuation continuation) {
        super(continuation);
        this.f7379c = c0336q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7377a = obj;
        this.f7378b |= Integer.MIN_VALUE;
        return this.f7379c.p(null, this);
    }
}
