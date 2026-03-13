package Ja;

import Oa.e;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UCropActivity f3472b;

    public /* synthetic */ d(UCropActivity uCropActivity, int i3) {
        this.f3471a = i3;
        this.f3472b = uCropActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string2 = StubApp.getString2(3096);
        UCropActivity uCropActivity = this.f3472b;
        switch (this.f3471a) {
            case 0:
                GestureCropImageView gestureCropImageView = uCropActivity.f12971R;
                AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) ((ViewGroup) view).getChildAt(0);
                if (view.isSelected()) {
                    if (aspectRatioTextView.f13027d != 0.0f) {
                        float f10 = aspectRatioTextView.f13029f;
                        float f11 = aspectRatioTextView.f13030g;
                        aspectRatioTextView.f13029f = f11;
                        aspectRatioTextView.f13030g = f10;
                        aspectRatioTextView.f13027d = f11 / f10;
                    }
                    aspectRatioTextView.f();
                }
                gestureCropImageView.setTargetAspectRatio(aspectRatioTextView.f13027d);
                uCropActivity.f12971R.setImageToWrapCropBounds(true);
                if (!view.isSelected()) {
                    Iterator it = uCropActivity.f12978m0.iterator();
                    while (it.hasNext()) {
                        ViewGroup viewGroup = (ViewGroup) it.next();
                        viewGroup.setSelected(viewGroup == view);
                    }
                    break;
                }
                break;
            case 1:
                GestureCropImageView gestureCropImageView2 = uCropActivity.f12971R;
                float f12 = -gestureCropImageView2.getCurrentAngle();
                RectF rectF = gestureCropImageView2.f5353x;
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                if (f12 != 0.0f) {
                    Matrix matrix = gestureCropImageView2.f5360g;
                    matrix.postRotate(f12, centerX, centerY);
                    gestureCropImageView2.setImageMatrix(matrix);
                    e eVar = gestureCropImageView2.f5362k;
                    if (eVar != null) {
                        float[] fArr = gestureCropImageView2.f5359f;
                        matrix.getValues(fArr);
                        double d8 = fArr[1];
                        matrix.getValues(fArr);
                        float f13 = (float) (-(Math.atan2(d8, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((c) eVar).f3470b).f12979n0;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), string2, Float.valueOf(f13)));
                        }
                    }
                }
                uCropActivity.f12971R.setImageToWrapCropBounds(true);
                break;
            case 2:
                GestureCropImageView gestureCropImageView3 = uCropActivity.f12971R;
                float f14 = 90;
                RectF rectF2 = gestureCropImageView3.f5353x;
                float centerX2 = rectF2.centerX();
                float centerY2 = rectF2.centerY();
                if (f14 != 0.0f) {
                    Matrix matrix2 = gestureCropImageView3.f5360g;
                    matrix2.postRotate(f14, centerX2, centerY2);
                    gestureCropImageView3.setImageMatrix(matrix2);
                    e eVar2 = gestureCropImageView3.f5362k;
                    if (eVar2 != null) {
                        float[] fArr2 = gestureCropImageView3.f5359f;
                        matrix2.getValues(fArr2);
                        double d10 = fArr2[1];
                        matrix2.getValues(fArr2);
                        float f15 = (float) (-(Math.atan2(d10, fArr2[0]) * 57.29577951308232d));
                        TextView textView2 = ((UCropActivity) ((c) eVar2).f3470b).f12979n0;
                        if (textView2 != null) {
                            textView2.setText(String.format(Locale.getDefault(), string2, Float.valueOf(f15)));
                        }
                    }
                }
                uCropActivity.f12971R.setImageToWrapCropBounds(true);
                break;
            default:
                if (!view.isSelected()) {
                    int id = view.getId();
                    Bitmap.CompressFormat compressFormat = UCropActivity.f12959w0;
                    uCropActivity.w(id);
                    break;
                }
                break;
        }
    }
}
