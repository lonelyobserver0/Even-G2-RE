package Tb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Tb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0321b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Sb.v f7341a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0322c f7343c;

    /* renamed from: d, reason: collision with root package name */
    public int f7344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321b(C0322c c0322c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7343c = c0322c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7342b = obj;
        this.f7344d |= Integer.MIN_VALUE;
        return this.f7343c.a(null, this);
    }
}
