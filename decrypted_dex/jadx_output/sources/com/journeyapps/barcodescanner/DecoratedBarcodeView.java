package com.journeyapps.barcodescanner;

import R5.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.stub.StubApp;
import m6.j;
import m6.m;
import n6.i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeView f12260a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewfinderView f12261b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f12262c;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f6222c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 2131427480);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(2131231181);
        this.f12260a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException(StubApp.getString2(12683));
        }
        barcodeView.d(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(2131231191);
        this.f12261b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException(StubApp.getString2(12682));
        }
        viewfinderView.setCameraPreview(this.f12260a);
        this.f12262c = (TextView) findViewById(2131231190);
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(2131231181);
    }

    public i getCameraSettings() {
        return this.f12260a.getCameraSettings();
    }

    public j getDecoderFactory() {
        return this.f12260a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f12262c;
    }

    public ViewfinderView getViewFinder() {
        return this.f12261b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 == 24) {
            this.f12260a.setTorch(true);
            return true;
        }
        if (i3 == 25) {
            this.f12260a.setTorch(false);
            return true;
        }
        if (i3 == 27 || i3 == 80) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    public void setCameraSettings(i iVar) {
        this.f12260a.setCameraSettings(iVar);
    }

    public void setDecoderFactory(j jVar) {
        this.f12260a.setDecoderFactory(jVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f12262c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(m mVar) {
    }
}
