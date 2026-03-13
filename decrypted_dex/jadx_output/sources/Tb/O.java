package Tb;

import Qb.InterfaceC0221t0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class O extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public P f7296a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0328i f7297b;

    /* renamed from: c, reason: collision with root package name */
    public S f7298c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0221t0 f7299d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f7301f;

    /* renamed from: g, reason: collision with root package name */
    public int f7302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p8, Continuation continuation) {
        super(continuation);
        this.f7301f = p8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7300e = obj;
        this.f7302g |= Integer.MIN_VALUE;
        return P.i(this.f7301f, null, this);
    }
}
