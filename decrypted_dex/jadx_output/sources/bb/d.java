package bb;

import Ac.q;
import D5.r;
import I4.e;
import S3.D;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.internal.measurement.U;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p0.AbstractC1482f;
import tb.AbstractC1748a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f10742a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10743b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10744c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10745d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10746e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10747f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10748g;

    public d(Context context, U u2, Long l9) {
        this.f10743b = true;
        D.h(context);
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        D.h(origApplicationContext);
        this.f10744c = origApplicationContext;
        this.f10747f = l9;
        if (u2 != null) {
            this.f10746e = u2;
            this.f10743b = u2.f11376c;
            this.f10742a = u2.f11375b;
            this.f10748g = u2.f11378e;
            Bundle bundle = u2.f11377d;
            if (bundle != null) {
                this.f10745d = Boolean.valueOf(bundle.getBoolean(StubApp.getString2(9342), true));
            }
        }
    }

    public void a(Context context, String[] strArr) {
        Context context2;
        String string2 = StubApp.getString2(9343);
        String string22 = StubApp.getString2(9344);
        String string23 = StubApp.getString2(9345);
        String string24 = StubApp.getString2(9346);
        String string25 = StubApp.getString2(9347);
        String string26 = StubApp.getString2(9348);
        String string27 = StubApp.getString2(9349);
        String string28 = StubApp.getString2(9350);
        String string29 = StubApp.getString2(9351);
        String string210 = StubApp.getString2(9352);
        if (this.f10743b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(StubApp.getString2(9374));
        }
        if (((e) this.f10744c) == null) {
            throw new IllegalStateException(StubApp.getString2(9373));
        }
        try {
            AbstractC1748a.d(StubApp.getString2("9353"));
            try {
                c cVar = (c) ((Future) this.f10748g).get();
                ArrayList arrayList = new ArrayList();
                arrayList.add(StubApp.getString2("9354"));
                StringBuilder sb2 = new StringBuilder(string210);
                sb2.append((String) ((r) this.f10745d).f1451e);
                String str = File.separator;
                sb2.append(str);
                sb2.append(StubApp.getString2("9355"));
                arrayList.add(sb2.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add(string22.concat((String) ((r) this.f10745d).f1448b));
                arrayList.add(string22 + ((String) ((r) this.f10745d).f1451e) + str + ((String) ((r) this.f10745d).f1448b));
                StringBuilder sb3 = new StringBuilder(string29);
                sb3.append(cVar.f10741b);
                arrayList.add(sb3.toString());
                arrayList.add(string2.concat((String) ((r) this.f10745d).f1450d));
                ((e) this.f10744c).getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i3 = bundle != null ? bundle.getInt(StubApp.getString2("9356")) : 0;
                if (i3 == 0) {
                    context2 = context;
                    ((ActivityManager) context2.getSystemService(StubApp.getString2("2680"))).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i3 = (int) ((r10.totalMem / 1000000.0d) / 2.0d);
                } else {
                    context2 = context;
                }
                arrayList.add(string28 + i3);
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                arrayList.add(string27 + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add(StubApp.getString2("9357"));
                if (bundle != null) {
                    if (bundle.containsKey(string24)) {
                        if (bundle.getBoolean(string24)) {
                            arrayList.add(StubApp.getString2("32"));
                        } else {
                            arrayList.add(StubApp.getString2("33"));
                        }
                    }
                    if (bundle.getBoolean(StubApp.getString2("9358"), false)) {
                        arrayList.add(StubApp.getString2("35"));
                    }
                    if (bundle.getBoolean(StubApp.getString2("9359"), false)) {
                        arrayList.add(StubApp.getString2("9360"));
                    }
                    if (bundle.getBoolean(StubApp.getString2("9361"), false)) {
                        arrayList.add(StubApp.getString2("9362"));
                    }
                    if (bundle.containsKey(string23) && bundle.getBoolean(string23)) {
                        arrayList.add(StubApp.getString2("9363"));
                    }
                    if (bundle.getBoolean(StubApp.getString2("9364"), false)) {
                        arrayList.add(StubApp.getString2("9365"));
                    }
                    String string = bundle.getString(StubApp.getString2("9366"));
                    if (string != null) {
                        arrayList.add(string26.concat(string));
                    }
                    if (bundle.getBoolean(StubApp.getString2("9367"))) {
                        arrayList.add(StubApp.getString2("9368"));
                    }
                    if (bundle.getBoolean(StubApp.getString2("9369"))) {
                        arrayList.add(StubApp.getString2("9370"));
                    }
                }
                arrayList.add(string25.concat(bundle == null ? true : bundle.getBoolean(StubApp.getString2("9371"), true) ? "true" : StubApp.getString2("9372")));
                ((FlutterJNI) this.f10746e).init(context2, (String[]) arrayList.toArray(new String[0]), null, cVar.f10740a, cVar.f10741b, SystemClock.uptimeMillis() - this.f10742a, Build.VERSION.SDK_INT);
                this.f10743b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e10) {
            Log.e(StubApp.getString2(9340), StubApp.getString2(9341), e10);
            throw new RuntimeException(e10);
        }
    }

    public String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) ((r) this.f10745d).f1449c);
        return AbstractC1482f.k(sb2, File.separator, str);
    }

    public void c(Context context) {
        e eVar = new e(29);
        if (((e) this.f10744c) != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(StubApp.getString2(9376));
        }
        AbstractC1748a.d(StubApp.getString2(9375));
        try {
            Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
            this.f10744c = eVar;
            this.f10742a = SystemClock.uptimeMillis();
            this.f10745d = AbstractC0535a.a(origApplicationContext);
            q b2 = q.b((DisplayManager) origApplicationContext.getSystemService(StubApp.getString2("3958")), (FlutterJNI) this.f10746e);
            ((FlutterJNI) b2.f382c).setAsyncWaitForVsyncDelegate((io.flutter.view.b) b2.f384e);
            this.f10748g = ((ExecutorService) this.f10747f).submit(new J9.c(6, this, origApplicationContext));
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
