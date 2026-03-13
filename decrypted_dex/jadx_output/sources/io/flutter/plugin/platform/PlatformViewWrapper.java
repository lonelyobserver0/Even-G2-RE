package io.flutter.plugin.platform;

import Xa.C0361a;
import a4.f;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.stub.StubApp;
import sb.C1674t0;

@TargetApi(23)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PlatformViewWrapper extends FrameLayout {
    private static final String TAG = StubApp.getString2(18765);
    private ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int left;
    private int prevLeft;
    private int prevTop;
    private PlatformViewRenderTarget renderTarget;
    private int top;
    private C0361a touchProcessor;

    public PlatformViewWrapper(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        String string2 = StubApp.getString2(18765);
        if (platformViewRenderTarget == null) {
            super.draw(canvas);
            Log.e(string2, StubApp.getString2(18766));
            return;
        }
        Surface surface = platformViewRenderTarget.getSurface();
        if (!surface.isValid()) {
            Log.e(string2, StubApp.getString2(18767));
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.renderTarget.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.activeFocusListener;
    }

    public int getRenderTargetHeight() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.left;
            this.prevLeft = i3;
            int i10 = this.top;
            this.prevTop = i10;
            matrix.postTranslate(i3, i10);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        this.touchProcessor.c(motionEvent, matrix);
        return true;
    }

    public void release() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.release();
            this.renderTarget = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void resizeRenderTarget(int i3, int i10) {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.resize(i3, i10);
        }
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.left = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewWrapper.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(View view, View view2) {
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    PlatformViewWrapper platformViewWrapper = PlatformViewWrapper.this;
                    onFocusChangeListener2.onFocusChange(platformViewWrapper, f.w(platformViewWrapper, new C1674t0(7)));
                }
            };
            this.activeFocusListener = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void setTouchProcessor(C0361a c0361a) {
        this.touchProcessor = c0361a;
    }

    public void unsetOnDescendantFocusChangeListener() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
            return;
        }
        this.activeFocusListener = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public PlatformViewWrapper(Context context, PlatformViewRenderTarget platformViewRenderTarget) {
        this(context);
        this.renderTarget = platformViewRenderTarget;
        Surface surface = platformViewRenderTarget.getSurface();
        if (surface != null) {
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            } finally {
                surface.unlockCanvasAndPost(lockHardwareCanvas);
            }
        }
    }
}
