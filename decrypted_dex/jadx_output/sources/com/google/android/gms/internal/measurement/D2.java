package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class D2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f11247a;

    static {
        char[] cArr = new char[80];
        f11247a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(sb2, i3);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append(StubApp.getString2(4956));
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        boolean z2 = obj instanceof String;
        String string2 = StubApp.getString2(11621);
        if (z2) {
            sb2.append(string2);
            C0594b2 c0594b2 = C0594b2.f11453c;
            sb2.append(AbstractC0624h2.C(new C0594b2(((String) obj).getBytes(AbstractC0673r2.f11652a))));
            sb2.append(Typography.quote);
            return;
        }
        if (obj instanceof C0594b2) {
            sb2.append(string2);
            sb2.append(AbstractC0624h2.C((C0594b2) obj));
            sb2.append(Typography.quote);
            return;
        }
        boolean z10 = obj instanceof AbstractC0639k2;
        String string22 = StubApp.getString2(265);
        String string23 = StubApp.getString2(3692);
        String string24 = StubApp.getString2(11622);
        if (z10) {
            sb2.append(string24);
            b((AbstractC0639k2) obj, sb2, i3 + 2);
            sb2.append(string23);
            c(sb2, i3);
            sb2.append(string22);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(StubApp.getString2(994));
            sb2.append(obj);
            return;
        }
        int i11 = i3 + 2;
        sb2.append(string24);
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i11, StubApp.getString2(728), entry.getKey());
        a(sb2, i11, StubApp.getString2(1061), entry.getValue());
        sb2.append(string23);
        c(sb2, i3);
        sb2.append(string22);
    }

    public static void b(AbstractC0639k2 abstractC0639k2, StringBuilder sb2, int i3) {
        String string2;
        String string22;
        String string23;
        int i10;
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0639k2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            string2 = StubApp.getString2(6443);
            string22 = StubApp.getString2(11623);
            string23 = StubApp.getString2(6911);
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(string23)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith(string22)) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(string2)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            String string24 = StubApp.getString2(10690);
            if (!substring.endsWith(string24) || substring.endsWith(StubApp.getString2(11624)) || substring.equals(string24) || (method2 = (Method) entry.getValue()) == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i3, substring.substring(0, substring.length() - 4), AbstractC0639k2.n(method2, abstractC0639k2, new Object[0]));
                    i10 = i11;
                }
            }
            String string25 = StubApp.getString2(10692);
            if (substring.endsWith(string25) && !substring.equals(string25) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i3, substring.substring(0, substring.length() - 3), AbstractC0639k2.n(method, abstractC0639k2, new Object[0]));
            } else if (hashSet.contains(string23.concat(substring)) && (!substring.endsWith(StubApp.getString2(11625)) || !treeMap.containsKey(string2.concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get(string22.concat(substring));
                if (method4 != null) {
                    Object n10 = AbstractC0639k2.n(method4, abstractC0639k2, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC0639k2.n(method5, abstractC0639k2, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i3, substring, n10);
                    } else if (n10 instanceof Boolean) {
                        if (!((Boolean) n10).booleanValue()) {
                        }
                        a(sb2, i3, substring, n10);
                    } else if (n10 instanceof Integer) {
                        if (((Integer) n10).intValue() == 0) {
                        }
                        a(sb2, i3, substring, n10);
                    } else if (n10 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) n10).floatValue()) == 0) {
                        }
                        a(sb2, i3, substring, n10);
                    } else if (n10 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) n10).doubleValue()) == 0) {
                        }
                        a(sb2, i3, substring, n10);
                    } else {
                        if (n10 instanceof String) {
                            equals = n10.equals("");
                        } else if (n10 instanceof C0594b2) {
                            equals = n10.equals(C0594b2.f11453c);
                        } else if (n10 instanceof V1) {
                            if (n10 == ((AbstractC0639k2) ((AbstractC0639k2) ((V1) n10)).o(6))) {
                            }
                            a(sb2, i3, substring, n10);
                        } else {
                            if ((n10 instanceof Enum) && ((Enum) n10).ordinal() == 0) {
                            }
                            a(sb2, i3, substring, n10);
                        }
                        if (equals) {
                        }
                        a(sb2, i3, substring, n10);
                    }
                }
            }
            i10 = i11;
        }
        P2 p22 = abstractC0639k2.zzc;
        if (p22 != null) {
            for (int i13 = 0; i13 < p22.f11342a; i13++) {
                a(sb2, i3, String.valueOf(p22.f11343b[i13] >>> 3), p22.f11344c[i13]);
            }
        }
    }

    public static void c(StringBuilder sb2, int i3) {
        while (i3 > 0) {
            int i10 = 80;
            if (i3 <= 80) {
                i10 = i3;
            }
            sb2.append(f11247a, 0, i10);
            i3 -= i10;
        }
    }
}
