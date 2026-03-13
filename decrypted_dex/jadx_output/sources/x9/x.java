package x9;

import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I f23095a;

    /* renamed from: b, reason: collision with root package name */
    public Style f23096b;

    /* renamed from: c, reason: collision with root package name */
    public RouteLineViewOptionsData f23097c;

    /* renamed from: d, reason: collision with root package name */
    public Collection f23098d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f23099e;

    /* renamed from: f, reason: collision with root package name */
    public Collection f23100f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f23101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I f23102h;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(I i3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23102h = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23101g = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f23102h.h(null, null, null, null, this);
    }
}
