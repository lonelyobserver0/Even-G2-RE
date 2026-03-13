package c5;

import android.util.Log;
import com.stub.StubApp;
import d5.C0803c;
import d5.C0804d;
import d5.C0805e;
import i5.C1059c;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10923b;

    public /* synthetic */ p(Object obj, int i3) {
        this.f10922a = i3;
        this.f10923b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10922a) {
            case 0:
                l lVar = ((r) this.f10923b).f10932h;
                lVar.getClass();
                C0805e.a();
                Y.m mVar = lVar.f10895c;
                String str = (String) mVar.f8674b;
                C1059c c1059c = (C1059c) mVar.f8675c;
                c1059c.getClass();
                boolean z2 = true;
                if (new File((File) c1059c.f14844c, str).exists()) {
                    String string2 = StubApp.getString2(280);
                    if (Log.isLoggable(string2, 2)) {
                        Log.v(string2, StubApp.getString2(9560), null);
                    }
                    String str2 = (String) mVar.f8674b;
                    c1059c.getClass();
                    new File((File) c1059c.f14844c, str2).delete();
                } else {
                    String e10 = lVar.e();
                    if (e10 == null || !lVar.j.c(e10)) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                A3.s sVar = (A3.s) ((V6.b) this.f10923b).f7762c;
                k5.d dVar = (k5.d) sVar.f190b;
                O1.a aVar = (O1.a) sVar.f194f;
                String str3 = aVar.f5194a;
                String string22 = StubApp.getString2(280);
                String string23 = StubApp.getString2(9554);
                String string24 = StubApp.getString2(9555);
                C0804d.a(new d.y(3), C0803c.f13418c);
                try {
                    HashMap c10 = O1.a.c(dVar);
                    a5.c cVar = new a5.c(str3, c10);
                    cVar.x(StubApp.getString2("2015"), StubApp.getString2("9556"));
                    cVar.x(StubApp.getString2("9557"), StubApp.getString2("9558"));
                    O1.a.b(cVar, dVar);
                    String str4 = string24 + str3;
                    if (Log.isLoggable(string22, 3)) {
                        Log.d(string22, str4, null);
                    }
                    String str5 = string23 + c10;
                    if (Log.isLoggable(string22, 2)) {
                        Log.v(string22, str5, null);
                    }
                    return aVar.e(cVar.l());
                } catch (IOException e11) {
                    Log.e(string22, StubApp.getString2(9559), e11);
                    return null;
                }
        }
    }
}
