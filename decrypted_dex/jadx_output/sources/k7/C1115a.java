package k7;

import android.view.View;
import androidx.lifecycle.B;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0443s;
import androidx.lifecycle.InterfaceC0444t;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1115a implements InterfaceC0443s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f15474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MapView f15476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f15477d;

    public C1115a(MapView mapView, d dVar, MapView mapView2, b bVar) {
        this.f15474a = mapView;
        this.f15475b = dVar;
        this.f15476c = mapView2;
        this.f15477d = bVar;
    }

    @B(EnumC0438m.ON_DESTROY)
    public final void onDestroy() {
        C0446v i3;
        MapboxLogger.logI(StubApp.getString2(13948), StubApp.getString2(19119));
        this.f15474a.onDestroy();
        d dVar = this.f15475b;
        dVar.f15480b.b(this);
        InterfaceC0444t interfaceC0444t = dVar.f15482d;
        if (interfaceC0444t != null && (i3 = interfaceC0444t.i()) != null) {
            i3.b(dVar.f15483e);
        }
        View view = (View) dVar.f15479a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(dVar.f15484f);
        }
        this.f15476c.getContext().unregisterComponentCallbacks(this.f15477d);
    }

    @B(EnumC0438m.ON_RESUME)
    public final void onResume() {
        MapboxLogger.logI(StubApp.getString2(13948), StubApp.getString2(19120));
        this.f15474a.onResume();
    }

    @B(EnumC0438m.ON_START)
    public final void onStart() {
        MapboxLogger.logI(StubApp.getString2(13948), StubApp.getString2(19121));
        this.f15474a.onStart();
    }

    @B(EnumC0438m.ON_STOP)
    public final void onStop() {
        MapboxLogger.logI(StubApp.getString2(13948), StubApp.getString2(19122));
        this.f15474a.onStop();
    }
}
