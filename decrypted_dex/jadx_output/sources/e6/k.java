package e6;

import com.stub.StubApp;
import java.util.HashMap;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13647a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f13648b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f13649c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f13650d;

    static {
        HashMap hashMap = new HashMap();
        f13647a = hashMap;
        hashMap.put(StubApp.getString2(1720), j.a(18));
        hashMap.put(StubApp.getString2(1717), j.a(14));
        hashMap.put(StubApp.getString2(1716), j.a(14));
        hashMap.put(StubApp.getString2(1708), j.b(20));
        hashMap.put(StubApp.getString2(1724), j.a(6));
        hashMap.put(StubApp.getString2(1723), j.a(6));
        hashMap.put(StubApp.getString2(1722), j.a(6));
        hashMap.put(StubApp.getString2(16823), j.a(6));
        hashMap.put(StubApp.getString2(16824), j.a(6));
        hashMap.put(StubApp.getString2(17329), j.a(2));
        hashMap.put(StubApp.getString2(17330), j.b(20));
        hashMap.put(StubApp.getString2(17331), j.b(29));
        hashMap.put(StubApp.getString2(2482), j.b(8));
        hashMap.put(StubApp.getString2(17332), j.b(8));
        for (int i3 = 90; i3 <= 99; i3++) {
            f13647a.put(String.valueOf(i3), j.b(30));
        }
        HashMap hashMap2 = new HashMap();
        f13648b = hashMap2;
        hashMap2.put(StubApp.getString2(17333), j.b(30));
        hashMap2.put(StubApp.getString2(17334), j.b(30));
        hashMap2.put(StubApp.getString2(17335), j.b(6));
        hashMap2.put(StubApp.getString2(17336), j.b(30));
        hashMap2.put(StubApp.getString2(17337), j.b(30));
        hashMap2.put(StubApp.getString2(17338), j.b(17));
        hashMap2.put(StubApp.getString2(17339), j.b(20));
        hashMap2.put(StubApp.getString2(9694), j.b(30));
        hashMap2.put(StubApp.getString2(9714), j.b(30));
        hashMap2.put(StubApp.getString2(17340), j.a(17));
        hashMap2.put(StubApp.getString2(17341), j.b(30));
        hashMap2.put(StubApp.getString2(17342), j.a(13));
        hashMap2.put(StubApp.getString2(17343), j.a(13));
        hashMap2.put(StubApp.getString2(17344), j.a(13));
        hashMap2.put(StubApp.getString2(17345), j.a(13));
        hashMap2.put(StubApp.getString2(17346), j.a(13));
        hashMap2.put(StubApp.getString2(17347), j.b(20));
        hashMap2.put(StubApp.getString2(17348), j.b(15));
        hashMap2.put(StubApp.getString2(17349), j.a(3));
        hashMap2.put(StubApp.getString2(17350), j.b(15));
        hashMap2.put(StubApp.getString2(17351), j.a(3));
        hashMap2.put(StubApp.getString2(17352), j.a(3));
        hashMap2.put(StubApp.getString2(17353), j.a(3));
        f13649c = new HashMap();
        for (int i10 = 310; i10 <= 316; i10++) {
            f13649c.put(String.valueOf(i10), j.a(6));
        }
        for (int i11 = DilithiumEngine.DilithiumPolyT1PackedBytes; i11 <= 336; i11++) {
            f13649c.put(String.valueOf(i11), j.a(6));
        }
        for (int i12 = 340; i12 <= 357; i12++) {
            f13649c.put(String.valueOf(i12), j.a(6));
        }
        for (int i13 = 360; i13 <= 369; i13++) {
            f13649c.put(String.valueOf(i13), j.a(6));
        }
        HashMap hashMap3 = f13649c;
        hashMap3.put(StubApp.getString2(17354), j.b(15));
        hashMap3.put(StubApp.getString2(17355), j.b(18));
        hashMap3.put(StubApp.getString2(17356), j.b(15));
        hashMap3.put(StubApp.getString2(17357), j.b(18));
        hashMap3.put(StubApp.getString2(17358), j.b(30));
        HashMap hashMap4 = new HashMap();
        f13650d = hashMap4;
        hashMap4.put(StubApp.getString2(17359), j.a(13));
        hashMap4.put(StubApp.getString2(17360), j.b(30));
        hashMap4.put(StubApp.getString2(17361), j.a(10));
        hashMap4.put(StubApp.getString2(17362), j.a(14));
        hashMap4.put(StubApp.getString2(17363), j.b(20));
        hashMap4.put(StubApp.getString2(17364), j.b(30));
        hashMap4.put(StubApp.getString2(17365), j.b(30));
        hashMap4.put(StubApp.getString2(17366), j.a(6));
        hashMap4.put(StubApp.getString2(17367), j.a(18));
        hashMap4.put(StubApp.getString2(17368), j.b(30));
        hashMap4.put(StubApp.getString2(17369), j.b(12));
        hashMap4.put(StubApp.getString2(17370), j.a(18));
        hashMap4.put(StubApp.getString2(17371), j.b(25));
        hashMap4.put(StubApp.getString2(17372), j.a(6));
        hashMap4.put(StubApp.getString2(17373), j.a(10));
        hashMap4.put(StubApp.getString2(17374), j.a(2));
        hashMap4.put(StubApp.getString2(17375), j.b(70));
        hashMap4.put(StubApp.getString2(17376), j.b(70));
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw N5.i.a();
        }
        j jVar = (j) f13647a.get(str.substring(0, 2));
        if (jVar != null) {
            boolean z2 = jVar.f13645a;
            int i3 = jVar.f13646b;
            return z2 ? c(2, i3, str) : b(2, i3, str);
        }
        if (str.length() < 3) {
            throw N5.i.a();
        }
        String substring = str.substring(0, 3);
        j jVar2 = (j) f13648b.get(substring);
        if (jVar2 != null) {
            boolean z10 = jVar2.f13645a;
            int i10 = jVar2.f13646b;
            return z10 ? c(3, i10, str) : b(3, i10, str);
        }
        if (str.length() < 4) {
            throw N5.i.a();
        }
        j jVar3 = (j) f13649c.get(substring);
        if (jVar3 != null) {
            boolean z11 = jVar3.f13645a;
            int i11 = jVar3.f13646b;
            return z11 ? c(4, i11, str) : b(4, i11, str);
        }
        j jVar4 = (j) f13650d.get(str.substring(0, 4));
        if (jVar4 == null) {
            throw N5.i.a();
        }
        boolean z12 = jVar4.f13645a;
        int i12 = jVar4.f13646b;
        return z12 ? c(4, i12, str) : b(4, i12, str);
    }

    public static String b(int i3, int i10, String str) {
        if (str.length() < i3) {
            throw N5.i.a();
        }
        String substring = str.substring(0, i3);
        int i11 = i10 + i3;
        if (str.length() < i11) {
            throw N5.i.a();
        }
        String substring2 = str.substring(i3, i11);
        String substring3 = str.substring(i11);
        String str2 = StubApp.getString2(2830) + substring + ')' + substring2;
        String a3 = a(substring3);
        return a3 == null ? str2 : AbstractC1482f.g(str2, a3);
    }

    public static String c(int i3, int i10, String str) {
        String substring = str.substring(0, i3);
        int min = Math.min(str.length(), i10 + i3);
        String substring2 = str.substring(i3, min);
        String substring3 = str.substring(min);
        String str2 = StubApp.getString2(2830) + substring + ')' + substring2;
        String a3 = a(substring3);
        return a3 == null ? str2 : AbstractC1482f.g(str2, a3);
    }
}
