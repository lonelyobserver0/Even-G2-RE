package V8;

import com.mapbox.bindgen.Expected;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f7848a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7849b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7850c;

    /* renamed from: d, reason: collision with root package name */
    public com.mapbox.navigation.base.route.g f7851d;

    /* renamed from: e, reason: collision with root package name */
    public Expected f7852e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f7853f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f7855h;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7855h = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7854g = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f7855h.g(null, null, this);
    }
}
