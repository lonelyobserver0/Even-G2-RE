package Oa;

import android.view.ScaleGestureDetector;
import com.yalantis.ucrop.view.GestureCropImageView;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureCropImageView f5356a;

    public d(GestureCropImageView gestureCropImageView) {
        this.f5356a = gestureCropImageView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        GestureCropImageView gestureCropImageView = this.f5356a;
        gestureCropImageView.h(scaleFactor, gestureCropImageView.f12991P, gestureCropImageView.f12992R);
        return true;
    }
}
