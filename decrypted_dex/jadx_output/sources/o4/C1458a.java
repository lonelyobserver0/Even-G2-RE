package o4;

import Q3.i;
import Q3.j;
import S3.AbstractC0275i;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.stub.StubApp;
import i5.C1059c;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1458a extends AbstractC0275i implements Q3.c {

    /* renamed from: C, reason: collision with root package name */
    public final boolean f18363C;

    /* renamed from: D, reason: collision with root package name */
    public final C1059c f18364D;

    /* renamed from: E, reason: collision with root package name */
    public final Bundle f18365E;

    /* renamed from: F, reason: collision with root package name */
    public final Integer f18366F;

    public C1458a(Context context, Looper looper, C1059c c1059c, Bundle bundle, i iVar, j jVar) {
        super(context, looper, 44, c1059c, iVar, jVar);
        this.f18363C = true;
        this.f18364D = c1059c;
        this.f18365E = bundle;
        this.f18366F = (Integer) c1059c.f14848g;
    }

    @Override // S3.AbstractC0271e, Q3.c
    public final int j() {
        return 12451000;
    }

    @Override // S3.AbstractC0271e, Q3.c
    public final boolean m() {
        return this.f18363C;
    }

    @Override // S3.AbstractC0271e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String string2 = StubApp.getString2(21615);
        IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
        return queryLocalInterface instanceof C1461d ? (C1461d) queryLocalInterface : new C1461d(iBinder, string2, 0);
    }

    @Override // S3.AbstractC0271e
    public final Bundle r() {
        C1059c c1059c = this.f18364D;
        boolean equals = this.f6493c.getPackageName().equals((String) c1059c.f14842a);
        Bundle bundle = this.f18365E;
        if (!equals) {
            bundle.putString(StubApp.getString2(21616), (String) c1059c.f14842a);
        }
        return bundle;
    }

    @Override // S3.AbstractC0271e
    public final String u() {
        return StubApp.getString2(21615);
    }

    @Override // S3.AbstractC0271e
    public final String v() {
        return StubApp.getString2(21617);
    }
}
