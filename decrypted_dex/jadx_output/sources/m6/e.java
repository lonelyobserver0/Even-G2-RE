package m6;

import a0.C0379a;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import com.stub.StubApp;
import java.util.ArrayList;
import r0.C1552m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e extends ViewGroup {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f17064D = 0;

    /* renamed from: A, reason: collision with root package name */
    public final c f17065A;

    /* renamed from: B, reason: collision with root package name */
    public final C0379a f17066B;

    /* renamed from: C, reason: collision with root package name */
    public final d f17067C;

    /* renamed from: a, reason: collision with root package name */
    public n6.f f17068a;

    /* renamed from: b, reason: collision with root package name */
    public WindowManager f17069b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f17070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17071d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceView f17072e;

    /* renamed from: f, reason: collision with root package name */
    public TextureView f17073f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17074g;

    /* renamed from: h, reason: collision with root package name */
    public P3.m f17075h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f17076k;

    /* renamed from: l, reason: collision with root package name */
    public Bc.i f17077l;

    /* renamed from: m, reason: collision with root package name */
    public n6.i f17078m;

    /* renamed from: n, reason: collision with root package name */
    public q f17079n;

    /* renamed from: p, reason: collision with root package name */
    public q f17080p;

    /* renamed from: q, reason: collision with root package name */
    public Rect f17081q;

    /* renamed from: r, reason: collision with root package name */
    public q f17082r;

    /* renamed from: s, reason: collision with root package name */
    public Rect f17083s;

    /* renamed from: t, reason: collision with root package name */
    public Rect f17084t;

    /* renamed from: v, reason: collision with root package name */
    public q f17085v;

    /* renamed from: w, reason: collision with root package name */
    public double f17086w;

    /* renamed from: x, reason: collision with root package name */
    public n6.l f17087x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17088y;

    /* renamed from: z, reason: collision with root package name */
    public final Xa.k f17089z;

    public e(Activity activity) {
        super(activity);
        this.f17071d = false;
        this.f17074g = false;
        this.j = -1;
        this.f17076k = new ArrayList();
        this.f17078m = new n6.i();
        this.f17083s = null;
        this.f17084t = null;
        this.f17085v = null;
        this.f17086w = 0.1d;
        this.f17087x = null;
        this.f17088y = false;
        BarcodeView barcodeView = (BarcodeView) this;
        int i3 = 1;
        this.f17089z = new Xa.k(barcodeView, i3);
        this.f17065A = new c(barcodeView, i3);
        this.f17066B = new C0379a(barcodeView, 16);
        this.f17067C = new d(barcodeView, 0);
        c(activity, null);
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.f17068a == null || barcodeView.getDisplayRotation() == barcodeView.j) {
            return;
        }
        barcodeView.i();
        barcodeView.e();
    }

    private int getDisplayRotation() {
        return this.f17069b.getDefaultDisplay().getRotation();
    }

    public Rect b(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f17085v != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f17085v.f17120a) / 2), Math.max(0, (rect3.height() - this.f17085v.f17121b) / 2));
            return rect3;
        }
        int min = (int) Math.min(rect3.width() * this.f17086w, rect3.height() * this.f17086w);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        d(attributeSet);
        this.f17069b = (WindowManager) context.getSystemService(StubApp.getString2(526));
        this.f17070c = new Handler(this.f17065A);
        this.f17075h = new P3.m(3);
    }

    public final void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R5.g.f6220a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f17085v = new q(dimension, dimension2);
        }
        this.f17071d = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f17087x = new n6.j(0);
        } else if (integer == 2) {
            this.f17087x = new n6.j(1);
        } else if (integer == 3) {
            this.f17087x = new n6.j(2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void e() {
        int i3 = 1;
        int i10 = 0;
        Y3.a.C();
        Log.d(StubApp.getString2(1958), StubApp.getString2(21074));
        if (this.f17068a != null) {
            Log.w(StubApp.getString2(1958), StubApp.getString2(21075));
        } else {
            Context context = getContext();
            n6.f fVar = new n6.f();
            fVar.f17825f = false;
            fVar.f17826g = true;
            fVar.f17828i = new n6.i();
            n6.e eVar = new n6.e(fVar, i10);
            fVar.j = new n6.e(fVar, i3);
            fVar.f17829k = new n6.e(fVar, 2);
            fVar.f17830l = new n6.e(fVar, 3);
            Y3.a.C();
            if (C1552m.f20168f == null) {
                C1552m c1552m = new C1552m();
                c1552m.f20169a = 0;
                c1552m.f20172d = new Object();
                C1552m.f20168f = c1552m;
            }
            C1552m c1552m2 = C1552m.f20168f;
            fVar.f17820a = c1552m2;
            n6.h hVar = new n6.h(context);
            fVar.f17822c = hVar;
            hVar.f17841g = fVar.f17828i;
            fVar.f17827h = new Handler();
            n6.i iVar = this.f17078m;
            if (!fVar.f17825f) {
                fVar.f17828i = iVar;
                hVar.f17841g = iVar;
            }
            this.f17068a = fVar;
            fVar.f17823d = this.f17070c;
            Y3.a.C();
            fVar.f17825f = true;
            fVar.f17826g = false;
            synchronized (c1552m2.f20172d) {
                c1552m2.f20169a++;
                c1552m2.d(eVar);
            }
            this.j = getDisplayRotation();
        }
        if (this.f17082r != null) {
            g();
        } else {
            SurfaceView surfaceView = this.f17072e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f17089z);
            } else {
                TextureView textureView = this.f17073f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f17073f.getSurfaceTexture();
                        this.f17082r = new q(this.f17073f.getWidth(), this.f17073f.getHeight());
                        g();
                    } else {
                        this.f17073f.setSurfaceTextureListener(new Xa.m(this, i3));
                    }
                }
            }
        }
        requestLayout();
        P3.m mVar = this.f17075h;
        Context context2 = getContext();
        C0379a c0379a = this.f17066B;
        p pVar = (p) mVar.f5530d;
        if (pVar != null) {
            pVar.disable();
        }
        mVar.f5530d = null;
        mVar.f5529c = null;
        mVar.f5531e = null;
        Context origApplicationContext = StubApp.getOrigApplicationContext(context2.getApplicationContext());
        mVar.f5531e = c0379a;
        mVar.f5529c = (WindowManager) origApplicationContext.getSystemService(StubApp.getString2(526));
        p pVar2 = new p(mVar, origApplicationContext);
        mVar.f5530d = pVar2;
        pVar2.enable();
        mVar.f5528b = ((WindowManager) mVar.f5529c).getDefaultDisplay().getRotation();
    }

    public final void f(V6.b bVar) {
        if (this.f17074g || this.f17068a == null) {
            return;
        }
        Log.i(StubApp.getString2(1958), StubApp.getString2(21076));
        n6.f fVar = this.f17068a;
        fVar.f17821b = bVar;
        Y3.a.C();
        if (!fVar.f17825f) {
            throw new IllegalStateException(StubApp.getString2(21077));
        }
        fVar.f17820a.d(fVar.f17829k);
        this.f17074g = true;
        ((BarcodeView) this).j();
        this.f17067C.g();
    }

    public final void g() {
        Rect rect;
        float f10;
        q qVar = this.f17082r;
        if (qVar == null || this.f17080p == null || (rect = this.f17081q) == null) {
            return;
        }
        if (this.f17072e != null && qVar.equals(new q(rect.width(), this.f17081q.height()))) {
            SurfaceHolder holder = this.f17072e.getHolder();
            V6.b bVar = new V6.b(26, false);
            if (holder == null) {
                throw new IllegalArgumentException(StubApp.getString2(21078));
            }
            bVar.f7761b = holder;
            f(bVar);
            return;
        }
        TextureView textureView = this.f17073f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f17080p != null) {
            int width = this.f17073f.getWidth();
            int height = this.f17073f.getHeight();
            q qVar2 = this.f17080p;
            float f11 = height;
            float f12 = width / f11;
            float f13 = qVar2.f17120a / qVar2.f17121b;
            float f14 = 1.0f;
            if (f12 < f13) {
                float f15 = f13 / f12;
                f10 = 1.0f;
                f14 = f15;
            } else {
                f10 = f12 / f13;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f14, f10);
            float f16 = width;
            matrix.postTranslate((f16 - (f14 * f16)) / 2.0f, (f11 - (f10 * f11)) / 2.0f);
            this.f17073f.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.f17073f.getSurfaceTexture();
        V6.b bVar2 = new V6.b(26, false);
        if (surfaceTexture == null) {
            throw new IllegalArgumentException(StubApp.getString2(21079));
        }
        bVar2.f7762c = surfaceTexture;
        f(bVar2);
    }

    public n6.f getCameraInstance() {
        return this.f17068a;
    }

    public n6.i getCameraSettings() {
        return this.f17078m;
    }

    public Rect getFramingRect() {
        return this.f17083s;
    }

    public q getFramingRectSize() {
        return this.f17085v;
    }

    public double getMarginFraction() {
        return this.f17086w;
    }

    public Rect getPreviewFramingRect() {
        return this.f17084t;
    }

    public n6.l getPreviewScalingStrategy() {
        n6.l lVar = this.f17087x;
        return lVar != null ? lVar : this.f17073f != null ? new n6.j(0) : new n6.j(1);
    }

    public q getPreviewSize() {
        return this.f17080p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17071d) {
            TextureView textureView = new TextureView(getContext());
            this.f17073f = textureView;
            textureView.setSurfaceTextureListener(new Xa.m(this, 1));
            addView(this.f17073f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f17072e = surfaceView;
        surfaceView.getHolder().addCallback(this.f17089z);
        addView(this.f17072e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i10, int i11, int i12) {
        q qVar = new q(i11 - i3, i12 - i10);
        this.f17079n = qVar;
        n6.f fVar = this.f17068a;
        if (fVar != null && fVar.f17824e == null) {
            int displayRotation = getDisplayRotation();
            Bc.i iVar = new Bc.i(13, (byte) 0);
            iVar.f768d = new n6.j(1);
            iVar.f766b = displayRotation;
            iVar.f767c = qVar;
            this.f17077l = iVar;
            iVar.f768d = getPreviewScalingStrategy();
            n6.f fVar2 = this.f17068a;
            Bc.i iVar2 = this.f17077l;
            fVar2.f17824e = iVar2;
            fVar2.f17822c.f17842h = iVar2;
            Y3.a.C();
            if (!fVar2.f17825f) {
                throw new IllegalStateException(StubApp.getString2(21077));
            }
            fVar2.f17820a.d(fVar2.j);
            boolean z10 = this.f17088y;
            if (z10) {
                n6.f fVar3 = this.f17068a;
                fVar3.getClass();
                Y3.a.C();
                if (fVar3.f17825f) {
                    fVar3.f17820a.d(new R5.a(2, fVar3, z10));
                }
            }
        }
        SurfaceView surfaceView = this.f17072e;
        if (surfaceView == null) {
            TextureView textureView = this.f17073f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f17081q;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(StubApp.getString2(21080)));
        setTorch(bundle.getBoolean(StubApp.getString2(21081)));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(StubApp.getString2(21080), onSaveInstanceState);
        bundle.putBoolean(StubApp.getString2(21081), this.f17088y);
        return bundle;
    }

    public void setCameraSettings(n6.i iVar) {
        this.f17078m = iVar;
    }

    public void setFramingRectSize(q qVar) {
        this.f17085v = qVar;
    }

    public void setMarginFraction(double d8) {
        if (d8 >= 0.5d) {
            throw new IllegalArgumentException(StubApp.getString2(21082));
        }
        this.f17086w = d8;
    }

    public void setPreviewScalingStrategy(n6.l lVar) {
        this.f17087x = lVar;
    }

    public void setTorch(boolean z2) {
        this.f17088y = z2;
        n6.f fVar = this.f17068a;
        if (fVar != null) {
            Y3.a.C();
            if (fVar.f17825f) {
                fVar.f17820a.d(new R5.a(2, fVar, z2));
            }
        }
    }

    public void setUseTextureView(boolean z2) {
        this.f17071d = z2;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17071d = false;
        this.f17074g = false;
        this.j = -1;
        this.f17076k = new ArrayList();
        this.f17078m = new n6.i();
        this.f17083s = null;
        this.f17084t = null;
        this.f17085v = null;
        this.f17086w = 0.1d;
        this.f17087x = null;
        this.f17088y = false;
        BarcodeView barcodeView = (BarcodeView) this;
        int i3 = 1;
        this.f17089z = new Xa.k(barcodeView, i3);
        this.f17065A = new c(barcodeView, i3);
        this.f17066B = new C0379a(barcodeView, 16);
        this.f17067C = new d(barcodeView, 0);
        c(context, attributeSet);
    }
}
