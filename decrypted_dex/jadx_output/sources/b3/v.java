package b3;

import com.mapbox.maps.SnapshotStyleListener;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v implements SnapshotStyleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10656a;

    public v(C0498N c0498n) {
        this.f10656a = c0498n;
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFailLoadingStyle(String str) {
        SnapshotStyleListener.DefaultImpls.onDidFailLoadingStyle(this, str);
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFinishLoadingStyle(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        C0498N c0498n = this.f10656a;
        c0498n.getClass();
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9214));
        c0498n.f10557M0 = true;
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFullyLoadStyle(Style style) {
        SnapshotStyleListener.DefaultImpls.onDidFullyLoadStyle(this, style);
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onStyleImageMissing(String str) {
        SnapshotStyleListener.DefaultImpls.onStyleImageMissing(this, str);
    }
}
