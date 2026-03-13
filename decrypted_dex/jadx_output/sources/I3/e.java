package I3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B3.j f3114b;

    public /* synthetic */ e(long j, B3.j jVar) {
        this.f3113a = j;
        this.f3114b = jVar;
    }

    @Override // I3.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(1045), Long.valueOf(this.f3113a));
        B3.j jVar = this.f3114b;
        String str = jVar.f628a;
        y3.d dVar = jVar.f630c;
        String[] strArr = {str, String.valueOf(L3.a.a(dVar))};
        String string2 = StubApp.getString2(1046);
        if (sQLiteDatabase.update(string2, contentValues, StubApp.getString2(2826), strArr) < 1) {
            contentValues.put(StubApp.getString2(1043), jVar.f628a);
            contentValues.put(StubApp.getString2(1044), Integer.valueOf(L3.a.a(dVar)));
            sQLiteDatabase.insert(string2, null, contentValues);
        }
        return null;
    }
}
