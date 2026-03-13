package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: gb.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0969A {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14243a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0992v f14244b;

    public C0969A(Za.d dVar) {
        r rVar = new r(this);
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(17827), JSONMethodCodec.INSTANCE);
        this.f14243a = methodChannel;
        methodChannel.setMethodCallHandler(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(gb.C0969A r11, org.json.JSONArray r12) {
        /*
            r11.getClass()
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L7:
            int r3 = r12.length()
            r4 = 2
            r5 = 4
            r6 = 1
            if (r0 >= r3) goto L84
            java.lang.String r3 = r12.getString(r0)
            int[] r5 = w.AbstractC1856e.d(r5)
            int r7 = r5.length
            r8 = r11
        L1a:
            if (r8 >= r7) goto L73
            r9 = r5[r8]
            r10 = 1
            if (r9 == r10) goto L44
            r10 = 2
            if (r9 == r10) goto L3c
            r10 = 3
            if (r9 == r10) goto L34
            r10 = 4
            if (r9 != r10) goto L32
            r10 = 17828(0x45a4, float:2.4982E-41)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            goto L4b
        L32:
            r11 = 0
            throw r11
        L34:
            r10 = 17829(0x45a5, float:2.4984E-41)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            goto L4b
        L3c:
            r10 = 17830(0x45a6, float:2.4985E-41)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            goto L4b
        L44:
            r10 = 17831(0x45a7, float:2.4987E-41)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
        L4b:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L70
            int r3 = w.AbstractC1856e.c(r9)
            if (r3 == 0) goto L68
            if (r3 == r6) goto L65
            if (r3 == r4) goto L62
            r4 = 3
            if (r3 == r4) goto L5f
            goto L6a
        L5f:
            r1 = r1 | 8
            goto L6a
        L62:
            r1 = r1 | 2
            goto L6a
        L65:
            r1 = r1 | 4
            goto L6a
        L68:
            r1 = r1 | 1
        L6a:
            if (r2 != 0) goto L6d
            r2 = r1
        L6d:
            int r0 = r0 + 1
            goto L7
        L70:
            int r8 = r8 + 1
            goto L1a
        L73:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            r12 = 17832(0x45a8, float:2.4988E-41)
            java.lang.String r12 = com.stub.StubApp.getString2(r12)
            java.lang.String r12 = E1.a.j(r12, r3)
            r11.<init>(r12)
            throw r11
        L84:
            if (r1 == 0) goto La1
            r12 = 8
            switch(r1) {
                case 2: goto La0;
                case 3: goto L96;
                case 4: goto L9e;
                case 5: goto L93;
                case 6: goto L96;
                case 7: goto L96;
                case 8: goto L9d;
                case 9: goto L96;
                case 10: goto L90;
                case 11: goto L8f;
                case 12: goto L96;
                case 13: goto L96;
                case 14: goto L96;
                case 15: goto L8c;
                default: goto L8b;
            }
        L8b:
            goto L9c
        L8c:
            r11 = 13
            return r11
        L8f:
            return r4
        L90:
            r11 = 11
            return r11
        L93:
            r11 = 12
            return r11
        L96:
            if (r2 == r4) goto La0
            if (r2 == r5) goto L9e
            if (r2 == r12) goto L9d
        L9c:
            return r6
        L9d:
            return r12
        L9e:
            r11 = 9
        La0:
            return r11
        La1:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C0969A.a(gb.A, org.json.JSONArray):int");
    }

    public static ArrayList b(C0969A c0969a, JSONArray jSONArray) {
        c0969a.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            for (EnumC0996z enumC0996z : EnumC0996z.values()) {
                if (enumC0996z.f14392a.equals(string)) {
                    int ordinal = enumC0996z.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(EnumC0996z.f14389b);
                    } else if (ordinal == 1) {
                        arrayList.add(EnumC0996z.f14390c);
                    }
                }
            }
            throw new NoSuchFieldException(E1.a.j(StubApp.getString2(17833), string));
        }
        return arrayList;
    }

    public static EnumC0995y c(C0969A c0969a, String str) {
        c0969a.getClass();
        for (EnumC0995y enumC0995y : EnumC0995y.values()) {
            if (enumC0995y.f14388a.equals(str)) {
                int ordinal = enumC0995y.ordinal();
                return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? EnumC0995y.f14386e : EnumC0995y.f14385d : EnumC0995y.f14384c : EnumC0995y.f14383b;
            }
        }
        throw new NoSuchFieldException(E1.a.j(StubApp.getString2(17834), str));
    }

    public static C0994x d(C0969A c0969a, JSONObject jSONObject) {
        c0969a.getClass();
        String string2 = StubApp.getString2(17835);
        Integer valueOf = !jSONObject.isNull(string2) ? Integer.valueOf(jSONObject.getInt(string2)) : null;
        String string22 = StubApp.getString2(17836);
        int a3 = !jSONObject.isNull(string22) ? com.mapbox.common.b.a(jSONObject.getString(string22)) : 0;
        String string23 = StubApp.getString2(17837);
        Boolean valueOf2 = !jSONObject.isNull(string23) ? Boolean.valueOf(jSONObject.getBoolean(string23)) : null;
        String string24 = StubApp.getString2(17838);
        Integer valueOf3 = !jSONObject.isNull(string24) ? Integer.valueOf(jSONObject.getInt(string24)) : null;
        String string25 = StubApp.getString2(17839);
        int a9 = jSONObject.isNull(string25) ? 0 : com.mapbox.common.b.a(jSONObject.getString(string25));
        String string26 = StubApp.getString2(17840);
        Integer valueOf4 = !jSONObject.isNull(string26) ? Integer.valueOf(jSONObject.getInt(string26)) : null;
        String string27 = StubApp.getString2(17841);
        return new C0994x(valueOf, a3, valueOf2, valueOf3, a9, valueOf4, jSONObject.isNull(string27) ? null : Boolean.valueOf(jSONObject.getBoolean(string27)));
    }
}
