package y6;

import E9.k;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t6.C1736c;
import t6.C1737d;
import t6.EnumC1735b;
import t6.EnumC1738e;
import w6.InterfaceC1866a;
import z6.C2011a;
import z6.C2012b;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1972a implements InterfaceC1973b {

    /* renamed from: a, reason: collision with root package name */
    public final C2012b f23523a;

    /* renamed from: b, reason: collision with root package name */
    public final C2011a f23524b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23525c;

    /* renamed from: d, reason: collision with root package name */
    public k f23526d;

    /* renamed from: e, reason: collision with root package name */
    public double f23527e;

    /* renamed from: f, reason: collision with root package name */
    public C1737d f23528f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f23529g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f23530h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer[] f23531i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23532k;

    /* renamed from: l, reason: collision with root package name */
    public Q9.b f23533l;

    /* renamed from: m, reason: collision with root package name */
    public AudioFocusRequest f23534m;

    public C1972a(C2012b recorderStateStreamHandler, C2011a recorderRecordStreamHandler, Context appContext) {
        Intrinsics.checkNotNullParameter(recorderStateStreamHandler, "recorderStateStreamHandler");
        Intrinsics.checkNotNullParameter(recorderRecordStreamHandler, "recorderRecordStreamHandler");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f23523a = recorderStateStreamHandler;
        this.f23524b = recorderRecordStreamHandler;
        this.f23525c = appContext;
        this.f23527e = -160.0d;
        HashMap hashMap = new HashMap();
        this.f23530h = hashMap;
        Integer[] numArr = {4, 8, 3, 5, 2, 1, 0};
        this.f23531i = numArr;
        hashMap.clear();
        Object systemService = appContext.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        for (Integer num : numArr) {
            int intValue = num.intValue();
            hashMap.put(Integer.valueOf(intValue), Integer.valueOf(audioManager.getStreamVolume(intValue)));
        }
        this.j = audioManager.getMode();
        this.f23532k = audioManager.isSpeakerphoneOn();
    }

    @Override // y6.InterfaceC1973b
    public final boolean a() {
        k kVar = this.f23526d;
        return kVar != null && kVar.b();
    }

    @Override // y6.InterfaceC1973b
    public final ArrayList b() {
        C1736c c1736c;
        k kVar = this.f23526d;
        double d8 = -160.0d;
        if (kVar != null && (c1736c = (C1736c) kVar.f2083d) != null) {
            d8 = c1736c.f21186f;
        }
        if (d8 > this.f23527e) {
            this.f23527e = d8;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(d8));
        arrayList.add(Double.valueOf(this.f23527e));
        return arrayList;
    }

    @Override // y6.InterfaceC1973b
    public final boolean c() {
        k kVar = this.f23526d;
        if (kVar != null) {
            if (((InterfaceC1866a) kVar.f2084e) != null && ((AtomicBoolean) kVar.f2086g).get()) {
                return true;
            }
        }
        return false;
    }

    @Override // y6.InterfaceC1973b
    public final void cancel() {
        k kVar = this.f23526d;
        if (kVar != null) {
            if (!kVar.b()) {
                android.support.v4.media.session.b.m(((C1737d) kVar.f2081b).f21187a);
                return;
            }
            kVar.f2080a = true;
            if (kVar.b()) {
                ((AtomicBoolean) kVar.f2085f).set(false);
                ((AtomicBoolean) kVar.f2086g).set(false);
                ((Semaphore) kVar.f2087h).release();
            }
        }
    }

    @Override // y6.InterfaceC1973b
    public final void d(C1737d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f23528f = config;
        k kVar = new k(config, this);
        this.f23526d = kVar;
        Intrinsics.checkNotNull(kVar);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ExecutorService) kVar.f2088i).execute(new com.even.translate.a(25, kVar, countDownLatch));
        countDownLatch.await();
        f(config, true);
    }

    @Override // y6.InterfaceC1973b
    public final void dispose() {
        e(null);
    }

    @Override // y6.InterfaceC1973b
    public final void e(Function1 function1) {
        this.f23529g = function1;
        k kVar = this.f23526d;
        if (kVar == null) {
            i();
            return;
        }
        if (!kVar.b()) {
            i();
            return;
        }
        k kVar2 = this.f23526d;
        if (kVar2 == null || !kVar2.b()) {
            return;
        }
        ((AtomicBoolean) kVar2.f2085f).set(false);
        ((AtomicBoolean) kVar2.f2086g).set(false);
        ((Semaphore) kVar2.f2087h).release();
    }

    public final void f(C1737d c1737d, boolean z2) {
        Object systemService = this.f23525c.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (c1737d == null) {
            return;
        }
        if (z2) {
            if (c1737d.f21202q != EnumC1735b.f21176a) {
                this.f23533l = new Q9.b(this, 1);
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setUsage(1);
                builder.setContentType(1);
                AudioAttributes build = builder.build();
                AudioFocusRequest.Builder builder2 = new AudioFocusRequest.Builder(1);
                builder2.setAudioAttributes(build);
                builder2.setAcceptsDelayedFocusGain(true);
                Q9.b bVar = this.f23533l;
                Intrinsics.checkNotNull(bVar);
                builder2.setOnAudioFocusChangeListener(bVar, new Handler(Looper.getMainLooper()));
                AudioFocusRequest build2 = builder2.build();
                this.f23534m = build2;
                Intrinsics.checkNotNull(build2);
                audioManager.requestAudioFocus(build2);
            }
        }
        if (c1737d.j) {
            g(audioManager, true);
        }
        int i3 = c1737d.f21199n;
        if (i3 != 0) {
            audioManager.setMode(i3);
        }
        if (c1737d.f21198m) {
            audioManager.setSpeakerphoneOn(true);
        }
    }

    public final void g(AudioManager audioManager, boolean z2) {
        int intValue;
        for (Integer num : this.f23531i) {
            int intValue2 = num.intValue();
            if (z2) {
                intValue = -100;
            } else {
                Integer num2 = (Integer) this.f23530h.get(Integer.valueOf(intValue2));
                intValue = num2 != null ? num2.intValue() : 100;
            }
            audioManager.setStreamVolume(intValue2, intValue, 0);
        }
    }

    public final void h(Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.e(StubApp.getString2(2378), ex.getMessage(), ex);
        C2012b c2012b = this.f23523a;
        c2012b.getClass();
        Intrinsics.checkNotNullParameter(ex, "ex");
        c2012b.f24129c.post(new com.even.translate.a(28, c2012b, ex));
    }

    public final void i() {
        j();
        Function1 function1 = this.f23529g;
        if (function1 != null) {
            C1737d c1737d = this.f23528f;
            function1.invoke(c1737d != null ? c1737d.f21187a : null);
        }
        this.f23529g = null;
        this.f23523a.a(EnumC1738e.f21206d);
        this.f23527e = -160.0d;
    }

    public final void j() {
        Object systemService = this.f23525c.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        AudioFocusRequest audioFocusRequest = this.f23534m;
        if (audioFocusRequest != null) {
            Intrinsics.checkNotNull(audioFocusRequest);
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            this.f23534m = null;
        }
        this.f23533l = null;
        C1737d c1737d = this.f23528f;
        if (c1737d == null) {
            return;
        }
        if (c1737d.j) {
            g(audioManager, false);
        }
        if (c1737d.f21199n != 0) {
            audioManager.setMode(this.j);
        }
        if (c1737d.f21198m) {
            audioManager.setSpeakerphoneOn(this.f23532k);
        }
    }

    @Override // y6.InterfaceC1973b
    public final void pause() {
        if (a()) {
            j();
        }
        k kVar = this.f23526d;
        if (kVar == null || !kVar.b()) {
            return;
        }
        ((AtomicBoolean) kVar.f2085f).set(true);
        ((AtomicBoolean) kVar.f2086g).set(true);
    }

    @Override // y6.InterfaceC1973b
    public final void resume() {
        if (c()) {
            f(this.f23528f, false);
        }
        k kVar = this.f23526d;
        if (kVar == null || ((InterfaceC1866a) kVar.f2084e) == null || !((AtomicBoolean) kVar.f2086g).get()) {
            return;
        }
        kVar.f();
    }
}
