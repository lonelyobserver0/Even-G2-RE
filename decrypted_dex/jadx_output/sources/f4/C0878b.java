package f4;

import a0.C0379a;
import android.app.PendingIntent;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.stub.StubApp;
import i4.C1040d;
import i4.C1055s;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0878b extends Q3.h implements ActivityRecognitionClient {

    /* renamed from: i, reason: collision with root package name */
    public static final Q3.d f13741i;

    static {
        C2.i iVar = new C2.i();
        f13741i = new Q3.d(StubApp.getString2(17446), new U3.b(1), iVar);
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final q4.j removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0879c(pendingIntent);
        b2.f2346b = 2406;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final q4.j removeActivityUpdates(PendingIntent pendingIntent) {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0379a(pendingIntent, 4);
        b2.f2346b = 2402;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final q4.j removeSleepSegmentUpdates(PendingIntent pendingIntent) {
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new C0880d(0, pendingIntent);
        b2.f2346b = 2411;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final q4.j requestActivityTransitionUpdates(C1040d c1040d, PendingIntent pendingIntent) {
        c1040d.f14763d = this.f5722b;
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new Y.m(11, c1040d, pendingIntent);
        b2.f2346b = 2405;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final q4.j requestActivityUpdates(long j, PendingIntent pendingIntent) {
        S3.D.a(StubApp.getString2(17447), j >= 0);
        S3.D.j(StubApp.getString2(17448), j != Long.MIN_VALUE);
        i4.x xVar = new i4.x(j, true, null, null, null, false, null, 0L, null);
        xVar.j = this.f5722b;
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new Y.m(12, xVar, pendingIntent);
        b2.f2346b = 2401;
        return d(1, b2.a());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final q4.j requestSleepSegmentUpdates(PendingIntent pendingIntent, C1055s c1055s) {
        S3.D.i(pendingIntent, StubApp.getString2(7477));
        Fb.a b2 = Fb.a.b();
        b2.f2347c = new V6.b(this, pendingIntent, c1055s);
        b2.f2348d = new com.google.android.gms.common.d[]{i4.y.f14829a};
        b2.f2346b = 2410;
        return d(0, b2.a());
    }
}
