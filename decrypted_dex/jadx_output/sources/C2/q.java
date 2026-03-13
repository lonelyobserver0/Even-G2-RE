package C2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import com.stub.StubApp;
import java.util.Calendar;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1097c;

    /* renamed from: f, reason: collision with root package name */
    public String f1100f;

    /* renamed from: g, reason: collision with root package name */
    public double f1101g;

    /* renamed from: h, reason: collision with root package name */
    public double f1102h;

    /* renamed from: i, reason: collision with root package name */
    public Calendar f1103i;
    public boolean j = false;

    /* renamed from: d, reason: collision with root package name */
    public final o f1098d = new OnNmeaMessageListener() { // from class: C2.o
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j) {
            q qVar = q.this;
            qVar.getClass();
            if (str.trim().matches(StubApp.getString2(1110))) {
                qVar.f1100f = str;
                qVar.f1103i = Calendar.getInstance();
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public final p f1099e = new p(this);

    /* JADX WARN: Type inference failed for: r2v3, types: [C2.o] */
    public q(Context context, m mVar) {
        this.f1095a = context;
        this.f1097c = mVar;
        this.f1096b = (LocationManager) context.getSystemService(StubApp.getString2(662));
    }

    public final void a(Location location) {
        m mVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble(StubApp.getString2(1111), this.f1101g);
        location.getExtras().putDouble(StubApp.getString2(1112), this.f1102h);
        if (this.f1100f == null || (mVar = this.f1097c) == null || !this.j) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f1103i;
        if ((calendar2 == null || !calendar2.before(calendar)) && mVar.f1090d) {
            String[] split = this.f1100f.split(StubApp.getString2(321));
            String str = split[0];
            if (!this.f1100f.trim().matches(StubApp.getString2(1110)) || split.length <= 9 || split[9].isEmpty()) {
                return;
            }
            double parseDouble = Double.parseDouble(split[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble(StubApp.getString2(1113), parseDouble);
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (this.j || this.f1097c == null || (locationManager = this.f1096b) == null || this.f1095a.checkSelfPermission(StubApp.getString2(140)) != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f1098d, (Handler) null);
        locationManager.registerGnssStatusCallback(this.f1099e, (Handler) null);
        this.j = true;
    }
}
