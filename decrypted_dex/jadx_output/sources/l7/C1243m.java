package l7;

import com.mapbox.common.Cancelable;
import com.mapbox.common.location.LocationObserver;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1243m implements LocationObserver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cancelable f16770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Sb.v f16771c;

    public C1243m(Cancelable cancelable, Sb.v vVar) {
        this.f16770b = cancelable;
        this.f16771c = vVar;
        this.f16769a = cancelable != null;
    }

    @Override // com.mapbox.common.location.LocationObserver
    public final void onLocationUpdateReceived(List locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        if (this.f16769a) {
            Cancelable cancelable = this.f16770b;
            if (cancelable != null) {
                cancelable.cancel();
            }
            this.f16769a = false;
        }
        Oc.a.T(this.f16771c, CollectionsKt.last(locations));
    }
}
