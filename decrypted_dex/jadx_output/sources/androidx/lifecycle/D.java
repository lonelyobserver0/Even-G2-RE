package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D extends AbstractC0432g {
    final /* synthetic */ E this$0;

    public static final class a extends AbstractC0432g {
        final /* synthetic */ E this$0;

        public a(E e10) {
            this.this$0 = e10;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            E e10 = this.this$0;
            int i3 = e10.f9866a + 1;
            e10.f9866a = i3;
            if (i3 == 1 && e10.f9869d) {
                e10.f9871f.e(EnumC0438m.ON_START);
                e10.f9869d = false;
            }
        }
    }

    public D(E e10) {
        this.this$0 = e10;
    }

    @Override // androidx.lifecycle.AbstractC0432g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = H.f9874b;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) findFragmentByTag).f9875a = this.this$0.f9873h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0432g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E e10 = this.this$0;
        int i3 = e10.f9867b - 1;
        e10.f9867b = i3;
        if (i3 == 0) {
            Handler handler = e10.f9870e;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(e10.f9872g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0432g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        E e10 = this.this$0;
        int i3 = e10.f9866a - 1;
        e10.f9866a = i3;
        if (i3 == 0 && e10.f9868c) {
            e10.f9871f.e(EnumC0438m.ON_STOP);
            e10.f9869d = true;
        }
    }
}
