package q3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.stub.StubApp;
import l4.O0;
import r3.C1566a;
import u3.C1773b;

/* renamed from: q3.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class HandlerC1519l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public C1514g f20046a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f20047b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f20048c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f20049d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20050e;

    public final void a(int i3, float f10, float f11, RectF rectF, boolean z2, int i10, boolean z10, boolean z11) {
        C1518k c1518k = new C1518k();
        c1518k.f20041d = i3;
        c1518k.f20038a = f10;
        c1518k.f20039b = f11;
        c1518k.f20040c = rectF;
        c1518k.f20042e = z2;
        c1518k.f20043f = i10;
        c1518k.f20044g = z10;
        c1518k.f20045h = z11;
        sendMessage(obtainMessage(1, c1518k));
    }

    public final C1773b b(C1518k c1518k) {
        C1517j c1517j = this.f20046a.f19991g;
        int i3 = c1518k.f20041d;
        int a3 = c1517j.a(i3);
        if (a3 >= 0) {
            synchronized (C1517j.f20020s) {
                try {
                    if (c1517j.f20026f.indexOfKey(a3) < 0) {
                        try {
                            c1517j.f20022b.j(c1517j.f20021a, a3);
                            c1517j.f20026f.put(a3, true);
                        } catch (Exception e10) {
                            c1517j.f20026f.put(a3, false);
                            throw new C1566a(i3, e10);
                        }
                    }
                } finally {
                }
            }
        }
        int round = Math.round(c1518k.f20038a);
        int round2 = Math.round(c1518k.f20039b);
        if (round != 0 && round2 != 0) {
            if (c1517j.f20026f.get(c1517j.a(c1518k.f20041d), false)) {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(round, round2, c1518k.f20044g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                    RectF rectF = c1518k.f20040c;
                    Matrix matrix = this.f20049d;
                    matrix.reset();
                    float f10 = round;
                    float f11 = round2;
                    matrix.postTranslate((-rectF.left) * f10, (-rectF.top) * f11);
                    matrix.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
                    RectF rectF2 = this.f20047b;
                    rectF2.set(0.0f, 0.0f, f10, f11);
                    matrix.mapRect(rectF2);
                    rectF2.round(this.f20048c);
                    int i10 = c1518k.f20041d;
                    Rect rect = this.f20048c;
                    c1517j.f20022b.l(c1517j.f20021a, createBitmap, c1517j.a(i10), rect.left, rect.top, rect.width(), rect.height(), c1518k.f20045h);
                    return new C1773b(c1518k.f20041d, createBitmap, c1518k.f20040c, c1518k.f20042e, c1518k.f20043f);
                } catch (IllegalArgumentException e11) {
                    Log.e(StubApp.getString2(22215), StubApp.getString2(22216), e11);
                }
            }
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1514g c1514g = this.f20046a;
        try {
            C1773b b2 = b((C1518k) message.obj);
            if (b2 != null) {
                if (this.f20050e) {
                    c1514g.post(new O0(this, b2, 8, false));
                } else {
                    b2.f21434b.recycle();
                }
            }
        } catch (C1566a e10) {
            c1514g.post(new O0(this, e10, 9, false));
        }
    }
}
