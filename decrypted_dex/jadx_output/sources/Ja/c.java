package Ja;

import Oa.e;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.TextView;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements e, Pa.a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f3468c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3469a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3470b;

    public /* synthetic */ c() {
        this.f3469a = 4;
    }

    @Override // Pa.a
    public void a() {
        switch (this.f3469a) {
            case 1:
                ((UCropActivity) this.f3470b).f12971R.setImageToWrapCropBounds(true);
                break;
            default:
                ((UCropActivity) this.f3470b).f12971R.setImageToWrapCropBounds(true);
                break;
        }
    }

    @Override // Pa.a
    public void b(float f10) {
        switch (this.f3469a) {
            case 1:
                GestureCropImageView gestureCropImageView = ((UCropActivity) this.f3470b).f12971R;
                float f11 = f10 / 42.0f;
                RectF rectF = gestureCropImageView.f5353x;
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                if (f11 != 0.0f) {
                    Matrix matrix = gestureCropImageView.f5360g;
                    matrix.postRotate(f11, centerX, centerY);
                    gestureCropImageView.setImageMatrix(matrix);
                    e eVar = gestureCropImageView.f5362k;
                    if (eVar != null) {
                        float[] fArr = gestureCropImageView.f5359f;
                        matrix.getValues(fArr);
                        double d8 = fArr[1];
                        matrix.getValues(fArr);
                        float f12 = (float) (-(Math.atan2(d8, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((c) eVar).f3470b).f12979n0;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), StubApp.getString2(3096), Float.valueOf(f12)));
                            break;
                        }
                    }
                }
                break;
            default:
                UCropActivity uCropActivity = (UCropActivity) this.f3470b;
                if (f10 <= 0.0f) {
                    GestureCropImageView gestureCropImageView2 = uCropActivity.f12971R;
                    float maxScale = (((uCropActivity.f12971R.getMaxScale() - uCropActivity.f12971R.getMinScale()) / 15000.0f) * f10) + gestureCropImageView2.getCurrentScale();
                    RectF rectF2 = gestureCropImageView2.f5353x;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    if (maxScale >= gestureCropImageView2.getMinScale()) {
                        gestureCropImageView2.h(maxScale / gestureCropImageView2.getCurrentScale(), centerX2, centerY2);
                        break;
                    }
                } else {
                    GestureCropImageView gestureCropImageView3 = uCropActivity.f12971R;
                    float maxScale2 = (((uCropActivity.f12971R.getMaxScale() - uCropActivity.f12971R.getMinScale()) / 15000.0f) * f10) + gestureCropImageView3.getCurrentScale();
                    RectF rectF3 = gestureCropImageView3.f5353x;
                    gestureCropImageView3.i(maxScale2, rectF3.centerX(), rectF3.centerY());
                    break;
                }
                break;
        }
    }

    @Override // Pa.a
    public void c() {
        switch (this.f3469a) {
            case 1:
                ((UCropActivity) this.f3470b).f12971R.f();
                break;
            default:
                ((UCropActivity) this.f3470b).f12971R.f();
                break;
        }
    }

    public void d(float f10) {
        TextView textView = ((UCropActivity) this.f3470b).f12980o0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), StubApp.getString2(3097), Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    public /* synthetic */ c(UCropActivity uCropActivity, int i3) {
        this.f3469a = i3;
        this.f3470b = uCropActivity;
    }
}
