package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.geojson.Point;
import com.microsoft.cognitiveservices.speech.PropertyCollection;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class b {
    public static int a(String str) {
        String string2;
        for (int i3 : AbstractC1856e.d(2)) {
            if (i3 == 1) {
                string2 = StubApp.getString2(13547);
            } else {
                if (i3 != 2) {
                    throw null;
                }
                string2 = StubApp.getString2(13546);
            }
            if (string2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(E1.a.j(StubApp.getString2(13548), str));
    }

    public static int b(int i3, int i10, long j) {
        return (Long.hashCode(j) + i3) * i10;
    }

    public static PropertyCollection c(long j, IntRef intRef) {
        Contracts.throwIfFail(j);
        return new PropertyCollection(intRef);
    }

    public static ClassCastException d(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException e(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String f(double d8, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Double.valueOf(d8)));
        sb2.append(str);
        return sb2.toString();
    }

    public static String g(int i3, String str, StringBuilder sb2) {
        sb2.append(RecordUtils.fieldToString(Integer.valueOf(i3)));
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(String str, IOException iOException) {
        return str + iOException;
    }

    public static String i(String str, StringBuilder sb2, List list) {
        sb2.append(RecordUtils.fieldToString(list));
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, int i3, char c10) {
        sb2.append(i3);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String k(boolean z2, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Boolean.valueOf(z2)));
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder l(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void m(double d8, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Double.valueOf(d8)));
        sb2.append(str);
    }

    public static void n(float f10, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Float.valueOf(f10)));
        sb2.append(str);
    }

    public static void o(int i3, String str, StringBuilder sb2) {
        sb2.append(RecordUtils.fieldToString(Integer.valueOf(i3)));
        sb2.append(str);
    }

    public static void p(long j, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Long.valueOf(j)));
        sb2.append(str);
    }

    public static void q(Point point, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(point));
        sb2.append(str);
    }

    public static void r(Double d8, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(d8));
        sb2.append(str);
    }

    public static void s(Float f10, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(f10));
        sb2.append(str);
    }

    public static void t(Integer num, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(num));
        sb2.append(str);
    }

    public static void u(Long l9, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(l9));
        sb2.append(str);
    }

    public static void v(String str, StringBuilder sb2, List list) {
        sb2.append(RecordUtils.fieldToString(list));
        sb2.append(str);
    }

    public static void w(StringBuilder sb2, String str, Boolean bool) {
        sb2.append(RecordUtils.fieldToString(bool));
        sb2.append(str);
    }

    public static /* synthetic */ String x(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(207);
            case 2:
                return StubApp.getString2(3793);
            case 3:
                return StubApp.getString2(10215);
            case 4:
                return StubApp.getString2(13554);
            case 5:
                return StubApp.getString2(3323);
            case 6:
                return StubApp.getString2(4825);
            case 7:
                return StubApp.getString2(10297);
            case 8:
                return StubApp.getString2(10298);
            case 9:
                return StubApp.getString2(13553);
            case 10:
                return StubApp.getString2(13552);
            case 11:
                return StubApp.getString2(13551);
            case 12:
                return StubApp.getString2(13550);
            case 13:
                return StubApp.getString2(13549);
            default:
                return StubApp.getString2(1116);
        }
    }

    public static /* synthetic */ String y(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(13559);
            case 2:
                return StubApp.getString2(11415);
            case 3:
                return StubApp.getString2(13558);
            case 4:
                return StubApp.getString2(13557);
            case 5:
                return StubApp.getString2(13556);
            case 6:
                return StubApp.getString2(13555);
            default:
                return StubApp.getString2(1116);
        }
    }
}
