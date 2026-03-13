package m8;

import f4.C0879c;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public List f17259a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0879c f17261c;

    /* renamed from: d, reason: collision with root package name */
    public int f17262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0879c c0879c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f17261c = c0879c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17260b = obj;
        this.f17262d |= Integer.MIN_VALUE;
        return this.f17261c.s(null, this);
    }
}
