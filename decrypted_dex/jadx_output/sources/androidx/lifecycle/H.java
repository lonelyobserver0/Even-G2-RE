package androidx.lifecycle;

import Z9.C0366a;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/H;", "Landroid/app/Fragment;", "<init>", "()V", "Z9/a", "a", "androidx/lifecycle/F", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class H extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9874b = 0;

    /* renamed from: a, reason: collision with root package name */
    public C0366a f9875a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new G();

        @JvmStatic
        public static final void registerIn(Activity activity) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i3 = H.f9874b;
            F.a(activity, EnumC0438m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i3 = H.f9874b;
            F.a(activity, EnumC0438m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i3 = H.f9874b;
            F.a(activity, EnumC0438m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i3 = H.f9874b;
            F.a(activity, EnumC0438m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i3 = H.f9874b;
            F.a(activity, EnumC0438m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int i3 = H.f9874b;
            F.a(activity, EnumC0438m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public final void a(EnumC0438m enumC0438m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            F.a(activity, enumC0438m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0438m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0438m.ON_DESTROY);
        this.f9875a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0438m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0366a c0366a = this.f9875a;
        if (c0366a != null) {
            ((E) c0366a.f9105b).b();
        }
        a(EnumC0438m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0366a c0366a = this.f9875a;
        if (c0366a != null) {
            E e10 = (E) c0366a.f9105b;
            int i3 = e10.f9866a + 1;
            e10.f9866a = i3;
            if (i3 == 1 && e10.f9869d) {
                e10.f9871f.e(EnumC0438m.ON_START);
                e10.f9869d = false;
            }
        }
        a(EnumC0438m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0438m.ON_STOP);
    }
}
