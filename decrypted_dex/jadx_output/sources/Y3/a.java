package Y3;

import J7.q;
import Kc.C0104k;
import a4.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.location.Address;
import android.os.Looper;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC0621h;
import com.google.android.gms.internal.measurement.C0601d;
import com.google.android.gms.internal.measurement.C0611f;
import com.google.android.gms.internal.measurement.C0616g;
import com.google.android.gms.internal.measurement.C0646m;
import com.google.android.gms.internal.measurement.C0680t;
import com.google.android.gms.internal.measurement.InterfaceC0651n;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.RouterErrorType;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p2.h;
import t2.g;
import u5.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f8734a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f8735b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Field f8736c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8737d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8738e = true;

    public static int A(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ArrayList B(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Address address = (Address) it.next();
            HashMap hashMap = new HashMap();
            String addressLine = address.getAddressLine(0);
            String str = null;
            if (addressLine != null && !addressLine.isEmpty()) {
                StringTokenizer stringTokenizer = new StringTokenizer(addressLine, StubApp.getString2(321), false);
                if (stringTokenizer.hasMoreTokens()) {
                    str = stringTokenizer.nextToken();
                }
            }
            hashMap.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), address.getFeatureName());
            hashMap.put(StubApp.getString2(2050), str);
            hashMap.put(StubApp.getString2(7502), address.getCountryCode());
            hashMap.put(StubApp.getString2(223), address.getCountryName());
            hashMap.put(StubApp.getString2(7503), address.getThoroughfare());
            hashMap.put(StubApp.getString2(7504), address.getSubThoroughfare());
            hashMap.put(StubApp.getString2(7505), address.getPostalCode());
            hashMap.put(StubApp.getString2(7506), address.getAdminArea());
            hashMap.put(StubApp.getString2(7507), address.getSubAdminArea());
            hashMap.put(StubApp.getString2(2071), address.getLocality());
            hashMap.put(StubApp.getString2(7508), address.getSubLocality());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static void C() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(StubApp.getString2(7509));
        }
    }

    public static InterfaceC0651n E(C0601d c0601d, h hVar, ArrayList arrayList, boolean z2) {
        InterfaceC0651n interfaceC0651n;
        String string2 = StubApp.getString2(7510);
        f.M(1, string2, arrayList);
        f.Q(string2, 2, arrayList);
        InterfaceC0651n c10 = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(0));
        if (!(c10 instanceof AbstractC0621h)) {
            throw new IllegalArgumentException(StubApp.getString2(7514));
        }
        if (arrayList.size() == 2) {
            interfaceC0651n = ((C0680t) hVar.f19672b).c(hVar, (InterfaceC0651n) arrayList.get(1));
            if (interfaceC0651n instanceof C0611f) {
                throw new IllegalArgumentException(StubApp.getString2(7511));
            }
        } else {
            if (c0601d.p() == 0) {
                throw new IllegalStateException(StubApp.getString2(7513));
            }
            interfaceC0651n = null;
        }
        AbstractC0621h abstractC0621h = (AbstractC0621h) c10;
        int p8 = c0601d.p();
        int i3 = z2 ? 0 : p8 - 1;
        int i10 = z2 ? p8 - 1 : 0;
        int i11 = true == z2 ? 1 : -1;
        if (interfaceC0651n == null) {
            interfaceC0651n = c0601d.q(i3);
            i3 += i11;
        }
        while ((i10 - i3) * i11 >= 0) {
            if (c0601d.s(i3)) {
                interfaceC0651n = abstractC0621h.e(hVar, Arrays.asList(interfaceC0651n, c0601d.q(i3), new C0616g(Double.valueOf(i3)), c0601d));
                if (interfaceC0651n instanceof C0611f) {
                    throw new IllegalStateException(StubApp.getString2(7512));
                }
                i3 += i11;
            } else {
                i3 += i11;
            }
        }
        return interfaceC0651n;
    }

    public static C0601d F(C0601d c0601d, h hVar, C0646m c0646m, Boolean bool, Boolean bool2) {
        C0601d c0601d2 = new C0601d();
        Iterator o5 = c0601d.o();
        while (o5.hasNext()) {
            int intValue = ((Integer) o5.next()).intValue();
            if (c0601d.s(intValue)) {
                InterfaceC0651n e10 = c0646m.e(hVar, Arrays.asList(c0601d.q(intValue), new C0616g(Double.valueOf(intValue)), c0601d));
                if (e10.a().equals(bool)) {
                    break;
                }
                if (bool2 == null || e10.a().equals(bool2)) {
                    c0601d2.r(intValue, e10);
                }
            }
        }
        return c0601d2;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i3, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i3, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i3 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i3, i10, 33);
    }

    public static double b(Point point, Point point2) {
        double a3 = H9.a.a(point.longitude());
        double a9 = H9.a.a(point2.longitude());
        double a10 = H9.a.a(point.latitude());
        double a11 = H9.a.a(point2.latitude());
        double d8 = a9 - a3;
        return ((Math.atan2(Math.cos(a11) * Math.sin(d8), (Math.sin(a11) * Math.cos(a10)) - (Math.cos(d8) * (Math.cos(a11) * Math.sin(a10)))) % 6.283185307179586d) * 180.0d) / 3.141592653589793d;
    }

    public static int c(int i3, int i10, byte[] bArr, int i11) {
        if (i11 < 0 || i11 > 4) {
            throw new IllegalArgumentException(Xa.h.g(i11, StubApp.getString2(7515), StubApp.getString2(1920)));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += (bArr[i13 + i3] & 255) << ((i10 == 0 || i10 == 2) ? ((i11 - 1) - i13) * 8 : i13 * 8);
        }
        return i12;
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Point h(Point point, double d8, double d10) {
        double a3 = H9.a.a(point.longitude());
        double a9 = H9.a.a(point.latitude());
        double a10 = H9.a.a(d10);
        double doubleValue = d8 / ((Double) H9.a.f2954a.get(StubApp.getString2(2707))).doubleValue();
        double asin = Math.asin((Math.cos(a10) * Math.sin(doubleValue) * Math.cos(a9)) + (Math.cos(doubleValue) * Math.sin(a9)));
        return Point.fromLngLat((((Math.atan2(Math.cos(a9) * (Math.sin(doubleValue) * Math.sin(a10)), Math.cos(doubleValue) - (Math.sin(asin) * Math.sin(a9))) + a3) % 6.283185307179586d) * 180.0d) / 3.141592653589793d, ((asin % 6.283185307179586d) * 180.0d) / 3.141592653589793d);
    }

    public static double i(Point point, Point point2, String str) {
        double a3 = H9.a.a(point2.latitude() - point.latitude());
        double a9 = H9.a.a(point2.longitude() - point.longitude());
        double a10 = H9.a.a(point.latitude());
        double a11 = H9.a.a(point2.latitude());
        double cos = (Math.cos(a11) * Math.cos(a10) * Math.pow(Math.sin(a9 / 2.0d), 2.0d)) + Math.pow(Math.sin(a3 / 2.0d), 2.0d);
        return ((Double) H9.a.f2954a.get(str)).doubleValue() * Math.atan2(Math.sqrt(cos), Math.sqrt(1.0d - cos)) * 2.0d;
    }

    public static boolean j(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(StubApp.getString2(3958));
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i3 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i3 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Bitmap k(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "{\n        this.bitmap\n    }");
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …nfig.ARGB_8888,\n        )");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static synchronized boolean o(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
            Context context2 = f8734a;
            if (context2 != null && (bool = f8735b) != null && context2 == origApplicationContext) {
                return bool.booleanValue();
            }
            f8735b = null;
            Boolean valueOf = Boolean.valueOf(origApplicationContext.getPackageManager().isInstantApp());
            f8735b = valueOf;
            f8734a = origApplicationContext;
            return valueOf.booleanValue();
        }
    }

    public static final String p(RouterOrigin routerOrigin) {
        Intrinsics.checkNotNullParameter(routerOrigin, "<this>");
        int i3 = q.f3452a[routerOrigin.ordinal()];
        if (i3 == 1) {
            return StubApp.getString2(7517);
        }
        if (i3 == 2) {
            return StubApp.getString2(1933);
        }
        if (i3 == 3) {
            return StubApp.getString2(4423);
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(StubApp.getString2(7516));
    }

    public static final String q(RouterErrorType routerErrorType) {
        Intrinsics.checkNotNullParameter(routerErrorType, "<this>");
        int i3 = E8.f.f1943a[routerErrorType.ordinal()];
        String string2 = StubApp.getString2(7518);
        switch (i3) {
            case 1:
                return StubApp.getString2(1932);
            case 2:
                return StubApp.getString2(7523);
            case 3:
                return StubApp.getString2(7522);
            case 4:
                return StubApp.getString2(7521);
            case 5:
                return StubApp.getString2(7520);
            case 6:
                return string2;
            case 7:
                throw new IllegalStateException(StubApp.getString2(7519));
            case 8:
                return string2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String r(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (certificate == null) {
            throw new IllegalArgumentException(StubApp.getString2(7524));
        }
        Intrinsics.checkNotNullParameter(certificate, "<this>");
        C0104k c0104k = C0104k.f3820d;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        return Intrinsics.stringPlus("sha256/", d.t(encoded).d(StubApp.getString2(1488)).a());
    }

    public abstract TransformationMethod D(TransformationMethod transformationMethod);

    public abstract boolean d(t2.h hVar, t2.c cVar, t2.c cVar2);

    public abstract boolean e(t2.h hVar, Object obj, Object obj2);

    public abstract boolean f(t2.h hVar, g gVar, g gVar2);

    public abstract InputFilter[] l(InputFilter[] inputFilterArr);

    public float m(View view) {
        float transitionAlpha;
        if (f8738e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f8738e = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean n();

    public abstract void s(g gVar, g gVar2);

    public abstract void t(g gVar, Thread thread);

    public abstract void u(boolean z2);

    public abstract void v(boolean z2);

    public abstract void w(boolean z2);

    public abstract void x(boolean z2);

    public void y(View view, float f10) {
        if (f8738e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f8738e = false;
            }
        }
        view.setAlpha(f10);
    }

    public void z(View view, int i3) {
        if (!f8737d) {
            try {
                Field declaredField = View.class.getDeclaredField(StubApp.getString2("7525"));
                f8736c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(StubApp.getString2(7526), StubApp.getString2(7527));
            }
            f8737d = true;
        }
        Field field = f8736c;
        if (field != null) {
            try {
                f8736c.setInt(view, i3 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
