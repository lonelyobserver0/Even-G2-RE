package T;

import Qb.C0215q;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: T.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0308y extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6914a;

    /* renamed from: b, reason: collision with root package name */
    public Q f6915b;

    /* renamed from: c, reason: collision with root package name */
    public C0215q f6916c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f6918e;

    /* renamed from: f, reason: collision with root package name */
    public int f6919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0308y(Q q10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6918e = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6917d = obj;
        this.f6919f |= Integer.MIN_VALUE;
        return Q.c(this.f6918e, null, this);
    }
}
