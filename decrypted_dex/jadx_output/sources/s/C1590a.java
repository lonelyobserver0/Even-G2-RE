package s;

import Bc.i;
import C.E;
import I4.e;
import R4.h;
import T0.J;
import T0.q;
import Z9.AbstractC0374i;
import Z9.C0366a;
import Z9.C0367b;
import android.graphics.Rect;
import android.util.Log;
import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.common.BillingService;
import com.mapbox.common.BillingServiceFactory;
import com.stub.StubApp;
import da.C0810A;
import da.C0812b;
import da.G;
import da.H;
import da.y;
import da.z;
import ea.C0857d;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import q1.l;
import r0.C1553n;
import r0.C1558s;
import w.AbstractC1856e;
import w3.C1860a;
import wa.d;
import y1.C1966a;
import z1.C1991C;
import z1.C1992D;
import z1.C1994F;
import z1.InterfaceC1990B;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1590a implements l, InterfaceC1990B {

    /* renamed from: a, reason: collision with root package name */
    public Object f20574a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20575b;

    public /* synthetic */ C1590a(Object obj) {
        this.f20575b = obj;
    }

    public static File i() {
        String property = System.getProperty(StubApp.getString2(22967));
        if ((property == null || !new File(property).isDirectory() || !new File(property).canWrite()) && ((property = System.getProperty(StubApp.getString2(17816))) == null || !new File(property).isDirectory() || !new File(property).canWrite())) {
            property = System.getProperty(StubApp.getString2(15716));
        }
        return new File(property, StubApp.getString2(22968));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            da.I r1 = new da.I     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
            r0 = 0
        L7:
            int r2 = r1.f13475b     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L47
            if (r0 >= r2) goto L17
            da.J r2 = r1.a(r0)     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L47
            r6.e(r2, r7)     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L47
            int r0 = r0 + 1
            goto L7
        L15:
            r0 = move-exception
            goto L23
        L17:
            r1.close()
            return
        L1b:
            r0 = r1
            goto L49
        L1d:
            r7 = move-exception
            goto L49
        L1f:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L23:
            java.lang.String r2 = "948"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "22969"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L47
            r3.append(r4)     // Catch: java.lang.Throwable -> L47
            r3.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.w(r2, r7, r0)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L46
            r1.close()
        L46:
            return
        L47:
            r7 = move-exception
            goto L1b
        L49:
            if (r0 == 0) goto L4e
            r0.close()
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1590a.a(java.io.File):void");
    }

    @Override // z1.InterfaceC1990B
    public void b(C1558s c1558s, q qVar, C1994F c1994f) {
    }

    @Override // z1.InterfaceC1990B
    public void c(C1553n c1553n) {
        C1992D c1992d;
        if (c1553n.u() == 0 && (c1553n.u() & 128) != 0) {
            c1553n.H(6);
            int a3 = c1553n.a() / 4;
            int i3 = 0;
            while (true) {
                c1992d = (C1992D) this.f20575b;
                if (i3 >= a3) {
                    break;
                }
                J j = (J) this.f20574a;
                c1553n.f(0, 4, j.f6949b);
                j.q(0);
                int i10 = j.i(16);
                j.t(3);
                if (i10 == 0) {
                    j.t(13);
                } else {
                    int i11 = j.i(13);
                    if (c1992d.f23737h.get(i11) == null) {
                        c1992d.f23737h.put(i11, new C1991C(new E(c1992d, i11)));
                        c1992d.f23742n++;
                    }
                }
                i3++;
            }
            if (c1992d.f23730a != 2) {
                c1992d.f23737h.remove(0);
            }
        }
    }

    public void d(File file) {
        try {
            if (file.getPath().toLowerCase().endsWith(StubApp.getString2("17471"))) {
                e(new z(false, true).f(file), file);
            } else {
                e(new G(false, true).c(file), file);
            }
        } catch (IOException e10) {
            Log.w(StubApp.getString2(948), StubApp.getString2(22969) + file, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void e(da.J j, File file) {
        String str;
        ?? r42;
        int i3;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        i iVar;
        i iVar2;
        File file2 = file;
        String string2 = StubApp.getString2(7708);
        String string22 = StubApp.getString2(22970);
        String string23 = StubApp.getString2(948);
        ArrayList arrayList = (ArrayList) this.f20574a;
        String string24 = StubApp.getString2(22969);
        String string25 = StubApp.getString2(22971);
        String string26 = StubApp.getString2(22972);
        try {
            try {
                if (j.getName() == null || !j.getName().contains(StubApp.getString2("4851"))) {
                    try {
                        if (j.getName() == null) {
                            str = string24;
                            string24 = 1;
                            arrayList.add(new d(file2, 1, StubApp.getString2("22976")));
                            Log.w(string23, string25 + file2);
                        } else {
                            if (j.v() == null) {
                                arrayList.add(new d(file2, 1, j.getName()));
                                j.close();
                                return;
                            }
                            int i14 = j.v().f13525k;
                            y yVar = (y) j.C(StubApp.getString2("17135"));
                            if (yVar != null) {
                                try {
                                    int i15 = yVar.f13550h;
                                    i3 = yVar.f13549g;
                                    int i16 = (int) yVar.j;
                                    int i17 = (int) yVar.f13552k;
                                    bArr = yVar.f13551i;
                                    i10 = i17;
                                    i11 = i16;
                                    i12 = 0;
                                    i13 = i15;
                                } catch (IOException e10) {
                                    e = e10;
                                    str = string24;
                                    r42 = 1;
                                    arrayList.add(new d(file2, r42, StubApp.getString2("22977")));
                                    Log.w(string23, str + file2, e);
                                    j.close();
                                    return;
                                }
                            } else {
                                i10 = 0;
                                i12 = 0;
                                i3 = -1;
                                bArr = null;
                                i11 = 0;
                                i13 = -1;
                            }
                            try {
                                if (j instanceof C0810A) {
                                    try {
                                        if (((C0810A) j).f13479c.containsKey(string2)) {
                                            C0810A c0810a = (C0810A) j;
                                            if (!c0810a.f13458g) {
                                                throw new UnsupportedOperationException(StubApp.getString2("22975"));
                                            }
                                            AbstractC0374i abstractC0374i = ((C0812b) c0810a.C(string2)).f13494f;
                                            if (abstractC0374i instanceof C0367b) {
                                                C0367b c0367b = (C0367b) abstractC0374i;
                                                iVar = new i(c0367b.f9108h, 15, c0367b.f9106f, c0367b.f9107g);
                                            } else {
                                                iVar = null;
                                            }
                                            arrayList.add(new wa.c(file2, 2, j.getName(), iVar, i3, i13, i11, i10, i14, bArr, this));
                                        }
                                    } catch (IOException e11) {
                                        e = e11;
                                        str = string24;
                                        file2 = file;
                                        r42 = 1;
                                        arrayList.add(new d(file2, r42, StubApp.getString2("22977")));
                                        Log.w(string23, str + file2, e);
                                        j.close();
                                        return;
                                    }
                                }
                                str = string24;
                                int i18 = i3;
                                int i19 = i10;
                                HashMap hashMap = j.f13479c;
                                if (hashMap.containsKey(string22)) {
                                    byte[] F3 = j.F((H) hashMap.get(string22));
                                    Charset charset = Ia.a.f3238a;
                                    String str2 = new String(F3, 10, 64, charset);
                                    String substring = str2.substring(i12, str2.indexOf(i12));
                                    String str3 = new String(F3, 76, 64, charset);
                                    iVar2 = new i(F3[141] & UByte.MAX_VALUE & (F3[140] << 8), 15, substring, str3.substring(i12, str3.indexOf(i12)));
                                } else {
                                    iVar2 = null;
                                }
                                file2 = file;
                                string24 = 1;
                                arrayList.add(new wa.c(file2, 1, j.getName(), iVar2, i18, i13, i11, i19, i14, bArr, this));
                            } catch (IOException e12) {
                                e = e12;
                            }
                        }
                    } catch (IOException e13) {
                        e = e13;
                        r42 = string24;
                    }
                } else {
                    arrayList.add(new d(file2, 1, StubApp.getString2("22973")));
                    Log.w(string23, string26 + j.getName() + StubApp.getString2("22974") + file2);
                }
                j.close();
            } catch (Throwable th) {
                j.close();
                throw th;
            }
        } catch (IOException e14) {
            e = e14;
            str = string24;
            r42 = 1;
        }
    }

    public void f(File file) {
        String string2 = StubApp.getString2(948);
        String string22 = StubApp.getString2(22969);
        String string23 = StubApp.getString2(22972);
        String string24 = StubApp.getString2(22971);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C0857d c10 = C0857d.c(fileInputStream);
            String str = c10.f13674a;
            ArrayList arrayList = (ArrayList) this.f20574a;
            if (str == null) {
                arrayList.add(new d(file, 3, StubApp.getString2("22976")));
                Log.w(string2, string24 + file);
                return;
            }
            if (!str.contains(StubApp.getString2("4851"))) {
                arrayList.add(new wa.c(file, 3, c10.f13674a, null, -1, -1, 0, 0, -1, null, this));
                return;
            }
            arrayList.add(new d(file, 3, StubApp.getString2("22973")));
            Log.w(string2, string23 + c10.f13674a + StubApp.getString2("22974") + file);
        } catch (IOException e10) {
            Log.w(string2, string22 + file, e10);
        } finally {
            fileInputStream.close();
        }
    }

    public File h() {
        String string2 = StubApp.getString2(22978);
        if (((File) this.f20574a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f20574a) == null) {
                        h hVar = (h) this.f20575b;
                        hVar.a();
                        this.f20574a = new File(hVar.f6193a.getFilesDir(), string2 + ((h) this.f20575b).g() + StubApp.getString2("13771"));
                    }
                } finally {
                }
            }
        }
        return (File) this.f20574a;
    }

    public synchronized Map j() {
        try {
            if (((Map) this.f20575b) == null) {
                this.f20575b = Collections.unmodifiableMap(new HashMap((HashMap) this.f20574a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f20575b;
    }

    public void k(y5.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StubApp.getString2("22979"), aVar.f23513a);
            jSONObject.put(StubApp.getString2("15988"), AbstractC1856e.c(aVar.f23514b));
            jSONObject.put(StubApp.getString2("22980"), aVar.f23515c);
            jSONObject.put(StubApp.getString2("22981"), aVar.f23516d);
            jSONObject.put(StubApp.getString2("22982"), aVar.f23518f);
            jSONObject.put(StubApp.getString2("22983"), aVar.f23517e);
            jSONObject.put(StubApp.getString2("22984"), aVar.f23519g);
            String string2 = StubApp.getString2("22985");
            String string22 = StubApp.getString2("8895");
            h hVar = (h) this.f20575b;
            hVar.a();
            File createTempFile = File.createTempFile(string2, string22, hVar.f6193a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(StubApp.getString2("640")));
            fileOutputStream.close();
            if (createTempFile.renameTo(h())) {
            } else {
                throw new IOException(StubApp.getString2("22986"));
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList l(java.util.ArrayList r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1590a.l(java.util.ArrayList):java.util.ArrayList");
    }

    public y5.a m() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(h());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString(StubApp.getString2(22979), null);
        int optInt = jSONObject.optInt(StubApp.getString2(15988), 0);
        String optString2 = jSONObject.optString(StubApp.getString2(22980), null);
        String optString3 = jSONObject.optString(StubApp.getString2(22981), null);
        long optLong = jSONObject.optLong(StubApp.getString2(22982), 0L);
        long optLong2 = jSONObject.optLong(StubApp.getString2(22983), 0L);
        String optString4 = jSONObject.optString(StubApp.getString2(22984), null);
        int i3 = AbstractC1856e.d(5)[optInt];
        if (i3 == 0) {
            throw new NullPointerException(StubApp.getString2(22994));
        }
        String string2 = i3 == 0 ? StubApp.getString2(22993) : "";
        if (string2.isEmpty()) {
            return new y5.a(optString, i3, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException(StubApp.getString2(555).concat(string2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x043c, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0132, code lost:
    
        if (com.stub.StubApp.getString2(74).equals(y1.C1966a.b(r8, r11)) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(byte[] r21, int r22, int r23, q1.k r24, r0.InterfaceC1542c r25) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1590a.n(byte[], int, int, q1.k, r0.c):void");
    }

    public void o() {
        BufferedWriter bufferedWriter;
        String string2;
        String string22 = StubApp.getString2(948);
        String string23 = StubApp.getString2(4851);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(i()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (SecurityException unused) {
            return;
        }
        try {
            Iterator it = ((ArrayList) this.f20574a).iterator();
            while (it.hasNext()) {
                wa.c cVar = (wa.c) it.next();
                bufferedWriter.write(cVar.f22188a.trim());
                bufferedWriter.write(string23);
                int i3 = cVar.f22189b;
                if (i3 == 1) {
                    string2 = StubApp.getString2("22076");
                } else if (i3 == 2) {
                    string2 = "OTF";
                } else {
                    if (i3 != 3) {
                        throw null;
                    }
                    string2 = "PFB";
                }
                bufferedWriter.write(string2);
                bufferedWriter.write(string23);
                i iVar = cVar.f22190c;
                if (iVar != null) {
                    bufferedWriter.write(((String) iVar.f768d) + '-' + ((String) iVar.f767c) + '-' + iVar.f766b);
                }
                bufferedWriter.write(string23);
                int i10 = cVar.f22191d;
                if (i10 > -1) {
                    bufferedWriter.write(Integer.toHexString(i10));
                }
                bufferedWriter.write(string23);
                int i11 = cVar.f22192e;
                if (i11 > -1) {
                    bufferedWriter.write(Integer.toHexString(i11));
                }
                bufferedWriter.write(string23);
                bufferedWriter.write(Integer.toHexString(cVar.f22193f));
                bufferedWriter.write(string23);
                bufferedWriter.write(Integer.toHexString(cVar.f22194g));
                bufferedWriter.write(string23);
                int i12 = cVar.f22195h;
                if (i12 > -1) {
                    bufferedWriter.write(Integer.toHexString(i12));
                }
                bufferedWriter.write(string23);
                C1860a c1860a = cVar.f22196i;
                if (c1860a != null) {
                    byte[] bArr = c1860a.f22106b;
                    for (int i13 = 0; i13 < 10; i13++) {
                        String hexString = Integer.toHexString(bArr[i13]);
                        if (hexString.length() == 1) {
                            bufferedWriter.write(48);
                        }
                        bufferedWriter.write(hexString);
                    }
                }
                bufferedWriter.write(string23);
                bufferedWriter.write(cVar.j.getAbsolutePath());
                bufferedWriter.newLine();
            }
            F1.h(bufferedWriter);
        } catch (IOException e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            Log.w(string22, StubApp.getString2("23016"), e);
            Log.w(string22, StubApp.getString2("23017"));
            Log.w(string22, StubApp.getString2("23018"));
            F1.h(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            F1.h(bufferedWriter2);
            throw th;
        }
    }

    @Override // q1.l
    public int p() {
        return 1;
    }

    public void q(ArrayList arrayList) {
        String lowerCase;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                lowerCase = file.getPath().toLowerCase();
            } catch (IOException e10) {
                Log.w(StubApp.getString2(948), StubApp.getString2(23020) + file.getPath(), e10);
            }
            if (!lowerCase.endsWith(StubApp.getString2("17470")) && !lowerCase.endsWith(StubApp.getString2("17471"))) {
                if (!lowerCase.endsWith(StubApp.getString2("17473")) && !lowerCase.endsWith(StubApp.getString2("23019"))) {
                    if (lowerCase.endsWith(StubApp.getString2("17472"))) {
                        f(file);
                    }
                }
                a(file);
            }
            d(file);
        }
    }

    public void r(int i3, int i10, int i11, int i12) {
        CardView cardView = (CardView) this.f20575b;
        cardView.f9616d.set(i3, i10, i11, i12);
        Rect rect = cardView.f9615c;
        super/*android.view.View*/.setPadding(i3 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    public C1590a(int i3) {
        switch (i3) {
            case 3:
                this.f20574a = new HashMap();
                break;
            case 5:
                e skuIdProvider = new e(1);
                BillingService billingServiceFactory = BillingServiceFactory.getInstance();
                Intrinsics.checkNotNullExpressionValue(billingServiceFactory, "getInstance()");
                C0366a billingService = new C0366a(billingServiceFactory);
                Intrinsics.checkNotNullParameter(skuIdProvider, "skuIdProvider");
                Intrinsics.checkNotNullParameter(billingService, "billingService");
                this.f20574a = skuIdProvider;
                this.f20575b = billingService;
                break;
            case 8:
                this.f20574a = new C1553n();
                this.f20575b = new C1966a();
                break;
            default:
                this.f20574a = new CopyOnWriteArraySet();
                this.f20575b = CollectionsKt.emptyList();
                break;
        }
    }
}
