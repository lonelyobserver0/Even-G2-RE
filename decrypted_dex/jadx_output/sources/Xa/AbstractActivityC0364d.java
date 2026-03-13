package Xa;

import a0.C0379a;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import gb.C0988q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import tb.AbstractC1748a;

/* renamed from: Xa.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractActivityC0364d extends Activity implements PlatformPlugin.PlatformPluginDelegate, InterfaceC0444t {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8526e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f8527a = false;

    /* renamed from: b, reason: collision with root package name */
    public g f8528b;

    /* renamed from: c, reason: collision with root package name */
    public final C0446v f8529c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f8530d;

    public AbstractActivityC0364d() {
        int i3 = Build.VERSION.SDK_INT;
        this.f8530d = i3 < 33 ? null : i3 >= 34 ? new C0363c(this) : new C0362b(this, 0);
        this.f8529c = new C0446v(this);
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0) {
            return null;
        }
        if (!StubApp.getString2(7329).equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int c() {
        Intent intent = getIntent();
        String string2 = StubApp.getString2(7330);
        if (!intent.hasExtra(string2)) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra(string2);
        if (stringExtra == null) {
            throw new NullPointerException(StubApp.getString2(7334));
        }
        if (stringExtra.equals(StubApp.getString2(7331))) {
            return 1;
        }
        if (stringExtra.equals(StubApp.getString2(7332))) {
            return 2;
        }
        throw new IllegalArgumentException(StubApp.getString2(7333).concat(stringExtra));
    }

    public final String d() {
        return getIntent().getStringExtra(StubApp.getString2(7335));
    }

    public final String e() {
        Intent intent = getIntent();
        String string2 = StubApp.getString2(7336);
        if (intent.hasExtra(string2)) {
            return getIntent().getStringExtra(string2);
        }
        try {
            Bundle h2 = h();
            String string = h2 != null ? h2.getString(StubApp.getString2("7337")) : null;
            if (string != null) {
                return string;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return StubApp.getString2(470);
    }

    public final String g() {
        Intent intent = getIntent();
        String string2 = StubApp.getString2(2053);
        if (intent.hasExtra(string2)) {
            return getIntent().getStringExtra(string2);
        }
        try {
            Bundle h2 = h();
            if (h2 != null) {
                return h2.getString(StubApp.getString2("7338"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f8529c;
    }

    public final boolean j() {
        Intent intent = getIntent();
        String string2 = StubApp.getString2(7339);
        boolean booleanExtra = intent.getBooleanExtra(string2, false);
        return (d() != null || this.f8528b.f8540f) ? booleanExtra : getIntent().getBooleanExtra(string2, true);
    }

    public final boolean k() {
        Intent intent = getIntent();
        String string2 = StubApp.getString2(7340);
        return intent.hasExtra(string2) ? getIntent().getBooleanExtra(string2, false) : d() == null;
    }

    public final boolean l(String str) {
        g gVar = this.f8528b;
        String string2 = StubApp.getString2(397);
        String string22 = StubApp.getString2(7341);
        String string23 = StubApp.getString2(7342);
        if (gVar == null) {
            Log.w(string23, string22 + hashCode() + string2 + str + StubApp.getString2(7343));
            return false;
        }
        if (gVar.f8543i) {
            return true;
        }
        Log.w(string23, string22 + hashCode() + string2 + str + StubApp.getString2(7344));
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i10, Intent intent) {
        if (l(StubApp.getString2(7345))) {
            g gVar = this.f8528b;
            gVar.c();
            if (gVar.f8536b == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7348));
                return;
            }
            Objects.toString(intent);
            K2.c cVar = gVar.f8536b.f8864d;
            if (!cVar.e()) {
                Log.e(StubApp.getString2(3243), StubApp.getString2(7347));
                return;
            }
            AbstractC1748a.d(StubApp.getString2(7346));
            try {
                Ya.d dVar = (Ya.d) cVar.f3644h;
                dVar.getClass();
                Iterator it = new HashSet(dVar.f8885d).iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((PluginRegistry.ActivityResultListener) it.next()).onActivityResult(i3, i10, intent) || z2) {
                            z2 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (l(StubApp.getString2(7349))) {
            g gVar = this.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                cVar.f8869i.f14365a.invokeMethod(StubApp.getString2(7350), null);
            } else {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7351));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:0|1|2|(1:6)|8|(1:10)|11|(2:13|(4:15|(1:17)|18|(2:20|21))(2:23|(4:25|(3:27|ad|34)|40|(1:42)(2:43|44))(1:45)))|46|47|48|(1:50)|51|52|(1:54)|55|(1:57)(1:150)|58|(2:60|(1:62)(2:63|(1:65)(1:66)))|67|(4:69|70|71|(1:73)(2:135|(1:137)(2:138|139)))(1:149)|74|(1:76)|77|(1:79)|(1:81)(1:134)|82|(3:84|(1:86)(1:128)|87)(3:129|(1:131)(1:133)|132)|88|(6:90|(1:92)|93|(2:95|(3:97|(1:99)|100)(2:101|102))|103|104)|105|(1:107)|108|109|110|111|(2:(1:124)(1:115)|116)(1:125)|117|(6:119|(1:121)|93|(0)|103|104)(2:122|123)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0353, code lost:
    
        android.util.Log.e(com.stub.StubApp.getString2(7365), com.stub.StubApp.getString2(7366));
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x044f  */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa.AbstractActivityC0364d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (l(StubApp.getString2(7369))) {
            this.f8528b.e();
            this.f8528b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f8530d);
            this.f8527a = false;
        }
        g gVar = this.f8528b;
        if (gVar != null) {
            gVar.f8535a = null;
            gVar.f8536b = null;
            gVar.f8537c = null;
            gVar.f8538d = null;
            this.f8528b = null;
        }
        this.f8529c.e(EnumC0438m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l(StubApp.getString2(7370))) {
            g gVar = this.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7374));
                return;
            }
            K2.c cVar2 = cVar.f8864d;
            if (cVar2.e()) {
                AbstractC1748a.d(StubApp.getString2(7371));
                try {
                    Iterator it = ((Ya.d) cVar2.f3644h).f8886e.iterator();
                    while (it.hasNext()) {
                        ((PluginRegistry.NewIntentListener) it.next()).onNewIntent(intent);
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e(StubApp.getString2(3243), StubApp.getString2(7372));
            }
            String d8 = gVar.d(intent);
            if (d8 == null || d8.isEmpty()) {
                return;
            }
            C0988q c0988q = gVar.f8536b.f8869i;
            c0988q.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(StubApp.getString2(662), d8);
            c0988q.f14365a.invokeMethod(StubApp.getString2(7373), hashMap);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (l(StubApp.getString2(7375))) {
            g gVar = this.f8528b;
            gVar.c();
            gVar.f8535a.getClass();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                H0.l lVar = cVar.f8867g;
                lVar.e(3, lVar.f2584c);
            }
        }
        this.f8529c.e(EnumC0438m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (l(StubApp.getString2(7376))) {
            g gVar = this.f8528b;
            gVar.c();
            if (gVar.f8536b == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7377));
                return;
            }
            PlatformPlugin platformPlugin = gVar.f8538d;
            if (platformPlugin != null) {
                platformPlugin.updateSystemUiOverlays();
            }
            gVar.f8536b.f8877r.onResume();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        StubApp.interface22(i3, strArr, iArr);
        if (l(StubApp.getString2(7378))) {
            g gVar = this.f8528b;
            gVar.c();
            if (gVar.f8536b == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7381));
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            K2.c cVar = gVar.f8536b.f8864d;
            if (!cVar.e()) {
                Log.e(StubApp.getString2(3243), StubApp.getString2(7380));
                return;
            }
            AbstractC1748a.d(StubApp.getString2(7379));
            try {
                Iterator it = ((Ya.d) cVar.f3644h).f8884c.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((PluginRegistry.RequestPermissionsResultListener) it.next()).onRequestPermissionsResult(i3, strArr, iArr) || z2) {
                            z2 = true;
                        }
                    }
                    Trace.endSection();
                    return;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f8529c.e(EnumC0438m.ON_RESUME);
        if (l(StubApp.getString2(7382))) {
            g gVar = this.f8528b;
            gVar.c();
            gVar.f8535a.getClass();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                H0.l lVar = cVar.f8867g;
                lVar.e(2, lVar.f2584c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l(StubApp.getString2(7383))) {
            g gVar = this.f8528b;
            gVar.c();
            if (gVar.f8535a.k()) {
                bundle.putByteArray(StubApp.getString2(7360), gVar.f8536b.f8870k.f14304b);
            }
            gVar.f8535a.getClass();
            Bundle bundle2 = new Bundle();
            K2.c cVar = gVar.f8536b.f8864d;
            if (cVar.e()) {
                AbstractC1748a.d(StubApp.getString2(7384));
                try {
                    Iterator it = ((Ya.d) cVar.f3644h).f8888g.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e(StubApp.getString2(3243), StubApp.getString2(7385));
            }
            bundle.putBundle(StubApp.getString2(7359), bundle2);
            if (gVar.f8535a.d() == null || gVar.f8535a.j()) {
                return;
            }
            bundle.putBoolean(StubApp.getString2(7354), gVar.f8535a.f8527a);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f8529c.e(EnumC0438m.ON_START);
        if (l(StubApp.getString2(2696))) {
            g gVar = this.f8528b;
            gVar.c();
            if (gVar.f8535a.d() == null && !gVar.f8536b.f8863c.f9168f) {
                String g10 = gVar.f8535a.g();
                if (g10 == null) {
                    AbstractActivityC0364d abstractActivityC0364d = gVar.f8535a;
                    abstractActivityC0364d.getClass();
                    g10 = gVar.d(abstractActivityC0364d.getIntent());
                    if (g10 == null) {
                        g10 = StubApp.getString2(601);
                    }
                }
                AbstractActivityC0364d abstractActivityC0364d2 = gVar.f8535a;
                abstractActivityC0364d2.getClass();
                String str = null;
                try {
                    Bundle h2 = abstractActivityC0364d2.h();
                    if (h2 != null) {
                        str = h2.getString(StubApp.getString2("7386"));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                gVar.f8535a.e();
                gVar.f8536b.f8869i.f14365a.invokeMethod(StubApp.getString2(7387), g10);
                String b2 = gVar.f8535a.b();
                if (b2 == null || b2.isEmpty()) {
                    b2 = (String) ((D5.r) ((bb.d) Q2.g.H().f5711b).f10745d).f1449c;
                }
                gVar.f8536b.f8863c.b(str == null ? new Za.b(b2, gVar.f8535a.e()) : new Za.b(b2, str, gVar.f8535a.e()), (List) gVar.f8535a.getIntent().getSerializableExtra(StubApp.getString2(7388)));
            }
            Integer num = gVar.j;
            if (num != null) {
                gVar.f8537c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (l(StubApp.getString2(2700))) {
            g gVar = this.f8528b;
            gVar.c();
            gVar.f8535a.getClass();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                H0.l lVar = cVar.f8867g;
                lVar.e(5, lVar.f2584c);
            }
            gVar.j = Integer.valueOf(gVar.f8537c.getVisibility());
            gVar.f8537c.setVisibility(8);
            Ya.c cVar2 = gVar.f8536b;
            if (cVar2 != null) {
                cVar2.f8862b.e(40);
            }
        }
        this.f8529c.e(EnumC0438m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (l(StubApp.getString2(7389))) {
            g gVar = this.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                if (gVar.f8542h && i3 >= 10) {
                    FlutterJNI flutterJNI = cVar.f8863c.f9163a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0379a c0379a = gVar.f8536b.f8875p;
                    c0379a.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(StubApp.getString2(660), StubApp.getString2(7390));
                    ((BasicMessageChannel) c0379a.f9233b).send(hashMap);
                }
                gVar.f8536b.f8862b.e(i3);
                gVar.f8536b.f8877r.onTrimMemory(i3);
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (l(StubApp.getString2(7391))) {
            g gVar = this.f8528b;
            gVar.c();
            Ya.c cVar = gVar.f8536b;
            if (cVar == null) {
                Log.w(StubApp.getString2(7321), StubApp.getString2(7394));
                return;
            }
            K2.c cVar2 = cVar.f8864d;
            if (!cVar2.e()) {
                Log.e(StubApp.getString2(3243), StubApp.getString2(7393));
                return;
            }
            AbstractC1748a.d(StubApp.getString2(7392));
            try {
                Iterator it = ((Ya.d) cVar2.f3644h).f8887f.iterator();
                while (it.hasNext()) {
                    ((PluginRegistry.UserLeaveHintListener) it.next()).onUserLeaveHint();
                }
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (l(StubApp.getString2(7395))) {
            g gVar = this.f8528b;
            gVar.c();
            gVar.f8535a.getClass();
            Ya.c cVar = gVar.f8536b;
            if (cVar != null) {
                H0.l lVar = cVar.f8867g;
                if (z2) {
                    lVar.e(lVar.f2582a, true);
                } else {
                    lVar.e(lVar.f2582a, false);
                }
            }
        }
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public final boolean popSystemNavigator() {
        return false;
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public final void setFrameworkHandlesBack(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f8527a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f8530d);
                this.f8527a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f8527a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f8530d);
        this.f8527a = false;
    }
}
