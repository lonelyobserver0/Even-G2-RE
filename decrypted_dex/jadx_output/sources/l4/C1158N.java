package l4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.stub.StubApp;

/* renamed from: l4.N, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1158N extends AbstractC1150F {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f16187e = {StubApp.getString2(20029), StubApp.getString2(20030), StubApp.getString2(20027), StubApp.getString2(20028)};

    /* renamed from: c, reason: collision with root package name */
    public final C1196m f16188c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16189d;

    public C1158N(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16188c = new C1196m(this, ((C1200n0) this.f4728a).f16536a);
    }

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return false;
    }

    public final void o() {
        int delete;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        k();
        try {
            SQLiteDatabase q10 = q();
            if (q10 == null || (delete = q10.delete(StubApp.getString2("9802"), null, null)) <= 0) {
                return;
            }
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16249p.c(Integer.valueOf(delete), StubApp.getString2("20031"));
        } catch (SQLiteException e10) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.c(e10, StubApp.getString2(20032));
        }
    }

    public final boolean p() {
        String string2 = StubApp.getString2(20033);
        k();
        if (!this.f16189d) {
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            if (c1200n0.f16536a.getDatabasePath(StubApp.getString2(20034)).exists()) {
                int i3 = 0;
                int i10 = 5;
                while (true) {
                    if (i3 >= 5) {
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        t3.j.b(StubApp.getString2(20036));
                        break;
                    }
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        try {
                            SQLiteDatabase q10 = q();
                            if (q10 != null) {
                                q10.beginTransaction();
                                q10.delete(StubApp.getString2("9802"), StubApp.getString2("20035"), new String[]{Integer.toString(3)});
                                q10.setTransactionSuccessful();
                                q10.endTransaction();
                                q10.close();
                                return true;
                            }
                            this.f16189d = true;
                        } catch (SQLiteDatabaseLockedException unused) {
                            SystemClock.sleep(i10);
                            i10 += 20;
                            if (0 == 0) {
                            }
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e10) {
                        T t10 = c1200n0.f16541f;
                        C1200n0.l(t10);
                        t10.f16242f.c(e10, string2);
                        this.f16189d = true;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteException e11) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        T t11 = c1200n0.f16541f;
                        C1200n0.l(t11);
                        t11.f16242f.c(e11, string2);
                        this.f16189d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    public final SQLiteDatabase q() {
        if (this.f16189d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f16188c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f16189d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(int r20, byte[] r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1158N.r(int, byte[]):boolean");
    }
}
