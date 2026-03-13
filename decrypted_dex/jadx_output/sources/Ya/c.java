package Ya;

import D5.r;
import a0.C0379a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import gb.C0969A;
import gb.C0973b;
import gb.C0975d;
import gb.C0976e;
import gb.C0977f;
import gb.C0983l;
import gb.C0984m;
import gb.C0986o;
import gb.C0988q;
import gb.P;
import gb.T;
import gb.U;
import gb.V;
import gb.Z;
import gb.a0;
import gb.c0;
import gb.j0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import io.flutter.plugin.text.ProcessTextPlugin;
import java.util.HashMap;
import java.util.HashSet;
import tb.InterfaceC1749b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InterfaceC1749b {

    /* renamed from: w, reason: collision with root package name */
    public static long f8859w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f8860x = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f8861a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8862b;

    /* renamed from: c, reason: collision with root package name */
    public final Za.d f8863c;

    /* renamed from: d, reason: collision with root package name */
    public final K2.c f8864d;

    /* renamed from: e, reason: collision with root package name */
    public final LocalizationPlugin f8865e;

    /* renamed from: f, reason: collision with root package name */
    public final C0973b f8866f;

    /* renamed from: g, reason: collision with root package name */
    public final H0.l f8867g;

    /* renamed from: h, reason: collision with root package name */
    public final C0986o f8868h;

    /* renamed from: i, reason: collision with root package name */
    public final C0988q f8869i;
    public final C0975d j;

    /* renamed from: k, reason: collision with root package name */
    public final T f8870k;

    /* renamed from: l, reason: collision with root package name */
    public final C0969A f8871l;

    /* renamed from: m, reason: collision with root package name */
    public final V f8872m;

    /* renamed from: n, reason: collision with root package name */
    public final Z f8873n;

    /* renamed from: o, reason: collision with root package name */
    public final c0 f8874o;

    /* renamed from: p, reason: collision with root package name */
    public final C0379a f8875p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f8876q;

    /* renamed from: r, reason: collision with root package name */
    public final PlatformViewsController f8877r;

    /* renamed from: s, reason: collision with root package name */
    public final PlatformViewsController2 f8878s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f8879t;

    /* renamed from: u, reason: collision with root package name */
    public final long f8880u;

    /* renamed from: v, reason: collision with root package name */
    public final a f8881v;

    public c(Context context, String[] strArr) {
        this(context, null, new PlatformViewsController(), strArr, true, false);
    }

    public c(Context context, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] strArr, boolean z2, boolean z10) {
        AssetManager assets;
        this.f8879t = new HashSet();
        this.f8881v = new a(this);
        long j = f8859w;
        f8859w = 1 + j;
        this.f8880u = j;
        f8860x.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        Q2.g H2 = Q2.g.H();
        if (flutterJNI == null) {
            Object obj = H2.f5712c;
            flutterJNI = new FlutterJNI();
        }
        this.f8861a = flutterJNI;
        Za.d dVar = new Za.d(flutterJNI, assets, this.f8880u);
        this.f8863c = dVar;
        flutterJNI.setPlatformMessageHandler(dVar.f9166d);
        Q2.g.H().getClass();
        this.f8866f = new C0973b(dVar, flutterJNI);
        new MethodChannel(dVar, StubApp.getString2(7583), StandardMethodCodec.INSTANCE).setMethodCallHandler(new C0976e(new C0977f()));
        Q2.g.H().getClass();
        new HashMap();
        this.f8867g = new H0.l(dVar);
        C0983l c0983l = new C0983l(dVar);
        C0986o c0986o = new C0986o();
        new MethodChannel(dVar, StubApp.getString2(7584), StandardMethodCodec.INSTANCE).setMethodCallHandler(new C0984m(c0986o));
        this.f8868h = c0986o;
        this.f8869i = new C0988q(dVar);
        this.j = new C0975d(dVar);
        this.f8871l = new C0969A(dVar);
        P p8 = new P(dVar, context.getPackageManager());
        this.f8870k = new T(dVar, z10);
        V v2 = new V();
        new MethodChannel(dVar, StubApp.getString2(7585), JSONMethodCodec.INSTANCE).setMethodCallHandler(new U(v2));
        this.f8872m = v2;
        this.f8873n = new Z(dVar);
        c0 c0Var = new c0();
        new MethodChannel(dVar, StubApp.getString2(7586), StandardMethodCodec.INSTANCE).setMethodCallHandler(new a0(c0Var));
        this.f8874o = c0Var;
        this.f8875p = new C0379a(dVar);
        this.f8876q = new j0(dVar);
        LocalizationPlugin localizationPlugin = new LocalizationPlugin(context, c0983l);
        this.f8865e = localizationPlugin;
        bb.d dVar2 = (bb.d) H2.f5711b;
        if (!flutterJNI.isAttached()) {
            dVar2.c(StubApp.getOrigApplicationContext(context.getApplicationContext()));
            dVar2.a(context, strArr);
        }
        PlatformViewsController2 platformViewsController2 = new PlatformViewsController2();
        platformViewsController2.setRegistry(platformViewsController.getRegistry());
        platformViewsController2.setFlutterJNI(flutterJNI);
        flutterJNI.addEngineLifecycleListener(this.f8881v);
        flutterJNI.setPlatformViewsController(platformViewsController);
        flutterJNI.setPlatformViewsController2(platformViewsController2);
        flutterJNI.setLocalizationPlugin(localizationPlugin);
        H2.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException(StubApp.getString2(7587));
            }
        }
        this.f8862b = new l(flutterJNI);
        this.f8877r = platformViewsController;
        this.f8878s = platformViewsController2;
        K2.c cVar = new K2.c(StubApp.getOrigApplicationContext(context.getApplicationContext()), this, dVar2);
        this.f8864d = cVar;
        localizationPlugin.sendLocalesToFlutter(context.getResources().getConfiguration());
        if (z2 && ((r) dVar2.f10745d).f1447a) {
            D1.q(this);
        }
        a4.f.d(context, this);
        cVar.a(new ProcessTextPlugin(p8));
    }
}
