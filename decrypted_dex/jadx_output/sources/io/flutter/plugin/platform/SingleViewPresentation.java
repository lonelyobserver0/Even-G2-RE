package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.stub.StubApp;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = StubApp.getString2(18768);
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private AccessibilityDelegatingFrameLayout rootView;
    private boolean startFocused;
    private final PresentationState state;
    private int viewId;

    public static class AccessibilityDelegatingFrameLayout extends FrameLayout {
        private final AccessibilityEventsDelegate accessibilityEventsDelegate;
        private final View embeddedView;

        public AccessibilityDelegatingFrameLayout(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, View view) {
            super(context);
            this.accessibilityEventsDelegate = accessibilityEventsDelegate;
            this.embeddedView = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.accessibilityEventsDelegate.requestSendAccessibilityEvent(this.embeddedView, view, accessibilityEvent);
        }
    }

    public static class ImmContext extends ContextWrapper {
        private final InputMethodManager inputMethodManager;

        public ImmContext(Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new ImmContext(super.createDisplayContext(display), this.inputMethodManager);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return StubApp.getString2(18353).equals(str) ? this.inputMethodManager : super.getSystemService(str);
        }

        private ImmContext(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.inputMethodManager = inputMethodManager == null ? (InputMethodManager) context.getSystemService(StubApp.getString2(18353)) : inputMethodManager;
        }
    }

    public static class PresentationContext extends ContextWrapper {
        private final Context flutterAppWindowContext;
        private WindowManager windowManager;
        private final WindowManagerHandler windowManagerHandler;

        public PresentationContext(Context context, WindowManagerHandler windowManagerHandler, Context context2) {
            super(context);
            this.windowManagerHandler = windowManagerHandler;
            this.flutterAppWindowContext = context2;
        }

        private WindowManager getWindowManager() {
            if (this.windowManager == null) {
                this.windowManager = this.windowManagerHandler;
            }
            return this.windowManager;
        }

        private boolean isCalledFromAlertDialog() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 0; i3 < stackTrace.length && i3 < 11; i3++) {
                if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals(StubApp.getString2(9282))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return StubApp.getString2(526).equals(str) ? isCalledFromAlertDialog() ? this.flutterAppWindowContext.getSystemService(str) : getWindowManager() : super.getSystemService(str);
        }
    }

    public static class PresentationState {
        private SingleViewFakeWindowViewGroup fakeWindowViewGroup;
        private PlatformView platformView;
        private WindowManagerHandler windowManagerHandler;
    }

    public SingleViewPresentation(Context context, Display display, PlatformView platformView, AccessibilityEventsDelegate accessibilityEventsDelegate, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new ImmContext(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        PresentationState presentationState = new PresentationState();
        this.state = presentationState;
        presentationState.platformView = platformView;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public PresentationState detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = this.rootView;
        if (accessibilityDelegatingFrameLayout != null) {
            accessibilityDelegatingFrameLayout.removeAllViews();
        }
        return this.state;
    }

    public PlatformView getView() {
        return this.state.platformView;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.fakeWindowViewGroup == null) {
            this.state.fakeWindowViewGroup = new SingleViewFakeWindowViewGroup(getContext());
        }
        if (this.state.windowManagerHandler == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService(StubApp.getString2(526));
            PresentationState presentationState = this.state;
            presentationState.windowManagerHandler = new WindowManagerHandler(windowManager, presentationState.fakeWindowViewGroup);
        }
        this.container = new FrameLayout(getContext());
        PresentationContext presentationContext = new PresentationContext(getContext(), this.state.windowManagerHandler, this.outerContext);
        View view = this.state.platformView.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(presentationContext);
        } else {
            Log.w(StubApp.getString2(18768), StubApp.getString2(18798) + this.viewId + StubApp.getString2(18799));
        }
        this.container.addView(view);
        AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = new AccessibilityDelegatingFrameLayout(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = accessibilityDelegatingFrameLayout;
        accessibilityDelegatingFrameLayout.addView(this.container);
        this.rootView.addView(this.state.fakeWindowViewGroup);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, AccessibilityEventsDelegate accessibilityEventsDelegate, PresentationState presentationState, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new ImmContext(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.state = presentationState;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}
