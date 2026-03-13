package b3;

import com.mapbox.maps.SnapshotStyleListener;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0518t implements SnapshotStyleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10654a;

    public C0518t(C0498N c0498n) {
        this.f10654a = c0498n;
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFailLoadingStyle(String str) {
        SnapshotStyleListener.DefaultImpls.onDidFailLoadingStyle(this, str);
    }

    @Override // com.mapbox.maps.SnapshotStyleListener
    public final void onDidFinishLoadingStyle(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f10654a.getClass();
        R2.c.b(StubApp.getString2(103), StubApp.getString2(9210));
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
