package com.journeyapps.barcodescanner;

import N5.o;
import R5.g;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import m6.d;
import m6.e;
import m6.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ViewfinderView extends View {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f12263m = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f12264a;

    /* renamed from: b, reason: collision with root package name */
    public int f12265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12266c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12267d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12268e;

    /* renamed from: f, reason: collision with root package name */
    public int f12269f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f12270g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f12271h;
    public e j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f12272k;

    /* renamed from: l, reason: collision with root package name */
    public q f12273l;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12264a = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f6221b);
        this.f12265b = obtainStyledAttributes.getColor(4, resources.getColor(2131034415));
        obtainStyledAttributes.getColor(1, resources.getColor(2131034411));
        this.f12266c = obtainStyledAttributes.getColor(2, resources.getColor(2131034414));
        this.f12267d = obtainStyledAttributes.getColor(0, resources.getColor(2131034410));
        this.f12268e = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.f12269f = 0;
        this.f12270g = new ArrayList(20);
        this.f12271h = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        q qVar;
        e eVar = this.j;
        if (eVar != null) {
            Rect framingRect = eVar.getFramingRect();
            q previewSize = this.j.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f12272k = framingRect;
                this.f12273l = previewSize;
            }
        }
        Rect rect = this.f12272k;
        if (rect == null || (qVar = this.f12273l) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Paint paint = this.f12264a;
        paint.setColor(this.f12265b);
        float f10 = width;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, height, paint);
        if (this.f12268e) {
            paint.setColor(this.f12266c);
            paint.setAlpha(f12263m[this.f12269f]);
            this.f12269f = (this.f12269f + 1) % 8;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, paint);
        }
        float width2 = getWidth() / qVar.f17120a;
        float height3 = getHeight() / qVar.f17121b;
        boolean isEmpty = this.f12271h.isEmpty();
        int i3 = this.f12267d;
        if (!isEmpty) {
            paint.setAlpha(80);
            paint.setColor(i3);
            Iterator it = this.f12271h.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                canvas.drawCircle((int) (oVar.f4926a * width2), (int) (oVar.f4927b * height3), 3.0f, paint);
            }
            this.f12271h.clear();
        }
        if (!this.f12270g.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i3);
            Iterator it2 = this.f12270g.iterator();
            while (it2.hasNext()) {
                o oVar2 = (o) it2.next();
                canvas.drawCircle((int) (oVar2.f4926a * width2), (int) (oVar2.f4927b * height3), 6.0f, paint);
            }
            ArrayList arrayList = this.f12270g;
            ArrayList arrayList2 = this.f12271h;
            this.f12270g = arrayList2;
            this.f12271h = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(e eVar) {
        this.j = eVar;
        eVar.f17076k.add(new d(this, 2));
    }

    public void setLaserVisibility(boolean z2) {
        this.f12268e = z2;
    }

    public void setMaskColor(int i3) {
        this.f12265b = i3;
    }
}
