package l4;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import cb.C0585c;
import com.stub.StubApp;
import java.io.File;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f15899a = {StubApp.getString2(19374), StubApp.getString2(19375), StubApp.getString2(19376), StubApp.getString2(19377), StubApp.getString2(19378), StubApp.getString2(19379), StubApp.getString2(19380), StubApp.getString2(19381), StubApp.getString2(19382), StubApp.getString2(19383), StubApp.getString2(19384), StubApp.getString2(19385), StubApp.getString2(19386), StubApp.getString2(19387), StubApp.getString2(19388), StubApp.getString2(19389), StubApp.getString2(435), StubApp.getString2(19390), StubApp.getString2(19391), StubApp.getString2(19392), StubApp.getString2(19393), StubApp.getString2(19394), StubApp.getString2(19395), StubApp.getString2(19396), StubApp.getString2(19397), StubApp.getString2(19398), StubApp.getString2(19399), StubApp.getString2(19400), StubApp.getString2(19401), StubApp.getString2(19402), StubApp.getString2(19403), StubApp.getString2(19372), StubApp.getString2(19373)};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f15900b = {StubApp.getString2(19401)};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f15901c = {StubApp.getString2(6355), StubApp.getString2(6344), StubApp.getString2(6352), StubApp.getString2(6354), StubApp.getString2(19405), StubApp.getString2(6353), StubApp.getString2(6358), StubApp.getString2(57), StubApp.getString2(6357), StubApp.getString2(19383), StubApp.getString2(19384), StubApp.getString2(19385), StubApp.getString2(19386), StubApp.getString2(6346), StubApp.getString2(6362), StubApp.getString2(1191), StubApp.getString2(11891), StubApp.getString2(6359), StubApp.getString2(19406), StubApp.getString2(6360), StubApp.getString2(12559), StubApp.getString2(12593), StubApp.getString2(1194), StubApp.getString2(19407), StubApp.getString2(19408), StubApp.getString2(6361), StubApp.getString2(17495), StubApp.getString2(3306), StubApp.getString2(6356), StubApp.getString2(19409), StubApp.getString2(19410), StubApp.getString2(19404), StubApp.getString2(1191)};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f15902d = {StubApp.getString2(19413), StubApp.getString2(19414), StubApp.getString2(19415), StubApp.getString2(19416), StubApp.getString2(19417), StubApp.getString2(19418), StubApp.getString2(19419), StubApp.getString2(19420), StubApp.getString2(19421), StubApp.getString2(19422), StubApp.getString2(19423), StubApp.getString2(19424), StubApp.getString2(19425), StubApp.getString2(19426), StubApp.getString2(19427), StubApp.getString2(19428), StubApp.getString2(19429), StubApp.getString2(19430), StubApp.getString2(19411), StubApp.getString2(19412)};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f15903e = {StubApp.getString2(19433), StubApp.getString2(19434), StubApp.getString2(19435), StubApp.getString2(19436), StubApp.getString2(19437), StubApp.getString2(19438), StubApp.getString2(19439), StubApp.getString2(19440), StubApp.getString2(19441), StubApp.getString2(19442), StubApp.getString2(19443), StubApp.getString2(19444), StubApp.getString2(19445), StubApp.getString2(19446), StubApp.getString2(19447), StubApp.getString2(19448), StubApp.getString2(19449), StubApp.getString2(1179), StubApp.getString2(19450), StubApp.getString2(19451), StubApp.getString2(19452), StubApp.getString2(1519), StubApp.getString2(19453), StubApp.getString2(19454), StubApp.getString2(1418), StubApp.getString2(19455), StubApp.getString2(19456), StubApp.getString2(19457), StubApp.getString2(19458), StubApp.getString2(19459), StubApp.getString2(19460), StubApp.getString2(19461), StubApp.getString2(19462), StubApp.getString2(19463), StubApp.getString2(19464), StubApp.getString2(19465), StubApp.getString2(19466), StubApp.getString2(19467), StubApp.getString2(5226), StubApp.getString2(19468), StubApp.getString2(19469), StubApp.getString2(19470), StubApp.getString2(19471), StubApp.getString2(19472), StubApp.getString2(19473), StubApp.getString2(19474), StubApp.getString2(19475), StubApp.getString2(19476), StubApp.getString2(19477), StubApp.getString2(19478), StubApp.getString2(19479), StubApp.getString2(19480), StubApp.getString2(19481), StubApp.getString2(19482), StubApp.getString2(19483), StubApp.getString2(19484), StubApp.getString2(19431), StubApp.getString2(19432)};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f15904f = {StubApp.getString2(19486), StubApp.getString2(3304), StubApp.getString2(19487), StubApp.getString2(19488), StubApp.getString2(6356), StubApp.getString2(11891), StubApp.getString2(19489), StubApp.getString2(11892), StubApp.getString2(6519), StubApp.getString2(19490), StubApp.getString2(19491), StubApp.getString2(19492), StubApp.getString2(19493), StubApp.getString2(19494), StubApp.getString2(19495), StubApp.getString2(19496), StubApp.getString2(19497), StubApp.getString2(19498), StubApp.getString2(19499), StubApp.getString2(19500), StubApp.getString2(19501), StubApp.getString2(19502), StubApp.getString2(19503), StubApp.getString2(19504), StubApp.getString2(19505), StubApp.getString2(19506), StubApp.getString2(19507), StubApp.getString2(19508), StubApp.getString2(19509), StubApp.getString2(19510), StubApp.getString2(19511), StubApp.getString2(19512), StubApp.getString2(19513), StubApp.getString2(19514), StubApp.getString2(19515), StubApp.getString2(19516), StubApp.getString2(3151), StubApp.getString2(19517), StubApp.getString2(19518), StubApp.getString2(19485), StubApp.getString2(17493), StubApp.getString2(19519), StubApp.getString2(19520), StubApp.getString2(17494), StubApp.getString2(19521), StubApp.getString2(19486), StubApp.getString2(11891), StubApp.getString2(19489), StubApp.getString2(11892), StubApp.getString2(6519), StubApp.getString2(19490), StubApp.getString2(19491), StubApp.getString2(19492), StubApp.getString2(19493), StubApp.getString2(19494), StubApp.getString2(19495), StubApp.getString2(19485), StubApp.getString2(17493)};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f15905g = {StubApp.getString2(19522)};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f15906h = {StubApp.getString2(19525), StubApp.getString2(19526), StubApp.getString2(19527), StubApp.getString2(19528), StubApp.getString2(7787), StubApp.getString2(19521), StubApp.getString2(19529), StubApp.getString2(8110), StubApp.getString2(19530), StubApp.getString2(19531), StubApp.getString2(19532), StubApp.getString2(19533), StubApp.getString2(19534), StubApp.getString2(19535), StubApp.getString2(19536), StubApp.getString2(19537), StubApp.getString2(19538), StubApp.getString2(19539), StubApp.getString2(19540), StubApp.getString2(19541), StubApp.getString2(19542), StubApp.getString2(19543), StubApp.getString2(19544), StubApp.getString2(19545), StubApp.getString2(19546), StubApp.getString2(19547), StubApp.getString2(19548), StubApp.getString2(19549), StubApp.getString2(19550), StubApp.getString2(1061), StubApp.getString2(19551), StubApp.getString2(19552), StubApp.getString2(19523), StubApp.getString2(19524)};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f15907i = {StubApp.getString2(19553), StubApp.getString2(19554), StubApp.getString2(19555), StubApp.getString2(19556), StubApp.getString2(19557), StubApp.getString2(19558), StubApp.getString2(19559), StubApp.getString2(19560), StubApp.getString2(19561), StubApp.getString2(19562), StubApp.getString2(19468), StubApp.getString2(19469), StubApp.getString2(19563), StubApp.getString2(19431), StubApp.getString2(19432)};
    public static final String[] j = {StubApp.getString2(1187), StubApp.getString2(19564), StubApp.getString2(19565), StubApp.getString2(19566), StubApp.getString2(2829), StubApp.getString2(19567), StubApp.getString2(19568), StubApp.getString2(19569), StubApp.getString2(19570), StubApp.getString2(19571), StubApp.getString2(19485), StubApp.getString2(17493), StubApp.getString2(19572), StubApp.getString2(19485), StubApp.getString2(17493)};

    /* renamed from: k, reason: collision with root package name */
    public static C0585c f15908k;

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(2131755062);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String b(Context context, String str) {
        S3.D.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = a(context);
        }
        int identifier = resources.getIdentifier(StubApp.getString2(5702), StubApp.getString2(983), str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, Object obj) {
        boolean z2 = obj instanceof Double;
        String string2 = StubApp.getString2(1061);
        if (z2) {
            bundle.putDouble(string2, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(string2, ((Long) obj).longValue());
        } else {
            bundle.putString(string2, obj.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: SQLiteException -> 0x00db, TryCatch #4 {SQLiteException -> 0x00db, blocks: (B:15:0x0054, B:18:0x0094, B:20:0x00a6, B:22:0x00ae, B:24:0x00b1, B:25:0x00da, B:29:0x00e0, B:31:0x00e3, B:33:0x00eb, B:35:0x00f2, B:38:0x00f5, B:40:0x00fb, B:45:0x0112, B:46:0x0116, B:17:0x008d), top: B:14:0x0054, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0 A[Catch: SQLiteException -> 0x00db, LOOP:1: B:29:0x00e0->B:35:0x00f2, LOOP_START, PHI: r1
      0x00e0: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:28:0x00de, B:35:0x00f2] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {SQLiteException -> 0x00db, blocks: (B:15:0x0054, B:18:0x0094, B:20:0x00a6, B:22:0x00ae, B:24:0x00b1, B:25:0x00da, B:29:0x00e0, B:31:0x00e3, B:33:0x00eb, B:35:0x00f2, B:38:0x00f5, B:40:0x00fb, B:45:0x0112, B:46:0x0116, B:17:0x008d), top: B:14:0x0054, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb A[Catch: SQLiteException -> 0x00db, TryCatch #4 {SQLiteException -> 0x00db, blocks: (B:15:0x0054, B:18:0x0094, B:20:0x00a6, B:22:0x00ae, B:24:0x00b1, B:25:0x00da, B:29:0x00e0, B:31:0x00e3, B:33:0x00eb, B:35:0x00f2, B:38:0x00f5, B:40:0x00fb, B:45:0x0112, B:46:0x0116, B:17:0x008d), top: B:14:0x0054, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(l4.T r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.A0.d(l4.T, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static Object e(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AbstractC1482f.k(i2.u.t(StubApp.getString2(19583), str, StubApp.getString2(19584), canonicalName, StubApp.getString2(19585)), obj2.getClass().getCanonicalName(), StubApp.getString2(511)));
    }

    public static void f(T t3, SQLiteDatabase sQLiteDatabase) {
        if (t3 == null) {
            throw new IllegalArgumentException(StubApp.getString2(19582));
        }
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        Ac.b bVar = t3.j;
        if (!readable) {
            bVar.b(StubApp.getString2(19586));
        }
        if (!file.setWritable(false, false)) {
            bVar.b(StubApp.getString2(19587));
        }
        if (!file.setReadable(true, true)) {
            bVar.b(StubApp.getString2(19588));
        }
        if (file.setWritable(true, true)) {
            return;
        }
        bVar.b(StubApp.getString2(19589));
    }

    public static String g(String[] strArr, String str, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i3 = 0; i3 < min; i3++) {
            String str2 = strArr[i3];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i3];
            }
        }
        return null;
    }
}
