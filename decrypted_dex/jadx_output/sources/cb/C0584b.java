package cb;

import Xa.C0361a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* renamed from: cb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0584b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f11057a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11058b;

    /* renamed from: c, reason: collision with root package name */
    public int f11059c;

    /* renamed from: d, reason: collision with root package name */
    public int f11060d;

    /* renamed from: e, reason: collision with root package name */
    public int f11061e;

    /* renamed from: f, reason: collision with root package name */
    public int f11062f;

    /* renamed from: g, reason: collision with root package name */
    public final C0361a f11063g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f11064h;
    public ViewTreeObserverOnGlobalFocusChangeListenerC0583a j;

    public C0584b(Context context, float f10, C0361a c0361a) {
        super(context, null);
        this.f11058b = f10;
        this.f11063g = c0361a;
        this.f11064h = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f11057a.getFinalMatrix());
        float f10 = this.f11058b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f11059c, -this.f11060d);
        return matrix;
    }

    public final void a() {
        ViewTreeObserverOnGlobalFocusChangeListenerC0583a viewTreeObserverOnGlobalFocusChangeListenerC0583a;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (viewTreeObserverOnGlobalFocusChangeListenerC0583a = this.j) == null) {
            return;
        }
        this.j = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0583a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f11057a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f11059c, -this.f11060d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f11057a.getFinalOpacity() * 255.0f);
        Paint paint = this.f11064h;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f11057a.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0361a c0361a = this.f11063g;
        if (c0361a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f11059c;
            this.f11061e = i3;
            int i10 = this.f11060d;
            this.f11062f = i10;
            matrix.postTranslate(i3, i10);
        } else if (action != 2) {
            matrix.postTranslate(this.f11059c, this.f11060d);
        } else {
            matrix.postTranslate(this.f11061e, this.f11062f);
            this.f11061e = this.f11059c;
            this.f11062f = this.f11060d;
        }
        c0361a.c(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.j == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0583a viewTreeObserverOnGlobalFocusChangeListenerC0583a = new ViewTreeObserverOnGlobalFocusChangeListenerC0583a(onFocusChangeListener, this);
            this.j = viewTreeObserverOnGlobalFocusChangeListenerC0583a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0583a);
        }
    }
}
