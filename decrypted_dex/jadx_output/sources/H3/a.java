package H3;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.mapbox.bindgen.Cleaner;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2701a;

    public /* synthetic */ a(int i3) {
        this.f2701a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2701a) {
            case 0:
                int i3 = AlarmManagerSchedulerBroadcastReceiver.f11150a;
                return;
            case 1:
                Cleaner.lambda$create$0();
                return;
            default:
                throw new FirebaseCrashlyticsTestCrash();
        }
    }
}
