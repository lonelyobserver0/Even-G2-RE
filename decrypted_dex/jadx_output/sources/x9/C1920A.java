package x9;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: x9.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1920A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f22899b;

    /* renamed from: c, reason: collision with root package name */
    public int f22900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1920A(I i3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22899b = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22898a = obj;
        this.f22900c |= Integer.MIN_VALUE;
        return I.a(this.f22899b, null, null, null, null, null, this);
    }
}
