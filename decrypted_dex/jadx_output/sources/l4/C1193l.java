package l4;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C0608e1;
import com.google.android.gms.internal.measurement.C0613f1;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: l4.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1193l {

    /* renamed from: a, reason: collision with root package name */
    public final String f16501a;

    /* renamed from: b, reason: collision with root package name */
    public long f16502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1199n f16503c;

    public C1193l(C1199n c1199n, String str) {
        Objects.requireNonNull(c1199n);
        this.f16503c = c1199n;
        S3.D.e(str);
        this.f16501a = str;
        this.f16502b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public final List a() {
        ArrayList arrayList;
        C1199n c1199n = this.f16503c;
        ArrayList arrayList2 = new ArrayList();
        String valueOf = String.valueOf(this.f16502b);
        String str = this.f16501a;
        Cursor cursor = null;
        try {
            try {
                cursor = c1199n.b0().query(StubApp.getString2("19783"), new String[]{StubApp.getString2("19799"), StubApp.getString2("152"), StubApp.getString2("1350"), StubApp.getString2("19844"), StubApp.getString2("1485"), StubApp.getString2("19845")}, StubApp.getString2(20545), new String[]{str, valueOf}, null, null, StubApp.getString2("19799"), StubApp.getString2(20546));
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j3 = cursor.getLong(3);
                        boolean z2 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.f16502b) {
                            this.f16502b = j;
                        }
                        try {
                            C0608e1 c0608e1 = (C0608e1) W.X(C0613f1.z(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c0608e1.b();
                            ((C0613f1) c0608e1.f11593b).F(string);
                            long j10 = cursor.getLong(2);
                            c0608e1.b();
                            ((C0613f1) c0608e1.f11593b).G(j10);
                            arrayList2.add(new C1190k(j, j3, z2, (C0613f1) c0608e1.e()));
                        } catch (IOException e10) {
                            T t3 = ((C1200n0) c1199n.f4728a).f16541f;
                            C1200n0.l(t3);
                            t3.f16242f.d(StubApp.getString2("20547"), T.s(str), e10);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e11) {
            T t10 = ((C1200n0) c1199n.f4728a).f16541f;
            C1200n0.l(t10);
            t10.f16242f.d(StubApp.getString2("20548"), T.s(str), e11);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public C1193l(C1199n c1199n, String str, long j) {
        Objects.requireNonNull(c1199n);
        this.f16503c = c1199n;
        S3.D.e(str);
        this.f16501a = str;
        this.f16502b = c1199n.H(-1L, StubApp.getString2(20544), new String[]{str, String.valueOf(j)});
    }
}
