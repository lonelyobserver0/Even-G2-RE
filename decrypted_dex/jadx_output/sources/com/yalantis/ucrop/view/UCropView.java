package com.yalantis.ucrop.view;

import A0.c;
import Ja.a;
import Z9.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class UCropView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestureCropImageView f13022a;

    /* renamed from: b, reason: collision with root package name */
    public final OverlayView f13023b;

    public UCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2131427479, (ViewGroup) this, true);
        GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(2131230910);
        this.f13022a = gestureCropImageView;
        OverlayView overlayView = (OverlayView) findViewById(2131231161);
        this.f13023b = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3465b);
        overlayView.getClass();
        overlayView.f13010m = obtainStyledAttributes.getBoolean(2, false);
        int color = obtainStyledAttributes.getColor(3, overlayView.getResources().getColor(2131034389));
        overlayView.f13011n = color;
        Paint paint = overlayView.f13013q;
        paint.setColor(color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(2131100023));
        int color2 = obtainStyledAttributes.getColor(4, overlayView.getResources().getColor(2131034387));
        Paint paint2 = overlayView.f13015s;
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setColor(color2);
        paint2.setStyle(style);
        Paint paint3 = overlayView.f13016t;
        paint3.setStrokeWidth(dimensionPixelSize * 3);
        paint3.setColor(color2);
        paint3.setStyle(style);
        overlayView.f13008k = obtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(2131100024));
        int color3 = obtainStyledAttributes.getColor(6, overlayView.getResources().getColor(2131034388));
        Paint paint4 = overlayView.f13014r;
        paint4.setStrokeWidth(dimensionPixelSize2);
        paint4.setColor(color3);
        overlayView.f13005f = obtainStyledAttributes.getInt(8, 2);
        overlayView.f13006g = obtainStyledAttributes.getInt(7, 2);
        overlayView.f13009l = obtainStyledAttributes.getBoolean(11, true);
        gestureCropImageView.getClass();
        float abs = Math.abs(obtainStyledAttributes.getFloat(0, 0.0f));
        float abs2 = Math.abs(obtainStyledAttributes.getFloat(1, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            gestureCropImageView.f5355z = 0.0f;
        } else {
            gestureCropImageView.f5355z = abs / abs2;
        }
        obtainStyledAttributes.recycle();
        gestureCropImageView.setCropBoundsChangeListener(new c(this));
        overlayView.setOverlayViewChangeListener(new q(this, 15));
    }

    public GestureCropImageView getCropImageView() {
        return this.f13022a;
    }

    public OverlayView getOverlayView() {
        return this.f13023b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
