package J1;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.stub.StubApp;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3375a;

    /* renamed from: b, reason: collision with root package name */
    public int f3376b;

    public static void c(String str) {
        boolean equals;
        equals = StringsKt__StringsJVMKt.equals(str, StubApp.getString2(2950), true);
        if (equals) {
            return;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            boolean z10 = Intrinsics.compare((int) str.charAt(!z2 ? i3 : length), 32) <= 0;
            if (z2) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i3++;
            } else {
                z2 = true;
            }
        }
        if (str.subSequence(i3, length + 1).toString().length() == 0) {
            return;
        }
        String concat = StubApp.getString2(2951).concat(str);
        String string2 = StubApp.getString2(2952);
        Log.w(string2, concat);
        try {
            File file = new File(str);
            Intrinsics.checkNotNullParameter(file, "file");
            SQLiteDatabase.deleteDatabase(file);
        } catch (Exception e10) {
            Log.w(string2, StubApp.getString2(2953), e10);
        }
    }

    public static String i(int i3) {
        return "" + ((char) ((i3 >> 24) & 255)) + ((char) ((i3 >> 16) & 255)) + ((char) ((i3 >> 8) & 255)) + ((char) (i3 & 255));
    }

    public void a(int i3) {
        this.f3376b = i3 | this.f3376b;
    }

    public abstract void b(P1.c cVar);

    public abstract void h(P1.c cVar);

    public abstract int j(int i3);

    public boolean k(int i3) {
        return (this.f3376b & i3) == i3;
    }

    public void l(P1.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }

    public abstract void m(P1.c cVar);

    public abstract void n(P1.c cVar, int i3, int i10);

    public abstract void o(P1.c cVar);

    public abstract void p(P1.c cVar);

    public abstract void q(P1.c cVar, int i3, int i10);

    public abstract t r(P1.c cVar);

    public String toString() {
        switch (this.f3375a) {
            case 4:
                return i(this.f3376b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(int i3, int i10) {
        this.f3375a = i10;
        this.f3376b = i3;
    }
}
