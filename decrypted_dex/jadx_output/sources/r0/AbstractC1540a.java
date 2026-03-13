package r0;

import com.stub.StubApp;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1540a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20137a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f20138b = {"", StubApp.getString2(4905), StubApp.getString2(4906), StubApp.getString2(4907)};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f20139c = Pattern.compile(StubApp.getString2(22347));

    public static String a(int i3, int i10, int i11) {
        return String.format(StubApp.getString2(22348), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String b(int i3, int i10, int i11, int[] iArr, boolean z2, int i12) {
        Object[] objArr = {f20138b[i3], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(z2 ? 'H' : 'L'), Integer.valueOf(i12)};
        int i13 = AbstractC1560u.f20190a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, StubApp.getString2(22349), objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(StubApp.getString2(22350), Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0219, code lost:
    
        if (r13.equals(com.stub.StubApp.getString2(22374)) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.lang.String r12, java.lang.String[] r13, o0.C1431f r14) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.AbstractC1540a.c(java.lang.String, java.lang.String[], o0.f):android.util.Pair");
    }
}
