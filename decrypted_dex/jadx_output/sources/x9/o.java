package x9;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public t f23035a;

    /* renamed from: b, reason: collision with root package name */
    public List f23036b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f23038d;

    /* renamed from: e, reason: collision with root package name */
    public int f23039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23038d = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23037c = obj;
        this.f23039e |= Integer.MIN_VALUE;
        return this.f23038d.d(null, false, false, this);
    }
}
