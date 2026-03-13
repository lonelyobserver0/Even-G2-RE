package l4;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16251a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final URL f16252b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16253c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16254d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16255e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f16256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Mb.b f16257g;

    public V(W w10, String str, URL url, byte[] bArr, Map map, U u2) {
        Objects.requireNonNull(w10);
        this.f16257g = w10;
        S3.D.e(str);
        S3.D.h(url);
        this.f16252b = url;
        this.f16253c = bArr;
        this.f16255e = u2;
        this.f16254d = str;
        this.f16256f = map;
    }

    public void a(final int i3, final IOException iOException, final byte[] bArr, final Map map) {
        C1191k0 c1191k0 = ((C1200n0) ((T0) this.f16257g).f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new Runnable() { // from class: l4.S0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ((R0) V.this.f16255e).a(i3, iOException, bArr);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x02b1: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:177:0x02af */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x02b4: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:174:0x02b3 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.V.run():void");
    }

    public V(T0 t02, String str, URL url, byte[] bArr, HashMap hashMap, R0 r02) {
        Objects.requireNonNull(t02);
        this.f16257g = t02;
        S3.D.e(str);
        this.f16252b = url;
        this.f16253c = bArr;
        this.f16255e = r02;
        this.f16254d = str;
        this.f16256f = hashMap;
    }
}
