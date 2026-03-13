package gb;

import com.stub.StubApp;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14352a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14353b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14356e;

    public h0(String str, int i3, int i10, int i11, int i12) {
        String string2 = StubApp.getString2(74);
        String string22 = StubApp.getString2(81);
        if (!(i3 == -1 && i10 == -1) && (i3 < 0 || i10 < 0)) {
            throw new IndexOutOfBoundsException(StubApp.getString2(18004) + String.valueOf(i3) + string22 + String.valueOf(i10) + string2);
        }
        if (!(i11 == -1 && i12 == -1) && (i11 < 0 || i11 > i12)) {
            throw new IndexOutOfBoundsException(StubApp.getString2(18003) + String.valueOf(i11) + string22 + String.valueOf(i12) + string2);
        }
        if (i12 > str.length()) {
            throw new IndexOutOfBoundsException(StubApp.getString2(18002) + String.valueOf(i11));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(StubApp.getString2(18001) + String.valueOf(i3));
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException(StubApp.getString2(18000) + String.valueOf(i10));
        }
        this.f14352a = str;
        this.f14353b = i3;
        this.f14354c = i10;
        this.f14355d = i11;
        this.f14356e = i12;
    }

    public static h0 a(JSONObject jSONObject) {
        return new h0(jSONObject.getString(StubApp.getString2(613)), jSONObject.getInt(StubApp.getString2(18005)), jSONObject.getInt(StubApp.getString2(18006)), jSONObject.getInt(StubApp.getString2(18007)), jSONObject.getInt(StubApp.getString2(18008)));
    }
}
