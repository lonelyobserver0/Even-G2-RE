package S3;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.stub.StubApp;
import e4.AbstractC0841a;

/* renamed from: S3.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0274h extends T3.a {
    public static final Parcelable.Creator<C0274h> CREATOR = new B0.s(16);

    /* renamed from: q, reason: collision with root package name */
    public static final Scope[] f6521q = new Scope[0];

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.android.gms.common.d[] f6522r = new com.google.android.gms.common.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f6523a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6524b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6525c;

    /* renamed from: d, reason: collision with root package name */
    public String f6526d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f6527e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f6528f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f6529g;

    /* renamed from: h, reason: collision with root package name */
    public Account f6530h;
    public com.google.android.gms.common.d[] j;

    /* renamed from: k, reason: collision with root package name */
    public com.google.android.gms.common.d[] f6531k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6532l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6533m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6534n;

    /* renamed from: p, reason: collision with root package name */
    public final String f6535p;

    public C0274h(int i3, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.d[] dVarArr, com.google.android.gms.common.d[] dVarArr2, boolean z2, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f6521q : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        com.google.android.gms.common.d[] dVarArr3 = f6522r;
        com.google.android.gms.common.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f6523a = i3;
        this.f6524b = i10;
        this.f6525c = i11;
        String string2 = StubApp.getString2(0);
        if (string2.equals(str)) {
            this.f6526d = string2;
        } else {
            this.f6526d = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = AbstractBinderC0267a.f6489f;
                String string22 = StubApp.getString2(5244);
                IInterface queryLocalInterface = iBinder.queryLocalInterface(string22);
                IInterface q10 = queryLocalInterface instanceof InterfaceC0276j ? (InterfaceC0276j) queryLocalInterface : new Q(iBinder, string22, 2);
                if (q10 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Q q11 = (Q) q10;
                            Parcel e10 = q11.e(q11.g(), 2);
                            Account account3 = (Account) AbstractC0841a.a(e10, Account.CREATOR);
                            e10.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w(StubApp.getString2("5979"), StubApp.getString2("5980"));
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f6530h = account2;
        } else {
            this.f6527e = iBinder;
            this.f6530h = account;
        }
        this.f6528f = scopeArr2;
        this.f6529g = bundle2;
        this.j = dVarArr4;
        this.f6531k = dVarArr3;
        this.f6532l = z2;
        this.f6533m = i12;
        this.f6534n = z10;
        this.f6535p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        B0.s.a(this, parcel, i3);
    }
}
