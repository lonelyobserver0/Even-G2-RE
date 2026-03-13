package f3;

import Ha.e;
import android.os.AsyncTask;
import android.util.Log;
import com.stub.StubApp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import oa.C1468a;
import oa.C1471d;
import oa.j;
import sa.C1609b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13734a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x003f -> B:11:0x005c). Please report as a decompilation issue!!! */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C1609b c1609b;
        e eVar;
        C1471d c1471d;
        C1609b c1609b2;
        switch (this.f13734a) {
            case 0:
                String[] strArr = (String[]) objArr;
                String string2 = StubApp.getString2(17430);
                String string22 = StubApp.getString2(17431);
                ArrayList arrayList = new ArrayList();
                try {
                    c1609b = C1609b.d(new File(strArr[0]));
                } catch (IOException e10) {
                    Log.e(string22, StubApp.getString2(17432), e10);
                    c1609b = null;
                }
                try {
                    try {
                        if (c1609b != null) {
                            try {
                                eVar = new e();
                                c1471d = (C1471d) ((C1471d) c1609b.a().f20829b).J(j.f18431C2);
                                new HashSet();
                            } catch (IOException e11) {
                                Log.e(string22, "Exception thrown while stripping text", e11);
                                c1609b.close();
                            }
                            if (c1471d == null) {
                                throw new IllegalArgumentException(StubApp.getString2("17434"));
                            }
                            boolean equals = j.f18426B2.equals(c1471d.H(j.f18621y3));
                            C1471d c1471d2 = c1471d;
                            if (equals) {
                                C1468a c1468a = new C1468a();
                                c1468a.a(c1471d);
                                C1471d c1471d3 = new C1471d();
                                c1471d3.V(j.f18480N1, c1468a);
                                c1471d3.U(j.f18597t0, 1);
                                c1471d2 = c1471d3;
                            }
                            int N3 = c1471d2.N(j.f18597t0, null, 0);
                            for (int i3 = 1; i3 <= N3; i3++) {
                                eVar.f2991v = i3;
                                eVar.f2992w = i3;
                                arrayList.add(eVar.m(c1609b));
                            }
                            c1609b.close();
                        }
                    } catch (Throwable th) {
                        try {
                            c1609b.close();
                        } catch (IOException e12) {
                            Log.e(string22, string2, e12);
                        }
                        throw th;
                    }
                } catch (IOException e13) {
                    Log.e(string22, string2, e13);
                }
                return arrayList;
            default:
                String[] strArr2 = (String[]) objArr;
                String string23 = StubApp.getString2(17430);
                String string24 = StubApp.getString2(17431);
                String str = null;
                try {
                    c1609b2 = C1609b.d(new File(strArr2[0]));
                } catch (IOException e14) {
                    Log.e(string24, StubApp.getString2(17432), e14);
                    c1609b2 = null;
                }
                try {
                    try {
                    } catch (Throwable th2) {
                        try {
                            c1609b2.close();
                        } catch (IOException e15) {
                            Log.e(string24, string23, e15);
                        }
                        throw th2;
                    }
                } catch (IOException e16) {
                    Log.e(string24, string23, e16);
                    c1609b2 = e16;
                }
                if (c1609b2 != null) {
                    try {
                        str = new e().m(c1609b2);
                        c1609b2.close();
                        c1609b2 = c1609b2;
                    } catch (IOException e17) {
                        Log.e(string24, StubApp.getString2("17433"), e17);
                        c1609b2.close();
                        c1609b2 = c1609b2;
                    }
                }
                return str;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f13734a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                super.onPostExecute(arrayList);
                if (arrayList != null && !arrayList.isEmpty()) {
                    b.f13735b.success(arrayList);
                    break;
                } else {
                    b.f13735b.error(StubApp.getString2(17435), StubApp.getString2(17436), null);
                    break;
                }
            default:
                String str = (String) obj;
                super.onPostExecute(str);
                if (str == null) {
                    b.f13735b.error(StubApp.getString2(17435), StubApp.getString2(17436), null);
                    break;
                } else {
                    b.f13735b.success(str);
                    break;
                }
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        switch (this.f13734a) {
            case 0:
                super.onPreExecute();
                break;
            default:
                super.onPreExecute();
                break;
        }
    }
}
