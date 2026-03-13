package l4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.P3;
import com.stub.StubApp;
import java.util.Objects;

/* renamed from: l4.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1196m extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Mb.b f16514b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1196m(C1199n c1199n, Context context) {
        this(context, StubApp.getString2(19677));
        this.f16513a = 0;
        Objects.requireNonNull(c1199n);
        this.f16514b = c1199n;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f16513a) {
            case 0:
                C1199n c1199n = (C1199n) this.f16514b;
                ((C1200n0) c1199n.f4728a).getClass();
                Cc.a aVar = c1199n.f16527e;
                if (aVar.f1188b != 0) {
                    ((W3.a) aVar.f1189c).getClass();
                    if (SystemClock.elapsedRealtime() - aVar.f1188b < 3600000) {
                        throw new SQLiteException(StubApp.getString2(20565));
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((W3.a) aVar.f1189c).getClass();
                    aVar.f1188b = SystemClock.elapsedRealtime();
                    C1200n0 c1200n0 = (C1200n0) c1199n.f4728a;
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.f16242f.b(StubApp.getString2(20562));
                    Context context = c1200n0.f16536a;
                    String string2 = StubApp.getString2(19677);
                    if (!context.getDatabasePath(string2).delete()) {
                        T t10 = c1200n0.f16541f;
                        C1200n0.l(t10);
                        t10.f16242f.c(string2, StubApp.getString2(20563));
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        aVar.f1188b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e10) {
                        T t11 = c1200n0.f16541f;
                        C1200n0.l(t11);
                        t11.f16242f.c(e10, StubApp.getString2(20564));
                        throw e10;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e11) {
                    throw e11;
                } catch (SQLiteException unused2) {
                    C1158N c1158n = (C1158N) this.f16514b;
                    C1200n0 c1200n02 = (C1200n0) c1158n.f4728a;
                    T t12 = c1200n02.f16541f;
                    C1200n0.l(t12);
                    t12.f16242f.b(StubApp.getString2(20559));
                    Context context2 = c1200n02.f16536a;
                    String string22 = StubApp.getString2(20034);
                    if (!context2.getDatabasePath(string22).delete()) {
                        T t13 = c1200n02.f16541f;
                        C1200n0.l(t13);
                        t13.f16242f.c(string22, StubApp.getString2(20560));
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e12) {
                        T t14 = ((C1200n0) c1158n.f4728a).f16541f;
                        C1200n0.l(t14);
                        t14.f16242f.c(e12, StubApp.getString2(20561));
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f16513a) {
            case 0:
                T t3 = ((C1200n0) ((C1199n) this.f16514b).f4728a).f16541f;
                C1200n0.l(t3);
                A0.f(t3, sQLiteDatabase);
                break;
            default:
                T t10 = ((C1200n0) ((C1158N) this.f16514b).f4728a).f16541f;
                C1200n0.l(t10);
                A0.f(t10, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        int i11 = this.f16513a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f16513a) {
            case 0:
                String[] strArr = C1199n.f16516f;
                C1200n0 c1200n0 = (C1200n0) ((C1199n) this.f16514b).f4728a;
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                A0.d(t3, sQLiteDatabase, StubApp.getString2(973), StubApp.getString2(20568), StubApp.getString2(20569), strArr);
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(20572), StubApp.getString2(20570), StubApp.getString2(20571), null);
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19781), StubApp.getString2(20573), StubApp.getString2(20574), null);
                String[] strArr2 = C1199n.f16518h;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19780), StubApp.getString2(20575), StubApp.getString2(20576), strArr2);
                String[] strArr3 = C1199n.j;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19782), StubApp.getString2(20577), StubApp.getString2(20578), strArr3);
                String[] strArr4 = C1199n.f16520l;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(20581), StubApp.getString2(20579), StubApp.getString2(20580), strArr4);
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19784), StubApp.getString2(20582), StubApp.getString2(20583), null);
                String[] strArr5 = C1199n.f16519k;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19783), StubApp.getString2(20584), StubApp.getString2(20585), strArr5);
                String[] strArr6 = C1199n.f16521m;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19785), StubApp.getString2(20586), StubApp.getString2(20587), strArr6);
                String[] strArr7 = C1199n.f16522n;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19786), StubApp.getString2(20588), StubApp.getString2(20589), strArr7);
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19787), StubApp.getString2(20590), StubApp.getString2(20591), null);
                String[] strArr8 = C1199n.f16523p;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(20594), StubApp.getString2(20592), StubApp.getString2(20593), strArr8);
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(20595), StubApp.getString2(20596), StubApp.getString2(20597), null);
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(3809), StubApp.getString2(20598), StubApp.getString2(20599), null);
                String[] strArr9 = C1199n.f16524q;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19788), StubApp.getString2(20600), StubApp.getString2(20601), strArr9);
                P3.a();
                String[] strArr10 = C1199n.f16525r;
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(18357), StubApp.getString2(20602), StubApp.getString2(20603), strArr10);
                C1200n0.l(t10);
                String[] strArr11 = C1199n.f16517g;
                A0.d(t10, sQLiteDatabase, StubApp.getString2(3130), StubApp.getString2(20604), StubApp.getString2(20605), strArr11);
                C1200n0.l(t10);
                A0.d(t10, sQLiteDatabase, StubApp.getString2(19789), StubApp.getString2(20606), StubApp.getString2(20607), null);
                break;
            default:
                String[] strArr12 = C1158N.f16187e;
                T t11 = ((C1200n0) ((C1158N) this.f16514b).f4728a).f16541f;
                C1200n0.l(t11);
                A0.d(t11, sQLiteDatabase, StubApp.getString2(9802), StubApp.getString2(20566), StubApp.getString2(20567), strArr12);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        int i11 = this.f16513a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1196m(C1158N c1158n, Context context) {
        this(context, StubApp.getString2(20034));
        this.f16513a = 1;
        Objects.requireNonNull(c1158n);
        this.f16514b = c1158n;
    }

    public C1196m(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
