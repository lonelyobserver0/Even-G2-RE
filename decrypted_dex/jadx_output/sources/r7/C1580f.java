package r7;

import Ec.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stub.StubApp;
import i.HandlerC1022c;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.v;
import s7.C1604b;

/* renamed from: r7.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1580f extends View implements InterfaceC1576b {

    /* renamed from: a, reason: collision with root package name */
    public List f20381a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f20382b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f20383c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f20384d;

    /* renamed from: e, reason: collision with root package name */
    public String f20385e;

    /* renamed from: f, reason: collision with root package name */
    public float f20386f;

    /* renamed from: g, reason: collision with root package name */
    public float f20387g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20388h;
    public final HandlerC1022c j;

    /* renamed from: k, reason: collision with root package name */
    public final DecimalFormat f20389k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20390l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f20391m;

    /* renamed from: n, reason: collision with root package name */
    public C1604b f20392n;

    /* renamed from: p, reason: collision with root package name */
    public h f20393p;

    /* renamed from: q, reason: collision with root package name */
    public float f20394q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20381a = AbstractC1577c.f20374a;
        Paint paint = new Paint();
        this.f20382b = paint;
        Paint paint2 = new Paint();
        this.f20383c = paint2;
        Paint paint3 = new Paint();
        this.f20384d = paint3;
        this.f20385e = StubApp.getString2(22734);
        this.f20387g = 1.0f;
        this.f20389k = new DecimalFormat(StubApp.getString2(22735));
        this.f20392n = l.b(C1579e.f20377b);
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint2.setAntiAlias(true);
        Intrinsics.checkNotNullParameter(this, "scaleBarImpl");
        HandlerC1022c handlerC1022c = new HandlerC1022c(Looper.getMainLooper());
        handlerC1022c.f14569b = new WeakReference(this);
        if (getUseContinuousRendering()) {
            handlerC1022c.sendEmptyMessage(1);
        }
        this.j = handlerC1022c;
    }

    public static float b(float f10) {
        return ((int) (f10 * 10)) / 10.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0246, code lost:
    
        r10 = r21;
        r1 = r24;
        r2 = r26;
        r8 = r4;
        r4 = r6;
        r11 = r4;
        r0 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r7.h a(float r21, float r22, java.util.List r23, android.graphics.Paint r24, float r25, java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C1580f.a(float, float, java.util.List, android.graphics.Paint, float, java.lang.String, int):r7.h");
    }

    public final Paint getBarPaint$plugin_scalebar_release() {
        return this.f20383c;
    }

    public float getDistancePerPixel() {
        return this.f20394q;
    }

    public boolean getEnable() {
        return this.f20390l;
    }

    public float getMapViewWidth() {
        return this.f20386f;
    }

    public float getPixelRatio() {
        return this.f20387g;
    }

    public final List<Pair<Integer, Integer>> getScaleTable$plugin_scalebar_release() {
        return this.f20381a;
    }

    public C1604b getSettings() {
        return this.f20392n;
    }

    public final Paint getStrokePaint$plugin_scalebar_release() {
        return this.f20384d;
    }

    public final Paint getTextPaint$plugin_scalebar_release() {
        return this.f20382b;
    }

    public final String getUnit$plugin_scalebar_release() {
        return this.f20385e;
    }

    public boolean getUseContinuousRendering() {
        return this.f20388h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r22.f20391m != null) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C1580f.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        float pixelRatio = (getPixelRatio() * 10) + (getMapViewWidth() * getSettings().f20811t);
        C1604b settings = getSettings();
        Pair pair = new Pair(Float.valueOf(pixelRatio), Float.valueOf((settings.f20803k * 2) + settings.f20805m + settings.f20807p + settings.f20804l));
        setMeasuredDimension((int) ((Number) pair.first).floatValue(), (int) ((Number) pair.second).floatValue());
    }

    public void setDistancePerPixel(float f10) {
        if (!getSettings().f20808q) {
            f10 *= 3.2808f;
        }
        if (this.f20394q == f10) {
            return;
        }
        this.f20394q = f10;
        if (getUseContinuousRendering()) {
            this.f20391m = null;
            return;
        }
        if (Intrinsics.areEqual(a(getDistancePerPixel() * getMapViewWidth() * getSettings().f20811t, this.f20394q, this.f20381a, this.f20382b, this.f20384d.getStrokeWidth(), this.f20385e, getWidth()), this.f20393p)) {
            return;
        }
        HandlerC1022c handlerC1022c = this.j;
        if (handlerC1022c.hasMessages(0)) {
            return;
        }
        handlerC1022c.sendEmptyMessageDelayed(0, getSettings().f20809r);
    }

    public void setEnable(boolean z2) {
        this.f20390l = z2;
        if (getUseContinuousRendering()) {
            return;
        }
        setVisibility(z2 ? 0 : 8);
    }

    public void setMapViewWidth(float f10) {
        this.f20386f = f10;
        post(new v(this, 1));
    }

    public void setPixelRatio(float f10) {
        this.f20387g = f10;
    }

    public final void setScaleTable$plugin_scalebar_release(List<? extends Pair<Integer, Integer>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f20381a = list;
    }

    public void setSettings(C1604b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Paint paint = this.f20382b;
        paint.setColor(value.f20801g);
        float f10 = value.f20807p;
        paint.setTextSize(f10);
        Paint paint2 = this.f20384d;
        paint2.setTextSize(f10);
        boolean z2 = value.f20808q;
        this.f20381a = z2 ? AbstractC1577c.f20374a : AbstractC1577c.f20375b;
        this.f20385e = z2 ? StubApp.getString2(22734) : StubApp.getString2(22738);
        paint2.setStrokeWidth(value.f20810s ? value.f20806n : 0.0f);
        setEnable(value.f20795a);
        setUseContinuousRendering(value.f20812v);
        if (getUseContinuousRendering()) {
            this.f20391m = null;
        } else {
            HandlerC1022c handlerC1022c = this.j;
            if (!handlerC1022c.hasMessages(0)) {
                handlerC1022c.sendEmptyMessageDelayed(0, value.f20809r);
            }
        }
        this.f20392n = value;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = value.f20796b;
            layoutParams2.setMargins((int) value.f20797c, (int) value.f20798d, (int) value.f20799e, (int) value.f20800f);
        }
        setMapViewWidth(getMapViewWidth());
    }

    public final void setUnit$plugin_scalebar_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f20385e = str;
    }

    public void setUseContinuousRendering(boolean z2) {
        HandlerC1022c handlerC1022c = this.j;
        if (z2) {
            if (!this.f20390l) {
                setVisibility(0);
            }
            handlerC1022c.removeMessages(0);
            handlerC1022c.sendEmptyMessage(1);
        } else {
            if (!this.f20390l) {
                setVisibility(8);
            }
            handlerC1022c.removeMessages(1);
            this.f20391m = null;
        }
        this.f20388h = z2;
    }
}
