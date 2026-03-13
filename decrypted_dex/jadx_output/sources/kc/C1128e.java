package kc;

import Xa.AbstractActivityC0364d;
import android.app.Application;
import android.content.Context;
import android.view.View;
import com.stub.StubApp;
import i2.u;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import m6.q;
import n6.i;
import r0.C1552m;

/* renamed from: kc.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1128e implements PlatformView, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15567a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15569c;

    /* renamed from: d, reason: collision with root package name */
    public final MethodChannel f15570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15571e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15572f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15573g;

    /* renamed from: h, reason: collision with root package name */
    public C1124a f15574h;
    public final V6.b j;

    public C1128e(Context context, BinaryMessenger messenger, int i3, HashMap params) {
        V6.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f15567a = context;
        this.f15568b = params;
        this.f15569c = 513469796 + i3;
        MethodChannel methodChannel = new MethodChannel(messenger, u.p(i3, StubApp.getString2(26062)));
        this.f15570d = methodChannel;
        this.f15571e = 1;
        eb.b bVar2 = Ec.d.f2143b;
        if (bVar2 != null) {
            ((Ya.d) bVar2).b(this);
        }
        methodChannel.setMethodCallHandler(this);
        AbstractActivityC0364d abstractActivityC0364d = Ec.d.f2142a;
        if (abstractActivityC0364d != null) {
            C1126c c1126c = new C1126c(this, 0);
            C1126c c1126c2 = new C1126c(this, 1);
            Intrinsics.checkNotNullParameter(abstractActivityC0364d, "<this>");
            C1129f c1129f = new C1129f(abstractActivityC0364d, c1126c, c1126c2);
            abstractActivityC0364d.getApplication().registerActivityLifecycleCallbacks(c1129f);
            Application application = abstractActivityC0364d.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            bVar = new V6.b(application, c1129f);
        } else {
            bVar = null;
        }
        this.j = bVar;
    }

    public static void a(MethodChannel.Result result) {
        result.error(StubApp.getString2(9696), StubApp.getString2(26063), null);
    }

    public final void b() {
        if (c()) {
            this.f15570d.invokeMethod(StubApp.getString2(26064), Boolean.TRUE);
        } else {
            AbstractActivityC0364d abstractActivityC0364d = Ec.d.f2142a;
            if (abstractActivityC0364d != null) {
                abstractActivityC0364d.requestPermissions(new String[]{StubApp.getString2(1842)}, this.f15569c);
            }
        }
    }

    public final boolean c() {
        return D.a.a(this.f15567a, StubApp.getString2(1842)) == 0;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final void dispose() {
        V6.b bVar = this.j;
        if (bVar != null) {
            ((Application) bVar.f7761b).unregisterActivityLifecycleCallbacks((C1129f) bVar.f7762c);
        }
        eb.b bVar2 = Ec.d.f2143b;
        if (bVar2 != null) {
            ((Ya.d) bVar2).f8884c.remove(this);
        }
        C1124a c1124a = this.f15574h;
        if (c1124a != null) {
            c1124a.i();
        }
        this.f15574h = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final View getView() {
        i cameraSettings;
        C1124a c1124a = this.f15574h;
        if (c1124a != null) {
            if (!this.f15573g) {
                c1124a.e();
            }
            return c1124a;
        }
        C1124a c1124a2 = new C1124a(Ec.d.f2142a);
        c1124a2.f15562K = -1;
        this.f15574h = c1124a2;
        c1124a2.setDecoderFactory(new C1552m(null, null, null, 2));
        Object obj = this.f15568b.get(StubApp.getString2(26065));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj).intValue() == 1 && (cameraSettings = c1124a2.getCameraSettings()) != null) {
            cameraSettings.f17846a = this.f15571e;
        }
        return c1124a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        List arrayList;
        i cameraSettings;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        if (str != null) {
            int hashCode = str.hashCode();
            Context context = this.f15567a;
            String string2 = StubApp.getString2(26066);
            switch (hashCode) {
                case -2129330689:
                    if (str.equals(StubApp.getString2(26089))) {
                        Object obj = call.arguments;
                        List list = obj instanceof List ? (List) obj : null;
                        b();
                        if (list != null) {
                            try {
                                arrayList = new ArrayList(CollectionsKt.f(list));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(N5.a.values()[((Number) it.next()).intValue()]);
                                }
                            } catch (Exception e10) {
                                result.error("", e10.getMessage(), null);
                                arrayList = CollectionsKt.emptyList();
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = CollectionsKt.emptyList();
                        }
                        if (list == null) {
                            C1124a c1124a = this.f15574h;
                            if (c1124a != null) {
                                c1124a.setDecoderFactory(new C1552m(null, null, null, 2));
                            }
                        } else {
                            C1124a c1124a2 = this.f15574h;
                            if (c1124a2 != null) {
                                c1124a2.setDecoderFactory(new C1552m(arrayList, null, null, 2));
                            }
                        }
                        C1124a c1124a3 = this.f15574h;
                        if (c1124a3 != null) {
                            C1127d c1127d = new C1127d(arrayList, this);
                            c1124a3.f12253E = 3;
                            c1124a3.f12254F = c1127d;
                            c1124a3.j();
                            return;
                        }
                        return;
                    }
                    break;
                case -2110134142:
                    if (str.equals(StubApp.getString2(26082))) {
                        try {
                            Pair pair = TuplesKt.to(StubApp.getString2("26083"), Boolean.valueOf(context.getPackageManager().hasSystemFeature(StubApp.getString2("26084"))));
                            Pair pair2 = TuplesKt.to(StubApp.getString2("26085"), Boolean.valueOf(context.getPackageManager().hasSystemFeature(StubApp.getString2("26086"))));
                            Pair pair3 = TuplesKt.to(StubApp.getString2("26087"), Boolean.valueOf(context.getPackageManager().hasSystemFeature(string2)));
                            String string22 = StubApp.getString2("26088");
                            C1124a c1124a4 = this.f15574h;
                            result.success(MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(string22, (c1124a4 == null || (cameraSettings = c1124a4.getCameraSettings()) == null) ? null : Integer.valueOf(cameraSettings.f17846a))));
                            return;
                        } catch (Exception e11) {
                            result.error("", e11.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case -1824838201:
                    if (str.equals(StubApp.getString2(26081))) {
                        C1124a c1124a5 = this.f15574h;
                        if (c1124a5 == null) {
                            a(result);
                            return;
                        }
                        if (c1124a5.f17074g) {
                            this.f15573g = true;
                            c1124a5.i();
                        }
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1176613766:
                    if (str.equals(StubApp.getString2(26077))) {
                        Object argument = call.argument(StubApp.getString2(26078));
                        String string23 = StubApp.getString2(2906);
                        if (argument == null) {
                            throw new IllegalArgumentException(string23);
                        }
                        double doubleValue = ((Number) argument).doubleValue();
                        Object argument2 = call.argument(StubApp.getString2(26079));
                        if (argument2 == null) {
                            throw new IllegalArgumentException(string23);
                        }
                        double doubleValue2 = ((Number) argument2).doubleValue();
                        Object argument3 = call.argument(StubApp.getString2(26080));
                        if (argument3 == null) {
                            throw new IllegalArgumentException(string23);
                        }
                        double doubleValue3 = ((Number) argument3).doubleValue();
                        C1124a c1124a6 = this.f15574h;
                        if (c1124a6 != null) {
                            c1124a6.f15562K = (int) (doubleValue3 * context.getResources().getDisplayMetrics().density);
                            c1124a6.setFramingRectSize(new q((int) (doubleValue * context.getResources().getDisplayMetrics().density), (int) (doubleValue2 * context.getResources().getDisplayMetrics().density)));
                        }
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -1157185016:
                    if (str.equals(StubApp.getString2(26076))) {
                        if (this.f15574h == null) {
                            a(result);
                            return;
                        } else {
                            result.success(Boolean.valueOf(this.f15572f));
                            return;
                        }
                    }
                    break;
                case -668845828:
                    if (str.equals(StubApp.getString2(26074))) {
                        C1124a c1124a7 = this.f15574h;
                        if (c1124a7 == null) {
                            a(result);
                            return;
                        }
                        if (!context.getPackageManager().hasSystemFeature(string2)) {
                            result.error(StubApp.getString2(9696), StubApp.getString2(26075), null);
                            return;
                        }
                        c1124a7.setTorch(!this.f15572f);
                        boolean z2 = !this.f15572f;
                        this.f15572f = z2;
                        result.success(Boolean.valueOf(z2));
                        return;
                    }
                    break;
                case 437643762:
                    if (str.equals(StubApp.getString2(26073))) {
                        C1124a c1124a8 = this.f15574h;
                        if (c1124a8 == null) {
                            a(result);
                            return;
                        }
                        c1124a8.i();
                        i cameraSettings2 = c1124a8.getCameraSettings();
                        int i3 = cameraSettings2.f17846a;
                        int i10 = this.f15571e;
                        if (i3 == i10) {
                            cameraSettings2.f17846a = 0;
                        } else {
                            cameraSettings2.f17846a = i10;
                        }
                        c1124a8.e();
                        result.success(Integer.valueOf(cameraSettings2.f17846a));
                        return;
                    }
                    break;
                case 1026482610:
                    if (str.equals(StubApp.getString2(26072))) {
                        C1124a c1124a9 = this.f15574h;
                        if (c1124a9 == null) {
                            a(result);
                            return;
                        }
                        if (!c1124a9.f17074g) {
                            this.f15573g = false;
                            c1124a9.e();
                        }
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case 1669188213:
                    if (str.equals(StubApp.getString2(1798))) {
                        b();
                        return;
                    }
                    break;
                case 1714778527:
                    if (str.equals(StubApp.getString2(26071))) {
                        C1124a c1124a10 = this.f15574h;
                        if (c1124a10 != null) {
                            c1124a10.f12253E = 1;
                            c1124a10.f12254F = null;
                            c1124a10.k();
                            return;
                        }
                        return;
                    }
                    break;
                case 1899593587:
                    if (str.equals(StubApp.getString2(26069))) {
                        Boolean bool = (Boolean) call.argument(StubApp.getString2(26070));
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        C1124a c1124a11 = this.f15574h;
                        if (c1124a11 == null) {
                            return;
                        }
                        c1124a11.i();
                        c1124a11.getCameraSettings().f17847b = booleanValue;
                        c1124a11.e();
                        return;
                    }
                    break;
                case 1984772457:
                    if (str.equals(StubApp.getString2(26068))) {
                        C1124a c1124a12 = this.f15574h;
                        if (c1124a12 == null) {
                            a(result);
                            return;
                        } else {
                            result.success(Integer.valueOf(c1124a12.getCameraSettings().f17846a));
                            return;
                        }
                    }
                    break;
                case 2013529275:
                    if (str.equals(StubApp.getString2(26067))) {
                        C1124a c1124a13 = this.f15574h;
                        if (c1124a13 == null) {
                            a(result);
                            return;
                        }
                        if (c1124a13.f17074g) {
                            this.f15573g = true;
                            c1124a13.i();
                        }
                        result.success(Boolean.TRUE);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean z2 = false;
        if (i3 != this.f15569c) {
            return false;
        }
        Integer firstOrNull = ArraysKt.firstOrNull(grantResults);
        if (firstOrNull != null && firstOrNull.intValue() == 0) {
            z2 = true;
        }
        this.f15570d.invokeMethod(StubApp.getString2(26064), Boolean.valueOf(z2));
        return z2;
    }
}
