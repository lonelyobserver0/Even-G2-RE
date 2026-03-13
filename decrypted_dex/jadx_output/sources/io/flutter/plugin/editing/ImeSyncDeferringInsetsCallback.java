package io.flutter.plugin.editing;

import A.a;
import O.b;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.annotation.Keep;
import c5.z;
import java.util.Iterator;
import java.util.List;

@Keep
@SuppressLint({"NewApi", "Override"})
@TargetApi(30)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private InsetsListener insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;

    /* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @Keep
    public class AnimationCallback extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || ImeSyncDeferringInsetsCallback.this.view == null) {
                        return;
                    }
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            int i3;
            Insets insets;
            int i10;
            Insets of;
            WindowInsets build;
            int navigationBars;
            Insets insets2;
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    typeMask = z.i(it.next()).getTypeMask();
                    if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                    if ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                        navigationBars = WindowInsets.Type.navigationBars();
                        insets2 = windowInsets.getInsets(navigationBars);
                        i3 = insets2.bottom;
                    } else {
                        i3 = 0;
                    }
                    b.i();
                    WindowInsets.Builder f10 = a.f(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    insets = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                    i10 = insets.bottom;
                    of = Insets.of(0, 0, 0, Math.max(i10 - i3, 0));
                    f10.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                    View view = ImeSyncDeferringInsetsCallback.this.view;
                    build = f10.build();
                    view.onApplyWindowInsets(build);
                }
            }
            return windowInsets;
        }
    }

    public class InsetsListener implements View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsets windowInsets2;
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            if (!ImeSyncDeferringInsetsCallback.this.animating) {
                return view.onApplyWindowInsets(windowInsets);
            }
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }

        public /* synthetic */ InsetsListener(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public ImeSyncDeferringInsetsCallback(View view) {
        int ime;
        ime = WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new InsetsListener(this, null);
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
