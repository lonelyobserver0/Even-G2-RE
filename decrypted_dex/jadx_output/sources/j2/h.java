package j2;

import android.content.Context;
import android.content.SharedPreferences;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends K1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15282c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f15283d;

    public h(Context context, int i3, int i10) {
        super(i3, i10);
        this.f15283d = context;
    }

    @Override // K1.a
    public final void a(P1.c cVar) {
        switch (this.f15282c) {
            case 0:
                int i3 = this.f3630b;
                String string2 = StubApp.getString2(18985);
                if (i3 >= 10) {
                    cVar.p(new Object[]{string2, 1});
                    return;
                } else {
                    this.f15283d.getSharedPreferences(StubApp.getString2(18984), 0).edit().putBoolean(string2, true).apply();
                    return;
                }
            default:
                cVar.k(StubApp.getString2(4802));
                Context context = this.f15283d;
                SharedPreferences sharedPreferences = context.getSharedPreferences(StubApp.getString2(18984), 0);
                String string22 = StubApp.getString2(18985);
                boolean contains = sharedPreferences.contains(string22);
                String string23 = StubApp.getString2(18986);
                if (contains || sharedPreferences.contains(string23)) {
                    long j = sharedPreferences.getLong(string23, 0L);
                    long j3 = sharedPreferences.getBoolean(string22, false) ? 1L : 0L;
                    cVar.a();
                    try {
                        cVar.p(new Object[]{string23, Long.valueOf(j)});
                        cVar.p(new Object[]{string22, Long.valueOf(j3)});
                        sharedPreferences.edit().clear().apply();
                        cVar.G();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences(StubApp.getString2(18987), 0);
                String string24 = StubApp.getString2(18988);
                if (sharedPreferences2.contains(string24) || sharedPreferences2.contains(string24)) {
                    int i10 = sharedPreferences2.getInt(string24, 0);
                    String string25 = StubApp.getString2(18989);
                    int i11 = sharedPreferences2.getInt(string25, 0);
                    cVar.a();
                    try {
                        cVar.p(new Object[]{string24, Integer.valueOf(i10)});
                        cVar.p(new Object[]{string25, Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        cVar.G();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f15283d = context;
    }
}
