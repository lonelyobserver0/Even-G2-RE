package m6;

import a0.C0379a;
import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P3.m f17119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(P3.m mVar, Context context) {
        super(context, 3);
        this.f17119a = mVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i3) {
        int rotation;
        P3.m mVar = this.f17119a;
        WindowManager windowManager = (WindowManager) mVar.f5529c;
        C0379a c0379a = (C0379a) mVar.f5531e;
        if (windowManager == null || c0379a == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == mVar.f5528b) {
            return;
        }
        mVar.f5528b = rotation;
        ((BarcodeView) c0379a.f9233b).f17070c.postDelayed(new B0.o(c0379a, 27), 250L);
    }
}
