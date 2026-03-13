package C9;

import B3.j;
import H3.i;
import I3.f;
import I3.h;
import Q2.g;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.ResourceLoadResultCallback;
import com.stub.StubApp;
import f5.C0910l0;
import kotlin.jvm.internal.Intrinsics;
import w5.InterfaceC1865a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements ResourceLoadResultCallback, J3.b, f, InterfaceC1865a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1147c;

    public /* synthetic */ a(Object obj, long j, Object obj2) {
        this.f1146b = obj;
        this.f1145a = j;
        this.f1147c = obj2;
    }

    @Override // I3.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((E3.c) this.f1147c).f1890a;
        String num = Integer.toString(i3);
        String str = (String) this.f1146b;
        Cursor rawQuery = sQLiteDatabase.rawQuery(StubApp.getString2(1211), new String[]{str, num});
        try {
            boolean z2 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f1145a;
            if (z2) {
                sQLiteDatabase.execSQL(StubApp.getString2(1215) + j + StubApp.getString2(1216), new String[]{str, Integer.toString(i3)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(StubApp.getString2(1212), str);
            contentValues.put(StubApp.getString2(532), Integer.valueOf(i3));
            contentValues.put(StubApp.getString2(1213), Long.valueOf(j));
            sQLiteDatabase.insert(StubApp.getString2(1214), null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // w5.InterfaceC1865a
    public void c(w5.b bVar) {
        ((Z4.a) bVar.get()).d((String) this.f1146b, this.f1145a, (C0910l0) this.f1147c);
    }

    @Override // J3.b
    public Object f() {
        i iVar = (i) this.f1146b;
        long f10 = iVar.f2730g.f() + this.f1145a;
        h hVar = (h) iVar.f2726c;
        j jVar = (j) this.f1147c;
        hVar.getClass();
        hVar.e(new I3.e(f10, jVar));
        return null;
    }

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public void run(Expected it) {
        String string2 = StubApp.getString2(392);
        b bVar = (b) this.f1146b;
        Intrinsics.checkNotNullParameter(bVar, string2);
        String string22 = StubApp.getString2(1217);
        g gVar = (g) this.f1147c;
        Intrinsics.checkNotNullParameter(gVar, string22);
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.f1150c.remove(Long.valueOf(this.f1145a));
        gVar.run(it);
    }

    public /* synthetic */ a(Object obj, Object obj2, long j) {
        this.f1146b = obj;
        this.f1147c = obj2;
        this.f1145a = j;
    }
}
