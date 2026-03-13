package q3;

import B3.s;
import D5.B;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p0.AbstractC1482f;
import u3.C1773b;
import v3.InterfaceC1832a;
import x3.EnumC1907a;

/* renamed from: q3.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1514g extends RelativeLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f19970A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f19971B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f19972C;

    /* renamed from: D, reason: collision with root package name */
    public PdfiumCore f19973D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f19974E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f19975F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f19976G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f19977H;

    /* renamed from: I, reason: collision with root package name */
    public PaintFlagsDrawFilter f19978I;

    /* renamed from: K, reason: collision with root package name */
    public int f19979K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f19980L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f19981O;

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f19982P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f19983R;

    /* renamed from: T, reason: collision with root package name */
    public C1513f f19984T;

    /* renamed from: a, reason: collision with root package name */
    public float f19985a;

    /* renamed from: b, reason: collision with root package name */
    public float f19986b;

    /* renamed from: c, reason: collision with root package name */
    public float f19987c;

    /* renamed from: d, reason: collision with root package name */
    public B f19988d;

    /* renamed from: e, reason: collision with root package name */
    public C1510c f19989e;

    /* renamed from: f, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC1512e f19990f;

    /* renamed from: g, reason: collision with root package name */
    public C1517j f19991g;

    /* renamed from: h, reason: collision with root package name */
    public int f19992h;
    public int h0;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f19993k;

    /* renamed from: l, reason: collision with root package name */
    public float f19994l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19995m;

    /* renamed from: n, reason: collision with root package name */
    public AsyncTaskC1511d f19996n;

    /* renamed from: p, reason: collision with root package name */
    public HandlerThread f19997p;

    /* renamed from: q, reason: collision with root package name */
    public HandlerC1519l f19998q;

    /* renamed from: r, reason: collision with root package name */
    public C1516i f19999r;

    /* renamed from: s, reason: collision with root package name */
    public s f20000s;

    /* renamed from: t, reason: collision with root package name */
    public Paint f20001t;

    /* renamed from: v, reason: collision with root package name */
    public EnumC1907a f20002v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20003w;

    /* renamed from: x, reason: collision with root package name */
    public int f20004x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20005y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20006z;

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z2) {
        this.f19980L = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i3) {
        this.f20004x = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z2) {
        this.f20003w = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(EnumC1907a enumC1907a) {
        this.f20002v = enumC1907a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC1832a interfaceC1832a) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i3) {
        this.f19979K = (int) TypedValue.applyDimension(1, i3, getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z2) {
        this.f20005y = z2;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i3) {
        C1517j c1517j = this.f19991g;
        if (c1517j == null) {
            return true;
        }
        if (this.f20005y) {
            if (i3 < 0 && this.j < 0.0f) {
                return true;
            }
            if (i3 > 0) {
                return (c1517j.b().f12764a * this.f19994l) + this.j > ((float) getWidth());
            }
            return false;
        }
        if (i3 < 0 && this.j < 0.0f) {
            return true;
        }
        if (i3 <= 0) {
            return false;
        }
        return (c1517j.f20035p * this.f19994l) + this.j > ((float) getWidth());
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i3) {
        C1517j c1517j = this.f19991g;
        if (c1517j == null) {
            return true;
        }
        if (!this.f20005y) {
            if (i3 < 0 && this.f19993k < 0.0f) {
                return true;
            }
            if (i3 > 0) {
                return (c1517j.b().f12765b * this.f19994l) + this.f19993k > ((float) getHeight());
            }
            return false;
        }
        if (i3 < 0 && this.f19993k < 0.0f) {
            return true;
        }
        if (i3 <= 0) {
            return false;
        }
        return (c1517j.f20035p * this.f19994l) + this.f19993k > ((float) getHeight());
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        C1510c c1510c = this.f19989e;
        boolean computeScrollOffset = c1510c.f19937c.computeScrollOffset();
        C1514g c1514g = c1510c.f19935a;
        if (computeScrollOffset) {
            c1514g.n(r1.getCurrX(), r1.getCurrY());
            c1514g.l();
        } else if (c1510c.f19938d) {
            c1510c.f19938d = false;
            c1514g.m();
            c1510c.a();
            c1514g.o();
        }
    }

    public int getCurrentPage() {
        return this.f19992h;
    }

    public float getCurrentXOffset() {
        return this.j;
    }

    public float getCurrentYOffset() {
        return this.f19993k;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument;
        C1517j c1517j = this.f19991g;
        if (c1517j == null || (pdfDocument = c1517j.f20021a) == null) {
            return null;
        }
        return c1517j.f20022b.b(pdfDocument);
    }

    public float getMaxZoom() {
        return this.f19987c;
    }

    public float getMidZoom() {
        return this.f19986b;
    }

    public float getMinZoom() {
        return this.f19985a;
    }

    public int getPageCount() {
        C1517j c1517j = this.f19991g;
        if (c1517j == null) {
            return 0;
        }
        return c1517j.f20023c;
    }

    public EnumC1907a getPageFitPolicy() {
        return this.f20002v;
    }

    public float getPositionOffset() {
        float f10;
        float f11;
        int width;
        if (this.f20005y) {
            f10 = -this.f19993k;
            f11 = this.f19991g.f20035p * this.f19994l;
            width = getHeight();
        } else {
            f10 = -this.j;
            f11 = this.f19991g.f20035p * this.f19994l;
            width = getWidth();
        }
        float f12 = f10 / (f11 - width);
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        return f12;
    }

    public InterfaceC1832a getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.f19979K;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        C1517j c1517j = this.f19991g;
        if (c1517j == null) {
            return Collections.EMPTY_LIST;
        }
        PdfDocument pdfDocument = c1517j.f20021a;
        return pdfDocument == null ? new ArrayList() : c1517j.f20022b.f(pdfDocument);
    }

    public float getZoom() {
        return this.f19994l;
    }

    public final void h(Canvas canvas, C1773b c1773b) {
        float e10;
        float f10;
        RectF rectF = c1773b.f21435c;
        Bitmap bitmap = c1773b.f21434b;
        if (bitmap.isRecycled()) {
            return;
        }
        C1517j c1517j = this.f19991g;
        int i3 = c1773b.f21433a;
        SizeF f11 = c1517j.f(i3);
        if (this.f20005y) {
            f10 = this.f19991g.e(this.f19994l, i3);
            e10 = ((this.f19991g.b().f12764a - f11.f12764a) * this.f19994l) / 2.0f;
        } else {
            e10 = this.f19991g.e(this.f19994l, i3);
            f10 = ((this.f19991g.b().f12765b - f11.f12765b) * this.f19994l) / 2.0f;
        }
        canvas.translate(e10, f10);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float f12 = rectF.left * f11.f12764a;
        float f13 = this.f19994l;
        float f14 = f12 * f13;
        float f15 = rectF.top * f11.f12765b * f13;
        RectF rectF2 = new RectF((int) f14, (int) f15, (int) (f14 + (rectF.width() * f11.f12764a * this.f19994l)), (int) (f15 + (rectF.height() * r8 * this.f19994l)));
        float f16 = this.j + e10;
        float f17 = this.f19993k + f10;
        if (rectF2.left + f16 >= getWidth() || f16 + rectF2.right <= 0.0f || rectF2.top + f17 >= getHeight() || f17 + rectF2.bottom <= 0.0f) {
            canvas.translate(-e10, -f10);
        } else {
            canvas.drawBitmap(bitmap, rect, rectF2, this.f20001t);
            canvas.translate(-e10, -f10);
        }
    }

    public final int i(float f10, float f11) {
        boolean z2 = this.f20005y;
        if (z2) {
            f10 = f11;
        }
        float height = z2 ? getHeight() : getWidth();
        if (f10 > -1.0f) {
            return 0;
        }
        C1517j c1517j = this.f19991g;
        float f12 = this.f19994l;
        return f10 < ((-(c1517j.f20035p * f12)) + height) + 1.0f ? c1517j.f20023c - 1 : c1517j.c(-(f10 - (height / 2.0f)), f12);
    }

    public final int j(int i3) {
        if (!this.f19972C || i3 < 0) {
            return 4;
        }
        float f10 = this.f20005y ? this.f19993k : this.j;
        float f11 = -this.f19991g.e(this.f19994l, i3);
        int height = this.f20005y ? getHeight() : getWidth();
        float d8 = this.f19991g.d(this.f19994l, i3);
        float f12 = height;
        if (f12 >= d8) {
            return 2;
        }
        if (f10 >= f11) {
            return 1;
        }
        return f11 - d8 > f10 - f12 ? 3 : 4;
    }

    public final void k(int i3) {
        C1517j c1517j = this.f19991g;
        if (c1517j == null) {
            return;
        }
        if (i3 <= 0) {
            i3 = 0;
        } else {
            int i10 = c1517j.f20023c;
            if (i3 >= i10) {
                i3 = i10 - 1;
            }
        }
        float f10 = i3 == 0 ? 0.0f : -c1517j.e(this.f19994l, i3);
        if (this.f20005y) {
            n(this.j, f10);
        } else {
            n(f10, this.f19993k);
        }
        q(i3);
    }

    public final void l() {
        float f10;
        int width;
        if (this.f19991g.f20023c == 0) {
            return;
        }
        if (this.f20005y) {
            f10 = this.f19993k;
            width = getHeight();
        } else {
            f10 = this.j;
            width = getWidth();
        }
        int c10 = this.f19991g.c(-(f10 - (width / 2.0f)), this.f19994l);
        if (c10 < 0 || c10 > this.f19991g.f20023c - 1 || c10 == getCurrentPage()) {
            m();
        } else {
            q(c10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C1514g.m():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(float r6, float r7) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C1514g.n(float, float):void");
    }

    public final void o() {
        C1517j c1517j;
        int i3;
        int j;
        if (!this.f19972C || (c1517j = this.f19991g) == null || c1517j.f20023c == 0 || (j = j((i3 = i(this.j, this.f19993k)))) == 4) {
            return;
        }
        float r8 = r(i3, j);
        boolean z2 = this.f20005y;
        C1510c c1510c = this.f19989e;
        if (z2) {
            c1510c.c(this.f19993k, -r8);
        } else {
            c1510c.b(this.j, -r8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19997p == null) {
            this.f19997p = new HandlerThread(StubApp.getString2(22208));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p();
        HandlerThread handlerThread = this.f19997p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f19997p = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (isInEditMode()) {
            return;
        }
        if (this.f19977H) {
            canvas.setDrawFilter(this.f19978I);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.f19971B ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f19995m && this.h0 == 3) {
            float f10 = this.j;
            float f11 = this.f19993k;
            canvas.translate(f10, f11);
            B b2 = this.f19988d;
            synchronized (((ArrayList) b2.f1342c)) {
                arrayList = (ArrayList) b2.f1342c;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h(canvas, (C1773b) it.next());
            }
            B b10 = this.f19988d;
            synchronized (b10.f1343d) {
                arrayList2 = new ArrayList((PriorityQueue) b10.f1340a);
                arrayList2.addAll((PriorityQueue) b10.f1341b);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                h(canvas, (C1773b) it2.next());
                this.f20000s.getClass();
            }
            Iterator it3 = this.f19982P.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).getClass();
                this.f20000s.getClass();
            }
            this.f19982P.clear();
            this.f20000s.getClass();
            canvas.translate(-f10, -f11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        this.f19983R = true;
        C1513f c1513f = this.f19984T;
        if (c1513f != null) {
            c1513f.a();
        }
        if (isInEditMode() || this.h0 != 3) {
            return;
        }
        float f12 = (i11 * 0.5f) + (-this.j);
        float f13 = (i12 * 0.5f) + (-this.f19993k);
        if (this.f20005y) {
            f10 = f12 / this.f19991g.b().f12764a;
            f11 = this.f19991g.f20035p * this.f19994l;
        } else {
            C1517j c1517j = this.f19991g;
            f10 = f12 / (c1517j.f20035p * this.f19994l);
            f11 = c1517j.b().f12765b;
        }
        float f14 = f13 / f11;
        this.f19989e.e();
        this.f19991g.i(new Size(i3, i10));
        if (this.f20005y) {
            this.j = (i3 * 0.5f) + ((-f10) * this.f19991g.b().f12764a);
            this.f19993k = (i10 * 0.5f) + (this.f19991g.f20035p * this.f19994l * (-f14));
        } else {
            C1517j c1517j2 = this.f19991g;
            this.j = (i3 * 0.5f) + (c1517j2.f20035p * this.f19994l * (-f10));
            this.f19993k = (i10 * 0.5f) + ((-f14) * c1517j2.b().f12765b);
        }
        n(this.j, this.f19993k);
        l();
    }

    public final void p() {
        PdfDocument pdfDocument;
        this.f19984T = null;
        this.f19989e.e();
        this.f19990f.f19952g = false;
        HandlerC1519l handlerC1519l = this.f19998q;
        if (handlerC1519l != null) {
            handlerC1519l.f20050e = false;
            handlerC1519l.removeMessages(1);
        }
        AsyncTaskC1511d asyncTaskC1511d = this.f19996n;
        if (asyncTaskC1511d != null) {
            asyncTaskC1511d.cancel(true);
        }
        B b2 = this.f19988d;
        synchronized (b2.f1343d) {
            try {
                Iterator it = ((PriorityQueue) b2.f1340a).iterator();
                while (it.hasNext()) {
                    ((C1773b) it.next()).f21434b.recycle();
                }
                ((PriorityQueue) b2.f1340a).clear();
                Iterator it2 = ((PriorityQueue) b2.f1341b).iterator();
                while (it2.hasNext()) {
                    ((C1773b) it2.next()).f21434b.recycle();
                }
                ((PriorityQueue) b2.f1341b).clear();
            } finally {
            }
        }
        synchronized (((ArrayList) b2.f1342c)) {
            try {
                Iterator it3 = ((ArrayList) b2.f1342c).iterator();
                while (it3.hasNext()) {
                    ((C1773b) it3.next()).f21434b.recycle();
                }
                ((ArrayList) b2.f1342c).clear();
            } finally {
            }
        }
        C1517j c1517j = this.f19991g;
        if (c1517j != null) {
            PdfiumCore pdfiumCore = c1517j.f20022b;
            if (pdfiumCore != null && (pdfDocument = c1517j.f20021a) != null) {
                pdfiumCore.a(pdfDocument);
            }
            c1517j.f20021a = null;
            this.f19991g = null;
        }
        this.f19998q = null;
        this.f19993k = 0.0f;
        this.j = 0.0f;
        this.f19994l = 1.0f;
        this.f19995m = true;
        this.f20000s = new s(12);
        this.h0 = 1;
    }

    public final void q(int i3) {
        if (this.f19995m) {
            return;
        }
        C1517j c1517j = this.f19991g;
        if (i3 <= 0) {
            c1517j.getClass();
            i3 = 0;
        } else {
            int i10 = c1517j.f20023c;
            if (i3 >= i10) {
                i3 = i10 - 1;
            }
        }
        this.f19992h = i3;
        m();
        s sVar = this.f20000s;
        int i11 = this.f19992h;
        int i12 = this.f19991g.f20023c;
        s2.d dVar = (s2.d) sVar.f653e;
        if (dVar != null) {
            HashMap hashMap = new HashMap();
            AbstractC1482f.q(i11, hashMap, StubApp.getString2(6765), i12, StubApp.getString2(22209));
            ((Va.a) dVar.f20712b).f7914b.invokeMethod(StubApp.getString2(22210), hashMap);
        }
    }

    public final float r(int i3, int i10) {
        float e10 = this.f19991g.e(this.f19994l, i3);
        float height = this.f20005y ? getHeight() : getWidth();
        float d8 = this.f19991g.d(this.f19994l, i3);
        if (i10 == 2) {
            return (d8 / 2.0f) + (e10 - (height / 2.0f));
        }
        return i10 == 3 ? (e10 - height) + d8 : e10;
    }

    public final void s(float f10, PointF pointF) {
        float f11 = f10 / this.f19994l;
        this.f19994l = f10;
        float f12 = this.j * f11;
        float f13 = this.f19993k * f11;
        float f14 = pointF.x;
        float f15 = (f14 - (f14 * f11)) + f12;
        float f16 = pointF.y;
        n(f15, (f16 - (f11 * f16)) + f13);
    }

    public void setMaxZoom(float f10) {
        this.f19987c = f10;
    }

    public void setMidZoom(float f10) {
        this.f19986b = f10;
    }

    public void setMinZoom(float f10) {
        this.f19985a = f10;
    }

    public void setNightMode(boolean z2) {
        this.f19971B = z2;
        Paint paint = this.f20001t;
        if (z2) {
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        } else {
            paint.setColorFilter(null);
        }
    }

    public void setPageFling(boolean z2) {
        this.f19981O = z2;
    }

    public void setPageSnap(boolean z2) {
        this.f19972C = z2;
    }

    public void setPositionOffset(float f10) {
        if (this.f20005y) {
            n(this.j, ((-(this.f19991g.f20035p * this.f19994l)) + getHeight()) * f10);
        } else {
            n(((-(this.f19991g.f20035p * this.f19994l)) + getWidth()) * f10, this.f19993k);
        }
        l();
    }

    public void setSwipeEnabled(boolean z2) {
        this.f20006z = z2;
    }
}
