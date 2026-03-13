package com.google.android.gms.auth.api.signin;

import B0.s;
import S3.D;
import T3.a;
import a4.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new s(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f11152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11153b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11154c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11155d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11156e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f11157f;

    /* renamed from: g, reason: collision with root package name */
    public String f11158g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11159h;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f11160k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11161l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11162m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f11163n = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f11152a = i3;
        this.f11153b = str;
        this.f11154c = str2;
        this.f11155d = str3;
        this.f11156e = str4;
        this.f11157f = uri;
        this.f11158g = str5;
        this.f11159h = j;
        this.j = str6;
        this.f11160k = arrayList;
        this.f11161l = str7;
        this.f11162m = str8;
    }

    public static GoogleSignInAccount d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(StubApp.getString2(11423));
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString(StubApp.getString2(11424)));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(StubApp.getString2(11425));
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(1, jSONArray.getString(i3)));
        }
        String optString2 = jSONObject.optString(StubApp.getString2(290));
        String string2 = StubApp.getString2(11426);
        String optString3 = jSONObject.has(string2) ? jSONObject.optString(string2) : null;
        String string22 = StubApp.getString2(11427);
        String optString4 = jSONObject.has(string22) ? jSONObject.optString(string22) : null;
        String string23 = StubApp.getString2(1276);
        String optString5 = jSONObject.has(string23) ? jSONObject.optString(string23) : null;
        String string24 = StubApp.getString2(11428);
        String optString6 = jSONObject.has(string24) ? jSONObject.optString(string24) : null;
        String string25 = StubApp.getString2(11429);
        String optString7 = jSONObject.has(string25) ? jSONObject.optString(string25) : null;
        String string = jSONObject.getString(StubApp.getString2(11430));
        D.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        String string26 = StubApp.getString2(11431);
        googleSignInAccount.f11158g = jSONObject.has(string26) ? jSONObject.optString(string26) : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.j.equals(this.j)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f11160k);
        hashSet.addAll(googleSignInAccount.f11163n);
        HashSet hashSet2 = new HashSet(this.f11160k);
        hashSet2.addAll(this.f11163n);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.j.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f11160k);
        hashSet.addAll(this.f11163n);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        f.P(parcel, 1, 4);
        parcel.writeInt(this.f11152a);
        f.F(parcel, 2, this.f11153b);
        f.F(parcel, 3, this.f11154c);
        f.F(parcel, 4, this.f11155d);
        f.F(parcel, 5, this.f11156e);
        f.E(parcel, 6, this.f11157f, i3);
        f.F(parcel, 7, this.f11158g);
        f.P(parcel, 8, 8);
        parcel.writeLong(this.f11159h);
        f.F(parcel, 9, this.j);
        f.H(parcel, 10, this.f11160k);
        f.F(parcel, 11, this.f11161l);
        f.F(parcel, 12, this.f11162m);
        f.N(parcel, I10);
    }
}
