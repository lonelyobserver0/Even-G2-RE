package com.yalantis.ucrop.view;

import Oa.c;
import Oa.e;
import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.TextView;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import java.util.Locale;
import s2.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class GestureCropImageView extends c {

    /* renamed from: K, reason: collision with root package name */
    public ScaleGestureDetector f12988K;

    /* renamed from: L, reason: collision with root package name */
    public Na.c f12989L;

    /* renamed from: O, reason: collision with root package name */
    public GestureDetector f12990O;

    /* renamed from: P, reason: collision with root package name */
    public float f12991P;

    /* renamed from: R, reason: collision with root package name */
    public float f12992R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f12993T;
    public boolean h0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f12994k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f12995l0;

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12993T = true;
        this.h0 = true;
        this.f12994k0 = true;
        this.f12995l0 = 5;
    }

    public int getDoubleTapScaleSteps() {
        return this.f12995l0;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f12995l0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            f();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f12991P = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f12992R = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        if (this.f12994k0) {
            this.f12990O.onTouchEvent(motionEvent);
        }
        if (this.h0) {
            this.f12988K.onTouchEvent(motionEvent);
        }
        if (this.f12993T) {
            Na.c cVar = this.f12989L;
            cVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                cVar.f4962c = motionEvent.getX();
                cVar.f4963d = motionEvent.getY();
                cVar.f4964e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                cVar.f4966g = 0.0f;
                cVar.f4967h = true;
            } else if (actionMasked == 1) {
                cVar.f4964e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    cVar.f4960a = motionEvent.getX();
                    cVar.f4961b = motionEvent.getY();
                    cVar.f4965f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    cVar.f4966g = 0.0f;
                    cVar.f4967h = true;
                } else if (actionMasked == 6) {
                    cVar.f4965f = -1;
                }
            } else if (cVar.f4964e != -1 && cVar.f4965f != -1 && motionEvent.getPointerCount() > cVar.f4965f) {
                float x7 = motionEvent.getX(cVar.f4964e);
                float y10 = motionEvent.getY(cVar.f4964e);
                float x10 = motionEvent.getX(cVar.f4965f);
                float y11 = motionEvent.getY(cVar.f4965f);
                if (cVar.f4967h) {
                    cVar.f4966g = 0.0f;
                    cVar.f4967h = false;
                } else {
                    float f10 = cVar.f4960a;
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y11 - y10, x10 - x7))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(cVar.f4961b - cVar.f4963d, f10 - cVar.f4962c))) % 360.0f);
                    cVar.f4966g = degrees;
                    if (degrees < -180.0f) {
                        cVar.f4966g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        cVar.f4966g = degrees - 360.0f;
                    }
                }
                d dVar = cVar.f4968i;
                float f11 = cVar.f4966g;
                GestureCropImageView gestureCropImageView = (GestureCropImageView) dVar.f20712b;
                float f12 = gestureCropImageView.f12991P;
                float f13 = gestureCropImageView.f12992R;
                if (f11 != 0.0f) {
                    Matrix matrix = gestureCropImageView.f5360g;
                    matrix.postRotate(f11, f12, f13);
                    gestureCropImageView.setImageMatrix(matrix);
                    e eVar = gestureCropImageView.f5362k;
                    if (eVar != null) {
                        float[] fArr = gestureCropImageView.f5359f;
                        matrix.getValues(fArr);
                        double d8 = fArr[1];
                        matrix.getValues(fArr);
                        float f14 = (float) (-(Math.atan2(d8, fArr[0]) * 57.29577951308232d));
                        TextView textView = ((UCropActivity) ((Ja.c) eVar).f3470b).f12979n0;
                        if (textView != null) {
                            textView.setText(String.format(Locale.getDefault(), StubApp.getString2(3096), Float.valueOf(f14)));
                        }
                    }
                }
                cVar.f4960a = x10;
                cVar.f4961b = y11;
                cVar.f4962c = x7;
                cVar.f4963d = y10;
            }
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i3) {
        this.f12995l0 = i3;
    }

    public void setGestureEnabled(boolean z2) {
        this.f12994k0 = z2;
    }

    public void setRotateEnabled(boolean z2) {
        this.f12993T = z2;
    }

    public void setScaleEnabled(boolean z2) {
        this.h0 = z2;
    }
}
