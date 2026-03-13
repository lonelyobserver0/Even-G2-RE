package I3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3124c = StubApp.getString2(2834) + System.currentTimeMillis() + StubApp.getString2(74);

    /* renamed from: d, reason: collision with root package name */
    public static final int f3125d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final List f3126e = Arrays.asList(new i(0), new i(1), new i(2), new i(3), new i(4), new i(5), new i(6));

    /* renamed from: a, reason: collision with root package name */
    public final int f3127a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3128b;

    public j(Context context, int i3, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
        this.f3128b = false;
        this.f3127a = i3;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        List list = f3126e;
        if (i10 > list.size()) {
            StringBuilder l9 = AbstractC1482f.l(i3, StubApp.getString2(2855), i10, StubApp.getString2(1632), StubApp.getString2(2856));
            l9.append(list.size());
            l9.append(StubApp.getString2(2857));
            throw new IllegalArgumentException(l9.toString());
        }
        while (i3 < i10) {
            switch (((i) list.get(i3)).f3123a) {
                case 0:
                    sQLiteDatabase.execSQL(StubApp.getString2(2850));
                    sQLiteDatabase.execSQL(StubApp.getString2(2851));
                    sQLiteDatabase.execSQL(StubApp.getString2(2852));
                    sQLiteDatabase.execSQL(StubApp.getString2(2853));
                    sQLiteDatabase.execSQL(StubApp.getString2(2854));
                    break;
                case 1:
                    sQLiteDatabase.execSQL(StubApp.getString2(2847));
                    sQLiteDatabase.execSQL(StubApp.getString2(2848));
                    sQLiteDatabase.execSQL(StubApp.getString2(2849));
                    break;
                case 2:
                    sQLiteDatabase.execSQL(StubApp.getString2(2846));
                    break;
                case 3:
                    sQLiteDatabase.execSQL(StubApp.getString2(2843));
                    sQLiteDatabase.execSQL(StubApp.getString2(2844));
                    sQLiteDatabase.execSQL(StubApp.getString2(2845));
                    break;
                case 4:
                    sQLiteDatabase.execSQL(StubApp.getString2(2839));
                    sQLiteDatabase.execSQL(StubApp.getString2(2840));
                    sQLiteDatabase.execSQL(StubApp.getString2(2841));
                    sQLiteDatabase.execSQL(StubApp.getString2(2842));
                    sQLiteDatabase.execSQL(f3124c);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(StubApp.getString2(2838));
                    break;
                default:
                    sQLiteDatabase.execSQL(StubApp.getString2(2835));
                    sQLiteDatabase.execSQL(StubApp.getString2(2836));
                    sQLiteDatabase.execSQL(StubApp.getString2(2837));
                    break;
            }
            i3++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f3128b = true;
        sQLiteDatabase.rawQuery(StubApp.getString2(2858), new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f3128b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f3127a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        sQLiteDatabase.execSQL(StubApp.getString2(2859));
        sQLiteDatabase.execSQL(StubApp.getString2(2860));
        sQLiteDatabase.execSQL(StubApp.getString2(2861));
        sQLiteDatabase.execSQL(StubApp.getString2(2844));
        sQLiteDatabase.execSQL(StubApp.getString2(2839));
        sQLiteDatabase.execSQL(StubApp.getString2(2840));
        if (!this.f3128b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f3128b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        if (!this.f3128b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i3, i10);
    }
}
