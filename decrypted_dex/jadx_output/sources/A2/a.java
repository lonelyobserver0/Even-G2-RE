package A2;

import C2.r;
import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;
import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements r, B2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventChannel.EventSink f80b;

    public /* synthetic */ a(EventChannel.EventSink eventSink, int i3) {
        this.f79a = i3;
        this.f80b = eventSink;
    }

    @Override // C2.r
    public void a(Location location) {
        EventChannel.EventSink eventSink = this.f80b;
        switch (this.f79a) {
            case 0:
                int i3 = GeolocatorLocationService.f11088l;
                eventSink.success(android.support.v4.media.session.b.A(location));
                break;
            default:
                eventSink.success(android.support.v4.media.session.b.A(location));
                break;
        }
    }

    @Override // B2.a
    public void b(int i3) {
        EventChannel.EventSink eventSink = this.f80b;
        switch (this.f79a) {
            case 1:
                int i10 = GeolocatorLocationService.f11088l;
                eventSink.error(E1.a.b(i3), E1.a.a(i3), null);
                break;
            default:
                eventSink.error(E1.a.b(i3), E1.a.a(i3), null);
                break;
        }
    }
}
