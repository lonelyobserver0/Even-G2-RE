package E;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f1688a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f1689b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f1690c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f1691d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1692e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f1693f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1694g;

    public static int b(Context context, int i3, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? i3 : i10;
    }

    public static int c(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z2 = f13 > 0.008856452f;
        float f14 = z2 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1690c;
        return F.a.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float d(int i3) {
        float f10 = i3 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static d g(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException(StubApp.getString2(1567));
        }
        String string2 = StubApp.getString2(1565);
        xmlResourceParser.require(2, null, string2);
        if (!xmlResourceParser.getName().equals(string2)) {
            i(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), B.a.f399b);
        String string = obtainAttributes.getString(0);
        String string3 = obtainAttributes.getString(5);
        String string4 = obtainAttributes.getString(6);
        String string5 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string6 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string != null && string3 != null && string4 != null) {
            while (xmlResourceParser.next() != 3) {
                i(xmlResourceParser);
            }
            List h2 = h(resources, resourceId);
            return new g(new K.d(string, string3, string4, h2), string5 != null ? new K.d(string, string3, string5, h2) : null, integer, integer2, string6);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals(StubApp.getString2(1566))) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), B.a.f400c);
                    int i3 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i10 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string7 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i11 = obtainAttributes2.getInt(i10, 0);
                    int i12 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i12, 0);
                    String string8 = obtainAttributes2.getString(i12);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        i(xmlResourceParser);
                    }
                    arrayList.add(new f(string8, i3, string7, i11, resourceId2, z2));
                } else {
                    i(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e((f[]) arrayList.toArray(new f[0]));
    }

    public static List h(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i3);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void i(XmlResourceParser xmlResourceParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static float j() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i3) {
        new Handler(Looper.getMainLooper()).post(new j(i3, 0, this));
    }

    public abstract void e(int i3);

    public abstract void f(Typeface typeface);
}
