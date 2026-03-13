package R8;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: R8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0244b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public A3.s f6274a;

    /* renamed from: b, reason: collision with root package name */
    public List f6275b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A3.s f6277d;

    /* renamed from: e, reason: collision with root package name */
    public int f6278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244b(A3.s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6277d = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6276c = obj;
        this.f6278e |= Integer.MIN_VALUE;
        return A3.s.a(this.f6277d, null, false, this);
    }
}
