package U3;

import R3.r;
import S3.AbstractC0275i;
import S3.C0283q;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c4.f;
import com.stub.StubApp;
import i5.C1059c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends AbstractC0275i {

    /* renamed from: C, reason: collision with root package name */
    public final C0283q f7453C;

    public d(Context context, Looper looper, C1059c c1059c, C0283q c0283q, r rVar, r rVar2) {
        super(context, looper, 270, c1059c, rVar, rVar2);
        this.f7453C = c0283q;
    }

    @Override // S3.AbstractC0271e, Q3.c
    public final int j() {
        return 203400000;
    }

    @Override // S3.AbstractC0271e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String string2 = StubApp.getString2(6339);
        IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, string2, 0);
    }

    @Override // S3.AbstractC0271e
    public final com.google.android.gms.common.d[] q() {
        return f.f10825b;
    }

    @Override // S3.AbstractC0271e
    public final Bundle r() {
        C0283q c0283q = this.f7453C;
        c0283q.getClass();
        Bundle bundle = new Bundle();
        String str = c0283q.f6557b;
        if (str != null) {
            bundle.putString(StubApp.getString2(6340), str);
        }
        return bundle;
    }

    @Override // S3.AbstractC0271e
    public final String u() {
        return StubApp.getString2(6339);
    }

    @Override // S3.AbstractC0271e
    public final String v() {
        return StubApp.getString2(6341);
    }

    @Override // S3.AbstractC0271e
    public final boolean w() {
        return true;
    }
}
