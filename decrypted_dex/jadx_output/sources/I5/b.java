package I5;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Map f3220a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f3221b;

    /* renamed from: c, reason: collision with root package name */
    public d f3222c;

    /* renamed from: d, reason: collision with root package name */
    public Zb.a f3223d;

    /* renamed from: e, reason: collision with root package name */
    public Map f3224e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3225f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3226g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f3227h;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3227h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3226g = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f3227h.b(this);
    }
}
