package l4;

import android.os.Bundle;
import com.stub.StubApp;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: l4.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1204p {

    /* renamed from: f, reason: collision with root package name */
    public static final C1204p f16571f = new C1204p((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f16572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16573b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f16574c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16575d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f16576e;

    public C1204p(Boolean bool, int i3, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        this.f16576e = enumMap;
        enumMap.put((EnumMap) EnumC1222y0.f16686d, (EnumC1222y0) (bool == null ? EnumC1218w0.f16645b : bool.booleanValue() ? EnumC1218w0.f16648e : EnumC1218w0.f16647d));
        this.f16572a = i3;
        this.f16573b = d();
        this.f16574c = bool2;
        this.f16575d = str;
    }

    public static C1204p b(String str) {
        if (str == null || str.length() <= 0) {
            return f16571f;
        }
        String[] split = str.split(StubApp.getString2(478));
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        EnumC1222y0[] enumC1222y0Arr = EnumC1220x0.f16656c.f16658a;
        int length = enumC1222y0Arr.length;
        int i3 = 1;
        int i10 = 0;
        while (i10 < length) {
            enumMap.put((EnumMap) enumC1222y0Arr[i10], (EnumC1222y0) C1224z0.e(split[i3].charAt(0)));
            i10++;
            i3++;
        }
        return new C1204p(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static C1204p c(int i3, Bundle bundle) {
        if (bundle == null) {
            return new C1204p((Boolean) null, i3, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16656c.f16658a) {
            enumMap.put((EnumMap) enumC1222y0, (EnumC1222y0) C1224z0.d(bundle.getString(enumC1222y0.f16689a)));
        }
        String string2 = StubApp.getString2(19867);
        return new C1204p(enumMap, i3, bundle.containsKey(string2) ? Boolean.valueOf(bundle.getString(string2)) : null, bundle.getString(StubApp.getString2(19868)));
    }

    public final EnumC1218w0 a() {
        EnumC1218w0 enumC1218w0 = (EnumC1218w0) this.f16576e.get(EnumC1222y0.f16686d);
        return enumC1218w0 == null ? EnumC1218w0.f16645b : enumC1218w0;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16572a);
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16656c.f16658a) {
            sb2.append(StubApp.getString2(478));
            sb2.append(C1224z0.h((EnumC1218w0) this.f16576e.get(enumC1222y0)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1204p)) {
            return false;
        }
        C1204p c1204p = (C1204p) obj;
        if (this.f16573b.equalsIgnoreCase(c1204p.f16573b) && Objects.equals(this.f16574c, c1204p.f16574c)) {
            return Objects.equals(this.f16575d, c1204p.f16575d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f16574c;
        int i3 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f16575d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f16573b.hashCode() + (i3 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20872));
        sb2.append(C1224z0.a(this.f16572a));
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16656c.f16658a) {
            sb2.append(StubApp.getString2(321));
            sb2.append(enumC1222y0.f16689a);
            sb2.append(StubApp.getString2(2359));
            EnumC1218w0 enumC1218w0 = (EnumC1218w0) this.f16576e.get(enumC1222y0);
            String string2 = StubApp.getString2(20873);
            if (enumC1218w0 == null) {
                sb2.append(string2);
            } else {
                int ordinal = enumC1218w0.ordinal();
                if (ordinal == 0) {
                    sb2.append(string2);
                } else if (ordinal == 1) {
                    sb2.append(StubApp.getString2(20459));
                } else if (ordinal == 2) {
                    sb2.append(StubApp.getString2(12543));
                } else if (ordinal == 3) {
                    sb2.append(StubApp.getString2(12542));
                }
            }
        }
        Boolean bool = this.f16574c;
        if (bool != null) {
            sb2.append(StubApp.getString2(20874));
            sb2.append(bool);
        }
        String str = this.f16575d;
        if (str != null) {
            sb2.append(StubApp.getString2(20875));
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C1204p(EnumMap enumMap, int i3, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC1222y0.class);
        this.f16576e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16572a = i3;
        this.f16573b = d();
        this.f16574c = bool;
        this.f16575d = str;
    }
}
