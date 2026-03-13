package com.journeyapps.barcodescanner;

import N5.d;
import N5.h;
import P3.m;
import Y3.a;
import Z9.C0366a;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import com.stub.StubApp;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import m6.InterfaceC1273a;
import m6.c;
import m6.e;
import m6.i;
import m6.j;
import m6.k;
import m6.l;
import m6.n;
import m6.o;
import m6.p;
import n6.RunnableC1390d;
import n6.f;
import r0.C1552m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BarcodeView extends e {

    /* renamed from: E, reason: collision with root package name */
    public int f12253E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC1273a f12254F;

    /* renamed from: G, reason: collision with root package name */
    public l f12255G;

    /* renamed from: H, reason: collision with root package name */
    public j f12256H;

    /* renamed from: I, reason: collision with root package name */
    public final Handler f12257I;

    public BarcodeView(Activity activity) {
        super(activity);
        this.f12253E = 1;
        this.f12254F = null;
        c cVar = new c(this, 0);
        this.f12256H = new C1552m();
        this.f12257I = new Handler(cVar);
    }

    public j getDecoderFactory() {
        return this.f12256H;
    }

    public final i h() {
        i iVar;
        if (this.f12256H == null) {
            this.f12256H = new C1552m();
        }
        k kVar = new k();
        HashMap hashMap = new HashMap();
        hashMap.put(d.f4890k, kVar);
        C1552m c1552m = (C1552m) this.f12256H;
        c1552m.getClass();
        EnumMap enumMap = new EnumMap(d.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = (EnumMap) c1552m.f20171c;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Collection collection = (Collection) c1552m.f20170b;
        if (collection != null) {
            enumMap.put((EnumMap) d.f4884c, (d) collection);
        }
        String str = (String) c1552m.f20172d;
        if (str != null) {
            enumMap.put((EnumMap) d.f4886e, (d) str);
        }
        h hVar = new h();
        hVar.c(enumMap);
        int i3 = c1552m.f20169a;
        if (i3 == 0) {
            iVar = new i(hVar);
        } else if (i3 == 1) {
            iVar = new n(hVar);
        } else if (i3 != 2) {
            iVar = new i(hVar);
        } else {
            o oVar = new o(hVar);
            oVar.f17118c = true;
            iVar = oVar;
        }
        kVar.f17108a = iVar;
        return iVar;
    }

    public final void i() {
        TextureView textureView;
        SurfaceView surfaceView;
        k();
        a.C();
        Log.d(StubApp.getString2(1958), StubApp.getString2(12665));
        this.j = -1;
        f fVar = this.f17068a;
        if (fVar != null) {
            a.C();
            if (fVar.f17825f) {
                fVar.f17820a.d(fVar.f17830l);
            } else {
                fVar.f17826g = true;
            }
            fVar.f17825f = false;
            this.f17068a = null;
            this.f17074g = false;
        } else {
            this.f17070c.sendEmptyMessage(2131231182);
        }
        if (this.f17082r == null && (surfaceView = this.f17072e) != null) {
            surfaceView.getHolder().removeCallback(this.f17089z);
        }
        if (this.f17082r == null && (textureView = this.f17073f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f17079n = null;
        this.f17080p = null;
        this.f17084t = null;
        m mVar = this.f17075h;
        p pVar = (p) mVar.f5530d;
        if (pVar != null) {
            pVar.disable();
        }
        mVar.f5530d = null;
        mVar.f5529c = null;
        mVar.f5531e = null;
        this.f17067C.j();
    }

    public final void j() {
        k();
        if (this.f12253E == 1 || !this.f17074g) {
            return;
        }
        l lVar = new l(getCameraInstance(), h(), this.f12257I);
        this.f12255G = lVar;
        lVar.f17115g = getPreviewFramingRect();
        l lVar2 = this.f12255G;
        lVar2.getClass();
        a.C();
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(1314));
        lVar2.f17112d = handlerThread;
        handlerThread.start();
        lVar2.f17109a = new Handler(((HandlerThread) lVar2.f17112d).getLooper(), (J4.e) lVar2.f17117i);
        lVar2.f17110b = true;
        f fVar = (f) lVar2.f17111c;
        fVar.f17827h.post(new RunnableC1390d(fVar, (C0366a) lVar2.j, 0));
    }

    public final void k() {
        l lVar = this.f12255G;
        if (lVar != null) {
            lVar.getClass();
            a.C();
            synchronized (lVar.f17116h) {
                lVar.f17110b = false;
                lVar.f17109a.removeCallbacksAndMessages(null);
                ((HandlerThread) lVar.f17112d).quit();
            }
            this.f12255G = null;
        }
    }

    public void setDecoderFactory(j jVar) {
        a.C();
        this.f12256H = jVar;
        l lVar = this.f12255G;
        if (lVar != null) {
            lVar.f17114f = h();
        }
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12253E = 1;
        this.f12254F = null;
        c cVar = new c(this, 0);
        this.f12256H = new C1552m();
        this.f12257I = new Handler(cVar);
    }
}
